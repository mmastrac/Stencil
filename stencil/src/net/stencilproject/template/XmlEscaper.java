package net.stencilproject.template;

import java.io.IOException;

class XmlEscaper {
	public static String escape(char c) {
		switch (c) {
		case '<':
			return "&lt;";
		case '>':
			return "&gt;";
		case '&':
			return "&amp;";
		case '\"':
			return "&quot;";
		}

		return Character.toString(c);
	}

	public static void escape(StringBuilder builder, char c) {
		switch (c) {
		case '<':
			builder.append("&lt;");
			break;
		case '>':
			builder.append("&gt;");
			break;
		case '&':
			builder.append("&amp;");
			break;
		case '\"':
			builder.append("&quot;");
			break;
		default:
			builder.append(c);
		}
	}

	public static void escape(Appendable appendable, char c) throws IOException {
		switch (c) {
		case '<':
			appendable.append("&lt;");
			break;
		case '>':
			appendable.append("&gt;");
			break;
		case '&':
			appendable.append("&amp;");
			break;
		case '\"':
			appendable.append("&quot;");
			break;
		default:
			appendable.append(c);
		}
	}
}
