package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateParserException;
import net.stencilproject.template.Templater;

import org.junit.Test;

import com.google.common.collect.Maps;

/**
 * Tests the IF construct.
 */
public class TestIf {
	private Templater createTemplater() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return new Templater(null, options);
	}

	@Test
	public void testIf1a() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("x{% if x %} = true{% end %}, y{% if y %} = true{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", true);
		mapModel.put("y", false);
		assertEquals("x = true, y", template.process(mapModel));
	}

	@Test
	public void testIf1b() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("x{% if x %} = true{% end %}, y{% if y %} = true{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", false);
		mapModel.put("y", true);
		assertEquals("x, y = true", template.process(mapModel));
	}

	@Test
	public void testIf2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("x{% if data.x %} = true{% end %}, y{% if data.y %} = true{% end %}");

		HashMap<String, Object> mapModelInner = Maps.newHashMap();
		mapModelInner.put("x", true);
		mapModelInner.put("y", false);
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", mapModelInner);
		assertEquals("x = true, y", template.process(mapModel));
	}

	@Test
	public void testIfElse1() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("x{% if data.x %} = true{% else %} = false{% end %}, y{% if data.y %} = true{% else %} = false{% end %}");

		HashMap<String, Object> mapModelInner = Maps.newHashMap();
		mapModelInner.put("x", true);
		mapModelInner.put("y", false);
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", mapModelInner);
		assertEquals("x = true, y = false", template.process(mapModel));
	}

	@Test
	public void testIfElse2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("x{% if data.x %} = true{% else %} = false{% end %}, y{% if data.y %} = true{% else %} = false{% end %}");

		HashMap<String, Object> mapModelInner = Maps.newHashMap();
		mapModelInner.put("x", false);
		mapModelInner.put("y", true);
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", mapModelInner);
		assertEquals("x = false, y = true", template.process(mapModel));
	}

	@Test
	public void testIfElIf1() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% if x %}x = true{% elif y %}y = true{% else %}neither{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();

		mapModel.put("x", true);
		mapModel.put("y", true);
		assertEquals("x = true", template.process(mapModel));

		mapModel.put("x", true);
		mapModel.put("y", false);
		assertEquals("x = true", template.process(mapModel));

		mapModel.put("x", false);
		mapModel.put("y", true);
		assertEquals("y = true", template.process(mapModel));

		mapModel.put("x", false);
		mapModel.put("y", false);
		assertEquals("neither", template.process(mapModel));
	}

	@Test
	public void testIfElIf2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% if x and y %}x&&y{% elif x %}x{% elif y %}y{% else %}!x&&!y{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();

		mapModel.put("x", true);
		mapModel.put("y", true);
		assertEquals("x&&y", template.process(mapModel));

		mapModel.put("x", true);
		mapModel.put("y", false);
		assertEquals("x", template.process(mapModel));

		mapModel.put("x", false);
		mapModel.put("y", true);
		assertEquals("y", template.process(mapModel));

		mapModel.put("x", false);
		mapModel.put("y", false);
		assertEquals("!x&&!y", template.process(mapModel));
	}

	@Test
	public void testIfElIf3() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% if x and y %}x&&y{% elif x or y %}x||y{% else %}!x&&!y{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();

		mapModel.put("x", true);
		mapModel.put("y", true);
		assertEquals("x&&y", template.process(mapModel));

		mapModel.put("x", true);
		mapModel.put("y", false);
		assertEquals("x||y", template.process(mapModel));

		mapModel.put("x", false);
		mapModel.put("y", true);
		assertEquals("x||y", template.process(mapModel));

		mapModel.put("x", false);
		mapModel.put("y", false);
		assertEquals("!x&&!y", template.process(mapModel));
	}
}
