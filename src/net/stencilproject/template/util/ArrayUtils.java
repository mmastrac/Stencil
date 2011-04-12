package net.stencilproject.template.util;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Replaces common {@link Arrays} methods not available in Android.
 */
public class ArrayUtils {
	public static int[] copyOf(int[] in, int length) {
		int[] out = new int[length];
		if (length > 0) {
			System.arraycopy(in, 0, out, 0, Math.min(length, in.length));
		}

		return out;
	}

	@SuppressWarnings("unchecked")
	public static <T> T[] copyOf(T[] in, int length) {
		T[] out = (T[]) Array.newInstance(in.getClass().getComponentType(), length);
		if (length > 0) {
			System.arraycopy(in, 0, out, 0, Math.min(length, in.length));
		}

		return out;
	}

	@SuppressWarnings("unchecked")
	public static <T> T[] copyOfRange(T[] in, int start, int end) {
		int length = end - start;
		if (length < 0) {
			throw new IllegalArgumentException("end < start");
		}
		T[] out = (T[]) Array.newInstance(in.getClass().getComponentType(), length);
		if (length > 0) {
			System.arraycopy(in, start, out, 0, Math.min(length, in.length - start));
		}

		return out;
	}

	public static String toString(Object[] a) {
		if (a == null) {
			return "null";
		}

		if (a.length == 0) {
			return "[]";
		}

		StringBuilder b = new StringBuilder("[");
		boolean first = true;
		for (Object o : a) {
			if (!first) {
				b.append(", ");
			} else {
				first = false;
			}
			b.append(o);
		}
		b.append(']');
		return b.toString();
	}

}
