package net.stencilproject.template;

class TemplateFileSourceInfo implements SourceInfo {
	private final TemplateFile file;
	private final SourceInfo parent;
	private final int line;
	private final int column;

	public TemplateFileSourceInfo(TemplateFile file) {
		this.file = file;
		this.parent = null;
		this.line = SourceInfo.NO_LINE;
		this.column = SourceInfo.NO_COLUMN;
	}

	public TemplateFileSourceInfo(TemplateFile file, SourceInfo parent, int line, int column) {
		this.file = file;
		this.parent = parent;
		this.line = line;
		this.column = column;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public SourceInfo getParent() {
		return parent;
	}

	@Override
	public TemplateFile getSource() {
		return file;
	}
}
