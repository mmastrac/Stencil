package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import com.google.common.collect.Maps;

public class TestExceptions {
	private Templater createTemplater() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return new Templater(null, options);
	}

	@Test
	public void testExceptionInCalledMethod() throws TemplateParserException {
		Templater templater = createTemplater();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				throw new RuntimeException("Thrown from run");
			}
		};
		HashMap<String, Object> mapModel = Maps.newHashMap();
		Template template = templater.parse("{{ runnable.run() }}");
		mapModel.put("runnable", runnable);
		assertEquals("", template.process(mapModel));
	}
}
