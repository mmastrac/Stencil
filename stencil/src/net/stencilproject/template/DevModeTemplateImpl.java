package net.stencilproject.template;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

class DevModeTemplateImpl implements Template {
	private final TemplateSource source;
	private final TemplateRootScope rootScope;

	public DevModeTemplateImpl(TemplateSource source, TemplateRootScope rootScope) {
		this.source = source;
		this.rootScope = rootScope;
	}

	@Override
	public String process(Map<String, ?> model) throws RuntimeTemplateProcessingException {
		try {
			return readTemplate().process(model);
		} catch (IOException e) {
			throw new RuntimeTemplateProcessingException(e);
		} catch (TemplateParserException e) {
			throw new RuntimeTemplateProcessingException(e);
		}
	}

	@Override
	public RunStatistics process(Map<String, ?> model, Writer writer) throws RuntimeTemplateProcessingException, IOException {
		try {
			return readTemplate().process(model, writer);
		} catch (TemplateParserException e) {
			throw new RuntimeTemplateProcessingException(e);
		}
	}

	@Override
	public String toString() {
		try {
			return readTemplate().toString();
		} catch (TemplateParserException e) {
			return "(error parsing template)";
		} catch (IOException e) {
			return "(error reading template)";
		}
	}

	private Template readTemplate() throws TemplateParserException, IOException {
		return source.readTemplate(rootScope);
	}
}
