package net.stencilproject.template;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;

public class TemplateRootScope extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	static class ConverterRecord {
		Converter<?, ?> converter;
		Class<?> clazz1;
		Class<?> clazz2;
	}

	Multimap<Class<?>, ConverterRecord> converters = ArrayListMultimap.create();
	Map<Class<?>, ConverterRecord> autoConverters = Maps.newHashMap();

	public <FROM, TO> void addConverter(Class<FROM> clazz1, Class<TO> clazz2, Converter<FROM, TO> converter) {
		ConverterRecord record = new ConverterRecord();
		record.converter = converter;
		record.clazz1 = clazz1;
		record.clazz2 = clazz2;

		converters.put(clazz1, record);
	}

	public <FROM, TO> void addAutoConverter(Class<FROM> clazz1, Class<TO> clazz2, Converter<FROM, TO> converter) {
		ConverterRecord record = new ConverterRecord();
		record.converter = converter;
		record.clazz1 = clazz1;
		record.clazz2 = clazz2;

		autoConverters.put(clazz1, record);
	}

	@SuppressWarnings("unchecked")
	<FROM, TO> Converter<Object, Object> getConverter(Class<FROM> clazz1, Class<TO> clazz2) {
		for (ConverterRecord record : converters.get(clazz1)) {
			if (record.clazz2 == clazz2) {
				return (Converter<Object, Object>) record.converter;
			}
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	Converter<Object, Object> getAutoConverter(Class<?> clazz1) {
		final ConverterRecord record = autoConverters.get(clazz1);
		return record == null ? null : (Converter<Object, Object>) record.converter;
	}

	public void addFilters(Class<?> filterClass) {
		for (CachedMethodInfo methodInfo : ReflectionCache.INSTANCE.getMethods(filterClass).values()) {
			if (methodInfo.isStatic()) {
				String name = methodInfo.getName();
				if (name.startsWith("_")) {
					name = name.substring(1);
				}
				put(name, methodInfo);
			}
		}
	}

	public void addEnum(Class<? extends Enum<?>> enumClass) {
		HashMap<String, Enum<?>> enumValues = new HashMap<String, Enum<?>>();
		for (Enum<?> value : enumClass.getEnumConstants()) {
			enumValues.put(value.name(), value);
		}

		put(enumClass.getSimpleName(), enumValues);
	}

	public void addStaticEnum(Class<?> clazz) {
		HashMap<String, Object> staticEnum = Maps.newHashMap();
		for (Field field : clazz.getFields()) {
			if ((field.getModifiers() | Modifier.STATIC) != 0) {
				try {
					staticEnum.put(field.getName(), field.get(null));
				} catch (IllegalArgumentException e) {
					// ??
				} catch (IllegalAccessException e) {
					// ??
				}
			}
		}

		put(clazz.getSimpleName(), staticEnum);
	}
}
