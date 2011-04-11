package net.stencilproject.template;

import net.stencilproject.template.GatingTemplateLexer;
import net.stencilproject.template.TemplateLexer;
import net.stencilproject.template.TemplateParser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Test;

public class TestAntlrGrammar {
	@Test
	public void testGrammar() throws RecognitionException {
		final String input = "yo test!";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar2() throws RecognitionException {
		final String input = "yo test{{ 1 }}";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar3() throws RecognitionException {
		final String input = "yo test{# 1 #}";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar4() throws RecognitionException {
		final String input = "yo test{% 1 %}hey";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar5() throws RecognitionException {
		final String input = "yo test{{% 1 %}}hey";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar6() throws RecognitionException {
		final String input = "yo test{{{ 1 }}}hey";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar7() throws RecognitionException {
		final String input = "yo test{%%%raw this is totally raw{{}} %%%}hey";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	@Test
	public void testGrammar8() throws RecognitionException {
		final String input = "{{1}} {{{2}}} {{{{3}}}} {%%%raw {{4}}%%%}{{5}}";

		CommonTree tree = parse(input);
		System.out.println(tree.toStringTree());
	}

	private CommonTree parse(final String input) throws RecognitionException {
		final ANTLRStringStream stringStream = new ANTLRStringStream(input);
		final Exception[] stashed = new Exception[1];

		TemplateLexer lexer = new GatingTemplateLexer(stringStream) {
			@Override
			public void reportError(RecognitionException e) {
				stashed[0] = e;
				throw new RuntimeException(e);
			};
		};
		TokenStream stream = new CommonTokenStream(lexer);

		TemplateParser parser = new TemplateParser(stream) {
			@Override
			public void reportError(RecognitionException e) {
				stashed[0] = e;
				throw new RuntimeException(e);
			};
		};

		if (stashed[0] != null) {
			throw new RuntimeException(stashed[0]);
		}
		return (CommonTree) parser.template().tree;
	}
}
