package net.stencilproject.template;

import java.io.IOException;

public abstract class AbstractTemplateTest {
	protected Template parse(String text) throws TemplateParserException {
		return new TemplateFactory(new TemplateOptions()).parseString(TemplateMode.TEXT, null, text);
	}

	protected Template parseResource(String filename) throws TemplateParserException, IOException {
		return new TemplateFactory(new TemplateOptions()).parse(TemplateMode.TEXT, null, getClass(), filename);
	}

	protected Template parse(TemplateRootScope rootScope, String text) throws TemplateParserException {
		return new TemplateFactory(new TemplateOptions()).parseString(TemplateMode.TEXT, rootScope, text);
	}

	protected Template parseHtml(String text) throws TemplateParserException {
		return new TemplateFactory(new TemplateOptions()).parseString(TemplateMode.HTML, null, text);
	}

	protected Template parseXml(String text) throws TemplateParserException {
		return new TemplateFactory(new TemplateOptions()).parseString(TemplateMode.XML, null, text);
	}

	protected Template parseResourceXml(String filename) throws TemplateParserException, IOException {
		return new TemplateFactory(new TemplateOptions()).parse(TemplateMode.XML, null, getClass(), filename);
	}

}
