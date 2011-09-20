package net.stencilproject.template;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;
import java.util.Date;
import java.util.List;
import java.util.Stack;

import net.stencilproject.template.ProgramBuilder.Label;
import net.stencilproject.template.TemplateParserException.TemplateError;
import net.stencilproject.template.TemplateTreeBuilder.EventHandler;

import org.antlr.runtime.tree.Tree;
import org.xml.sax.InputSource;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;

public class TemplateParserBuilder extends BaseParser implements EventHandler {
	private ProgramBuilder program = new ProgramBuilder();
	private Stack<BlockContext> blockStack = new Stack<BlockContext>();
	private final TemplateRootScope rootScope;
	private final TemplateMode mode;
	private final TemplateOptions options;
	private long start, end;
	private boolean firstStatement = true;

	abstract class BlockContext {
	}

	class ForBlockContext extends BlockContext {
		/**
		 * The start of the loop contents.
		 */
		Label loopstart;

		/**
		 * The label that tests whether the loop should continue.
		 */
		Label loop;

		/**
		 * The start of the else block.
		 */
		Label elseBlock;

		/**
		 * The end of the loop.
		 */
		Label end;
	}

	class IfBlockContext extends BlockContext {
		public Label end;

		public Label elseBlock;
	}

	class ContentBlockContext extends BlockContext {

	}

	private TemplateParserBuilder(TemplateRootScope rootScope, TemplateFile templateFile, TemplateMode mode, TemplateOptions options) {
		super(new TemplateFileSourceInfo(templateFile, null));

		this.rootScope = rootScope;
		this.mode = mode;
		this.options = options;
		program.setEscapingMode(mode == TemplateMode.TEXT ? EscapingMode.TEXT : EscapingMode.XML);
	}

	public static TemplateParserBuilder parse(TemplateRootScope rootScope, TemplateFile templateFile, TemplateMode mode,
			TemplateOptions options) throws TemplateParserException, IOException {
		TemplateParserBuilder templateParserBuilder = new TemplateParserBuilder(rootScope, templateFile, mode, options);
		templateParserBuilder.parse();
		return templateParserBuilder;
	}

	public void parse() throws TemplateParserException, IOException {
		start = System.nanoTime();

		TemplateTreeBuilder treeBuilder = new TemplateTreeBuilder(new TemplateFileSourceInfo(templateFile, null), mode, this);
		treeBuilder.parse();

		end = System.nanoTime();
	}

	protected String toString(InputSource source) throws TemplateParserException, IOException {
		StringBuilder builder = new StringBuilder();
		CharBuffer buffer = CharBuffer.allocate(4096);
		Reader reader = source.getCharacterStream();
		if (reader == null) {
			final InputStream inputStream = source.getByteStream();
			if (inputStream == null) {
				throwParserException(TemplateError.UNEXPECTED_ERROR, "No reader or stream in InputSource");
				return null; // Not needed, but avoids warnings
			}

			reader = new InputStreamReader(inputStream, Charsets.UTF_8);
		}

		while (reader.read(buffer) > 0) {
			buffer.flip();
			builder.append(buffer);
		}

		reader.close();

		return builder.toString();
	}

	@Override
	public void tree(TemplateFileSourceInfo source, Tree tree) throws TemplateParserException {
		parseDirectives(source, tree);
	}

	@Override
	public void text(TemplateFileSourceInfo source, String text) throws TemplateParserException {
		// TODO: We should pull in the proper line info here
		program.setSourceInformation(source, SourceInfo.NO_LINE, SourceInfo.NO_COLUMN);
		program.append(Opcode2.PRINT_LITERAL, text);
	}

	@Override
	public void done() throws TemplateParserException {
	}

	private void parseDirectives(TemplateFileSourceInfo source, Tree tree) throws TemplateParserException {
		final int type = tree.getType();
		switch (type) {
		case TemplateParser.TEMPLATE_STATEMENT_START:
			for (int i = 0; i < tree.getChildCount(); i++) {
				parseStatement(source, tree.getChild(i), tree.getChild(i).getType());
			}
			break;
		case TemplateParser.TEMPLATE_PRINT_START:
			parseStatement(source, tree, TemplateParser.PRINT);
			break;
		default:
			throwParserException(TemplateError.PARSE_ERROR, "Unexpected token: " + tree.getText(), tree);
			break;
		}
	}

	private void parseStatement(TemplateFileSourceInfo source, Tree tree, final int type) throws TemplateParserException {
		program.setSourceInformation(source, tree.getLine(), tree.getCharPositionInLine());

		boolean wasFirstStatement = firstStatement;
		firstStatement = false;

		switch (type) {
		case TemplateParser.INCLUDE: {
			URL parentUrl = source.getTemplateFile().getUrl();
			String include = tree.getChild(0).getText();
			try {
				URL url = new URL(parentUrl, include);
				TemplateFile templateFile = TemplateFile.fromUrl(url);
				TemplateTreeBuilder treeBuilder = new TemplateTreeBuilder(new TemplateFileSourceInfo(templateFile, new ParentSourceInfo(
						source, tree.getLine(), tree.getCharPositionInLine())), mode, this);
				treeBuilder.parse();
			} catch (MalformedURLException e) {
				throwParserException(TemplateError.BAD_IMPORT, "Invalid argument to import of " + include, e, tree);
			} catch (IOException e) {
				throwParserException(TemplateError.BAD_IMPORT, "Error while processing import of " + include + " (relative to " + parentUrl
						+ ")", e, tree);
			}
			break;
		}
		case TemplateParser.EXTENDS: {
			if (!wasFirstStatement) {
				throwParserException(TemplateError.EXTENDS_LOCATION, "extends must be the first instruction of a template");
			}

			URL parentUrl = source.getTemplateFile().getUrl();
			String extendsTemplate = tree.getChild(0).getText();
			try {
				URL url = new URL(parentUrl, extendsTemplate);
				TemplateFile templateFile = TemplateFile.fromUrl(url);
				TemplateTreeBuilder treeBuilder = new TemplateTreeBuilder(new TemplateFileSourceInfo(templateFile, new ParentSourceInfo(
						source, tree.getLine(), tree.getCharPositionInLine())), mode, this);
				treeBuilder.parse();
			} catch (MalformedURLException e) {
				throwParserException(TemplateError.BAD_EXTENDS, "Invalid argument to extends of " + extendsTemplate, e, tree);
			} catch (IOException e) {
				throwParserException(TemplateError.BAD_EXTENDS, "Error while processing extends of " + extendsTemplate + " (relative to "
						+ parentUrl + ")", e, tree);
			}
			break;
		}
		case TemplateParser.BLOCK: {
			ContentBlockContext context = new ContentBlockContext();
			blockStack.push(context);
			program.localAllocator.startBlock();
			break;
		}
		case TemplateParser.VAR: {
			int index = program.localAllocator.allocate(tree.getChild(0).getText());

			if (tree.getChildCount() == 2) {
				appendTree(tree.getChild(1));
				program.append(Opcode2.LOCAL_STORE, index);
			}

			break;
		}
		case TemplateParser.FOR: {
			ForBlockContext context = new ForBlockContext();

			Tree name = tree.getChild(0);
			Tree collection = tree.getChild(1);
			Tree limit = null;
			Tree orderBy = null;
			for (int i = 2; i < tree.getChildCount(); i += 2) {
				switch (tree.getChild(i).getType()) {
				case TemplateLexer.LIMIT:
					limit = tree.getChild(i + 1);
					break;
				case TemplateLexer.ORDER:
					orderBy = tree.getChild(i + 1);
					break;
				}
			}

			// Allocate a local for the name in its own private block
			program.localAllocator.startBlock();
			int local = program.localAllocator.allocate(name.getText());

			program.localAllocator.startBlock();

			// Turn the collection into an iterator
			appendTree(collection);
			program.append(Opcode2.ITERATOR);

			// This is a bit hacky: we order the list as a mini-program inside
			// the script
			if (orderBy != null) {
				Label end = program.createLabel();
				program.append(Opcode2.ITERATOR_START_ORDER_BY);
				Label loop = program.createLabelHere();
				program.append(Opcode2.ITERATOR_NEXT_OR_BRANCH, end);
				program.append(Opcode2.DUP);
				program.append(Opcode2.LOCAL_STORE, local);
				appendTree(orderBy);
				program.append(Opcode2.ITERATOR_PROCESS_ORDER_BY);
				program.append(Opcode2.GOTO, loop);
				program.affixLabel(end);
				program.append(Opcode2.ITERATOR_END_ORDER_BY);
			}

			if (limit != null) {
				appendTree(limit);
				program.append(Opcode2.ITERATOR_LIMIT);
			}

			context.end = program.createLabel();
			context.elseBlock = program.createLabel();
			context.loopstart = program.createLabel();

			program.append(Opcode2.ITERATOR_NEXT_OR_BRANCH, context.elseBlock);
			program.append(Opcode2.GOTO, context.loopstart);
			context.loop = program.createLabelHere();
			program.append(Opcode2.ITERATOR_NEXT_OR_BRANCH, context.end);
			program.affixLabel(context.loopstart);

			// Store the value of the iterator as a local
			program.append(Opcode2.LOCAL_STORE, local);

			blockStack.push(context);
			break;
		}
		case TemplateParser.CONTINUE: {
			ForBlockContext forBlock = null;
			for (int i = blockStack.size() - 1; i >= 0; i--) {
				if (blockStack.get(i) instanceof ForBlockContext) {
					forBlock = (ForBlockContext) blockStack.get(i);
					break;
				}
			}

			if (forBlock == null) {
				throwParserException(TemplateError.CONTINUE_WITHOUT_FOR, "CONTINUE without FOR", tree);
				return;
			}

			program.append(Opcode2.GOTO, forBlock.loop);
			break;
		}
		case TemplateParser.IF: {
			IfBlockContext context = new IfBlockContext();
			context.elseBlock = program.createLabel();
			context.end = program.createLabel();

			appendTree(tree.getChild(0));
			program.append(Opcode2.BRANCH_FALSE, context.elseBlock);
			blockStack.push(context);
			program.localAllocator.startBlock();

			break;
		}
		case TemplateParser.ELSE: {
			if (blockStack.isEmpty()) {
				throwParserException(TemplateError.ELSE_WITHOUT_BLOCK, "ELSE without IF or FOR", tree);
			}

			program.localAllocator.restartBlock();

			BlockContext context = blockStack.peek();
			if (context instanceof ForBlockContext) {
				ForBlockContext forBlockContext = (ForBlockContext) context;
				if (forBlockContext.elseBlock.isAffixed()) {
					throwParserException(TemplateError.FOR_DUPLICATE_ELSE, "FOR block already has an ELSE block", tree);
				}

				program.append(Opcode2.GOTO, forBlockContext.loop);
				program.affixLabel(forBlockContext.elseBlock);
				break;
			} else if (context instanceof IfBlockContext) {
				IfBlockContext ifBlockContext = (IfBlockContext) context;
				if (ifBlockContext.elseBlock.isAffixed()) {
					throwParserException(TemplateError.IF_DUPLICATE_ELSE, "IF block already has an ELSE block", tree);
				}

				program.append(Opcode2.GOTO, ifBlockContext.end);
				program.affixLabel(ifBlockContext.elseBlock);
				break;
			} else {
				assert false : "Unexpected block: " + context.getClass();
			}
			break;
		}
		case TemplateParser.ELIF: {
			if (blockStack.isEmpty()) {
				throwParserException(TemplateError.ELIF_WITHOUT_IF, "ELIF without IF", tree);
			}

			final BlockContext context = blockStack.peek();
			if (!(context instanceof IfBlockContext)) {
				throwParserException(TemplateError.ELIF_WITH_WRONG_BLOCK, "ELIF with incorrect block: " + type, tree);
			}

			IfBlockContext ifBlockContext = (IfBlockContext) context;

			program.localAllocator.restartBlock();

			program.append(Opcode2.GOTO, ifBlockContext.end);
			program.affixLabel(ifBlockContext.elseBlock);
			appendTree(tree.getChild(0));

			// Replace the current else label
			ifBlockContext.elseBlock = program.createLabel();
			program.append(Opcode2.BRANCH_FALSE, ifBlockContext.elseBlock);

			break;
		}
		case TemplateParser.END: {
			if (blockStack.isEmpty()) {
				throwParserException(TemplateError.END_WITHOUT_BLOCK, "END without IF or FOR", tree);
			}

			program.localAllocator.endBlock();

			BlockContext context = blockStack.pop();

			if (context instanceof IfBlockContext) {
				IfBlockContext ifBlockContext = (IfBlockContext) context;
				if (!ifBlockContext.end.isAffixed()) {
					program.affixLabel(ifBlockContext.end);
				}
				if (!ifBlockContext.elseBlock.isAffixed()) {
					program.affixLabel(ifBlockContext.elseBlock);
				}
			} else if (context instanceof ForBlockContext) {
				// for blocks have two local scopes
				program.localAllocator.endBlock();

				ForBlockContext forBlockContext = (ForBlockContext) context;

				if (!forBlockContext.elseBlock.isAffixed()) {
					program.append(Opcode2.GOTO, forBlockContext.loop);
				}

				program.affixLabel(forBlockContext.end);
				if (!forBlockContext.elseBlock.isAffixed()) {
					program.affixLabel(forBlockContext.elseBlock);
				}

				// Drop the iterator and the iterable
				program.append(Opcode2.DROP, 2);
			} else {
				assert false : "Unexpected block: " + context.getClass();
			}
			break;
		}
		case TemplateParser.EQ:
			appendTree(tree.getChild(1));
			int lookup = program.localAllocator.lookup(tree.getChild(0).getText());
			program.append(Opcode2.LOCAL_STORE, lookup);
			break;
		case TemplateParser.PRINT:
			for (int i = 0; i < tree.getChildCount(); i++) {
				appendTree(tree.getChild(i));
				program.append(Opcode2.PRINT);
			}
			break;
		default:
			throwParserException(TemplateError.PARSE_ERROR, "Unexpected token: " + tree.getText(), tree);
			break;
		}
	}

	private void appendTree(Tree tree) throws TemplateParserException {
		String text = tree.getText();

		int type = tree.getType();

		switch (type) {
		case TemplateParser.LSQUARE:
			if (tree.getChildCount() == 2) {
				appendTree(tree.getChild(0));
				appendTree(tree.getChild(1));
				program.append(Opcode2.DOT);
			} else {
				int added = 0;

				List<Tree> children = Lists.newArrayList();
				for (int i = 1; i < tree.getChildCount(); i++) {
					added++;
					if (tree.getChild(i).getType() == TemplateParser.COLON) {
						children.add(null);
					} else {
						children.add(tree.getChild(i));
						i++;
					}
				}

				while (children.size() < 3) {
					children.add(null);
				}

				appendTree(tree.getChild(0));

				for (int i = 0; i < children.size(); i++) {
					if (children.get(i) == null) {
						program.append(Opcode2.NULL);
					} else {
						appendTree(children.get(i));
					}
				}

				program.append(Opcode2.SLICE);
			}
			return;
		case TemplateParser.QUESTION:
			// Build ternary operator as a virtual if statement
			Label falseLabel = program.createLabel();
			Label endLabel = program.createLabel();
			appendTree(tree.getChild(0));
			program.append(Opcode2.BRANCH_FALSE, falseLabel);
			appendTree(tree.getChild(1));
			program.append(Opcode2.GOTO, endLabel);
			program.affixLabel(falseLabel);
			appendTree(tree.getChild(2));
			program.affixLabel(endLabel);

			return;
		}

		boolean isShortCircuitable = (type == TemplateParser.OR || type == TemplateParser.AND);
		Label shortCircuitLabel = null;

		if (isShortCircuitable) {
			shortCircuitLabel = program.createLabel();
		}

		for (int i = 0; i < tree.getChildCount(); i++) {
			if (i == 1 && isShortCircuitable) {
				program.append(type == TemplateParser.AND ? Opcode2.DUP_BRANCH_FALSE : Opcode2.DUP_BRANCH_TRUE, shortCircuitLabel);
			}

			appendTree(tree.getChild(i));
		}

		switch (type) {
		case TemplateParser.INT:
			program.append(Opcode2.LITERAL_INT, Integer.valueOf(text));
			break;
		case TemplateParser.INT_HEX:
			program.append(Opcode2.LITERAL_INT, Integer.valueOf(text.substring(2), 16));
			break;
		case TemplateParser.LIST:
			program.append(Opcode2.LITERAL_INT, tree.getChildCount());
			program.append(Opcode2.LITERAL_LIST);
			break;
		case TemplateParser.FLOAT:
			program.append(Opcode2.LITERAL_FLOAT, Double.valueOf(text));
			break;
		case TemplateParser.STRING:
		case TemplateParser.ID:
			program.append(Opcode2.LITERAL_STRING, text);
			break;
		case TemplateParser.AND:
			program.append(Opcode2.AND);
			break;
		case TemplateParser.OR:
			program.append(Opcode2.OR);
			break;
		case TemplateParser.IAND:
			program.append(Opcode2.IAND);
			break;
		case TemplateParser.IOR:
			program.append(Opcode2.IOR);
			break;
		case TemplateParser.XOR:
			program.append(Opcode2.XOR);
			break;
		case TemplateParser.TRUE:
			program.append(Opcode2.TRUE);
			break;
		case TemplateParser.FALSE:
			program.append(Opcode2.FALSE);
			break;
		case TemplateParser.NULL:
			program.append(Opcode2.NULL);
			break;
		case TemplateParser.SCOPE_LOOKUP:
			int lookup = program.localAllocator.lookup(text);
			if (lookup == -1) {
				program.append(Opcode2.SCOPE_LOOKUP, text);
			} else {
				program.append(Opcode2.LOCAL_LOAD, lookup);
			}
			break;
		case TemplateParser.DOT:
			program.append(Opcode2.DOT);
			break;
		case TemplateParser.QDOT:
			program.append(Opcode2.QDOT);
			break;
		case TemplateParser.UNARY_MINUS:
			program.append(Opcode2.UNARY_MINUS);
			break;
		case TemplateParser.UNARY_PLUS:
			program.append(Opcode2.UNARY_PLUS);
			break;
		case TemplateParser.PLUS:
			program.append(Opcode2.BINARY_PLUS);
			break;
		case TemplateParser.MINUS:
			program.append(Opcode2.BINARY_MINUS);
			break;
		case TemplateParser.MUL:
			program.append(Opcode2.MUL);
			break;
		case TemplateParser.DIV:
			program.append(Opcode2.DIV);
			break;
		case TemplateParser.TILDE:
			program.append(Opcode2.BITWISE_NOT);
			break;
		case TemplateParser.NOT:
			program.append(Opcode2.BOOLEAN_NOT);
			break;
		case TemplateParser.LSHIFT:
			program.append(Opcode2.LSHIFT);
			break;
		case TemplateParser.RSHIFT:
			program.append(Opcode2.RSHIFT);
			break;
		case TemplateParser.GT:
			program.append(Opcode2.GT);
			break;
		case TemplateParser.GTE:
			program.append(Opcode2.GTE);
			break;
		case TemplateParser.LT:
			program.append(Opcode2.LT);
			break;
		case TemplateParser.LTE:
			program.append(Opcode2.LTE);
			break;
		case TemplateParser.EQEQ:
			program.append(Opcode2.EQEQ);
			break;
		case TemplateParser.NE:
			program.append(Opcode2.NE);
			break;
		case TemplateParser.PIPE:
			// TODO: The filter name should be resolved in a separate opcode
			program.append(Opcode2.LITERAL_INT, tree.getChildCount() - 2);
			program.append(Opcode2.PIPE);
			break;
		case TemplateParser.LPAREN:
			program.append(Opcode2.LITERAL_INT, tree.getChildCount() - 2);
			program.append(Opcode2.INVOKE);
			break;
		case TemplateParser.TO:
			if (tree.getChildCount() == 2) {
				program.append(Opcode2.NEW_RANGE);
			} else {
				program.append(Opcode2.NEW_RANGE_BY);
			}
			break;
		case TemplateParser.IN:
			program.append(Opcode2.IN);
			break;
		default:
			throwParserException(TemplateError.PARSE_ERROR, "Parse successful. Found unimplemented token: " + tree.getText() + " (" + type
					+ ")", tree);
		}

		if (isShortCircuitable) {
			program.affixLabel(shortCircuitLabel);
		}
	}

	public TemplateImpl toTemplate() throws TemplateParserException {
		if (!blockStack.isEmpty()) {
			BlockContext block = blockStack.peek();

			if (block instanceof ForBlockContext) {
				throwParserException(TemplateError.FOR_MISSING_END, "FOR without END");
			} else {
				assert block instanceof IfBlockContext : "Unexpected block: " + block;
				throwParserException(TemplateError.IF_MISSING_END, "IF without END");
			}
		}

		int parseTimeInMillis = (int) ((end - start) / 1000000);

		ParseStatistics parseStatistics = new ParseStatistics(parseTimeInMillis, new Date(start));
		return new TemplateImpl(rootScope, options, program.toProgram(), parseStatistics);
	}
}
