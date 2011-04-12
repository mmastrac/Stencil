package net.stencilproject.template;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.CharBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.zip.ZipEntry;

import net.stencilproject.template.types.Raw;
import net.stencilproject.template.util.ArrayUtils;

import org.junit.Test;

import com.google.common.collect.Maps;

public class TestTemplater {
	enum EnumValues {
		BLAH, FOO
	}

	private Templater createTemplater() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return new Templater(null, options);
	}

	@Test
	public void testTemplateEscapes() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{1}} {{{2}}} {{{{3}}}} {%%%raw {{4}}%%%}");

		// ${}: Normal template
		// $${}: Literal '${}'
		// $$${}: Literal '$', then ${} template
		// $$$${}: Literal '$${}'
		// $$$$${}: Literal '$$' then ${} template

		assertEquals("1 {2} {{3}} {{4}}", template.process(null));
	}

	@Test
	public void testStringyLookingTextOutsideTemplate() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("'{{ 1 }}'");

		assertEquals("'1'", template.process(null));
	}

	@Test
	public void testCommentyLookingTextOutsideTemplate() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("/*{{ 1 }}*/");

		assertEquals("/*1*/", template.process(null));
	}

	@Test
	public void testSimpleExpression() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x }}");

		HashMap<String, Integer> mapModel = new HashMap<String, Integer>();
		mapModel.put("x", 1);
		assertEquals("1", template.process(mapModel));
	}

	@Test
	public void testMapVsMethod() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x.name}}, {{y.name}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		HashMap<String, Object> innerMap = Maps.newHashMap();
		innerMap.put("name", "x-name");
		mapModel.put("x", innerMap);
		mapModel.put("y", new ZipEntry("y-name"));
		assertEquals("x-name, y-name", template.process(mapModel));
	}

	@Test
	public void testBasicRange() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% for i in 1 to 10 %}{{ i }},{% end %}");

		assertEquals("1,2,3,4,5,6,7,8,9,10,", template.process(null));
	}

	@Test
	public void testRangeWithConditional() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% for i in false ? 3 : 1 to false ? 5 : 10 %}{{ i }},{% end %}");

		assertEquals("1,2,3,4,5,6,7,8,9,10,", template.process(null));
	}

	@Test
	public void testLongRange() throws TemplateParserException {
		String[][] tests = { { "1 to 3", "1,2,3" }, { "3 to 1", "3,2,1" }, { "1 to 10 by 2", "1,3,5,7,9" }, { "1 to 3 by -1", "" },
				{ "3 to 1 by +1", "" }, { "1 to 1 by 1", "1" }, { "1 to 1 by -1", "1" } };
		String templateString = "";
		String resultString = "";

		for (String[] test : tests) {
			templateString += "{% for i in " + test[0] + "%}{{ i }},{% end %}|";
			resultString += test[1] + (test[1].length() == 0 ? "" : ",") + "|";
		}
		Templater templater = createTemplater();
		Template template = templater.parse(templateString);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		assertEquals(resultString, template.process(mapModel));
	}

	@Test
	public void testDoubleRange() throws TemplateParserException {
		String[][] tests = { { "1.5 to 3.5", "1.5,2.5,3.5" }, { "3.5 to 1.5", "3.5,2.5,1.5" },
				{ "1.5 to 10.5 by 2", "1.5,3.5,5.5,7.5,9.5" }, { "1.5 to 2.5 by .5", "1.5,2.0,2.5" }, { "1.5 to 3.5 by -1", "" },
				{ "3.5 to 1.5 by +1", "" }, { "1.5 to 1.5 by 1", "1.5" }, { "1.5 to 1.5 by -1", "1.5" } };
		String templateString = "";
		String resultString = "";

		for (String[] test : tests) {
			templateString += "{% for i in " + test[0] + "%}{{ i }},{% end %}|";
			resultString += test[1] + (test[1].length() == 0 ? "" : ",") + "|";
		}
		Templater templater = createTemplater();
		Template template = templater.parse(templateString);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		assertEquals(resultString, template.process(mapModel));
	}

	@Test
	public void testIn() throws TemplateParserException {
		Object[][] tests = { { "1 in [1,2,3]", true }, { "10 in [1,2,3]", false }, { "'a' in 'abc'", true }, { "'d' in 'abc'", false },
				{ "1 in 1 to 3", true }, { "10 in 1 to 3", false } };
		String templateString = "";
		String resultString = "";

		for (Object[] test : tests) {
			templateString += "{{ " + test[0] + " }}|";
			resultString += test[1] + "|";
		}
		Templater templater = createTemplater();
		Template template = templater.parse(templateString);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		assertEquals(resultString, template.process(mapModel));
	}

	@Test
	public void testStringSublist() throws TemplateParserException {
		String[][] tests = { { "100", "" }, { "-100", "" }, { "2", "2" }, { ":2", "01" }, { ":-2", "01234567" }, { "-1", "9" },
				{ "2:11", "23456789" }, { "2:10", "23456789" }, { "2:10:2", "2468" }, { "2:4", "23" }, { "2:-2", "234567" },
				{ "-11:2", "01" } };

		String templateString = "";
		String resultString = "";

		for (String[] test : tests) {
			templateString += "{{x[" + test[0] + "]}},";
			resultString += test[1] + ",";
		}
		Templater templater = createTemplater();
		Template template = templater.parse(templateString);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", "0123456789");
		assertEquals(resultString, template.process(mapModel));
	}

	@Test
	public void testListIndex() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x.data[1] }} {{ x.data[-1] }} {{ x.data[-2] }} {{ x.data[-3] }} [{{ x.data[-4] }}] [{{ x.data[4] }}]");

		HashMap<String, Object> mapModelInner = Maps.newHashMap();
		mapModelInner.put("data", ArrayUtils.asList("a", "b", "c"));
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", mapModelInner);
		assertEquals("b c b a [] []", template.process(mapModel));
	}

	@Test
	public void testArraySlice() throws TemplateParserException {
		String[][] tests = { { "1", "1" }, { ":2", "01" }, { ":-2", "01234567" }, { "2:11", "23456789" }, { "2:10", "23456789" },
				{ "2:10:2", "2468" }, { "2:4", "23" }, { "2:-2", "234567" }, { "-11:2", "01" } };

		// { "2", "2" }, { "-1", "9" },
		String templateString = "";
		String resultString = "";

		for (String[] test : tests) {
			templateString += "{% for y in x[" + test[0] + "] %}{{ y }}{% end %} ";
			resultString += test[1] + " ";
		}
		Templater templater = createTemplater();
		Template template = templater.parse(templateString);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
		assertEquals(resultString, template.process(mapModel));
		mapModel.put("x", new Character[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' });
		assertEquals(resultString, template.process(mapModel));
	}

	@Test
	public void testListImplicitBooleanConversion() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{not not listempty}} {{not not justnull}} {{not not oneitem}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("listempty", ArrayUtils.asList());
		mapModel.put("justnull", null);
		mapModel.put("oneitem", ArrayUtils.asList("a"));
		assertEquals("false false true", template.process(mapModel));
	}

	@Test
	public void testMapImplicitBooleanConversion() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{not not mapempty}} {{not not justnull}} {{not not oneitem}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("mapempty", Collections.EMPTY_MAP);
		mapModel.put("justnull", null);
		final HashMap<Object, Object> oneItem = Maps.newHashMap();
		oneItem.put("x", "y");
		mapModel.put("oneitem", oneItem);
		assertEquals("false false true", template.process(mapModel));
	}

	@Test
	public void testObjectImplicitBooleanConversion() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{not not emptystring}} {{not not string0}} {{not not string1}} {{not not object1}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("emptystring", "");
		mapModel.put("string1", "1");
		mapModel.put("string0", "0");
		mapModel.put("object1", new Object());
		assertEquals("false true true true", template.process(mapModel));
	}

	@Test
	public void testComparisons() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x1 > y1}} {{x1 > y2}} {{x2 > y1}} {{x2 > y2}} {{x1 < y1}} {{x1 < y2}} {{x2 < y1}} {{x2 < y2}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x1", 1);
		mapModel.put("x2", "1");
		mapModel.put("y1", 0);
		mapModel.put("y2", "0");
		assertEquals("true false false true false false false false", template.process(mapModel));
	}

	@Test
	public void testComparisons2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x1 >= y1}} {{x1 >= y2}} {{x2 >= y1}} {{x2 >= y2}} {{x1 <= y1}} {{x1 <= y2}} {{x2 <= y1}} {{x2 <= y2}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x1", 1);
		mapModel.put("x2", "1");
		mapModel.put("y1", 0);
		mapModel.put("y2", "0");
		assertEquals("true false false true false false false false", template.process(mapModel));
	}

	/**
	 * Tests that string comparisons work across all string-like things (CharSequences and chars).
	 */
	@Test
	public void testStringComparisons() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x == y }} {{ x != y }} {{ x < y }} {{ x > y }} {{ x <= y }} {{ x >= y }}");

		Object[] stringLikes = new Object[] { 'a', "a", new StringBuilder("a"), new StringBuffer("a"), CharBuffer.wrap(new char[] { 'a' }) };

		for (Object x : stringLikes) {
			for (Object y : stringLikes) {
				HashMap<String, Object> model = Maps.newHashMap();
				model.put("x", x);
				model.put("y", y);
				assertEquals("true false false false true true", template.process(model));
			}
		}
	}

	@Test
	public void testComparisonsEnumString() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x == 'BLAH'}} {{ x != 'BLAH' }} {{ x == 'FOO' }} {{ x != 'FOO' }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", EnumValues.BLAH);

		assertEquals("true false false true", template.process(mapModel));
	}

	@Test
	public void testComparisonsEnumInteger() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x == 0}} {{ x != 0 }} {{ x == 1 }} {{ x != 1 }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", EnumValues.BLAH);

		assertEquals("true false false true", template.process(mapModel));
	}

	@Test
	public void testComparisonsNull() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{null < zeroString}} {{null < oneString}} {{null < zeroInt}} {{null < null}} "
				+ "{{null > zeroString}} {{null > oneString}} {{null > zeroInt}} {{null > null}} "
				+ "{{null == zeroString}} {{null == oneString}} {{null == zeroInt}} {{null == null}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("zeroString", "0");
		mapModel.put("oneString", "0");
		mapModel.put("zeroInt", 0);
		assertEquals("true true true false false false false false false false false true", template.process(mapModel));
	}

	@Test
	public void testConditional() throws TemplateParserException {
		Templater templater = createTemplater();
		Object[][] tests = new Object[][] { { "zeroString", true }, // "0" is true, since it's not empty
				{ "oneString", true }, // "1" is true, since it's not empty
				{ "zeroInt", false }, // 0 is false
				{ "oneInt", true }, // 1 is true
				{ "true", true }, // true is true
				{ "false", false } }; // false is false

		StringBuilder templateString = new StringBuilder();
		StringBuilder resultString = new StringBuilder();
		for (Object[] test : tests) {
			templateString.append("{{ " + test[0] + " ? true : false }} ");
			resultString.append(test[1]).append(' ');
		}

		Template template = templater.parse(templateString.toString());

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("zeroString", "0");
		mapModel.put("oneString", "1");
		mapModel.put("zeroInt", 0);
		mapModel.put("oneInt", 1);
		assertEquals(resultString.toString(), template.process(mapModel));
	}

	/**
	 * Makes sure that the warning count for null.a is 1 (required for the short-circuit tests to be valid).
	 */
	@Test
	public void testWarningCount() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x.a|bool }} {% if x.a %}yes{% else %}no{% end %}");

		StringWriter writer = new StringWriter();
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", null);
		RunStatistics stats = template.process(mapModel, writer);

		assertEquals("false no", template.process(mapModel));
		assertEquals(2, stats.getWarningCount());
	}

	/**
	 * Test whether short-circuiting works.
	 */
	@Test
	public void testAndOrShortCircuit() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ (x and x.a)|bool }} {{ not x or not x.a }} {% if x and x.a %}yes{% else %}no{% end %} {% if not x or not x.a %}yes{% else %}no{% end %}");

		StringWriter writer = new StringWriter();
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", null);
		RunStatistics stats = template.process(mapModel, writer);

		assertEquals("false true no yes", template.process(mapModel));
		assertEquals(0, stats.getWarningCount());
	}

	/**
	 * Tests the ?. operator.
	 * 
	 * @throws TemplateParserException
	 * @throws IOException
	 */
	@Test
	public void testShortCircuitDot() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x|bool }} {{ x?.a|bool }}");

		StringWriter writer = new StringWriter();
		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", null);
		RunStatistics stats = template.process(mapModel, writer);

		assertEquals("false false", template.process(mapModel));
		assertEquals(0, stats.getWarningCount());
	}

	@Test
	public void testAndOrXorPrecedence() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ true or true and false }} {{ false and true or true }} {{ true and true ^ false and false }} {{ true or true ^ true or false }} "
				+ "{{ 1 or 1 and 0 }} {{ 0 and 1 or 1 }} {{ 1 and 1 ^ 0 and 0 }} {{ 1 or 1 ^ 1 or 0 }}");
		// Template template = templater.parse("${var x}x = '{{ x }}'${x = 1}");

		HashMap<String, Object> mapModel = Maps.newHashMap();

		assertEquals("true true true true 1 1 1 1", template.process(mapModel));
	}

	@Test
	public void testVariables() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% var x %}x = '{{ x }}'{% x = 1 %} x = '{{ x }}'");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("y", ArrayUtils.asList(1, 2, 3));

		assertEquals("x = '' x = '1'", template.process(mapModel));
	}

	@Test
	public void testVariables2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% var x = 1 %}x = '{{ x }}'{% x = 2 %} x = '{{ x }}'");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("y", ArrayUtils.asList(1, 2, 3));

		assertEquals("x = '1' x = '2'", template.process(mapModel));
	}

	@Test
	public void testVariables3() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% var x %}x = '{{ x }}'{% x = 1 %} x = '{{ x }}' {% for z in y %}{% x = z %}x = '{{ x }}' {% end %}x = '{{ x }}'");
		// Template template = templater.parse("${var x}x = '{{ x }}'${x = 1}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("y", ArrayUtils.asList(1, 2, 3));

		assertEquals("x = '' x = '1' x = '1' x = '2' x = '3' x = '3'", template.process(mapModel));
	}

	@Test
	public void testVariableWithAssignment() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{% var x = true %}x = '{{ x }}'{% x = 1 %} x = '{{ x }}' {% for z in y %}{% x = z %}x = '{{ x }}' {% end %}x = '{{ x }}'");
		// Template template = templater.parse("${var x}x = '{{ x }}'${x = 1}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("y", ArrayUtils.asList(1, 2, 3));

		assertEquals("x = 'true' x = '1' x = '1' x = '2' x = '3' x = '3'", template.process(mapModel));
	}

	@Test
	public void testAllIntegerOperators() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x + 1}} {{x - 1}} {{x * 2}} {{x / 2}} {{-x}} {{+x}} {{~x}} {{not x}} {{x << 1}} {{x >> 1}} {{x ^ 1}} {{x and 1}} {{x or 1}} {{x iand 14}} {{ x ior 1 }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", 10);

		assertEquals("11 9 20 5 -10 10 -11 false 20 5 11 1 10 10 11", template.process(mapModel));
	}

	@Test
	public void testIntegerLiterals() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{1000}} {{0x1000}} {{0xfFfFfF}}");

		assertEquals(1000 + " " + 0x1000 + " " + 0xffffff, template.process(null));
	}

	@Test
	public void testListLiterals() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ [1,2,3] }}");

		assertEquals("[1, 2, 3]", template.process(null));
	}

	@Test
	public void testAllDoubleOperators() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x + 1}} {{x - 1}} {{x * 2}} {{x / 2}} {{-x}} {{+x}} {{~x}} {{not x}} {{x << 1}} {{x >> 1}} {{x ^ 1}} {{x and 1}} {{x or 1}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", 6.5);

		assertEquals("7.5 5.5 13.0 3.25 -6.5 6.5 -7 false 12 3 7 1 6.5", template.process(mapModel));
	}

	@Test
	public void testAllStringOperators() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x + '1'}}"); // Any others?

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", "10");

		assertEquals("101", template.process(mapModel));
	}

	@Test
	public void testMultilineStrings() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{'foo\nbar'}}");

		assertEquals("foo\nbar", template.process(null));
	}

	@Test
	public void testMultilineStrings2() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{\"\"\"\"\\x66foo\nbar\"\"\"}} {{'''foo\"\"\"bar'''}}");

		assertEquals("\"\\x66foo\nbar foo\"\"\"bar", template.process(null));
	}

	@Test
	public void testStringEscapes() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{x + '\\\\\"' + \"\\\'\" + '\\xff\\u202a'}}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", "10");

		assertEquals("10\\\"'\u00ff\u202a", template.process(mapModel));
	}

	@Test
	public void testComplex() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse(".{% if flag %}.{% for x in data %}<1{{ x }}>{% else %}[1empty]{% end %}.{% else %}.{% for x in data %}<2{{ x }}>{% else %}[2empty]{% end %}.{% end %}.");

		HashMap<String, Object> mapModel = Maps.newHashMap();

		mapModel.put("flag", true);
		mapModel.put("data", ArrayUtils.asList("a", "b", "c"));
		assertEquals("..<1a><1b><1c>..", template.process(mapModel));

		mapModel.put("flag", true);
		mapModel.put("data", Collections.EMPTY_LIST);
		assertEquals("..[1empty]..", template.process(mapModel));

		mapModel.put("flag", false);
		mapModel.put("data", ArrayUtils.asList("a", "b", "c"));
		assertEquals("..<2a><2b><2c>..", template.process(mapModel));

		mapModel.put("flag", false);
		mapModel.put("data", Collections.EMPTY_LIST);
		assertEquals("..[2empty]..", template.process(mapModel));
	}

	@Test
	public void testMultipleStatements() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseText(TemplateFile.fromResource(getClass(), "multiline.txt"));

		HashMap<String, Object> mapModel = Maps.newHashMap();

		mapModel.put("flag", true);
		mapModel.put("data", ArrayUtils.asList("a", "b", "c"));
		assertEquals("..<1a><1b><1c>..", template.process(mapModel));

		mapModel.put("flag", true);
		mapModel.put("data", Collections.EMPTY_LIST);
		assertEquals("..[1empty]..", template.process(mapModel));

		mapModel.put("flag", false);
		mapModel.put("data", ArrayUtils.asList("a", "b", "c"));
		assertEquals("..<2a><2b><2c>..", template.process(mapModel));

		mapModel.put("flag", false);
		mapModel.put("data", Collections.EMPTY_LIST);
		assertEquals("..[2empty]..", template.process(mapModel));
	}

	@Test
	public void testFilter() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(false, "{{ '123'|size }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();

		assertEquals("3", template.process(mapModel));
	}

	@Test
	public void testFilterWithArgs() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x|join('[', ']') }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(1, 2, 3));
		assertEquals("[1][2][3]", template.process(mapModel));
	}

	@Test
	public void testFilters() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(
				false,
				"<body>{{ x|raw }} {{ '<'|escape }} {{ x|size }} {{ '123'|size }} {{ [1,2,3]|size }} {{ '1.5'|float + 1 }} {{ '1'|int + 1 }} {{ 1|bool }} {{ 0|bool }} {{ true|bool }} {{ false|bool }} {{ 'http://test?c=SPORTSHEADS&url=http%3A%2F%2Fhosted2%2Eap%2E'|urlencode }}</body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", "&lt;");

		assertEquals(
				"<body>&lt; &lt; 4 3 3 2.5 2 true false true false http%3A%2F%2Ftest%3Fc%3DSPORTSHEADS%26url%3Dhttp%253A%252F%252Fhosted2%252Eap%252E</body>",
				template.process(mapModel));
	}

	@Test
	public void testFormatFilter() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(
				false,
				"{{ array|format('%d/%d') }} {{ array2|format('%d/%d') }} {{ array3|format('%d/%d') }} {{ array4|format('%d/%d') }} {{ array5|format('%d/%d') }} {{ list|format('%d/%d') }} {{ [1,2]|format('%d/%d') }} {{ 123|format('%d') }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("array", new int[] { 1, 2 });
		mapModel.put("array2", new Integer[] { 1, 2 });
		mapModel.put("array3", new Object[] { 1, 2 });
		mapModel.put("array4", new short[] { 1, 2 });
		mapModel.put("array5", new Short[] { 1, 2 });
		mapModel.put("list", ArrayUtils.asList(1, 2));

		assertEquals("1/2 1/2 1/2 1/2 1/2 1/2 1/2 123", template.process(mapModel));
	}

	@Test
	public void testJoinFilter() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parse("{{ x|join }} {{ x|join(',') }} {{ x|join('[', ']') }} {{ x|join('[', ',', ']') }} {{ x|join('', '[', ',', ']', '') }} {{ x|join('{', '[', ']', '}') }} {{ x|join('{', '[', ',', ']', '}') }}");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(1, 2, 3));
		assertEquals("123 1,2,3 [1][2][3] [1,2,3] [1],[2],[3] {[1][2][3]} {[1],[2],[3]}", template.process(mapModel));
	}

	@Test
	public void testStaticFilters() throws TemplateParserException {
		TemplateRootScope rootScope = new TemplateRootScope();
		rootScope.addFilters(StaticTestMethods.class);

		Templater templater = new Templater(rootScope);
		Template template = templater.parse("{{ 'foo'|add_x }} {{ 1|add_x }} {{ 10|sub_1 }} {{ '10'|sub_1 }}");
		assertEquals("foox 1x 9 9", template.process(null));
	}

	@Test
	public void testXml() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(false, "<body>{% if x %}<x value='true' />{% else %}<x value='false'></x>{% end %}</body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", true);
		assertEquals("<body><x value='true'/></body>", template.process(mapModel));
	}

	@Test
	public void testXmlWithHtmlEntities() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(false, "<body>&nbsp;</body>");

		assertEquals("<body>&nbsp;</body>", template.process(null));
	}

	@Test
	public void testXmlEscaping() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(false,
				"<body>{% if x %}&amp;&lt;&gt;\"'<x value='&lt;&gt;\"&amp;&#39;' value2=\"&lt;&gt;&quot;&amp;'\" value3=\"{{ y }}\" />{% end %}</body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", true);
		mapModel.put("y", "<>\"&'");
		assertEquals(
				"<body>&amp;&lt;&gt;\"'<x value='&lt;&gt;\"&amp;&#39;' value2=\"&lt;&gt;&quot;&amp;'\" value3=\"&lt;&gt;&quot;&amp;'\"/></body>",
				template.process(mapModel));
	}

	@Test
	public void testXmlAsHtml() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(
				true,
				"<body><div id='header' />{% if x %}<code>x</code> is     <img src='true.png' />true{% else %}<code>x</code> is <img src='false.png' />false{% end %}<br />the end</body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", true);
		mapModel.put("y", "<>\"&'");
		assertEquals("<body><div id='header' /><code>x</code> is <img src='true.png' />true<br />the end</body>",
				template.process(mapModel));
	}

	@Test
	public void testXmlCharsInTemplateLanguage() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(true, "<body>{% if x < y %}less{% else %}greater{% end %}</body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", true);
		mapModel.put("y", "<>\"&'");
		assertEquals("<body>greater</body>", template.process(mapModel));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testXmlInclude() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(true, TemplateFile.fromResource(getClass(), "outerTemplate.xml"));

		HashMap<String, Object> innerMap = Maps.newHashMap();
		innerMap.put("data", ArrayUtils.asList("a", "b", "c"));

		HashMap<String, Object> innerMap2 = Maps.newHashMap();
		innerMap2.put("data", Collections.EMPTY_LIST);

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", ArrayUtils.asList(innerMap, innerMap2));

		assertEquals("<template><inner>Whoa: abc</inner><inner>Whoa: no data</inner></template>", template.process(mapModel));
	}

	@Test
	public void testXmlWithRaw() throws TemplateParserException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(true, "<body>{{ x }}</body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", new Raw("<invalid xml>"));
		assertEquals("<body><invalid xml></body>", template.process(mapModel));
	}

	@Test
	public void testXmlIf() throws TemplateParserException, IOException {
		Templater templater = createTemplater();
		Template template = templater.parseXml(false, "<body><x {% if x %}value='true'{% else %}value='false'{% end %} /></body>");

		HashMap<String, Object> mapModel = Maps.newHashMap();
		mapModel.put("x", true);
		assertEquals("<body><x value='true'/></body>", template.process(mapModel));
	}

	@Test
	public void testListOfStringUseCase() {
		// Templater templater = createTemplater();
		// Template template = templater.parseXml(false,
		// "<body>{% if x %}&amp;&lt;&gt;\"'<x value='&lt;&gt;\"&amp;&#39;' value2=\"&lt;&gt;&quot;&amp;'\" value3=\"{{ y }}\" />{% end %}</body>");
	}

	@Test
	public void testAutoConversion() throws TemplateParserException {
		TemplateRootScope rootScope = new TemplateRootScope();
		rootScope.addAutoConverter(ZipEntry.class, URL.class, new Converter<ZipEntry, URL>() {
			@Override
			public URL convert(ZipEntry from) {
				try {
					return new URL("http://" + from.getName() + "/foo.txt");
				} catch (MalformedURLException e) {
					fail();
					return null;
				}
			}
		});

		Templater templater = new Templater(rootScope);
		HashMap<String, Object> model = Maps.newHashMap();
		model.put("z", new ZipEntry("grack.com"));
		Template template = templater.parse("{{ z.host }}");
		assertEquals("grack.com", template.process(model));
	}
}
