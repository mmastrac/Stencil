package net.stencilproject.template;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.stencilproject.template.types.Raw;
import net.stencilproject.template.util.ArrayUtils;

import com.google.common.collect.Lists;

/**
 * The environment that runs a template {@link Program} in concert with a
 * {@link TemplateContext} and a model.
 */
class Environment {
	private static final int STACK_SIZE_INCREASE = 50;
	private static final int STACK_INITIAL_SIZE = 20;

	private int pc;
	private Object[] locals;
	private Object[] stack;
	private int stackPointer;
	private final Program program;
	private final Appendable appendable;
	private final TemplateContext ctx;
	private final Map<String, ?> model;
	private List<Object[]> orderByBuilder;
	private int instructionCount;
	private final boolean traceExecution;
	private long start, end;

	public Environment(Program program, Appendable appendable, TemplateContext context, Map<String, ?> model) {
		this.program = program;
		this.appendable = appendable;
		this.ctx = context;
		this.model = model;

		this.traceExecution = context.getOptions().getTraceExecution();
	}

	public void run() {
		start();

		while (step()) {
		}

		complete();
	}

	public void start() {
		ctx.setSourceInfo(program);

		if (ctx.getOptions().getDumpTemplate()) {
			System.out.println(program);
		}

		pc = 0;
		instructionCount = 0;
		locals = new Object[program.localSize];
		stack = new Object[STACK_INITIAL_SIZE];
		stackPointer = 0;
		start = System.currentTimeMillis();
	}

	public void complete() {
		ctx.setSourceInfo(null);

		end = System.currentTimeMillis();
		locals = null;
		stack = null;
	}

	public boolean step() {
		if (pc >= program.instructions.length) {
			return false;
		}

		Instruction ins = program.instructions[pc];
		Object literal = ins.literal;

		if (traceExecution) {
			System.out.print(pc);
			System.out.print(" ");
			System.out.print(ins.toString(pc));
			System.out.print(" (");
			System.out.print(ArrayUtils.toString(ArrayUtils.copyOf(stack, stackPointer)));
			System.out.print(")");
		}

		instructionCount++;
		if (instructionCount > ctx.getOptions().getMaxInstructions()) {
			ctx.warn("Exceeded maximum instruction count");
			return false;
		}

		try {
			Object a, b, c, d;

			ctx.setSourceInfo(ins);

			switch (ins.opcode) {
			case NOP:
				break;
			case DROP:
				for (int i = 0; i < (Integer) literal; i++) {
					pop();
				}
				break;
			case DUP:
				push(peek());
				break;

			case BINARY_MINUS:
				b = pop();
				a = pop();
				push(Ops.binaryMinus(ctx, a, b));
				break;
			case BINARY_PLUS:
				b = pop();
				a = pop();
				push(Ops.binaryPlus(ctx, a, b));
				break;
			case UNARY_MINUS:
				push(Ops.unaryMinus(ctx, pop()));
				break;
			case UNARY_PLUS:
				push(Ops.unaryPlus(ctx, pop()));
				break;
			case MUL:
				b = pop();
				a = pop();
				push(Ops.mul(ctx, a, b));
				break;
			case DIV:
				b = pop();
				a = pop();
				push(Ops.div(ctx, a, b));
				break;

			case LT:
				b = pop();
				a = pop();
				push(CompareOps.lt(ctx, a, b));
				break;
			case LTE:
				b = pop();
				a = pop();
				push(CompareOps.lte(ctx, a, b));
				break;
			case GT:
				b = pop();
				a = pop();
				push(CompareOps.gt(ctx, a, b));
				break;
			case GTE:
				b = pop();
				a = pop();
				push(CompareOps.gte(ctx, a, b));
				break;
			case EQEQ:
				b = pop();
				a = pop();
				push(CompareOps.eq(ctx, a, b));
				break;
			case NE:
				b = pop();
				a = pop();
				push(CompareOps.neq(ctx, a, b));
				break;

			case IAND:
				b = pop();
				a = pop();
				push(Ops.iand(ctx, a, b));
				break;
			case IOR:
				b = pop();
				a = pop();
				push(Ops.ior(ctx, a, b));
				break;
			case AND:
				b = pop();
				a = pop();
				push(Ops.and(ctx, a, b));
				break;
			case OR:
				b = pop();
				a = pop();
				push(Ops.or(ctx, a, b));
				break;
			case XOR:
				b = pop();
				a = pop();
				push(Ops.xor(ctx, a, b));
				break;

			case LSHIFT:
				b = pop();
				a = pop();
				push(Ops.lshift(ctx, a, b));
				break;
			case RSHIFT:
				b = pop();
				a = pop();
				push(Ops.rshift(ctx, a, b));
				break;

			case BITWISE_NOT:
				push(Ops.bitwiseNot(ctx, pop()));
				break;
			case BOOLEAN_NOT:
				push(Ops.booleanNot(ctx, pop()));
				break;

			case NULL:
				push(null);
				break;
			case TRUE:
				push(true);
				break;
			case FALSE:
				push(false);
				break;

			case BRANCH_FALSE:
				if (!Types.toBoolean(ctx, pop())) {
					pc += (Integer) literal;
					return true;
				}
				break;
			case DUP_BRANCH_FALSE:
				if (!Types.toBoolean(ctx, peek())) {
					pc += (Integer) literal;
					return true;
				}
				break;
			case DUP_BRANCH_TRUE:
				if (Types.toBoolean(ctx, peek())) {
					pc += (Integer) literal;
					return true;
				}
				break;
			case GOTO:
				pc += (Integer) literal;
				return true;

			case LITERAL_FLOAT:
			case LITERAL_INT:
			case LITERAL_STRING:
				push(literal);
				break;

			case LITERAL_LIST:
				int size = (Integer) pop();
				List<Object> list = Lists.newArrayList(pop(size));
				push(list);
				break;

			case ITERATOR:
				push(Types.toIterator(ctx, peek()));
				break;
			case ITERATOR_NEXT_OR_BRANCH: {
				Iterator<?> it = (Iterator<?>) peek();
				boolean hasNext = it.hasNext();
				if (!hasNext) {
					pc += (Integer) literal;
					return true;
				}
				Object next;
				try {
					next = it.next();
				} catch (Exception e) {
					ctx.warn("Exception in iterator", e);
					pc += (Integer) literal;
					return true;
				}
				push(next);
				break;
			}
			case ITERATOR_LIMIT: {
				long limit = Types.toLong(ctx, pop());
				Iterator<?> it = (Iterator<?>) pop();
				push(IteratorUtils.limitIterator(it, limit));
				break;
			}

			case ITERATOR_START_ORDER_BY:
				orderByBuilder = Lists.newArrayList();
				break;
			case ITERATOR_PROCESS_ORDER_BY:
				orderByBuilder.add(pop(2));
				break;
			case ITERATOR_END_ORDER_BY:
				pop();

				Collections.sort(orderByBuilder, new Comparator<Object[]>() {
					@Override
					public int compare(Object[] o1, Object[] o2) {
						return CompareOps.compare(ctx, o1[1], o2[1]);
					}
				});

				List<Object> finalList = Lists.newArrayList();
				for (Object[] entry : orderByBuilder) {
					finalList.add(entry[0]);
				}
				orderByBuilder = null;
				push(finalList.iterator());
				break;

			case DOT:
				b = pop();
				a = pop();
				push(Ops.dot(ctx, a, b));
				break;
			case QDOT:
				b = pop();
				a = pop();
				push(Ops.qdot(ctx, a, b));
				break;
			case SLICE:
				d = pop();
				c = pop();
				b = pop();
				a = pop();
				push(Ops.slice(ctx, a, b, c, d));
				break;

			case SCOPE_LOOKUP:
				if (model != null && model.containsKey(literal)) {
					push(ctx.processObject(model.get(literal)));
				} else {
					push(ctx.lookup((String) literal));
				}
				break;

			case LOCAL_LOAD:
				push(locals[(Integer) literal]);
				break;
			case LOCAL_STORE:
				locals[(Integer) literal] = pop();
				break;

			case PRINT_LITERAL:
				writeOutput(EscapingMode.TEXT, Types.toString(ctx, literal));
				break;

			case PRINT:
				writeOutput(program.getEscapingMode(), pop());
				break;

			case PIPE:
				pipe();
				break;

			case INVOKE:
				invoke();
				break;

			case NEW_RANGE:
				b = pop();
				a = pop();
				push(Ops.newRange(ctx, a, b));
				break;

			case NEW_RANGE_BY:
				c = pop();
				b = pop();
				a = pop();
				push(Ops.newRangeBy(ctx, a, b, c));
				break;

			case IN:
				b = pop();
				a = pop();
				push(Ops.in(ctx, a, b));
				break;

			default:
				throw new RuntimeException("Invalid instruction: " + ins.opcode);
			}
		} finally {
			ctx.setSourceInfo(program);

			if (traceExecution) {
				System.out.print(" -> (");
				System.out.print(ArrayUtils.toString(ArrayUtils.copyOf(stack, stackPointer)));
				System.out.println(")");
			}
		}
		pc++;

		return true;
	}

	private void invoke() {
		// TODO: The order here is kind of screwy
		int argCount = (Integer) pop();
		Object[] args = pop(argCount);
		Object methodName = pop();
		Object target = pop();

		push(Ops.invoke(ctx, target, methodName, args));
	}

	private void pipe() {
		// TODO: The order here is kind of screwy
		int argCount = (Integer) pop();
		Object[] args = pop(argCount);
		Object filter = pop();
		Object target = pop();

		push(Ops.pipe(ctx, target, filter, args));
	}

	private Object peek() {
		return stack[stackPointer - 1];
	}

	private Object pop() {
		return stack[--stackPointer];
	}

	private Object[] pop(int count) {
		stackPointer -= count;
		return ArrayUtils.copyOfRange(stack, stackPointer, stackPointer + count);
	}

	private void push(Object o) {
		if (stackPointer >= stack.length) {
			stack = ArrayUtils.copyOf(stack, stack.length + STACK_SIZE_INCREASE);
		}

		stack[stackPointer++] = o;
	}

	private void writeOutput(EscapingMode mode, Object output) {
		try {
			if (output instanceof Raw) {
				appendable.append(output.toString());
				return;
			}

			String string = Types.toString(ctx, output);
			switch (mode) {
			case TEXT:
				appendable.append(string);
				break;
			case XML:
				for (int i = 0; i < string.length(); i++) {
					char c = string.charAt(i);
					XmlEscaper.escape(appendable, c);
				}
				break;
			}
		} catch (IOException e) {
			ctx.warn("Failed to print", e);
		}
	}

	int getRuntimeInMillis() {
		return (int) (end - start);
	}

	int getInstructionCount() {
		return instructionCount;
	}
}
