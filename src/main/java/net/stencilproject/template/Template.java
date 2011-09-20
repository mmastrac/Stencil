package net.stencilproject.template;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public interface Template {
	String process(Map<String, ?> model);

	RunStatistics process(Map<String, ?> model, Writer writer) throws IOException;
}