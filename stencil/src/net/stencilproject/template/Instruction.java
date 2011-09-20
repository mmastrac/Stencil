package net.stencilproject.template;

/**
 * Instruction in a template program.
 */
class Instruction implements SourceInfo {
	final Opcode opcode;
	Object literal;

	final TemplateFileSourceInfo source;
	final int line;
	final int column;

	public Instruction(TemplateFileSourceInfo templateFileSourceInfo, int line, int column, Opcode opcode) {
		this(templateFileSourceInfo, line, column, opcode, null);
	}

	public Instruction(TemplateFileSourceInfo source, int line, int column, Opcode opcode, Object literal) {
		this.source = source;
		this.line = line;
		this.column = column;
		this.opcode = opcode;
		this.literal = literal;
	}

	private String address(int address, int offset) {
		if (offset == Integer.MIN_VALUE) {
			return "NOP";
		}

		if (address == Integer.MIN_VALUE) {
			if (offset <= 0) {
				return "" + offset;
			}

			return "+" + offset;
		}

		return "" + (address + offset);
	}

	public String toString(int addr) {
		if (literal == null) {
			return opcode.toString();
		}

		if (literal instanceof String) {
			return opcode + " " + '"' + literal + '"';
		}

		if (opcode == Opcode.GOTO || opcode == Opcode.BRANCH_FALSE) {
			return opcode + " " + address((Integer) literal, addr);
		}

		return opcode + " " + literal;
	}

	public int getColumn() {
		return column;
	}

	public int getLine() {
		return line;
	};

	public TemplateFile getSource() {
		return source.getTemplateFile();
	};

	public SourceInfo getParent() {
		return source.getParent();
	};
}
