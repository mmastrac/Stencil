package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import com.google.common.collect.Maps;

public class TestExceptions extends AbstractTemplateTest {
	@Test
	public void testExceptionInCalledMethod() throws TemplateParserException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				throw new RuntimeException("Thrown from run");
			}
		};
		HashMap<String, Object> mapModel = Maps.newHashMap();
		Template template = parse("{{ runnable.run() }}");
		mapModel.put("runnable", runnable);
		assertEquals("", template.process(mapModel));
	}
}
