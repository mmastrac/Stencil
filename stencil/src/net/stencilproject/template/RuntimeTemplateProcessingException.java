package net.stencilproject.template;

/**
 * Exception thrown in development mode when a template cannot be re-processed.
 */
public class RuntimeTemplateProcessingException extends RuntimeException {
	private static final long serialVersionUID = 1946058983270435863L;

	public RuntimeTemplateProcessingException(Exception e) {
		super(e);
	}
}
