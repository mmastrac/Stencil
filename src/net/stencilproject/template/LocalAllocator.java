package net.stencilproject.template;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Keeps track of local variable naming scopes.
 */
class LocalAllocator {
	Map<String, Stack<Integer>> localRegisters = Maps.newHashMap();
	Stack<List<String>> locals = new Stack<List<String>>();
	int index;

	public LocalAllocator() {
		startBlock();
	}

	public void restartBlock() {
		assert locals.size() > 1 : "Can't restart the default block";

		endBlock();
		startBlock();
	}

	public void startBlock() {
		ArrayList<String> list = Lists.newArrayList();
		locals.add(list);
	}

	public void endBlock() {
		assert locals.size() > 1 : "Can't end the default block";

		for (String name : locals.pop()) {
			localRegisters.get(name).pop();
		}
	}

	public int allocate(String name) {
		if (!localRegisters.containsKey(name)) {
			localRegisters.put(name, new Stack<Integer>());
		}

		int register = index++;
		localRegisters.get(name).push(register);
		locals.peek().add(name);

		return register;
	}

	public int lookup(String name) {
		Stack<Integer> stack = localRegisters.get(name);
		if (stack == null || stack.size() == 0) {
			return -1;
		}

		return stack.peek();
	}

	public int allocatedLocals() {
		return index;
	}
}
