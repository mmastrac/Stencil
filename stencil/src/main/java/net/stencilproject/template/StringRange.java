package net.stencilproject.template;

import java.util.Iterator;

/**
 * TODO.
 */
class StringRange implements Iterable<String> {
	String start;
	String end;
	long skip;

	public StringRange(String start, String end) {
		this.start = start;
		this.end = end;
		this.skip = (start.compareTo(end) > 0) ? +1 : -1;
	}

	public StringRange(String start, String end, long skip) {

	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String nextString(String value) {
		return null;
	}
}
