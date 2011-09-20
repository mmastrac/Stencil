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

	public TemplateSource getTemplateSourceFromString(final TemplateMode mode, final String string) {
		return new TemplateSource() {
			@Override
			public Template readTemplate(final TemplateRootScope rootScope) throws TemplateParserException, IOException {
				return readTemplateInternal(mode, rootScope, TemplateFile.fromString(string));
			}
		};
	}

	public TemplateSource getTemplateSource(final TemplateMode mode, final File file) {
		if (mode == null) {
			throw new NullPointerException("mode is null");
		}
		if (file == null) {
			throw new NullPointerException("file is null");
		}

		return new TemplateSource() {
			@Override
			public Template readTemplate(final TemplateRootScope rootScope) throws TemplateParserException, IOException {
				return readTemplateInternal(mode, rootScope, TemplateFile.fromFile(file));
			}
		};
	}

	public TemplateSource getTemplateSource(final TemplateMode mode, final URL input) {
		if (mode == null) {
			throw new NullPointerException("mode is null");
		}
		if (input == null) {
			throw new NullPointerException("input is null");
		}

		return new TemplateSource() {
			@Override
			public Template readTemplate(final TemplateRootScope rootScope) throws TemplateParserException, IOException {
				return readTemplateInternal(mode, rootScope, TemplateFile.fromUrl(input));
			}
		};
	}

	public TemplateSource getTemplateSource(TemplateMode mode, Class<?> clazz, String resourceName) {
		if (mode == null) {
			throw new NullPointerException("mode is null");
		}
		if (clazz == null) {
			throw new NullPointerException("clazz is null");
		}
		if (resourceName == null) {
			throw new NullPointerException("resourceName is null");
		}

		URL resource = clazz.getResource(resourceName);
		if (resource == null) {
			return null;
		}
		return getTemplateSource(mode, resource);
	}

	public Template parseString(TemplateMode mode, TemplateRootScope rootScope, String template) throws TemplateParserException {
		try {
			return parse(getTemplateSourceFromString(mode, template), rootScope);
		} catch (IOException e) {
			// This shouldn't happen
			throw new TemplateParserException(TemplateError.UNEXPECTED_ERROR, e, null);
		}
	}

	public Template parse(TemplateMode mode, TemplateRootScope rootScope, Class<?> clazz, String resourceName)
			throws TemplateParserException, IOException {
		return parse(getTemplateSource(mode, clazz, resourceName), rootScope);
	}

	public Template parse(final TemplateMode mode, final TemplateRootScope rootScope, final File file) throws TemplateParserException,
			IOException {
		return parse(getTemplateSource(mode, file), rootScope);
	}

	public Template parse(final TemplateMode mode, final TemplateRootScope rootScope, final URL input) throws TemplateParserException,
			IOException {
		return parse(getTemplateSource(mode, input), rootScope);
	}

	public Template parse(TemplateSource source, TemplateRootScope rootScope) throws TemplateParserException, IOException {
		return options.isDevelopmentMode() ? new DevModeTemplateImpl(source, rootScope) : source.readTemplate(rootScope);
	}

	private Template readTemplateInternal(TemplateMode mode, TemplateRootScope rootScope, TemplateFile templateFile)
			throws TemplateParserException, IOException {
		if (mode == TemplateMode.TEXT) {
			TemplateBuilder templateParser = TemplateBuilder.parse(rootScope, templateFile, TemplateMode.TEXT, options);
			return templateParser.toTemplate();
		} else {
			TemplateBuilder templateParser = TemplateBuilder.parse(rootScope, templateFile, mode == TemplateMode.HTML ? TemplateMode.HTML
					: TemplateMode.XML, options);

			return templateParser.toTemplate();
		}
	}
}
