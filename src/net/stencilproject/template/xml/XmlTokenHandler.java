package net.stencilproject.template.xml;

public interface XmlTokenHandler {
	void token(Mode mode, TokenType type, int[] value, int valueOffset, int valueLength);
}
