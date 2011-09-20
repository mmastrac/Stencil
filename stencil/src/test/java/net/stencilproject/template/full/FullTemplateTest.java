package net.stencilproject.template.full;

import static junit.framework.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;
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
		for (int i = 0;; i++) {
			String base = String.format("%03d", i);
			InputStream is = FullTemplateTest.class.getResourceAsStream(base + "/input.html");

			if (is != null) {
				is.close();
				files.add(new Object[] { base });
			} else {
				break;
			}
		}

		return files;
	}

	@Test
	public void runTemplate() throws TemplateParserException, IOException {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(false);
		options.setTraceExecution(false);

		String outputString = Resources.toString(FullTemplateTest.class.getResource(name + "/output.html"), Charsets.UTF_8);

		StringWriter writer = new StringWriter();
		Map<String, Object> model = Maps.newHashMap();

		TemplateFactory templateFactory = new TemplateFactory(options);
		Template template = templateFactory.parse(TemplateMode.HTML, null, FullTemplateTest.class, name + "/input.html");
		template.process(model, writer);

		assertEquals(outputString, writer.toString());
	}
}