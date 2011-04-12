package net.stencilproject.template;

import java.util.Iterator;

import com.google.common.collect.Iterators;

/**
 * Iterates over a range of long values.
 */
class LongRange implements Iterable<Long> {
	private final long l1;
	private final long l2;
	private final long skip;
	private final boolean invalid;

	public LongRange(long l1, long l2) {
		this.l1 = l1;
		this.l2 = l2;
		this.skip = l1 > l2 ? -1 : +1;
		this.invalid = false;
	}

	public LongRange(long l1, long l2, long skip) {
		if (skip == 0 || (l1 != l2 && (l1 < l2 != skip > 0))) {
			invalid = true;
		} else {
			invalid = false;
		}

		this.skip = skip;
		this.l1 = l1;
		this.l2 = l2;
	}

	public boolean in(long value) {
		if (invalid) {
			return false;
		}

		if (l1 >= l2) {
			return value <= l1 && value >= l2;
		}

		return value >= l1 && value <= l2;
	}

	@Override
	public Iterator<Long> iterator() {
		if (invalid) {
			return Iterators.emptyIterator();
		}

		return new Iterator<Long>() {
			long current = l1;
			boolean hasNext = true;

			@Override
			public boolean hasNext() {
				return hasNext;
			}

			@Override
			public Long next() {
				long l = current;
				current += skip;
				hasNext = (skip > 0) ? current <= l2 : current >= l2;
				return l;
			}

			@Override
			public void remove() {
			}
		};
	}
}
