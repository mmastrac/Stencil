package net.stencilproject.template;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * Represents a template literal parsed from a template.
 */
class TemplateRawNode extends CommonTree {
	private String filter;

	public TemplateRawNode(Token token) {
		super(token);

		String text = token.getText();
		filter = getFilter(text);

		for (int i = filter.length() + 4; i < text.length(); i++) {
			final char c = text.charAt(i);
			if (!Character.isWhitespace(c)) {
				text = text.substring(i, text.length() - 4);
				break;
			}
		}

		token.setText(text);
	}

	public String getFilter() {
		return filter;
	}

	private String getFilter(String text) {
		StringBuilder filter = new StringBuilder();
		for (int i = 4; i < text.length(); i++) {
			final char c = text.charAt(i);
			if (Character.isWhitespace(c)) {
				break;
			} else {
				filter.append(c);
			}
		}

		return filter.toString();
	}
}
