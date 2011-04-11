package net.stencilproject.template;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 * Represents a template literal parsed from a template.
 */
class TemplateLiteralNode extends CommonTree {
	public TemplateLiteralNode(Token token) {
		super(token);

		String text = token.getText();
		token.setText(text);
	}
}
