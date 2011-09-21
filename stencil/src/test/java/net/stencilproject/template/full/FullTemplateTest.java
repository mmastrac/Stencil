package net.stencilproject.template.full;

import static junit.framework.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateFactory;
import net.stencilproject.template.TemplateMode;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateParserException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Resources;

/**
 * Tests full templates.
 */
@RunWith(Parameterized.class)
public class FullTemplateTest {
	private final String name;

	public FullTemplateTest(String name) {
		this.name = name;
	}

	@Parameters
	public static Collection<Object[]> data() throws IOException {
		List<Object[]> files = Lists.newArrayList();
		for (String test : Resources.readLines(FullTemplateTest.class.getResource("tests.txt"), Charsets.UTF_8)) {
			files.add(new Object[] { test });
		}

		return files;
	}

	@Test
	public void runTemplate() throws TemplateParserException, IOException {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(false);
		options.setTraceExecution(false);

		boolean isText = exists(name + "/input.txt");
		String extension = isText ? "txt" : "html";
		String output = name + "/output." + extension;
		String input = name + "/input." + extension;

		String outputString = Resources.toString(FullTemplateTest.class.getResource(output), Charsets.UTF_8);

		StringWriter writer = new StringWriter();
		Map<String, Object> model = Maps.newHashMap();

		TemplateFactory templateFactory = new TemplateFactory(options);
		Template template = templateFactory.parse(isText ? TemplateMode.TEXT : TemplateMode.HTML, null, FullTemplateTest.class, input);
		template.process(model, writer);

		assertEquals(outputString, writer.toString());
	}

	private boolean exists(String name) {
		try {
			Resources.toByteArray(FullTemplateTest.class.getResource(name));
		} catch (Throwable t) {
			return false;
		}

		return true;
	}
}
