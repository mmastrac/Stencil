package net.stencilproject.template;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import net.stencilproject.template.TemplateParserException.TemplateError;

import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;
import org.apache.commons.io.IOUtils;

import com.google.common.collect.Maps;

/**
 * Base class for things involved in parsing. Contains useful methods for throwing proper exceptions.
 */
class BaseParser {
	protected final TemplateFileSourceInfo source;
	protected final TemplateFile templateFile;
	protected final URL rootUrl;

	public BaseParser(TemplateFileSourceInfo source) {
		this.source = source;
		this.templateFile = source.getTemplateFile();
		this.rootUrl = templateFile.getUrl();
	}

	protected void throwParserException(TemplateError error, Exception e) throws TemplateParserException {
		if (e instanceof RecognitionException) {
			final RecognitionException recognitionException = (RecognitionException) e;
			int line = recognitionException.line;
			int charPositionInLine = recognitionException.charPositionInLine;

			String message = e.toString();

			if (e instanceof MismatchedTokenException) {
				MismatchedTokenException mte = (MismatchedTokenException) e;
				try {
					Map<Integer, String> tokens = readTokens();

					String found = mte.token == null ? ("'" + (char) mte.c + "'") : tokens.get(mte.token.getType()) + " ('"
							+ mte.token.getText() + "')";
					message = "Unexpected token: found " + found + " but was expecting " + tokens.get(mte.expecting);
				} catch (IOException e1) {
					// eat and continue with default message
				}
			}

			throw new TemplateParserException(error, e, message, rootUrl, line, charPositionInLine);
		}

		throw new TemplateParserException(error, e, rootUrl);
	}

	private Map<Integer, String> readTokens() throws IOException {
		@SuppressWarnings("unchecked")
		List<String> lines = IOUtils.readLines(getClass().getResourceAsStream("Template.tokens"));
		Map<Integer, String> tokens = Maps.newHashMap();
		for (String token : lines) {
			int split = token.lastIndexOf('=');
			String id = token.substring(split + 1);
			String tokenName = token.substring(0, split);
			tokens.put(Integer.parseInt(id), tokenName);
		}
		return tokens;
	}

	protected void throwParserException(TemplateError error, String message, Exception e, Tree tree) throws TemplateParserException {
		throw new TemplateParserException(error, e, message, rootUrl, tree.getLine(), tree.getCharPositionInLine());
	}

	protected void throwParserException(TemplateError error, String string) throws TemplateParserException {
		throw new TemplateParserException(error, string, rootUrl);
	}

	protected void throwParserException(TemplateError error, String string, Tree tree) throws TemplateParserException {
		throw new TemplateParserException(error, string, rootUrl, tree.getLine(), tree.getCharPositionInLine());
	}
}
