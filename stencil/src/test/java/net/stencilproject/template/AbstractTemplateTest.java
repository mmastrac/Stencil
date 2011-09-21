package net.stencilproject.template;

import java.io.IOException;

public abstract class AbstractTemplateTest {
	private TemplateOptions getTemplateOptions() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return options;
	}

	protected Template parse(String text) throws TemplateParserException {
		return new TemplateFactory(getTemplateOptions()).parseString(TemplateMode.TEXT, null, text);
	}

	protected Template parseResource(String filename) throws TemplateParserException, IOException {
		return new TemplateFactory(getTemplateOptions()).parse(TemplateMode.TEXT, null, getClass(), filename);
	}

	protected Template parse(TemplateRootScope rootScope, String text) throws TemplateParserException {
		return new TemplateFactory(getTemplateOptions()).parseString(TemplateMode.TEXT, rootScope, text);
	}

	protected Template parseHtml(String text) throws TemplateParserException {
		return new TemplateFactory(getTemplateOptions()).parseString(TemplateMode.HTML, null, text);
	}

	protected Template parseXml(String text) throws TemplateParserException {
		return new TemplateFactory(getTemplateOptions()).parseString(TemplateMode.XML, null, text);
	}

	protected Template parseResourceXml(String filename) throws TemplateParserException, IOException {
		return new TemplateFactory(getTemplateOptions()).parse(TemplateMode.XML, null, getClass(), filename);
	}

}
