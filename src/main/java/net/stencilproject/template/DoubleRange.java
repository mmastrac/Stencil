package net.stencilproject.template;

import java.util.Iterator;

import com.google.common.collect.Iterators;

/**
 * Iterates over a range of double values.
 */
class DoubleRange implements Iterable<Double> {
	private final double d1;
	private final double d2;
	private double skip;
	private final boolean invalid;

	public DoubleRange(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
		this.skip = d1 > d2 ? -1 : +1;
		this.invalid = false;
	}

	public DoubleRange(double d1, double d2, double skip) {
		if (skip == 0 || (d1 != d2 && (d1 < d2 != skip > 0))) {
			invalid = true;
		} else {
			invalid = false;
		}

		this.skip = skip;
		this.d1 = d1;
		this.d2 = d2;
	}

	public boolean in(double value) {
		if (invalid) {
			return false;
		}

		if (d1 >= d2) {
			return value <= d1 && value >= d2;
		}

		return value >= d1 && value <= d2;
	}

	@Override
	public Iterator<Double> iterator() {
		if (invalid) {
			return Iterators.emptyIterator();
		}

		return new Iterator<Double>() {
			double current = d1;
			boolean hasNext = true;

			@Override
			public boolean hasNext() {
				return hasNext;
			}

			@Override
			public Double next() {
				double d = current;
				current += skip;
				hasNext = (skip > 0) ? current <= d2 : current >= d2;
				return d;
			}

			@Override
			public void remove() {
			}
		};
	}
}
