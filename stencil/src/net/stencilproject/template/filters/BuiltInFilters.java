package net.stencilproject.template.filters;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Map;

import net.stencilproject.template.TemplateContext;
import net.stencilproject.template.Types;
import net.stencilproject.template.types.Raw;


public class BuiltInFilters implements Filter {
	public static Raw raw(String string) {
		return new Raw(string);
	}

	public static Raw escape(String string) {
		StringBuilder escaped = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			switch (c) {
			case '<':
				escaped.append("&lt;");
				break;
			case '>':
				escaped.append("&gt;");
				break;
			case '&':
				escaped.append("&amp;");
				break;
			case '\"':
				escaped.append("&quot;");
				break;
			default:
				escaped.append(c);
			}
		}

		return new Raw(escaped.toString());
	}

	public static String urlencode(String string) {
		try {
			return URLEncoder.encode(string, "utf-8");
		} catch (UnsupportedEncodingException e) {
			return string;
		}
	}

	public static String string(String string) {
		return string;
	}

	public static String format(TemplateContext ctx, Object obj, String format) {
		try {
			Object[] args = Types.toObjectArray(ctx, obj);
			if (args == null) {
				if (obj == null || obj instanceof Map<?, ?>) {
					ctx.warn("Can't format an object of type " + Types.getClassName(ctx, obj));
					return null;
				}

				args = new Object[] { obj };
			}

			return String.format(format, args);
		} catch (IllegalFormatException e) {
			ctx.warn("Formatting failure", e);
			return null;
		}
	}

	public static int size(TemplateContext ctx, Object sizeable) {
		if (sizeable instanceof Collection<?>) {
			return ((Collection<?>) sizeable).size();
		}

		if (Types.isString(ctx, sizeable)) {
			return Types.toString(ctx, sizeable).length();
		}

		if (Types.isArray(ctx, sizeable)) {
			return Array.getLength(sizeable);
		}

		if (sizeable == null) {
			return 0;
		}

		ctx.warn("Size isn't appropriate for type " + Types.getClassName(ctx, sizeable));

		return 0;
	}

	public static int _int(int value) {
		return value;
	}

	public static double _float(double value) {
		return value;
	}

	public static boolean bool(boolean value) {
		return value;
	}

	public static String join(TemplateContext ctx, Iterator<Object> it) {
		return joinInternal(ctx, it, null, null, null, null, null);
	}

	public static String join(TemplateContext ctx, Iterator<Object> it, String between) {
		return joinInternal(ctx, it, null, null, null, null, between);
	}

	public static String join(TemplateContext ctx, Iterator<Object> it, String before, String after) {
		return joinInternal(ctx, it, null, null, before, after, null);
	}

	public static String join(TemplateContext ctx, Iterator<Object> it, String start, String between, String end) {
		return joinInternal(ctx, it, start, end, null, null, between);
	}

	public static String join(TemplateContext ctx, Iterator<Object> it, String start, String before, String after, String end) {
		return joinInternal(ctx, it, start, end, before, after, null);
	}

	public static String join(TemplateContext ctx, Iterator<Object> it, String start, String before, String between, String after,
			String end) {
		return joinInternal(ctx, it, start, end, before, after, between);
	}

	private static String joinInternal(TemplateContext ctx, Iterator<Object> it, String start, String end, String before, String after,
			String between) {
		StringBuilder output = new StringBuilder();
		boolean first = true;
		while (it.hasNext()) {
			if (first) {
				if (start != null) {
					output.append(start);
				}
			}

			if (!first) {
				if (between != null) {
					output.append(between);
				}
			}

			if (before != null) {
				output.append(before);
			}

			Object obj = it.next();
			output.append(Types.toString(ctx, obj));

			if (after != null) {
				output.append(after);
			}

			first = false;
		}

		if (!first) {
			if (end != null) {
				output.append(end);
			}
		}

		return output.toString();
	}
}
