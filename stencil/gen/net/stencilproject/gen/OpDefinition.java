package net.stencilproject.gen;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * Definition for an op, including the types and type operation table.
 */
public class OpDefinition {
	public String op;
	public String type;
	public List<String> types;
	public List<List<String>> table;
	public final String invalid;

	public OpDefinition(String op, String type, String invalid) {
		this.op = op;
		this.type = type;
		this.invalid = invalid;
		this.types = Lists.newArrayList();
		this.table = Lists.newArrayList();
	}
}
