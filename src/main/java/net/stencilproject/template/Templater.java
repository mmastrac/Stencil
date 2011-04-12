package net.stencilproject.template;

import java.io.IOException;

import net.stencilproject.template.TemplateParserException.TemplateError;


public class Templater {
	private final TemplateRootScope rootScope;
	private final TemplateOptions options;

	public Templater() {
		this(null, new TemplateOptions());
	}

	public Templater(TemplateRootScope rootScope) {
		this(rootScope, new TemplateOptions());
	}

	public Templater(TemplateRootScope rootScope, TemplateOptions options) {
		this.rootScope = rootScope;
		this.options = options;
	}

	public Template parse(TemplateMode mode, TemplateFile templateFile) throws TemplateParserException, IOException {
		TemplateParserBuilder baseTemplateParser = TemplateParserBuilder.parse(rootScope, templateFile, mode, options);

		return baseTemplateParser.toTemplate();
	}

	public Template parse(String input) throws TemplateParserException {
		TemplateParserBuilder baseTemplateParser;
		try {
			baseTemplateParser = TemplateParserBuilder.parse(rootScope, TemplateFile.fromString(input), TemplateMode.TEXT, options);
		} catch (IOException e) {
			// Impossible
			throw new TemplateParserException(TemplateError.UNEXPECTED_ERROR, e, null);
		}

		return baseTemplateParser.toTemplate();
	}

	public Template parseText(TemplateFile templateFile) throws TemplateParserException, IOException {
		TemplateParserBuilder templateParser = TemplateParserBuilder.parse(rootScope, templateFile, TemplateMode.TEXT, options);

		return templateParser.toTemplate();
	}

	public Template parseXml(boolean asHtml, String input) throws TemplateParserException {
		try {
			return parseXml(asHtml, TemplateFile.fromString(input));
		} catch (IOException e) {
			// Impossible
			throw new TemplateParserException(TemplateError.UNEXPECTED_ERROR, e, null);
		}
	}

	TemplateImpl parseXml(boolean asHtml, TemplateFile templateFile) throws TemplateParserException, IOException {
		TemplateParserBuilder templateParser = TemplateParserBuilder.parse(rootScope, templateFile, asHtml ? TemplateMode.HTML
				: TemplateMode.XML, options);

		return templateParser.toTemplate();
	}
}
