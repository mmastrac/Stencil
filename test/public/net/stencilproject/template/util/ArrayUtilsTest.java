package net.stencilproject.template.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ArrayUtilsTest {
	@Test
	public void testCopyOf() {
		assertArrayEquals(new int[] {}, ArrayUtils.copyOf(new int[] { 1, 2, 3 }, 0));
		assertArrayEquals(new int[] { 1 }, ArrayUtils.copyOf(new int[] { 1, 2, 3 }, 1));
		assertArrayEquals(new int[] { 1, 2 }, ArrayUtils.copyOf(new int[] { 1, 2, 3 }, 2));
		assertArrayEquals(new int[] { 1, 2, 3 }, ArrayUtils.copyOf(new int[] { 1, 2, 3 }, 3));
		assertArrayEquals(new int[] { 1, 2, 3, 0 }, ArrayUtils.copyOf(new int[] { 1, 2, 3 }, 4));

		try {
			ArrayUtils.copyOf(new int[] { 1, 2, 3 }, -1);
			fail("Should have thrown");
		} catch (NegativeArraySizeException e) {

		}
	}

	@Test
	public void testCopyOfGeneric() {
		assertArrayEquals(new String[] {}, ArrayUtils.copyOf(new String[] { "1", "2", "3" }, 0));
		assertArrayEquals(new String[] { "1" }, ArrayUtils.copyOf(new String[] { "1", "2", "3" }, 1));
		assertArrayEquals(new String[] { "1", "2" }, ArrayUtils.copyOf(new String[] { "1", "2", "3" }, 2));
		assertArrayEquals(new String[] { "1", "2", "3" }, ArrayUtils.copyOf(new String[] { "1", "2", "3" }, 3));
		assertArrayEquals(new String[] { "1", "2", "3", null }, ArrayUtils.copyOf(new String[] { "1", "2", "3" }, 4));

		try {
			ArrayUtils.copyOf(new String[] { "1", "2", "3" }, -1);
			fail("Should have thrown");
		} catch (NegativeArraySizeException e) {

		}
	}

	@Test
	public void testCopyOfRangeGeneric() {
		assertArrayEquals(new String[] {}, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 0, 0));
		assertArrayEquals(new String[] { "1" }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 0, 1));
		assertArrayEquals(new String[] { "1", "2" }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 0, 2));
		assertArrayEquals(new String[] { "1", "2", "3" }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 0, 3));
		assertArrayEquals(new String[] { "1", "2", "3", null }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 0, 4));

		assertArrayEquals(new String[] {}, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 1, 1));
		assertArrayEquals(new String[] { "2" }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 1, 2));
		assertArrayEquals(new String[] { "2", "3" }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 1, 3));
		assertArrayEquals(new String[] { "2", "3", null }, ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 1, 4));

		try {
			ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, 1, 0);
			fail("Should have thrown");
		} catch (IllegalArgumentException e) {

		}

		try {
			ArrayUtils.copyOfRange(new String[] { "1", "2", "3" }, -1, 4);
			fail("Should have thrown");
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	@Test
	public void testToString() {
		assertEquals("[]", ArrayUtils.toString(new Object[] {}));
		assertEquals("[1]", ArrayUtils.toString(new Object[] { 1 }));
		assertEquals("[1, 2]", ArrayUtils.toString(new Object[] { 1, 2 }));
		assertEquals("[null]", ArrayUtils.toString(new Object[] { null }));
		assertEquals("[a, 1, null]", ArrayUtils.toString(new Object[] { "a", 1, null }));
	}
}
