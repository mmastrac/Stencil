package net.stencilproject.template;

/**
 * Keeps track of a template file and a source info.
 */
class TemplateFileSourceInfo {
	private final TemplateFile templateFile;
	private final SourceInfo parent;

	public TemplateFileSourceInfo(TemplateFile templateFile, SourceInfo parent) {
		this.templateFile = templateFile;
		this.parent = parent;
	}

	public SourceInfo getParent() {
		return parent;
	}

	public TemplateFile getTemplateFile() {
		return templateFile;
	}
}
