package net.stencilproject.template.util;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayUtils {

	@SuppressWarnings("unchecked")
	public static <T> T[] copyOf(T[] original, int newLength) {
		return (T[]) copyOf(original, newLength, original.getClass());
	}

	@SuppressWarnings("unchecked")
	public static <T, U> T[] copyOf(U[] original, int newLength, Class<? extends T[]> newType) {
		T[] copy = ((Object) newType == (Object) Object[].class) ? (T[]) new Object[newLength] : (T[]) Array.newInstance(
				newType.getComponentType(), newLength);
		System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
		return copy;
	}

	public static int[] copyOf(int[] original, int newLength) {
		int[] copy = new int[newLength];
		System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
		return copy;
	}

	@SuppressWarnings("unchecked")
	public static <T> T[] copyOfRange(T[] original, int from, int to) {
		return copyOfRange(original, from, to, (Class<T[]>) original.getClass());
	}

	@SuppressWarnings("unchecked")
	public static <T, U> T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType) {
		int newLength = to - from;
		if (newLength < 0) {
			throw new IllegalArgumentException(from + " > " + to);
		}
		T[] copy = ((Object) newType == (Object) Object[].class) ? (T[]) new Object[newLength] : (T[]) Array.newInstance(
				newType.getComponentType(), newLength);
		System.arraycopy(original, from, copy, 0, Math.min(original.length - from, newLength));
		return copy;
	}

	public static String toString(Object[] a) {
		if (a == null) {
			return "null";
		}
		int iMax = a.length - 1;
		if (iMax == -1) {
			return "[]";
		}

		StringBuilder b = new StringBuilder();
		b.append('[');
		for (int i = 0;; i++) {
			b.append(String.valueOf(a[i]));
			if (i == iMax) {
				return b.append(']').toString();
			}
			b.append(", ");
		}
	}

	public static <T> List<T> asList(T... a) {
		return new ArrayList<T>(a);
	}

	private static class ArrayList<E> extends AbstractList<E> implements RandomAccess, java.io.Serializable {
		private static final long serialVersionUID = -2764017481108945198L;
		private final E[] a;

		ArrayList(E[] array) {
			if (array == null) {
				throw new NullPointerException();
			}
			a = array;
		}

		@Override
		public int size() {
			return a.length;
		}

		@Override
		public Object[] toArray() {
			return a.clone();
		}

		@Override
		@SuppressWarnings("unchecked")
		public <T> T[] toArray(T[] a) {
			int size = size();
			if (a.length < size) {
				return ArrayUtils.copyOf(this.a, size, (Class<? extends T[]>) a.getClass());
			}
			System.arraycopy(this.a, 0, a, 0, size);
			if (a.length > size) {
				a[size] = null;
			}
			return a;
		}

		@Override
		public E get(int index) {
			return a[index];
		}

		@Override
		public E set(int index, E element) {
			E oldValue = a[index];
			a[index] = element;
			return oldValue;
		}

		@Override
		public int indexOf(Object o) {
			if (o == null) {
				for (int i = 0; i < a.length; i++) {
					if (a[i] == null) {
						return i;
					}
				}
			} else {
				for (int i = 0; i < a.length; i++) {
					if (o.equals(a[i])) {
						return i;
					}
				}
			}
			return -1;
		}

		@Override
		public boolean contains(Object o) {
			return indexOf(o) != -1;
		}
	}
}
