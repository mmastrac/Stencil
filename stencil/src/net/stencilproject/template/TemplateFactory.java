package net.stencilproject.template;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import net.stencilproject.template.TemplateParserException.TemplateError;

/**
 * Creates templates from various sources, allowing them to be re-read without
 * restarting the application in development mode.
 */
public class TemplateFactory {
	private final TemplateOptions options;

	public TemplateFactory(TemplateOptions options) {
		this.options = options.clone();
	}

	public Template parseString(TemplateMode mode, TemplateRootScope rootScope, String template) throws TemplateParserException {
		try {
			return parse(mode, TemplateFile.fromString(template), rootScope);
		} catch (IOException e) {
			// This shouldn't happen
			throw new TemplateParserException(TemplateError.UNEXPECTED_ERROR, e, null);
		}
	}

	public Template parse(TemplateMode mode, TemplateRootScope rootScope, Class<?> clazz, String resourceName)
			throws TemplateParserException, IOException {
		return parse(mode, TemplateFile.fromResource(clazz, resourceName), rootScope);
	}

	public Template parse(final TemplateMode mode, final TemplateRootScope rootScope, final File file) throws TemplateParserException,
			IOException {
		return parse(mode, TemplateFile.fromFile(file), rootScope);
	}

	public Template parse(final TemplateMode mode, final TemplateRootScope rootScope, final URL input) throws TemplateParserException,
			IOException {
		return parse(mode, TemplateFile.fromUrl(input), rootScope);
	}

	private Template parse(TemplateMode mode, TemplateFile source, TemplateRootScope rootScope) throws TemplateParserException, IOException {
		return source.readTemplate(mode, rootScope, options);
	}
}
