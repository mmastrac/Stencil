package net.stencilproject.template;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

/**
 * Add a literal mode over top of the existing TemplateLexer. Adding it directly to the grammar causes problems with the
 * generated DFAs.
 */
class GatingTemplateLexer extends TemplateLexer {
	public GatingTemplateLexer() {
		super();
	}

	public GatingTemplateLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public GatingTemplateLexer(CharStream input) {
		super(input);
	}

	@Override
	public void mTokens() throws RecognitionException {
		if (literalMode) {
			mTEMPLATE_LITERAL();
		} else {
			super.mTokens();
		}
	}

	private void mTEMPLATE_LITERAL() {
		if (input.LA(1) == EOF) {
			state.type = EOF;
			state.channel = DEFAULT_TOKEN_CHANNEL;
			return;
		}

		while (true) {
			int la1 = input.LA(1);
			if (la1 == EOF) {
				input.consume();
				break;
			}

			int la2 = input.LA(2);

			if (la1 == '{') {
				if (la2 == '{') {
					int la3 = input.LA(3);
					if (la3 == '{' || la3 == '#' || la3 == '%') {
						input.consume();
						continue;
					}

					break;
				}

				if (la2 == '#' || la2 == '%') {
					break;
				}
			}

			input.consume();
		}

		state.type = TEMPLATE_LITERAL;
		state.channel = DEFAULT_TOKEN_CHANNEL;

		literalMode = false;
	}
}
