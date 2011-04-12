package net.stencilproject.template;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

import net.stencilproject.template.util.ArrayUtils;


class CachedMethodInfo {
	private final Class<? extends Object> clazz;
	private final Method[] methods;
	private final Class<?>[][] parameters;
	private final boolean[] hasContext;
	private boolean isStatic;
	private String name;

	public CachedMethodInfo(Class<?> clazz, List<Method> methods) {
		this.clazz = clazz;

		int maxParamLength = 0;
		boolean first = true;

		for (Method method : methods) {
			if (first) {
				isStatic = (method.getModifiers() & Modifier.STATIC) != 0;
				name = method.getName();
				first = false;
			}

			maxParamLength = Math.max(maxParamLength, method.getParameterTypes().length);
		}

		this.methods = new Method[maxParamLength + 1];
		this.parameters = new Class<?>[maxParamLength + 1][];
		this.hasContext = new boolean[maxParamLength + 1];

		for (Method method : methods) {
			Class<?>[] parameters = method.getParameterTypes();
			int paramLength = method.getParameterTypes().length;
			if (parameters.length > 0 && parameters[0] == TemplateContext.class) {
				parameters = ArrayUtils.copyOfRange(parameters, 1, paramLength);
				paramLength--;
				hasContext[paramLength] = true;
			}

			this.methods[paramLength] = method;
			this.parameters[paramLength] = parameters;
		}
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public boolean isValid(int paramCount) {
		return paramCount < methods.length && methods[paramCount] != null;
	}

	public Method getMethod(int paramCount) {
		return methods[paramCount];
	}

	public Class<?>[] getParameterTypes(int paramCount) {
		return parameters[paramCount];
	}

	public boolean hasContext(int paramCount) {
		return hasContext[paramCount];
	}

	public boolean isStatic() {
		return isStatic;
	}

	public String getName() {
		return name;
	}
}
