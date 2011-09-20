package net.stencilproject.template;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;

/**
 * Wraps one of many input sources for template data.
 */
abstract class TemplateFile {
	private final URL url;

	private TemplateFile(URL url) {
		this.url = url;
	}

	public URL getUrl() {
		return url;
	}

	public abstract String read() throws IOException;

	/**
	 * Returns a TemplateFile from a File.
	 */
	public static TemplateFile fromFile(final File file) {
		if (file == null) {
			throw new NullPointerException("file is null");
		}

		try {
			return new TemplateFile(file.toURI().toURL()) {
				@Override
				public String read() throws IOException {
					InputStream stream = new FileInputStream(file);
					try {
						return CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
					} finally {
						stream.close();
					}
				}
			};
		} catch (MalformedURLException e) {
			// Shouldn't be possble
			throw new RuntimeException(e);
		}
	}

	/**
	 * Returns a TemplateFile from a string.
	 */
	public static TemplateFile fromString(final String contents) {
		if (contents == null) {
			throw new NullPointerException("contents is null");
		}

		return new TemplateFile(null) {
			@Override
			public String read() throws IOException {
				return contents;
			}
		};
	}

	/**
	 * Returns a TemplateFile from a URL.
	 */
	public static TemplateFile fromUrl(final URL url) {
		if (url == null) {
			throw new NullPointerException("url is null");
		}

		return new TemplateFile(url) {
			@Override
			public String read() throws IOException {
				InputStream stream = url.openStream();
				try {
					return CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
				} finally {
					stream.close();
				}
			}
		};
	}

	/**
	 * Returns a template file from a class resource.
	 * 
	 * @return null if the resource could not be found, otherwise the
	 *         TemplateFile
	 */
	public static TemplateFile fromResource(Class<?> clazz, String resourceName) {
		if (clazz == null) {
			throw new NullPointerException("clazz is null");
		}
		if (resourceName == null) {
			throw new NullPointerException("resourceName");
		}

		URL resource = clazz.getResource(resourceName);
		if (resource == null) {
			return null;
		}

		return TemplateFile.fromUrl(resource);
	}
}
