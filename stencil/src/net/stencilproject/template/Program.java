package net.stencilproject.template;

class Program implements SourceInfo {
	Instruction2[] instructions;
	int localSize;
	private final EscapingMode escapingMode;
	private final TemplateFileSourceInfo source;

	public Program(TemplateFileSourceInfo source, EscapingMode escapingMode, Instruction2[] instructions, int localSize) {
		this.source = source;
		this.escapingMode = escapingMode;
		this.instructions = instructions;
		this.localSize = localSize;
	}

	public int size() {
		return instructions.length;
	}

	public EscapingMode getEscapingMode() {
		return escapingMode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int index = 0;
		for (Instruction2 instruction : instructions) {
			final int addr = index++;
			builder.append(addr + ": " + instruction.toString(addr));
			builder.append('\n');
		}

		return builder.toString();
	}

	@Override
	public int getColumn() {
		return SourceInfo.NO_COLUMN;
	}

	@Override
	public int getLine() {
		return SourceInfo.NO_LINE;
	}

	@Override
	public TemplateFile getSource() {
		return source.getTemplateFile();
	}

	@Override
	public SourceInfo getParent() {
		return source.getParent();
	}

}
