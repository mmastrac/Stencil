package net.stencilproject.template;

import static junit.framework.Assert.assertTrue;

import java.io.IOException;
import java.io.PrintStream;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;

public class TestErrorHandling {
	@Test
	public void testNestedError() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parse(TemplateMode.TEXT, TemplateFile.fromResource(TestErrorHandling.class, "nestedErrorOuter.txt"));

		ByteArrayOutputStream errStream = new ByteArrayOutputStream();

		// This is yucky, but we don't have an alternative right now
		PrintStream err = new PrintStream(errStream);
		PrintStream oldErr = System.err;
		System.setErr(err);
		try {
			template.process(null);
			err.flush();
			errStream.flush();
			String string = new String(errStream.toByteArray());
			assertTrue(string + " didn't contain 'nestedErrorOuter'", string.contains("nestedErrorOuter"));
			assertTrue(string + " didn't contain 'nestedErrorInner'", string.contains("nestedErrorInner"));
		} finally {
			System.setErr(oldErr);
		}
	}

	private Templater createTemplater() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return new Templater(null, options);
	}
}
