package net.stencilproject.template.xml;

public class NotWellFormedException extends Exception {
	private static final long serialVersionUID = 1L;

	public NotWellFormedException(String message, int c) {
		super(message + ", got '" + new String(new int[] { c }, 0, 1) + "'");
	}
}
