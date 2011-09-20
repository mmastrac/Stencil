package net.stencilproject.template;

public class InstanceTestMethods {
	public String add_x(String str) {
		return str + "x";
	}

	public int sub_1(int i) {
		return i - 1;
	}

	public int add_together(int i1, int i2) {
		return i1 + i2;
	}

	public InstanceTestMethods self() {
		return this;
	}
}
