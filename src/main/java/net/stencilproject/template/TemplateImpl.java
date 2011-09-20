package net.stencilproject.template;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

class TemplateImpl implements Template {
	private final Program program;
	private final TemplateRootScope rootScope;
	private final TemplateOptions options;
	private ParseStatistics parseStatistics;

	public TemplateImpl(TemplateRootScope rootScope, TemplateOptions options, Program program, ParseStatistics parseStatistics) {
		this.rootScope = rootScope;
		this.options = options;
		this.program = program;
		this.parseStatistics = parseStatistics;
	}

	@Override
	public String toString() {
		return program.toString();
	}

	public String process(Map<String, ?> model) {
		StringWriter writer = new StringWriter();
		process(model, writer);

		return writer.toString();
	}

	public RunStatistics process(Map<String, ?> model, Writer writer) {
		TemplateContext ctx = new TemplateContext(rootScope, options);
		Environment environment = new Environment(program, writer, ctx, model);
		environment.run();

		return new RunStatistics(parseStatistics, environment.getRuntimeInMillis(), environment.getInstructionCount(),
				ctx.getWarningCount());
	}
}
