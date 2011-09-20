package net.stencilproject.template;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * Represents a string literal parsed from a template. Pre-processes escape codes at creation time.
 */
class StringNode extends CommonTree {
	public StringNode(Token token) {
		super(token);

		StringBuilder text = new StringBuilder();
		String rawText = token.getText();

		if (rawText.startsWith("\"\"\"") || rawText.startsWith("'''")) {
			token.setText(rawText.substring(3, rawText.length() - 3));
			return;
		}

		for (int i = 1; i < rawText.length() - 1; i++) {
			char c = rawText.charAt(i);
			if (c == '\\') {
				c = rawText.charAt(++i);
				switch (c) {
				case 'b':
					text.append('\b');
					break;
				case 't':
					text.append('\t');
					break;
				case 'n':
					text.append('\n');
					break;
				case 'f':
					text.append('\f');
					break;
				case 'r':
					text.append('\r');
					break;
				case '"':
					text.append('\"');
					break;
				case '\'':
					text.append('\'');
					break;
				case '\\':
					text.append('\\');
					break;
				case 'x':
					text.append((char) Integer.parseInt(rawText.substring(i + 1, i + 3), 16));
					i += 2;
					break;
				case 'u':
					text.append((char) Integer.parseInt(rawText.substring(i + 1, i + 5), 16));
					i += 4;
					break;
				}
			} else {
				text.append(c);
			}
		}

		token.setText(text.toString());
	}
}
