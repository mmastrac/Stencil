package net.stencilproject.template.xml;

/**
 * Determines the XML character class of a character.
 */
public class XmlChars {
	public static boolean isNameStart(int c) {
		// [4] NameStartChar ::= ":" | [A-Z] | "_" | [a-z] | [#xC0-#xD6] |
		// [#xD8-#xF6] | [#xF8-#x2FF] | [#x370-#x37D] |
		// [#x37F-#x1FFF] | [#x200C-#x200D] | [#x2070-#x218F] | [#x2C00-#x2FEF]
		// | [#x3001-#xD7FF] | [#xF900-#xFDCF] |
		// [#xFDF0-#xFFFD] | [#x10000-#xEFFFF]
		return c == ':' || (c >= 'A' && c <= 'Z') || c == '_' || (c >= 'a' && c <= 'z') || (c >= 0xC0 && c <= 0xD6)
				|| (c >= 0xD8 && c <= 0xF6) || (c >= 0xF8 && c <= 0x2FF) || (c >= 0x370 && c <= 0x37D) || (c >= 0x37F && c <= 0x1FFF)
				|| (c >= 0x200C && c <= 0x200D) || (c >= 0x2070 && c <= 0x218F) || (c >= 0x2C00 && c <= 0x2FEF)
				|| (c >= 0x3001 && c <= 0xD7FF) || (c >= 0xF900 && c <= 0xFDCF) || (c >= 0xFDF0 && c <= 0xFFFD)
				|| (c >= 0x10000 && c <= 0xEFFFF);
	}

	public static boolean isWhitespace(int c) {
		// #x20 | #x9 | #xD | #xA
		return c == 0x20 || c == 0x9 || c == 0xd || c == 0xa;
	}

	public static boolean isName(int c) {
		// [4a] NameChar ::= NameStartChar | "-" | "." | [0-9] | #xB7 |
		// [#x0300-#x036F] | [#x203F-#x2040]
		return isNameStart(c) || c == '-' || c == '.' || (c >= '0' && c <= '9') || c == 0xB7 || (c >= 0x0300 && c <= 0x036F)
				|| (c >= 0x203F && c <= 0x2040);
	}

	public static boolean isDecimalNumeric(int c) {
		return (c >= '0' && c <= '9');
	}

	public static boolean isHexNumeric(int c) {
		return isDecimalNumeric(c) || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');
	}
}
