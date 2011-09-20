package net.stencilproject.template;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.stencilproject.template.IteratorUtils;
import net.stencilproject.template.RunStatistics;
import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateParserException;
import net.stencilproject.template.Templater;

import org.junit.Test;

import com.google.common.collect.Maps;

/**
 * This tests {@link ConcurrentModificationException} in templates.
 */
public class TestIteratorUtils {
	@Test
	public void testConcurrentModification() {
		HashMap<String, String> map = Maps.newHashMap();
		map.put("a", "a");
		map.put("b", "b");
		Iterator<?> iterator = IteratorUtils.toIterator(map);

		assertTrue(iterator.hasNext());
		iterator.next();
		assertTrue(iterator.hasNext());
		map.clear();
		assertTrue(iterator.hasNext());
		try {
			iterator.next();
			fail();
		} catch (ConcurrentModificationException e) {
			// Success
		}
	}

	@Test
	public void testConcurrentModificationInTemplate() throws TemplateParserException, IOException {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		Templater templater = new Templater(null, options);

		Template template = templater.parse("{% for x in y %}{{ x }}{% end %}");
		StringWriter writer = new StringWriter();

		final HashMap<String, String> map = Maps.newHashMap();
		map.put("a", "a");
		map.put("b", "b");

		final Iterator<?> it = map.entrySet().iterator();

		Map<String, Object> model = Maps.newHashMap();
		model.put("y", new Iterator<Object>() {
			@Override
			public boolean hasNext() {
				return it.hasNext();
			}

			@Override
			public Object next() {
				Object obj = it.next();
				// Cause a concurrent modification exception
				map.clear();
				return obj;
			}

			@Override
			public void remove() {
			}
		});

		RunStatistics process = template.process(model, writer);

		assertEquals(process.getWarningCount(), 1);
	}
}
