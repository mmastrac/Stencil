package net.stencilproject.template.types;

/**
 * Special type that represents raw HTML, XML or JSON (depends on the context).
 */
public class Raw {
	private final String raw;

	public Raw(String raw) {
		this.raw = raw;
	}

	@Override
	public String toString() {
		return raw;
	}
}
