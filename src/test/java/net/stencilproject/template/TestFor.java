package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.stencilproject.template.util.ArrayUtils;

import org.junit.Test;

import com.google.common.collect.Maps;

public class TestFor {
	private Templater createTemplater() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return new Templater(null, options);
	}

	@Test
	public void testFor() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data %}{{ x }}{% end %}.");

		HashMap<String, List<String>> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("a", "b", "c", "d"));
		assertEquals("Check out this list: abcd.", template.process(mapModel));
	}

	@Test
	public void testFor2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data %}{{ x }}{% end %}");

		HashMap<String, List<String>> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("a", "b", "c", "d"));
		assertEquals("Check out this list: abcd", template.process(mapModel));
	}

	@Test
	public void testForOverMap() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this map: {% for x in data %}{{ x[0] }} = {{ x[1] }},{% end %}.");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		TreeMap<String, Object> map = Maps.newTreeMap();
		map.put("key #1", "value #1");
		map.put("key #2", "value #2");
		mapModel.put("data", map);
		assertEquals("Check out this map: key #1 = value #1,key #2 = value #2,.", template.process(mapModel));
	}

	@Test
	public void testForOverMapOrder() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this map: {% for x in data order by x[0] %}{{ x[0] }} = {{ x[1] }},{% end %}.");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		TreeMap<String, Object> map = Maps.newTreeMap();
		map.put("key #1", "value #1");
		map.put("key #2", "value #2");
		mapModel.put("data", map);
		assertEquals("Check out this map: key #1 = value #1,key #2 = value #2,.", template.process(mapModel));
	}

	@Test
	public void testForOrder() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data order by x %}{{ x }}{% end %}");

		HashMap<String, List<String>> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("d", "b", "c", "a"));
		assertEquals("Check out this list: abcd", template.process(mapModel));
	}

	@Test
	public void testForOrder2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data order by -x %}{{ x }}{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList(4, 2, 1, 3));
		assertEquals("Check out this list: 4321", template.process(mapModel));
	}

	@Test
	public void testForOrderAndLimit() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data order by x limit 2 %}{{ x }}{% end %}");

		HashMap<String, List<String>> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("d", "b", "c", "a"));
		assertEquals("Check out this list: ab", template.process(mapModel));
	}

	@Test
	public void testForOrderAndLimit2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data order by x limit 6 %}{{ x }}{% end %}");

		HashMap<String, List<String>> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("d", "b", "c", "a"));
		assertEquals("Check out this list: abcd", template.process(mapModel));
	}

	@Test
	public void testForString() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("String chars: {% for x in data %}{{ x }},{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", "abcd");
		assertEquals("String chars: a,b,c,d,", template.process(mapModel));
	}

	@Test
	public void testForArray() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Integers: {% for x in data %}{{ x }},{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", new int[] { 1, 2, 3, 4 });
		assertEquals("Integers: 1,2,3,4,", template.process(mapModel));
	}

	@Test
	public void testForMap() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Map: {% for x in data %}{{ x[0] }} == {{ x[1] }}, {% end %}");

		Map<String, Object> mapModel = Maps.newHashMap();
		Map<String, String> map = Maps.newTreeMap();
		map.put("foo", "bar");
		map.put("bar", "baz");
		mapModel.put("data", map);
		assertEquals("Map: bar == baz, foo == bar, ", template.process(mapModel));
	}

	@Test
	public void testForLimit() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data limit lim %}{{x}}{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("a", "b", "c", "d"));
		mapModel.put("lim", 2);
		assertEquals("Check out this list: ab", template.process(mapModel));

		mapModel.put("lim", 5);
		assertEquals("Check out this list: abcd", template.process(mapModel));
	}

	@Test
	public void testForLimitNull() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data limit null %}{{x}}{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("a", "b", "c", "d"));
		assertEquals("Check out this list: ", template.process(mapModel));
	}

	@Test
	public void testForScope() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {{x}}{% for x in data %}{{x}}{% end %}{{x}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("a", "b", "c", "d"));
		mapModel.put("x", "x");
		assertEquals("Check out this list: xabcdx", template.process(mapModel));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testNestedFor() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater
				.parse("{% for item in x %}Whoa: {% for y in item.data %}{{ y }}{% else %}no data{% end %}. {% end %}");

		HashMap<String, Object> innerMap = Maps.newHashMap();
		innerMap.put("data", ArrayUtils.asList("a", "b", "c"));

		HashMap<String, Object> innerMap2 = Maps.newHashMap();
		innerMap2.put("data", Collections.EMPTY_LIST);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(innerMap, innerMap2));

		assertEquals("Whoa: abc. Whoa: no data. ", template.process(mapModel));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testNestedForContinue() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater
				.parse("{% for item in x %}Whoa: {% for y in item.data %}{% if y == 'b' %}{% continue %}{% end %}{{y}}{% else %}no data{% end %}. {% end %}");

		HashMap<String, Object> innerMap = Maps.newHashMap();
		innerMap.put("data", ArrayUtils.asList("a", "b", "c"));

		HashMap<String, Object> innerMap2 = Maps.newHashMap();
		innerMap2.put("data", Collections.EMPTY_LIST);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(innerMap, innerMap2));

		assertEquals("Whoa: ac. Whoa: no data. ", template.process(mapModel));
	}

	/**
	 * Tests with a print instruction between the FOR and IF to make sure we're
	 * correctly calculating the jumps.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testNestedForContinue2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater
				.parse("{% for item in x %}Whoa: {% for y in item.data %}>{% if y == 'b' %}{% continue %}{% end %}{{y}}<{% else %}no data{% end %}. {% end %}");

		HashMap<String, Object> innerMap = Maps.newHashMap();
		innerMap.put("data", ArrayUtils.asList("a", "b", "c"));

		HashMap<String, Object> innerMap2 = Maps.newHashMap();
		innerMap2.put("data", Collections.EMPTY_LIST);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(innerMap, innerMap2));

		assertEquals("Whoa: >a<>>c<. Whoa: no data. ", template.process(mapModel));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testNestedFor2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% for item in x %}Whoa: {% for y in item.data %}{{y}}{% else %}no data{% end %}. {% end %}");

		HashMap<String, Object> innerMap = Maps.newHashMap();
		innerMap.put("data", ArrayUtils.asList("a", "b", "c"));

		HashMap<String, Object> innerMap2 = Maps.newHashMap();
		innerMap2.put("data", Collections.EMPTY_LIST);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(innerMap, innerMap2, innerMap, innerMap2));

		assertEquals("Whoa: abc. Whoa: no data. Whoa: abc. Whoa: no data. ", template.process(mapModel));
	}

	@Test
	public void testForElse1() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data %}{{x}}{% else %}empty{% end %}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("data", Collections.emptyList());
		assertEquals("Check out this list: empty", template.process(mapModel));
	}

	@Test
	public void testForElse2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("Check out this list: {% for x in data %}{{x}}{% else %}empty{% end %}");

		HashMap<String, List<String>> mapModel = Maps.newHashMap();
		mapModel.put("data", ArrayUtils.asList("a", "b", "c", "d"));
		assertEquals("Check out this list: abcd", template.process(mapModel));
	}
}
