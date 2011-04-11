package net.stencilproject.template.xml;

public enum TokenType {
	/** Value for PCDATA, attribute value, CDATA, comment, etc. Use the mode to determine which node type it was. */
	VALUE,

	/** Optional whitespace (may be omitted entirely */
	OPTIONAL_WS,

	/**
	 * Required whitespace (one whitespace character required, any additional characters may be collapsed to a single
	 * character)
	 */
	REQUIRED_WS,

	START_ELEMENT_OPEN, START_ELEMENT_EMPTY_CLOSE, START_ELEMENT_CLOSE, START_ELEMENT_NAME,

	ATTRIBUTE_EQUALS,

	ATTRIBUTE_NAME, START_ATTRIBUTE_VALUE, END_ATTRIBUTE_VALUE,

	END_ELEMENT_OPEN, END_ELEMENT_NAME, END_ELEMENT_CLOSE,

	ENTITY_OPEN, ENTITY_NAME, CHAR_REF_DEC, CHAR_REF_HEX, ENTITY_CLOSE,

	COMMENT_OPEN, COMMENT_CLOSE,

	CDATA_OPEN, CDATA_CLOSE,

	PI_OPEN, PI_NAME, PI_CLOSE,
}
