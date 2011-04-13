package net.stencilproject.template.xml;

/**
 * Used to receive events from {@link XmlPushLexer}.
 */
public interface XmlTokenHandler {
	void token(Mode mode, TokenType type, int[] value, int valueOffset, int valueLength);
}
