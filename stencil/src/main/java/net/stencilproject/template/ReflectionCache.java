package net.stencilproject.template;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MapMaker;

/**
 * A thread-safe reflection cache that weakly references the given classes.
 */
class ReflectionCache {
	/**
	 * Weakly reference the Class keys of the map so we don't prevent their garbage collection. Soft-reference the maps
	 * from string to member so they can be garbage-collected under memory pressure.
	 */
	private static final MapMaker CLASS_MEMBERS_MAP = new MapMaker().weakKeys().softValues();

	/**
	 * Strongly reference the Method/Field values of the map so we keep the members alive. Java keeps track of the
	 * members individually for garbage collection, so we want to make sure they are either all alive, or all free to be
	 * garbage collected.
	 * 
	 * This MapMaker uses a concurrency level of 1, since the maps are immutable.
	 */
	private static final MapMaker MEMBER_NAME_MAP = new MapMaker().concurrencyLevel(1);

	private ConcurrentMap<Class<?>, Map<String, CachedMethodInfo>> methodCache = CLASS_MEMBERS_MAP.makeComputingMap(new Function<Class<?>, Map<String, CachedMethodInfo>>() {
		@Override
		public Map<String, CachedMethodInfo> apply(Class<?> clazz) {
			Map<String, CachedMethodInfo> methods = MEMBER_NAME_MAP.makeMap();
			ListMultimap<String, Method> methodMap = ArrayListMultimap.create();

			for (Method method : clazz.getMethods()) {
				boolean isStatic = (method.getModifiers() | Modifier.STATIC) != 0;
				methodMap.put(isStatic + method.getName(), method);
			}

			for (String key : methodMap.keys()) {
				CachedMethodInfo methodInfo = new CachedMethodInfo(clazz, methodMap.get(key));
				methods.put(methodInfo.getName(), methodInfo);
			}

			return methods;
		}
	});

	private ConcurrentMap<Class<?>, Map<String, Field>> fieldCache = CLASS_MEMBERS_MAP.makeComputingMap(new Function<Class<?>, Map<String, Field>>() {
		@Override
		public Map<String, Field> apply(Class<?> clazz) {
			Map<String, Field> fields = MEMBER_NAME_MAP.makeMap();
			for (Field field : clazz.getFields()) {
				fields.put(field.getName(), field);
			}

			return fields;
		}
	});

	public static ReflectionCache INSTANCE = new ReflectionCache();

	private ReflectionCache() {
	}

	/**
	 * Gets a public method with the given name, or null if the method does not exist.
	 */
	public CachedMethodInfo getMethod(Class<?> clazz, String method) {
		final Map<String, CachedMethodInfo> map = methodCache.get(clazz);
		return map == null ? null : map.get(method);
	}

	/**
	 * Gets all of the methods for a class.
	 */
	public Map<String, CachedMethodInfo> getMethods(Class<?> clazz) {
		return methodCache.get(clazz);
	}

	/**
	 * Gets a public field with the given name, or null if the field does not exist.
	 */
	public Field getField(Class<?> clazz, String field) {
		final Map<String, Field> map = fieldCache.get(clazz);
		return map == null ? null : map.get(field);
	}
}
