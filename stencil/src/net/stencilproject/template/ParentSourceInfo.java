package net.stencilproject.template;

class ParentSourceInfo implements SourceInfo {
	private final TemplateFileSourceInfo parent;
	private final int line;
	private final int column;

	public ParentSourceInfo(TemplateFileSourceInfo parent, int line, int column) {
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
		return parent.getParent();
	}

	@Override
	public TemplateFile getSource() {
		return parent.getTemplateFile();
	}
}
