package net.stencilproject.template;

/**
 * Represents the original source location.
 */
public interface SourceInfo {
	int NO_COLUMN = -1;
	int NO_LINE = -1;

	/**
	 * Gets the parent of this source info (the location it was included from).
	 */
	SourceInfo getParent();

	TemplateFile getSource();

	int getLine();

	int getColumn();
}
