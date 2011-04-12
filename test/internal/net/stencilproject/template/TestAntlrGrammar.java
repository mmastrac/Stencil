package net.stencilproject.template;

import org.junit.Test;

/**
 * Smoketests the ANTLR grammar. Doesn't currently assert on contents (should
 * though).
 */
public class TestAntlrGrammar {
	@Test
	public void testGrammar() {
		final String input = "yo test!";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar2() {
		final String input = "yo test{{ 1 }}";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar3() {
		final String input = "yo test{# 1 #}";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar4() {
		final String input = "yo test{% 1 %}hey";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar5() {
		final String input = "yo test{{% 1 %}}hey";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar6() {
		final String input = "yo test{{{ 1 }}}hey";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar7() {
		final String input = "yo test{%%%raw this is totally raw{{}} %%%}hey";

		System.out.println(InternalParserTestSupport.testParse(input));
	}

	@Test
	public void testGrammar8() {
		final String input = "{{1}} {{{2}}} {{{{3}}}} {%%%raw {{4}}%%%}{{5}}";

		System.out.println(InternalParserTestSupport.testParse(input));
	}
}
