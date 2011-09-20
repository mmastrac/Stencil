package net.stencilproject.template;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import net.stencilproject.template.TemplateParserException.TemplateError;

import org.junit.Test;

/**
 * Tests for various parsing exceptions.
 */
public class TestParseExceptions {
	private Templater createTemplater() {
		TemplateOptions options = new TemplateOptions();
		options.setDumpTemplate(true);
		options.setTraceExecution(true);
		return new Templater(null, options);
	}

	@Test
	public void testErrorInvalidChar() {
		Templater templater = createTemplater();
		try {
			templater.parse("{{ ! }} <- bad token");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.PARSE_ERROR, e.getError());
			assertEquals(4, e.getCharPositionInLine());
			assertEquals(1, e.getLine());
		}
	}

	@Test
	public void testErrorReservedWord() {
		Templater templater = createTemplater();
		try {
			templater.parse("{{ foo.limit }} <- limit is a reserved word");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.PARSE_ERROR, e.getError());
			assertEquals(7, e.getCharPositionInLine());
			assertEquals(1, e.getLine());
			assertEquals("string:1:7 Unexpected token: found LIMIT ('limit') but was expecting ID", e.getMessage());
		}
	}

	@Test
	public void testErrorIfWithoutEnd() {
		Templater templater = createTemplater();
		try {
			templater.parse("{% if x %} <- missing end");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.IF_MISSING_END, e.getError());
		}

		try {
			templater.parse("{% if x %} <- missing end {% else %}");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.IF_MISSING_END, e.getError());
		}
	}

	@Test
	public void testErrorForWithoutEnd() {
		Templater templater = createTemplater();
		try {
			templater.parse("{% for x in y %} <- missing end");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.FOR_MISSING_END, e.getError());
		}

		try {
			templater.parse("{% for x in y %} <- missing end {% else %}");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.FOR_MISSING_END, e.getError());
		}
	}

	@Test
	public void testErrorForDuplicateElse() {
		Templater templater = createTemplater();
		try {
			templater.parse("{% for x in y %}{% else %}{% else %} <- duplicate else {% end %}");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.FOR_DUPLICATE_ELSE, e.getError());
		}
	}

	@Test
	public void testErrorIfDuplicateElse() {
		Templater templater = createTemplater();
		try {
			templater.parse("{% if x %}{% else %}{% else %} <- duplicate else {% end %}");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.IF_DUPLICATE_ELSE, e.getError());
		}
	}

	@Test
	public void testErrorElifWithoutBlock() {
		Templater templater = createTemplater();
		try {
			templater.parse("{% elif x %} <- missing a block");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.ELIF_WITHOUT_IF, e.getError());
		}
	}

	@Test
	public void testErrorElifWithWrongBlock() {
		Templater templater = createTemplater();
		try {
			templater.parse("{% for x in y %}{% elif x %} <- doesn't match for");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.ELIF_WITH_WRONG_BLOCK, e.getError());
		}
	}

	@Test
	public void testErrorInvalidExpression() {
		Templater templater = createTemplater();
		try {
			templater.parse("{{ 1 xor 1 }}");
			fail("Should have thrown exception");
		} catch (TemplateParserException e) {
			assertEquals(TemplateError.PARSE_ERROR, e.getError());
		}
	}
}
