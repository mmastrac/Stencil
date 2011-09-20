package net.stencilproject.template;

/**
 * {@link SourceInfo} implementation that represents the top-level of a
 * {@link TemplateFile}.
 */
class TemplateFileSourceInfo implements SourceInfo {
	private final TemplateFile file;
	private final SourceInfo parent;
	private final int line;
	private final int column;

	/**
	 * Constructs the top-level {@link SourceInfo} for a {@link TemplateFile}.
	 */
	public TemplateFileSourceInfo(TemplateFile file) {
		this.file = file;
		this.parent = null;
		this.line = SourceInfo.NO_LINE;
		this.column = SourceInfo.NO_COLUMN;
	}

	/**
	 * Constructs a nested {@link SourceInfo} where a {@link TemplateFile} has
	 * been included from another {@link TemplateFile}.
	 */
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
