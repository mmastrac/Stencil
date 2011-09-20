package net.stencilproject.template;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class IteratorUtils {
	/**
	 * Represents the null iterator - one that has no values.
	 */
	public static final Iterator<Object> NULL_ITERATOR = new Iterator<Object>() {
		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Object next() {
			return null;
		}

		@Override
		public void remove() {
		}
	};

	/**
	 * Limits an iterator to a given count.
	 */
	public static <T> Iterator<T> limitIterator(final Iterator<T> it, final long limit) {
		return new Iterator<T>() {
			long left = limit;

			@Override
			public void remove() {
			}

			@Override
			public T next() {
				left--;
				return it.next();
			}

			@Override
			public boolean hasNext() {
				return left > 0 && it.hasNext();
			}
		};
	}

	/**
	 * Converts a string to an iterator of characters.
	 */
	public static Iterator<Character> toIterator(final String value) {
		return new Iterator<Character>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < value.length();
			}

			@Override
			public Character next() {
				return value.charAt(index++);
			}

			@Override
			public void remove() {
			}
		};
	}

	/**
	 * Converts an array to an iterator of objects.
	 */
	public static Iterator<Object> toIteratorArray(final Object array) {
		final int length = Array.getLength(array);

		return new Iterator<Object>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < length;
			}

			@Override
			public Object next() {
				return Array.get(array, index++);
			}

			@Override
			public void remove() {
			}
		};
	}

	/**
	 * Wraps a map iterator with an iterator that returns tuples of [key,
	 * value].
	 */
	public static Iterator<?> toIterator(Map<?, ?> o) {
		final Iterator<?> it = o.entrySet().iterator();

		return new Iterator<Object>() {
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			@Override
			public Object next() {
				Map.Entry<?, ?> entry = (Entry<?, ?>) it.next();
				return new Object[] { entry.getKey(), entry.getValue() };
			}

			@Override
			public void remove() {
			}
		};
	}
}
