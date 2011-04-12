package net.stencilproject.template;

import java.io.IOException;

public interface TemplateSource {
	Template readTemplate(TemplateRootScope rootScope) throws TemplateParserException, IOException;
}
