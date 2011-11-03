package net.stencilproject.template;

import java.net.URL;

public class TemplateParserException extends Exception {
	private static final long serialVersionUID = 1L;
	private final TemplateError error;
	private int line;
	private int charPositionInLine;
	private URL file;

	public enum TemplateError {
		/* Failed to parse a directive in the template */
		PARSE_ERROR,
		/* Failed to parse XML */
		XML_ERROR,
		/* IF missing an END */
		IF_MISSING_END,
		/* FOR missing an END */
		FOR_MISSING_END,
		/* IF already has ELSE */
		IF_DUPLICATE_ELSE,
		/* FOR already has ELSE */
		FOR_DUPLICATE_ELSE,
		/* FOR already has JOIN */
		FOR_DUPLICATE_JOIN,
		/* JOIN must appear after ELSE */
		FOR_JOIN_AFTER_ELSE,
		/* JOIN without FOR */
		JOIN_WITHOUT_FOR,
		/* ELSE without IF/FOR */
		ELSE_WITHOUT_BLOCK,
		/* END without IF/FOR */
		END_WITHOUT_BLOCK,
		/* ELIF without an IF */
		ELIF_WITHOUT_IF,
		/* ELIF with wrong type of block */
		ELIF_WITH_WRONG_BLOCK,
		/* Continue statement with no enclosing FOR */
		CONTINUE_WITHOUT_FOR,
		/* Unexpected error */
		UNEXPECTED_ERROR,
		/* Problem parsing import URL */
		BAD_IMPORT,
		/* Problem parsing extends URL */
		BAD_EXTENDS,
		/* Extends must be the first statement */
		EXTENDS_LOCATION,
	}

	public TemplateParserException(TemplateError error, String message, URL file) {
		super(getUrlString(file) + ' ' + message);
		this.error = error;
		this.file = file;
	}

	public TemplateParserException(TemplateError error, Throwable cause, URL file) {
		super(getUrlString(file) + " exception", cause);
		this.error = error;
		this.file = file;
	}

	public TemplateParserException(TemplateError error, Throwable cause, String message, URL file) {
		super(getUrlString(file) + ' ' + message, cause);
		this.error = error;
		this.file = file;
	}

	public TemplateParserException(TemplateError error, String message, URL file, int line, int charPositionInLine) {
		super(getUrlString(file) + line + ':' + charPositionInLine + ' ' + message);
		this.error = error;
		this.file = file;
		this.line = line;
		this.charPositionInLine = charPositionInLine;
	}

	public TemplateParserException(TemplateError error, Exception e, String message, URL file, int line, int charPositionInLine) {
		super(getUrlString(file) + line + ':' + charPositionInLine + ' ' + message, e);
		this.error = error;
		this.file = file;
		this.line = line;
		this.charPositionInLine = charPositionInLine;
	}

	public TemplateError getError() {
		return error;
	}

	public URL getFile() {
		return file;
	}

	public int getLine() {
		return line;
	}

	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	private static String getUrlString(URL url) {
		if (url == null) {
			return "string:";
		}
		return "" + url + ':';
	}
}
