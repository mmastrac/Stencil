package net.stencilproject.template;

import static junit.framework.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestErrorHandling extends AbstractTemplateTest {
	@Test
	public void testNestedError() throws TemplateParserException, IOException {
		Template template = parseResource("nestedErrorOuter.txt");

		ByteArrayOutputStream errStream = new ByteArrayOutputStream();

		/**
		 * This doesn't work as you'd expect, because the loggers apparently
		 * cache System.err and won't let us alter it
		 */
		PrintStream err = new PrintStream(errStream);
		PrintStream oldErr = System.err;
		System.setErr(err);
		try {
			template.process(null);
			err.flush();
			errStream.flush();
			String string = new String(errStream.toByteArray());
			System.out.println("ERRRRORRRRR");
			System.out.println(string);
			System.out.println("ERRRRORRRRR");

			assertTrue(string + " didn't contain 'nestedErrorOuter'", string.contains("nestedErrorOuter"));
			assertTrue(string + " didn't contain 'nestedErrorInner'", string.contains("nestedErrorInner"));
		} finally {
			System.setErr(oldErr);
		}
	}
}
