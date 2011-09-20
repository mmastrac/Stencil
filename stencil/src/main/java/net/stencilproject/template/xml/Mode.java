package net.stencilproject.template.xml;

/**
 * Modifies the token type to avoid combinatorial explosions. Currently valid
 * for the VALUE and ENTITY_* tokens.
 */
public enum Mode {
	/** Outside of an element or control */
	PCDATA,
	/** Inside an element-related tag, but outside of attributes */
	ELEMENT,
	/** Attribute value */
	ATTRIBUTE,
	/** Comment */
	COMMENT,
	/** Processing instruction */
	PROCESSING_INSTRUCTION,
	/** CDATA section */
	CDATA,
}
