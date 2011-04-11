package net.stencilproject.template;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.stencilproject.template.Types.TypeCode;
import net.stencilproject.template.util.StringUtils;

/**
 * Generic template expression operations.
 */
public class Ops {
	private static final int UNDEFINED_COMPARISON = 0;

	/**
	 * Javascript-style and operator. If !boolean(value1), returns value1,
	 * otherwise returns value2.
	 */
	public static Object and(TemplateContext ctx, Object value1, final Object value2) {
		if (!Types.toBoolean(ctx, value1)) {
			return value1;
		}

		return value2;
	}

	/**
	 * Javascript-style or operator. If boolean(value1), returns value1,
	 * otherwise returns value2.
	 */
	public static Object or(TemplateContext ctx, Object value1, final Object value2) {
		if (Types.toBoolean(ctx, value1)) {
			return value1;
		}

		return value2;
	}

	public static Object iand(TemplateContext ctx, Object value1, final Object value2) {
		return Types.toLong(ctx, value1) & Types.toLong(ctx, value2);
	}

	public static Object ior(TemplateContext ctx, Object value1, final Object value2) {
		return Types.toLong(ctx, value1) | Types.toLong(ctx, value2);
	}

	public static Object xor(TemplateContext ctx, Object value1, final Object value2) {
		if (Types.isNumeric(ctx, value1) && Types.isNumeric(ctx, value2)) {
			return Types.toLong(ctx, value1) ^ Types.toLong(ctx, value2);
		}

		return Types.toBoolean(ctx, value1) ^ Types.toBoolean(ctx, value2);
	}

	public static Object div(TemplateContext ctx, Object value1, final Object value2) {
		TypeCode type1 = Types.getTypeCode(ctx, value1);
		TypeCode type2 = Types.getTypeCode(ctx, value2);

		// Promote to double
		if (type1 == TypeCode.DOUBLE || type2 == TypeCode.DOUBLE) {
			return Types.toDouble(ctx, value1) / Types.toDouble(ctx, value2);
		}

		return Types.toLong(ctx, value1) / Types.toLong(ctx, value2);
	}

	public static Object mul(TemplateContext ctx, Object value1, final Object value2) {
		TypeCode type1 = Types.getTypeCode(ctx, value1);
		TypeCode type2 = Types.getTypeCode(ctx, value2);

		// Promote to double
		if (type1 == TypeCode.DOUBLE || type2 == TypeCode.DOUBLE) {
			return Types.toDouble(ctx, value1) * Types.toDouble(ctx, value2);
		}

		return Types.toLong(ctx, value1) * Types.toLong(ctx, value2);
	}

	public static Object binaryPlus(TemplateContext ctx, Object value1, final Object value2) {
		TypeCode type1 = Types.getTypeCode(ctx, value1);
		TypeCode type2 = Types.getTypeCode(ctx, value2);

		// Promote to string
		if (type1 == TypeCode.STRING || type2 == TypeCode.STRING) {
			return Types.toString(ctx, value1) + Types.toString(ctx, value2);
		}

		if (type1 == TypeCode.DOUBLE || type2 == TypeCode.DOUBLE) {
			return Types.toDouble(ctx, value1) + Types.toDouble(ctx, value2);
		}

		return Types.toLong(ctx, value1) + Types.toLong(ctx, value2);
	}

	public static Object binaryMinus(TemplateContext ctx, Object value1, final Object value2) {
		TypeCode type1 = Types.getTypeCode(ctx, value1);
		TypeCode type2 = Types.getTypeCode(ctx, value2);

		// Promote to double
		if (type1 == TypeCode.DOUBLE || type2 == TypeCode.DOUBLE) {
			return Types.toDouble(ctx, value1) - Types.toDouble(ctx, value2);
		}

		return Types.toLong(ctx, value1) - Types.toLong(ctx, value2);
	}

	public static Object unaryMinus(TemplateContext ctx, Object value) {
		switch (Types.getTypeCode(ctx, value)) {
		case LONG:
		case ENUM:
			return -Types.toLong(ctx, value);
		case DOUBLE:
		default:
			return -Types.toDouble(ctx, value);
		}
	}

	public static Object unaryPlus(TemplateContext ctx, Object value) {
		switch (Types.getTypeCode(ctx, value)) {
		case LONG:
		case ENUM:
			return +Types.toLong(ctx, value);
		case DOUBLE:
		default:
			return +Types.toDouble(ctx, value);
		}
	}

	public static long bitwiseNot(TemplateContext ctx, Object value) {
		return ~Types.toLong(ctx, value);
	}

	public static boolean booleanNot(TemplateContext ctx, Object value) {
		return !Types.toBoolean(ctx, value);
	}

	public static long lshift(TemplateContext ctx, Object value, Object count) {
		return Types.toLong(ctx, value) << Types.toLong(ctx, count);
	}

	public static long rshift(TemplateContext ctx, Object value, Object count) {
		return Types.toLong(ctx, value) >> Types.toLong(ctx, count);
	}

	private static int sliceFixup(int i, int length) {
		if (i >= length) {
			return length;
		}

		if (i < 0) {
			return Math.max(0, length + i);
		}

		return i;
	}

	public static Object slice(TemplateContext ctx, Object target, Object startObject, Object endObject, Object strideObject) {
		int start = startObject == null ? 0 : Types.toInteger(ctx, startObject);
		int end = endObject == null ? Integer.MAX_VALUE : Types.toInteger(ctx, endObject);
		int stride = strideObject == null ? 1 : Types.toInteger(ctx, strideObject);

		if (stride <= 0) {
			// TODO: negative stride
			throw new RuntimeException("Invalid stride: " + stride);
		}

		if (Types.isString(ctx, target)) {
			final String string = Types.toString(ctx, target);

			start = sliceFixup(start, string.length());
			end = sliceFixup(end, string.length());

			if (stride == 1) {
				return string.substring(start, end);
			}

			StringBuilder output = new StringBuilder();
			for (int i = start; i < end; i += stride) {
				output.append(string.charAt(i));
			}

			return output.toString();
		}

		if (Types.isArray(ctx, target)) {
			int length = Array.getLength(target);
			start = sliceFixup(start, length);
			end = sliceFixup(end, length);

			ArrayList<Object> copy = new ArrayList<Object>();
			for (int i = start; i < end; i += stride) {
				copy.add(Array.get(target, i));
			}

			return copy;
		}

		if (target instanceof List<?>) {
			List<?> list = (List<?>) target;

			start = sliceFixup(start, list.size());
			end = sliceFixup(end, list.size());

			if (stride == 1) {
				return list.subList(start, end);
			}

			ArrayList<Object> copy = new ArrayList<Object>();
			for (int i = start; i < end; i += stride) {
				copy.add(list.get(i));
			}

			return copy;
		}

		ctx.warn("Can't slice this kind of object");
		return null;
	}

	private static Object safeInvoke(TemplateContext ctx, CachedMethodInfo method, Object target, Object... args) {
		try {
			Object output;

			final Method theMethod = method.getMethod(args.length);
			if (!theMethod.isAccessible()) {
				theMethod.setAccessible(true);
			}

			if (method.hasContext(args.length)) {
				Object[] argsWithContext = new Object[args.length + 1];
				argsWithContext[0] = ctx;
				System.arraycopy(args, 0, argsWithContext, 1, args.length);
				output = theMethod.invoke(target, argsWithContext);
			} else {
				output = theMethod.invoke(target, args);
			}

			return ctx.processObject(output);
		} catch (IllegalArgumentException e) {
			ctx.warn("Error invoking method", e);
		} catch (IllegalAccessException e) {
			ctx.warn("Error invoking method", e);
		} catch (InvocationTargetException e) {
			// Warn based on the cause, not the InvocationTargetException
			ctx.warn("Error invoking method", e.getCause());
		}

		return null;
	}

	private static int indexFixup(int i, int length) {
		if (i < 0) {
			return length + i;
		}

		return i;
	}

	public static Object dot(TemplateContext ctx, Object target, Object child) {
		if (target == null) {
			ctx.warn("Tried to get " + child + " property of null");
			return null;
		}

		return dotInternal(ctx, target, child);
	}

	public static Object qdot(TemplateContext ctx, Object target, Object child) {
		if (target == null) {
			return null;
		}

		return dotInternal(ctx, target, child);
	}

	private static Object dotInternal(TemplateContext ctx, Object target, Object child) {
		try {
			if (Types.isString(ctx, target)) {
				final String string = Types.toString(ctx, target);

				if (Types.isString(ctx, child)) {
					if (Types.toString(ctx, child).equals("length")) {
						return string.length();
					}

					ctx.warn("No method on string named " + child);
					return null;
				}

				int index = indexFixup(Types.toInteger(ctx, child), string.length());
				if (index < 0 || index >= string.length()) {
					return "";
				}

				return Character.toString(string.charAt(index));
			}

			if (Types.isArray(ctx, target)) {
				int length = Array.getLength(target);
				int index = indexFixup(Types.toInteger(ctx, child), length);
				if (index < 0 || index >= length) {
					return null;
				}

				return ctx.processObject(Array.get(target, index));
			}

			if (target instanceof List<?>) {
				final List<?> list = (List<?>) target;
				int index = indexFixup(Types.toInteger(ctx, child), list.size());
				if (index < 0 || index >= list.size()) {
					return null;
				}

				return ctx.processObject(list.get(index));
			}

			if (target instanceof Map<?, ?>) {
				final Map<?, ?> rawMap = (Map<?, ?>) target;

				// Check the raw object first
				if (rawMap.containsKey(child)) {
					return ctx.processObject(rawMap.get(child));
				}

				// If that doesn't exist, try the raw string key
				String childKey = Types.toString(ctx, child);
				if (rawMap.containsKey(childKey)) {
					return ctx.processObject(rawMap.get(childKey));
				}

				return null;
			}

			String childKey = Types.toString(ctx, child);

			if (childKey != null && !StringUtils.isEmpty(childKey)) {
				final Class<? extends Object> clazz = target.getClass();

				final String methodName = "get" + Character.toUpperCase(childKey.charAt(0)) + childKey.substring(1);
				CachedMethodInfo method = ReflectionCache.INSTANCE.getMethod(clazz, methodName);
				if (method != null) {
					return safeInvoke(ctx, method, target);
				}

				Field field = ReflectionCache.INSTANCE.getField(clazz, childKey);
				if (field != null) {
					boolean isAccessible = field.isAccessible();
					if (!isAccessible) {
						field.setAccessible(true);
					}
					return ctx.processObject(field.get(target));
				}

			}

			if (ReflectionCache.INSTANCE.getMethod(target.getClass(), childKey) != null) {
				ctx.warn("Method returned but not invoked");
				return null;
			}

			ctx.warn("Object doesn't have attribute " + childKey);
		} catch (IllegalArgumentException e) {
			ctx.warn("Illegal arguments", e);
		} catch (IllegalAccessException e) {
			ctx.warn("Illegal access", e);
		} catch (SecurityException e) {
			ctx.warn("Security exception", e);
		}

		return null;
	}

	public static Object pipe(TemplateContext ctx, Object target, Object filterName, Object[] params) {
		Object filter = ctx.lookup(Types.toString(ctx, filterName));
		if (!(filter instanceof CachedMethodInfo)) {
			ctx.warn("Invalid filter: " + filter);
			return null;
		}

		CachedMethodInfo method = (CachedMethodInfo) filter;

		int paramCount = params.length + 1;
		if (!method.isValid(paramCount)) {
			ctx.warn("No overload for " + method.getName() + " has " + paramCount + " arguments");
			return null;
		}

		Object[] args = new Object[paramCount];
		final Class<?>[] paramTypes = method.getParameterTypes(paramCount);

		args[0] = Types.coerce(ctx, paramTypes[0], target);
		for (int i = 0; i < paramCount - 1; i++) {
			args[i + 1] = Types.coerce(ctx, paramTypes[i + 1], params[i]);
		}

		return safeInvoke(ctx, method, null, args);
	}

	public static Object invoke(TemplateContext ctx, Object target, Object methodName, Object[] params) {
		if (target == null) {
			ctx.warn("Cannot invoke on null target");
			return null;
		}

		CachedMethodInfo method = ReflectionCache.INSTANCE.getMethod(target.getClass(), Types.toString(ctx, methodName));

		if (method == null) {
			ctx.warn("Cannot invoke " + method + " on " + target);
			return null;
		}

		int paramCount = params.length;
		if (!method.isValid(paramCount)) {
			ctx.warn("No overload for " + method.getName() + " has " + paramCount + " arguments");
			return null;
		}

		Object[] args = new Object[paramCount];
		final Class<?>[] paramTypes = method.getParameterTypes(paramCount);

		for (int i = 0; i < paramCount; i++) {
			args[i] = Types.coerce(ctx, paramTypes[i], params[i]);
		}

		return safeInvoke(ctx, method, target, args);
	}

	public static Object newRange(TemplateContext ctx, Object from, Object to) {
		// TODO: String ranges

		TypeCode type = Types.getTypeCode(ctx, from);
		switch (type) {
		case LONG:
			return new LongRange(Types.toLong(ctx, from), Types.toLong(ctx, to));
		case DOUBLE:
			return new DoubleRange(Types.toDouble(ctx, from), Types.toDouble(ctx, to));
		default:
			ctx.warn("Unsupported type for range: " + type);
			return null;
		}

	}

	public static Object newRangeBy(TemplateContext ctx, Object from, Object to, Object by) {
		TypeCode type = Types.getTypeCode(ctx, from);
		switch (type) {
		case LONG:
			return new LongRange(Types.toLong(ctx, from), Types.toLong(ctx, to), Types.toLong(ctx, by));
		case DOUBLE:
			return new DoubleRange(Types.toDouble(ctx, from), Types.toDouble(ctx, to), Types.toDouble(ctx, by));
		default:
			ctx.warn("Unsupported type for range: " + type);
			return null;
		}
	}

	public static boolean in(TemplateContext ctx, Object o, Object in) {
		if (in == null) {
			return false;
		}

		if (in instanceof LongRange) {
			return ((LongRange) in).in(Types.toLong(ctx, o));
		}

		if (in instanceof DoubleRange) {
			return ((DoubleRange) in).in(Types.toDouble(ctx, o));
		}

		if (in instanceof Map<?, ?>) {
			Map<?, ?> map = (Map<?, ?>) in;
			return map.containsKey(o) || map.containsKey(Types.toString(ctx, o));
		}

		if (Types.isString(ctx, in)) {
			return Types.toString(ctx, in).contains(Types.toString(ctx, o));
		}

		if (in instanceof Iterable<?> || Types.isArray(ctx, in)) {
			Iterator<?> it = Types.toIterator(ctx, in);
			while (it.hasNext()) {
				Object item = it.next();
				if (CompareOps.eq(ctx, o, item)) {
					return true;
				}
			}

			return false;
		}

		return false;
	}
}
