package net.stencilproject.template;


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

/**
 * For test support only.
 */
class InternalParserTestSupport {
	public static String testParse(String input) {
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
		try {
			return ((CommonTree) parser.template().tree).toStringTree();
		} catch (RecognitionException e1) {
			throw new RuntimeException(e1);
		}
	}
}
