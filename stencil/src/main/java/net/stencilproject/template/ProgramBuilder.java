package net.stencilproject.template;

import java.util.ArrayList;

import com.google.common.collect.Lists;

class ProgramBuilder {
	ArrayList<Instruction> instructions = Lists.newArrayList();
	LocalAllocator localAllocator = new LocalAllocator();
	EscapingMode escapingMode = EscapingMode.TEXT;

	private TemplateFileSourceInfo mainSource;
	private TemplateFileSourceInfo source;
	private int line;
	private int column;

	class Label {
		int index = -1;

		boolean isAffixed() {
			return index != -1;
		}
	}

	public ProgramBuilder() {
		this(null);
	}

	public ProgramBuilder(TemplateFileSourceInfo mainSource) {
		this.mainSource = mainSource;
	}

	public void setEscapingMode(EscapingMode escapingMode) {
		this.escapingMode = escapingMode;
	}

	public LocalAllocator getLocalAllocator() {
		return localAllocator;
	}

	public Label createLabelHere() {
		Label label = new Label();
		label.index = size();
		return label;
	}

	public Label createLabel() {
		Label label = new Label();
		return label;
	}

	public void affixLabel(Label label) {
		label.index = size();
	}

	public void setSourceInformation(TemplateFileSourceInfo source, int line, int column) {
		this.source = source;
		this.line = line;
		this.column = column;
	}

	public void set(int i, Opcode opcode) {
		instructions.set(i, new Instruction(source, line, column, opcode));
	}

	public void append(Opcode opcode) {
		instructions.add(new Instruction(source, line, column, opcode));
	}

	public void append(Opcode opcode, Object literal) {
		instructions.add(new Instruction(source, line, column, opcode, literal));
	}

	public Program toProgram() {
		Instruction[] instructions = this.instructions.toArray(new Instruction[this.instructions.size()]);
		for (int i = 0; i < instructions.length; i++) {
			Instruction instruction = instructions[i];
			if (instruction.literal instanceof Label) {
				Label label = (Label) instruction.literal;
				if (label.index == -1) {
					throw new IllegalStateException("Unaffixed label at index " + i);
				}

				instruction.literal = label.index - i;
			}
		}

		return new Program(mainSource, escapingMode, instructions, localAllocator.allocatedLocals());
	}

	public void addAll(ProgramBuilder program) {
		instructions.addAll(program.instructions);
	}

	public void addAll(Program program) {
		for (Instruction instruction : program.instructions) {
			instructions.add(instruction);
		}
	}

	public int size() {
		return instructions.size();
	}
}
