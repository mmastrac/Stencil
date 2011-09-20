package net.stencilproject.template;

import org.antlr.runtime.tree.Tree;

/**
 * Events that {@link TemplateBuilder} handles.
 */
interface TemplateBuilderEvents {
	void text(TemplateFileSourceInfo source, String text) throws TemplateParserException;

	void tree(TemplateFileSourceInfo source, Tree tree) throws TemplateParserException;

	void done() throws TemplateParserException;
}