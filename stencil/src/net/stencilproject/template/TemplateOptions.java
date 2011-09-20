package net.stencilproject.template;

public class TemplateOptions implements Cloneable {
	private boolean developmentMode = false;
	private boolean dumpTemplate = false;
	private boolean traceExecution = false;
	private int maxInstructions = 200000;

	public TemplateOptions() {
	}

	public boolean getDumpTemplate() {
		return dumpTemplate;
	}

	public void setDumpTemplate(boolean dumpTemplate) {
		this.dumpTemplate = dumpTemplate;
	}

	public boolean getTraceExecution() {
		return traceExecution;
	}

	public void setTraceExecution(boolean traceExecution) {
		this.traceExecution = traceExecution;
	}

	public int getMaxInstructions() {
		return maxInstructions;
	}

	public void setDevelopmentMode(boolean developmentMode) {
		this.developmentMode = developmentMode;
	}

	public boolean isDevelopmentMode() {
		return developmentMode;
	}

	public void setMaxInstructions(int maxInstructions) {
		this.maxInstructions = maxInstructions;
	}

	@Override
	protected TemplateOptions clone() {
		try {
			return (TemplateOptions) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
