package net.stencilproject.template;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import net.stencilproject.template.types.Raw;
import net.stencilproject.template.util.StringUtils;

import com.google.common.collect.Iterators;

public class Types {
	public static enum TypeCode {
		BOOLEAN, DOUBLE, ENUM, LONG, LIST, MAP, OBJECT, STRING
	}

	/**
	 * Coerces the object to the indicated type.
	 */
	public static Object coerce(TemplateContext ctx, Class<?> type, final Object o) {
		Object arg;

		if (o != null && type == o.getClass()) {
			arg = o;
		} else if (type == String.class) {
			arg = Types.toString(ctx, o);
		} else if (type == int.class || type == Integer.class) {
			arg = Types.toInteger(ctx, o);
		} else if (type == long.class || type == Long.class) {
			arg = Types.toLong(ctx, o);
		} else if (type == float.class || type == Float.class || type == double.class || type == Double.class) {
			arg = Types.toDouble(ctx, o);
		} else if (type == boolean.class || type == Boolean.class) {
			arg = Types.toBoolean(ctx, o);
		} else if (type == Iterator.class) {
			arg = Types.toIterator(ctx, o);
		} else {
			if (o == null) {
				arg = null;
			} else {
				final Converter<Object, Object> converter = ctx.getConverter(o.getClass(), type);
				if (converter == null) {
					arg = o;
				} else {
					try {
						arg = converter.convert(o);
					} catch (ConverterException e) {
						ctx.warn("Conversion error", e);
						return null;
					}
				}
			}
		}

		return arg;
	}

	/**
	 * Gets a class name from an object for printing in warnings.
	 */
	public static String getClassName(TemplateContext ctx, Object o) {
		if (o == null) {
			return "(null)";
		}

		return o.getClass().getName();
	}

	/**
	 * Gets a type code for an object.
	 */
	public static TypeCode getTypeCode(TemplateContext ctx, Object o) {
		// Integral types become LONG
		if (o instanceof Long || o instanceof Integer || o instanceof Short || o instanceof Byte) {
			return TypeCode.LONG;
		}

		// Any other Number becomes DOUBLE
		if (o instanceof Number) {
			return TypeCode.DOUBLE;
		}

		if (isString(ctx, o)) {
			return TypeCode.STRING;
		}

		if (o instanceof Enum<?>) {
			return TypeCode.ENUM;
		}

		return TypeCode.OBJECT;
	}

	public static boolean isArray(TemplateContext ctx, Object o) {
		return o != null && o.getClass().isArray();
	}

	public static boolean isNumeric(TemplateContext ctx, Object o) {
		return o instanceof Number;
	}

	public static boolean isDouble(TemplateContext ctx, Object o) {
		return o instanceof Number && !isIntegral(ctx, o);
	}

	public static boolean isIntegral(TemplateContext ctx, Object o) {
		return o instanceof Long || o instanceof Integer || o instanceof Short || o instanceof Byte;
	}

	public static boolean isString(TemplateContext ctx, Object o) {
		return o instanceof CharSequence || o instanceof Raw || o instanceof Character;
	}

	public static boolean isEnum(TemplateContext ctx, Object o) {
		return o instanceof Enum<?>;
	}

	public static boolean isBoolean(TemplateContext ctx, Object o1) {
		return o1 instanceof Boolean;
	}

	public static boolean isComparable(TemplateContext ctx, Object o) {
		return o instanceof Comparable<?>;
	}

	public static boolean toBoolean(TemplateContext ctx, Object o) {
		if (o == null) {
			return false;
		}

		if (o instanceof Boolean) {
			return (Boolean) o;
		}

		if (o instanceof Number) {
			double d = ((Number) o).doubleValue();
			return !Double.isNaN(d) && d != 0;
		}

		if (o instanceof Collection<?>) {
			return !((Collection<?>) o).isEmpty();
		}

		if (o instanceof Map<?, ?>) {
			return !((Map<?, ?>) o).isEmpty();
		}

		if (Types.isString(ctx, o)) {
			return !StringUtils.isEmpty(Types.toString(ctx, o));
		}

		return true;
	}

	public static double toDouble(TemplateContext ctx, Object o) {
		if (o instanceof Number) {
			return ((Number) o).doubleValue();
		}

		if (o instanceof Enum<?>) {
			return ((Enum<?>) o).ordinal();
		}

		if (isString(ctx, o)) {
			return Double.parseDouble((String) o);
		}

		if (o instanceof Boolean) {
			return ((Boolean) o) ? 1 : 0;
		}

		return 0;
	}

	public static int toInteger(TemplateContext ctx, Object o) {
		if (o instanceof Number) {
			return ((Number) o).intValue();
		}

		if (o instanceof Enum<?>) {
			return ((Enum<?>) o).ordinal();
		}

		if (isString(ctx, o)) {
			return Integer.parseInt((String) o);
		}

		return 0;
	}

	public static long toLong(TemplateContext ctx, Object o) {
		if (o instanceof Number) {
			return ((Number) o).longValue();
		}

		if (o instanceof Enum<?>) {
			return ((Enum<?>) o).ordinal();
		}

		if (isString(ctx, o)) {
			return Long.parseLong((String) o);
		}

		return 0;
	}

	public static Iterator<?> toIterator(TemplateContext ctx, Object o) {
		if (o == null) {
			return IteratorUtils.NULL_ITERATOR;
		}

		if (o instanceof Iterator<?>) {
			return (Iterator<?>) o;
		}

		if (o instanceof Iterable<?>) {
			return ((Iterable<?>) o).iterator();
		}

		if (o instanceof Map<?, ?>) {
			return IteratorUtils.toIterator((Map<?, ?>) o);
		}

		if (isString(ctx, o)) {
			return IteratorUtils.toIterator(toString(ctx, o));
		}

		if (isArray(ctx, o)) {
			return IteratorUtils.toIteratorArray(o);
		}

		if (o instanceof Enumeration<?>) {
			return Iterators.forEnumeration((Enumeration<?>) o);
		}

		ctx.warn("Cannot iterate over object of type " + o.getClass());

		return IteratorUtils.NULL_ITERATOR;
	}

	/**
	 * Attempts to coerce the passed object to an array of objects. If it can't be done, returns null.
	 */
	public static Object[] toObjectArray(TemplateContext ctx, Object o) {
		Object[] args;

		if (o == null) {
			return null;
		}

		if (o instanceof Object[]) {
			return (Object[]) o;
		}

		if (isArray(ctx, o)) {
			final int length = Array.getLength(o);
			args = new Object[length];
			if (o.getClass().getComponentType().isPrimitive()) {
				// Primitive arrays require element-by-element boxing
				for (int i = 0; i < length; i++) {
					args[i] = Array.get(o, i);
				}
			} else {
				// Object arrays can be blitted directly to our new array
				System.arraycopy(o, 0, args, 0, length);
			}
			return args;
		}

		if (o instanceof Collection<?>) {
			return ((Collection<?>) o).toArray();
		}

		if (o instanceof Iterator<?>) {
			ArrayList<Object> argList = new ArrayList<Object>();
			Iterators.addAll(argList, (Iterator<?>) o);
			return argList.toArray();
		}

		if (o instanceof Iterable<?>) {
			ArrayList<Object> argList = new ArrayList<Object>();
			Iterators.addAll(argList, ((Iterable<?>) o).iterator());
			return argList.toArray();
		}

		return null;
	}

	public static String toString(TemplateContext ctx, Object o) {
		return o == null ? "" : String.valueOf(o);
	}

	private Types() {
	}
}
