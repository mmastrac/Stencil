package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import net.stencilproject.template.Environment;
import net.stencilproject.template.Opcode;
import net.stencilproject.template.Program;
import net.stencilproject.template.ProgramBuilder;
import net.stencilproject.template.TemplateContext;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateRootScope;
import net.stencilproject.template.ProgramBuilder.Label;

import org.junit.Test;


public class TestProgram {
	@Test
	public void testNullProgram() {
		ProgramBuilder p = new ProgramBuilder();
		run("", p);
	}

	@Test
	public void testSimpleProgram() {
		ProgramBuilder p = new ProgramBuilder();
		p.append(Opcode.LITERAL_INT, 1);
		p.append(Opcode.LITERAL_INT, 2);
		p.append(Opcode.BINARY_PLUS);
		p.append(Opcode.PRINT);
		run("3", p);
	}

	@Test
	public void testIterator() {
		ProgramBuilder p = new ProgramBuilder();
		Label labelEnd = p.createLabel();

		p.append(Opcode.LITERAL_STRING, "abc");
		p.append(Opcode.ITERATOR);
		Label labelLoopStart = p.createLabelHere();
		p.append(Opcode.ITERATOR_NEXT_OR_BRANCH, labelEnd);
		p.append(Opcode.PRINT_LITERAL, "(");
		p.append(Opcode.PRINT);
		p.append(Opcode.PRINT_LITERAL, ")");
		p.append(Opcode.GOTO, labelLoopStart);
		p.affixLabel(labelEnd);

		run("(a)(b)(c)", p);
	}

	@Test
	public void testLocals() {
		ProgramBuilder p = new ProgramBuilder();
		int x = p.localAllocator.allocate("x");
		int y = p.localAllocator.allocate("y");
		p.append(Opcode.LITERAL_INT, 1);
		p.append(Opcode.LOCAL_STORE, x);
		p.append(Opcode.LITERAL_INT, 2);
		p.append(Opcode.LOCAL_STORE, y);
		p.append(Opcode.LOCAL_LOAD, x);
		p.append(Opcode.LOCAL_LOAD, y);
		p.append(Opcode.BINARY_PLUS);
		p.append(Opcode.PRINT);
		p.append(Opcode.LOCAL_LOAD, x);
		p.append(Opcode.LOCAL_LOAD, y);
		p.append(Opcode.BINARY_PLUS);
		p.append(Opcode.PRINT);
		run("33", p);
	}

	@Test
	public void testPerformance() {
		ProgramBuilder p = new ProgramBuilder();
		Label end = p.createLabel();
		p.append(Opcode.LITERAL_INT, 0);
		Label loop = p.createLabelHere();
		p.append(Opcode.DUP);
		p.append(Opcode.LITERAL_INT, 120000);
		p.append(Opcode.GT);
		p.append(Opcode.BRANCH_FALSE, end);
		p.append(Opcode.LITERAL_INT, 1);
		p.append(Opcode.BINARY_PLUS);
		p.append(Opcode.GOTO, loop);
		p.affixLabel(end);

		TemplateOptions options = new TemplateOptions();
		options.setMaxInstructions(Integer.MAX_VALUE);

		Program program = p.toProgram();
		Environment e = new Environment(program, System.err, new TemplateContext(null, options), null);
		e.run();
		long total = 0;
		final int RUNS = 1000;
		for (int i = 0; i < RUNS; i++) {
			long start = System.nanoTime();
			e.run();
			total += System.nanoTime() - start;
		}

		System.err.println(total / (RUNS * 1000000.0) + " ms per run (" + RUNS + " runs)");
	}

	private void run(String expected, ProgramBuilder p) {
		StringBuilder builder = new StringBuilder();
		TemplateContext context = new TemplateContext(new TemplateRootScope(), new TemplateOptions());
		Environment environment = new Environment(p.toProgram(), builder, context, null);

		environment.run();

		assertEquals(expected, builder.toString());
	}
}
