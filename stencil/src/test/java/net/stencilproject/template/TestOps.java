package net.stencilproject.template;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

/**
 * Tests the operations in {@link Ops}.
 */
public class TestOps {
	private TemplateContext ctx;

	private enum Foo {
		VALUE0, VALUE1
	}

	private enum Bar {
		VALUE0, VALUE1
	}

	@Before
	public void setup() {
		ctx = new TemplateContext(null, null);
	}

	@Test
	public void testBooleanEquality() {
		assertEquals(true, CompareOps.eq(ctx, true, true));
		assertEquals(true, CompareOps.eq(ctx, false, false));
		assertEquals(false, CompareOps.eq(ctx, true, false));
		assertEquals(false, CompareOps.eq(ctx, false, true));

		assertEquals(false, CompareOps.lt(ctx, true, true));
		assertEquals(false, CompareOps.lt(ctx, false, false));
		assertEquals(false, CompareOps.lt(ctx, true, false));
		assertEquals(true, CompareOps.lt(ctx, false, true));

		assertEquals(false, CompareOps.gt(ctx, true, true));
		assertEquals(false, CompareOps.gt(ctx, false, false));
		assertEquals(true, CompareOps.gt(ctx, true, false));
		assertEquals(false, CompareOps.gt(ctx, false, true));
	}

	@Test
	public void testDateEquality() {
		Date d1 = new Date(1000001);
		Date d2 = new Date(1000002);

		java.sql.Date sd1 = new java.sql.Date(1000001);
		java.sql.Date sd2 = new java.sql.Date(1000002);

		assertTrue(d1.getClass().isInstance(sd1));

		assertEquals(true, CompareOps.eq(ctx, d1, d1));
		assertEquals(true, CompareOps.eq(ctx, d1, sd1));
		assertEquals(true, CompareOps.eq(ctx, sd1, d1));
		assertEquals(true, CompareOps.eq(ctx, sd1, sd1));
		assertEquals(false, CompareOps.eq(ctx, d1, d2));
		assertEquals(false, CompareOps.eq(ctx, d1, sd2));
		assertEquals(false, CompareOps.eq(ctx, sd1, d2));
		assertEquals(false, CompareOps.eq(ctx, sd1, sd2));

		assertEquals(false, CompareOps.lt(ctx, d1, d1));
		assertEquals(false, CompareOps.lt(ctx, d1, sd1));
		assertEquals(false, CompareOps.lt(ctx, sd1, d1));
		assertEquals(false, CompareOps.lt(ctx, sd1, sd1));
		assertEquals(true, CompareOps.lt(ctx, d1, d2));
		assertEquals(true, CompareOps.lt(ctx, d1, sd2));
		assertEquals(true, CompareOps.lt(ctx, sd1, d2));
		assertEquals(true, CompareOps.lt(ctx, sd1, sd2));

		assertEquals(false, CompareOps.gt(ctx, d1, d1));
		assertEquals(false, CompareOps.gt(ctx, d1, sd1));
		assertEquals(false, CompareOps.gt(ctx, sd1, d1));
		assertEquals(false, CompareOps.gt(ctx, sd1, sd1));
		assertEquals(false, CompareOps.gt(ctx, d1, d2));
		assertEquals(false, CompareOps.gt(ctx, d1, sd2));
		assertEquals(false, CompareOps.gt(ctx, sd1, d2));
		assertEquals(false, CompareOps.gt(ctx, sd1, sd2));
	}

	@Test
	public void testAnd() {
		assertEquals(10, Ops.and(null, 1, 10));
		assertEquals(1, Ops.and(null, 10, 1));
		assertEquals(10, Ops.and(null, 10, 10));

		assertEquals(null, Ops.and(null, null, 10));
		assertEquals(0, Ops.and(null, 0, 10));
		assertEquals(null, Ops.and(null, 10, null));
		assertEquals(0, Ops.and(null, 10, 0));
	}

	@Test
	public void testOr() {
		assertEquals(1, Ops.or(null, 1, 10));
		assertEquals(10, Ops.or(null, 10, 1));
		assertEquals(10, Ops.or(null, 10, 10));

		assertEquals(10, Ops.or(null, null, 10));
		assertEquals(10, Ops.or(null, 0, 10));
		assertEquals(10, Ops.or(null, 10, null));
		assertEquals(10, Ops.or(null, 10, 0));

		assertEquals(true, Ops.or(null, null, true));
		assertEquals(false, Ops.or(null, null, false));
	}

	@Test
	public void testLongMath() {
		assertEquals(10L * 86400L * 1000000L, Ops.mul(null, Ops.mul(null, 10, 86400), 1000000));
		assertEquals(0x100000000L / 0x1000L, Ops.div(null, 0x100000000L, 0x1000));
		assertEquals(0x100000000L ^ 0x1000L, Ops.xor(null, 0x100000000L, 0x1000));
		assertEquals(0x100000000L % 0x999L, Ops.mod(null, 0x100000000L, 0x999));
	}

	@Test
	public void testIn() {
		assertTrue(Ops.in(null, 1, new LongRange(1, 2)));
		assertTrue(Ops.in(null, 1, new DoubleRange(1, 2)));
		assertFalse(Ops.in(null, 0, new LongRange(1, 2)));
		assertFalse(Ops.in(null, 0, new DoubleRange(1, 2)));

		assertTrue(Ops.in(null, "a", "cat"));
		assertTrue(Ops.in(null, "a", 'a'));
		assertFalse(Ops.in(null, "a", "boo"));
		assertFalse(Ops.in(null, "a", 'o'));

		assertTrue(Ops.in(null, 1, Arrays.asList(1, 2, 3)));
		assertTrue(Ops.in(null, 1L, Arrays.asList(1, 2, 3)));
		assertFalse(Ops.in(null, 10, Arrays.asList(1, 2, 3)));
		assertFalse(Ops.in(null, 10L, Arrays.asList(1, 2, 3)));

		assertTrue(Ops.in(null, 1, new Object[] { 1, 2, 3 }));
		assertTrue(Ops.in(null, 1, new int[] { 1, 2, 3 }));
		assertTrue(Ops.in(null, 1, new long[] { 1, 2, 3 }));
		assertTrue(Ops.in(null, 1L, new Object[] { 1, 2, 3 }));
		assertTrue(Ops.in(null, 1L, new int[] { 1, 2, 3 }));
		assertTrue(Ops.in(null, 1L, new long[] { 1, 2, 3 }));
		assertFalse(Ops.in(null, 10, new Object[] { 1, 2, 3 }));
		assertFalse(Ops.in(null, 10, new int[] { 1, 2, 3 }));
		assertFalse(Ops.in(null, 10, new long[] { 1, 2, 3 }));
		assertFalse(Ops.in(null, 10L, new Object[] { 1, 2, 3 }));
		assertFalse(Ops.in(null, 10L, new int[] { 1, 2, 3 }));
		assertFalse(Ops.in(null, 10L, new long[] { 1, 2, 3 }));

		Map<Object, Object> map = Maps.newHashMap();
		map.put("a", "b");

		assertTrue(Ops.in(null, "a", map));
		assertTrue(Ops.in(null, 'a', map));
		assertFalse(Ops.in(null, "b", map));
		assertFalse(Ops.in(null, 'b', map));
	}

	@Test
	public void testCompare() {
		Comparator<Object> comparator = new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return CompareOps.compare(ctx, o1, o2);
			}
		};

		// Non-strings promoted to strings in compare
		Object[] o1 = new Object[] { 5, 2, 1, 3, 6, 4 };
		Arrays.sort(o1, comparator);
		assertArrayEquals(new Object[] { 1, 2, 3, 4, 5, 6 }, o1);
	}

	/**
	 * Tests {@link CompareOps#eq(TemplateContext, Object, Object)} and
	 * {@link CompareOps#neq(TemplateContext, Object, Object)} for enums.
	 */
	@Test
	public void testEnumEqNew() {
		assertEqTrue(ctx, Foo.VALUE0, Foo.VALUE0);
		assertEqTrue(ctx, Foo.VALUE0, 0);
		assertEqTrue(ctx, Foo.VALUE0, 0.0);
		assertEqTrue(ctx, Foo.VALUE0, 0.0f);
		assertEqTrue(ctx, Foo.VALUE0, "VALUE0");
		assertEqFalse(ctx, Foo.VALUE0, Foo.VALUE1);
		assertEqFalse(ctx, Foo.VALUE0, Bar.VALUE0);
		assertEqFalse(ctx, Foo.VALUE0, 1);
		assertEqFalse(ctx, Foo.VALUE0, "0");
		assertEqFalse(ctx, Foo.VALUE0, "VALUE1");
		assertEqFalse(ctx, Foo.VALUE0, null);
	}

	private void assertEqFalse(TemplateContext ctx2, Object o1, Object o2) {
		assertFalse(CompareOps.eq(ctx2, o1, o2));
		assertTrue(CompareOps.neq(ctx2, o1, o2));
	}

	private void assertEqTrue(TemplateContext ctx2, Object o1, Object o2) {
		assertTrue(CompareOps.eq(ctx2, o1, o2));
		assertFalse(CompareOps.neq(ctx2, o1, o2));
	}
}
