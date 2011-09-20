package net.stencilproject.template;

import java.io.IOException;
import java.util.ArrayList;

import net.stencilproject.template.TemplateParserException.TemplateError;
import net.stencilproject.template.xml.Mode;
import net.stencilproject.template.xml.NotWellFormedException;
import net.stencilproject.template.xml.TokenType;
import net.stencilproject.template.xml.XmlChars;
import net.stencilproject.template.xml.XmlPushLexer;
import net.stencilproject.template.xml.XmlTokenHandler;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.Tree;

/**
 * Parses the contents of a {@link TemplateFile}, passing back the structure to
 * an EventHandler.
 */
class TemplateContentHandler extends BaseParser {
	private StringBuilder builder = new StringBuilder();
	private final TemplateBuilderEvents eventHandler;
	private final TemplateMode mode;
	private TextState textState = TextState.TEXT;

	enum TextState {
		/*
		 * TODO: Implement XML modes
		 */
		TEXT,

		ESCAPE,
	}

	TemplateContentHandler(TemplateFileSourceInfo source, TemplateMode mode, TemplateBuilderEvents eventHandler) {
		super(source);
		this.mode = mode;
		this.eventHandler = eventHandler;
	}

	private class TextEventHandler implements TemplateBuilderEvents {
		@Override
		public void text(TemplateFileSourceInfo source, String text) throws TemplateParserException {
			emit(text);
		}

		@Override
		public void tree(TemplateFileSourceInfo source, Tree tree) throws TemplateParserException {
			parseDirectives(tree);
		}

		@Override
		public void done() {
		}
	}

	private class XmlEventHandler implements TemplateBuilderEvents, XmlTokenHandler {
		private XmlPushLexer pushLexer = new XmlPushLexer(this);
		// TODO: Use something more efficient here
		private ArrayList<Tree> trees = new ArrayList<Tree>();
		private TemplateParserException stashedException;
		private String lastOpenTag = "";

		@Override
		public void token(Mode mode, TokenType type, int[] value, int valueOffset, int valueLength) {
			boolean consecutiveWhitespace = false;
			if (type == TokenType.START_ELEMENT_NAME) {
				lastOpenTag = new String(value, valueOffset, valueLength);
			}

			// Ignore CDATA begin/end tags in HTML mode
			if (TemplateContentHandler.this.mode == TemplateMode.HTML) {
				if (type == TokenType.CDATA_OPEN || type == TokenType.CDATA_CLOSE) {
					return;
				}
			}

			for (int i = 0; i < valueLength; i++) {
				int c = value[i + valueOffset];
				if (XmlChars.isWhitespace(c)) {
					if (type == TokenType.OPTIONAL_WS
							|| ((type == TokenType.REQUIRED_WS || (mode == Mode.PCDATA && type == TokenType.VALUE)) && consecutiveWhitespace)) {
						continue;
					}

					consecutiveWhitespace = true;
				} else {
					consecutiveWhitespace = false;
				}

				if (TemplateContentHandler.this.mode == TemplateMode.HTML) {
					// Ensure that we emit HTML-compatible empty elements
					if (type == TokenType.START_ELEMENT_EMPTY_CLOSE && c == '/') {
						emit(" /");
						continue;
					}
				}

				if (c < 0) {
					try {
						parseDirectives(trees.remove(0));
					} catch (TemplateParserException e) {
						stashedException = e;
					}
				} else {
					if (lastOpenTag.equals("script")) {
						emit(TextState.TEXT, (char) c);
					} else if (TemplateContentHandler.this.mode == TemplateMode.HTML && type == TokenType.VALUE && mode == Mode.CDATA) {
						emit(TextState.ESCAPE, (char) c);
					} else {
						emit(TextState.TEXT, (char) c);
					}
				}
			}
		}

		@Override
		public void text(TemplateFileSourceInfo source, String text) throws TemplateParserException {
			try {
				pushLexer.input(text);
			} catch (NotWellFormedException e) {
				throwParserException(TemplateError.XML_ERROR, e);
			}

			if (stashedException != null) {
				throw stashedException;
			}
		}

		public void tree(TemplateFileSourceInfo source, Tree tree) throws TemplateParserException {
			try {
				pushLexer.input(-1);
				trees.add(tree);
			} catch (NotWellFormedException e) {
				throwParserException(TemplateError.XML_ERROR, e);
			}

			if (stashedException != null) {
				throw stashedException;
			}
		};

		public void done() throws TemplateParserException {
			try {
				pushLexer.finish();
			} catch (NotWellFormedException e) {
				throwParserException(TemplateError.XML_ERROR, e);
			}

			if (stashedException != null) {
				throw stashedException;
			}
		};
	}

	private void processTree(TemplateBuilderEvents eventHandler, Tree templateTree) throws TemplateParserException {
		for (int i = 0; i < templateTree.getChildCount(); i++) {
			Tree tree = templateTree.getChild(i);
			switch (tree.getType()) {
			case TemplateParser.EOF:
				eventHandler.done();
				return;
			case TemplateParser.SEMI:
				break;
			case TemplateParser.TEMPLATE_LITERAL:
			case TemplateParser.TEMPLATE_RAW:
				eventHandler.text(source, tree.getText());
				break;
			case TemplateParser.TEMPLATE_PRINT_START:
			case TemplateParser.TEMPLATE_STATEMENT_START:
				eventHandler.tree(source, tree);
				break;
			case TemplateParser.TEMPLATE_COMMENT:
				break;
			default:
				throwParserException(TemplateError.PARSE_ERROR, "Unexpected token: " + tree.getText());
				break;
			}
		}
	}

	private void parseDirectives(Tree tree) throws TemplateParserException {
		flushText();
		eventHandler.tree(source, tree);
	}

	private Tree parseTree(String string, TemplateBuilderEvents eventHandler) throws TemplateParserException {
		final Exception[] stashed = new Exception[1];

		final ANTLRStringStream stringStream = new ANTLRStringStream(string);
		TemplateLexer lexer = new GatingTemplateLexer(stringStream) {
			@Override
			public void reportError(RecognitionException e) {
				stashed[0] = e;
				throw new RuntimeException(e);
			};
		};
		TokenStream stream = new CommonTokenStream(lexer);

		try {
			TemplateParser parser = new TemplateParser(stream) {
				@Override
				public void reportError(RecognitionException e) {
					stashed[0] = e;
					throw new RuntimeException(e);
				};
			};

			Tree templateTree = (Tree) parser.template().tree;
			if (stashed[0] != null) {
				throwParserException(TemplateError.PARSE_ERROR, stashed[0]);
			}

			return templateTree;
		} catch (RuntimeException e) {
			if (e.getCause() instanceof RecognitionException) {
				throwParserException(TemplateError.PARSE_ERROR, (RecognitionException) e.getCause());
			}
			throwParserException(TemplateError.PARSE_ERROR, e);
		} catch (RecognitionException e) {
			throwParserException(TemplateError.PARSE_ERROR, e);
		}

		assert false;
		return null;
	}

	public void parse() throws TemplateParserException, IOException {
		TemplateBuilderEvents eventHandler = mode == TemplateMode.TEXT ? new TextEventHandler() : new XmlEventHandler();
		Tree tree = parseTree(templateFile.read(), eventHandler);
		processTree(eventHandler, tree);
		flushText();
	}

	protected void emit(String text) {
		if (textState == TextState.TEXT) {
			// Fast mode
			builder.append(text);
		} else {
			for (int i = 0; i < text.length(); i++) {
				emit(textState, text.charAt(i));
			}
		}
	}

	private void emit(TextState state, char c) {
		switch (state) {
		case TEXT:
			builder.append(c);
			return;
		case ESCAPE:
			XmlEscaper.escape(builder, c);
			return;
		}
	}

	private void flushText() throws TemplateParserException {
		if (builder.length() > 0) {
			eventHandler.text(source, builder.toString());
			builder.setLength(0);
		}
	}
}
