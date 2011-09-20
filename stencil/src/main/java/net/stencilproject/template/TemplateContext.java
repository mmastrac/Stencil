package net.stencilproject.template;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.stencilproject.template.filters.BuiltInFilters;

/**
 * Global, reusable template context.
 * 
 * Thread-safe.
 */
public class TemplateContext {
	private static final TemplateRootScope builtInRootScope;

	private static final Logger logger = Logger.getLogger("net.stencilproject.template");

	static {
		builtInRootScope = new TemplateRootScope();
		builtInRootScope.addFilters(BuiltInFilters.class);
	}

	private final TemplateRootScope rootScope;
	private final TemplateOptions options;
	private SourceInfo sourceInfo;
	private int warningCount;

	public TemplateContext(TemplateRootScope rootScope, TemplateOptions options) {
		this.rootScope = rootScope;
		this.options = options;
	}

	private String getSourceInfo() {
		return stringifySourceInfo(sourceInfo);
	}

	private static String stringifySourceInfo(SourceInfo sourceInfo) {
		if (sourceInfo == null) {
			return "";
		}

		TemplateFile source = sourceInfo.getSource();
		int line = sourceInfo.getLine();
		int column = sourceInfo.getColumn();

		String info;

		if (source != null && source.getUrl() != null) {
			if (source.getUrl().getProtocol().equals("file")) {
				info = source.getUrl().getFile();
			} else {
				info = source.getUrl().toString();
			}
		} else {
			info = "<unknown>";
		}

		if (line != -1) {
			info += ":" + line;
		}
		if (column != -1) {
			info += ":" + column;
		}

		return info + "\n" + (sourceInfo.getParent() == null ? "" : "included from " + stringifySourceInfo(sourceInfo.getParent()));
	}

	void setSourceInfo(SourceInfo sourceInfo) {
		this.sourceInfo = sourceInfo;
	}

	public void warn(String string) {
		logger.severe(getSourceInfo() + string);
		warningCount++;
	}

	public void warn(String string, Throwable throwable) {
		logger.log(Level.SEVERE, getSourceInfo() + string, throwable);
		warningCount++;
	}

	public Converter<Object, Object> getConverter(Class<?> clazz1, Class<?> clazz2) {
		return rootScope == null ? null : rootScope.getConverter(clazz1, clazz2);
	}

	public TemplateOptions getOptions() {
		return options;
	}

	public Object processObject(Object o) {
		if (rootScope == null) {
			return o;
		}

		if (o == null) {
			return null;
		}

		final Converter<Object, Object> converter = rootScope.getAutoConverter(o.getClass());
		try {
			return converter == null ? o : converter.convert(o);
		} catch (ConverterException e) {
			throw new RuntimeException(e);
		}
	}

	public Object lookup(final String name) {
		if (builtInRootScope.containsKey(name)) {
			return builtInRootScope.get(name);
		}

		if (rootScope != null) {
			if (rootScope.containsKey(name)) {
				return rootScope.get(name);
			}
		}

		warn("Missing scope variable: " + name);
		return null;
	}

	int getWarningCount() {
		return warningCount;
	}
}
