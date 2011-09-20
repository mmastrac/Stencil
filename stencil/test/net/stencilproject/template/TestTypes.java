package net.stencilproject.template;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests the {@link Types} class.
 */
public class TestTypes {
	@Test
	public void testToBoolean() {
		assertTrue(Types.toBoolean(null, 1));
		assertFalse(Types.toBoolean(null, 0));
		assertFalse(Types.toBoolean(null, null));
		assertFalse(Types.toBoolean(null, ""));
		assertTrue(Types.toBoolean(null, "0"));
		assertTrue(Types.toBoolean(null, "1"));
		assertTrue(Types.toBoolean(null, "2"));
	}
}
