package net.stencilproject.template.xml;

import java.util.Stack;

import net.stencilproject.template.util.ArrayUtils;

/**
 * XML lexer than consumes a single character at a time and outputs events to an
 * {@link XmlTokenHandler}.
 */
public class XmlPushLexer {
	private static final boolean LOG_EVENTS = false;

	Stack<State> state = new Stack<State>();
	char[] consuming = null;
	int consumeIndex = 0;
	char[] expecting = null;
	int expectIndex = 0;
	String expectFailure;
	TokenType expectToken;
	int[] token = new int[512];
	int tokenStart = 0;
	int tokenPosition = 0;
	XmlTokenHandler handler;
	TokenType nameType;
	State postNameState;
	Mode mode;

	public XmlPushLexer(XmlTokenHandler handler) {
		this.handler = handler;
		push(State.PCDATA);
	}

	public void input(int c) throws NotWellFormedException {
		if (LOG_EVENTS) {
			log("PROCESS: '" + codePointToString(c) + "' (" + state.peek() + ")");
		}

		consume(c);

		if (c > 0) {
			state.peek().c(this, c);
		}
	}

	private String codePointToString(int c) {
		if (c < 0) {
			return "(" + c + ")";
		}

		return new String(new int[] { c }, 0, 1);
	}

	private String codePointsToString(int[] c, int start, int length) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			builder.append(codePointToString(c[start + i]));
		}

		return builder.toString();
	}

	public void input(String str) throws NotWellFormedException {
		for (int i = 0; i < str.length(); i++) {
			input(str.charAt(i));
		}
	}

	public void finish() throws NotWellFormedException {
		if (state.size() > 1 || state.peek() != State.PCDATA) {
			throw new NotWellFormedException("Unclosed elements", -1);
		}

		emitIfNotEmpty(TokenType.VALUE, 0);
	}

	protected boolean lookback(String str) {
		final int lookbackLength = str.length();

		if (tokenPosition - tokenStart < lookbackLength) {
			return false;
		}

		int lookbackIndex = str.length() - 1;
		int tokenIndex = tokenPosition;
		while (lookbackIndex >= 0 && tokenIndex >= tokenStart) {
			tokenIndex--;

			if (token[tokenIndex] < 0) {
				continue;
			}

			if (token[tokenIndex] != str.charAt(lookbackIndex)) {
				return false;
			}

			lookbackIndex--;
		}

		return true;
	}

	protected void emitIfNotEmpty(TokenType type, int exclude) {
		if (tokenPosition + exclude - tokenStart > 0) {
			emit(type, exclude);
		}
	}

	protected void emit(TokenType type, int exclude) {
		for (int i = 0; i < -exclude; i++) {
			if (token[tokenPosition - i - 1] < 0) {
				exclude--;
			}
		}

		if (handler != null) {
			final int length = tokenPosition + exclude - tokenStart;
			if (LOG_EVENTS) {
				log("EMIT " + type + ": '" + codePointsToString(token, tokenStart, length) + "' ("
						+ codePointsToString(token, 0, tokenPosition) + ")");
			}
			handler.token(mode, type, token, tokenStart, length);
		}
		if (exclude == 0) {
			tokenPosition = 0;
			tokenStart = 0;
		} else {
			tokenStart = tokenPosition + exclude;
		}
	}

	protected void emitName(int c) throws NotWellFormedException {
		emit(nameType, -1);
		nameType = null;
		state(postNameState);
		postNameState.c(this, c);
	}

	protected String clear() {
		String str = new String(token, 0, tokenPosition);
		tokenPosition = 0;
		return str;
	}

	protected void name(State s, TokenType type, int c) {
		nameType = type;
		postNameState = s;
		state(State.NAME);
	}

	protected void state(State s) {
		pop();
		push(s);
	}

	protected void pop() {
		state.pop();
	}

	protected void pop(int c) throws NotWellFormedException {
		pop();
		state.peek().c(this, c);
	}

	/**
	 * Consumes input until the string is matched.
	 */
	protected void consumeTo(String str) {
		expecting = null;
		consuming = str.toCharArray();
		consumeIndex = 0;
	}

	protected void consumeTo(String expect, TokenType expectToken, String expectFailure, String str) {
		expecting = expect.toCharArray();
		this.expectFailure = expectFailure;
		this.expectToken = expectToken;
		expectIndex = 0;
		consuming = str.toCharArray();
		consumeIndex = 0;
	}

	/**
	 * Consume input until the char is matched.
	 */
	protected void consumeTo(char c) {
		expecting = null;
		consuming = new char[] { c };
		consumeIndex = 0;
	}

	protected boolean stepConsumeTo(int c) throws NotWellFormedException {
		if (expecting != null) {
			if (c != expecting[expectIndex++]) {
				throw new NotWellFormedException(expectFailure, c);
			}

			// Expectations satisfied, start consuming
			if (expectIndex == expecting.length) {
				expecting = null;
				emit(expectToken, 0);
			}
		} else {
			if (c != consuming[consumeIndex]) {
				// No match, rewind match
				consumeIndex = 0;
			}

			if (c == consuming[consumeIndex]) {
				consumeIndex++;
				// Finished consuming?
				if (consumeIndex == consuming.length) {
					consuming = null;
					return true;
				}
			}
		}

		return false;
	}

	protected void consume(int c) {
		token[tokenPosition++] = c;
		if (tokenPosition > token.length - 1) {
			token = ArrayUtils.copyOf(token, token.length * 2);
		}
	}

	protected void push(State state) {
		this.state.push(state);
		state.enter(this);
	}

	protected void mode(Mode mode) {
		this.mode = mode;
	}

	private void log(String string) {
		System.out.println(string);
	}
}
