package net.stencilproject.gen;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateFactory;
import net.stencilproject.template.TemplateMode;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateParserException;

import org.xml.sax.SAXException;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.CharStreams;

/**
 * Generates the matrix of compare operations from compare.html.
 */
public class GenerateCompareOps {
	public static void main(String[] args) throws IOException, SAXException, TemplateParserException {
		TemplateFactory factory = new TemplateFactory(new TemplateOptions());
		Template template = factory.parse(TemplateMode.TEXT, null, GenerateCompareOps.class, "CompareOps.java.template");

		Map<String, Object> model = Maps.newHashMap();
		model.put("compareOps", readOps(GenerateCompareOps.class.getResourceAsStream("compare.csv")));

		System.out.println(template.process(model));
	}

	public static List<OpDefinition> readOps(InputStream in) throws IOException {
		List<OpDefinition> ops = Lists.newArrayList();
		boolean header = true;
		OpDefinition currentOp = null;
		for (String line : CharStreams.readLines(new InputStreamReader(in, Charsets.UTF_8))) {
			if (line.isEmpty()) {
				header = true;
				continue;
			}

			String[] columns = line.split(",");

			if (header || currentOp == null) {
				currentOp = new OpDefinition(columns[0], columns[1], columns[2]);
				ops.add(currentOp);
				header = false;
				continue;
			}

			List<String> columnList = Arrays.asList(columns).subList(1, columns.length);

			if (currentOp.types.size() == 0) {
				currentOp.types.addAll(columnList);
			} else {
				currentOp.table.add(columnList);
			}
		}

		for (OpDefinition op : ops) {
			// Mirror the entries across the diagonal, but only where they are
			// missing
			List<List<String>> table = op.table;
			for (int i = 0; i < table.size(); i++) {
				List<String> row = table.get(i);
				for (int j = 0; j < i; j++) {
					if (row.get(j).isEmpty()) {
						row.set(j, table.get(j).get(i));
					}
				}
			}

			// Optimize comparisons by X'ing out any constant sequence of items
			// from the right-most edge
			for (List<String> row : op.table) {
				String lastItem = row.get(row.size() - 1);
				for (int i = row.size() - 2; i >= 0; i--) {
					if (row.get(i).equals(lastItem)) {
						row.set(i, "X");
					} else {
						break;
					}
				}
			}

			// Post-process operations
			for (List<String> row : op.table) {
				for (int i = 0; i < row.size(); i++) {
					String value = row.get(i);
					row.set(i, mapValue(value));
				}
			}
		}

		Collections.sort(ops, new Comparator<OpDefinition>() {
			@Override
			public int compare(OpDefinition o1, OpDefinition o2) {
				return o1.op.compareTo(o2.op);
			}
		});

		return ops;
	}

	private static String mapValue(String value) {
		if (value.equals("X")) {
			return value;
		}

		if (value.equals("FALSE")) {
			return "return false;";
		}

		if (value.equals("TRUE")) {
			return "return true;";
		}

		try {
			Integer.parseInt(value);
			return "return " + value + ";";
		} catch (NumberFormatException e) {
			// ignore
		}

		if (value.equals("EQUALS_EQ")) {
			return "return o1 == o2;";
		}

		if (value.equals("EQUALS_NEQ")) {
			return "return o1 != o2;";
		}

		if (value.startsWith("ENUM_")) {
			if (value.endsWith("COMPARE")) {
				return "{ return 0; }";
			} else {
				return "{ return true; }";
			}
		}

		if (value.startsWith("STRING_")) {
			return "{" + "String v1 = Types.toString(ctx, o1); String v2 = Types.toString(ctx, o2);" + mapPostfix(value) + "}";
		}

		if (value.startsWith("INTEGRAL_")) {
			return "{" + "long v1 = Types.toLong(ctx, o1); long v2 = Types.toLong(ctx, o2);" + mapPostfix(value) + "}";
		}

		if (value.startsWith("DOUBLE_")) {
			return "{" + "double v1 = Types.toDouble(ctx, o1); double v2 = Types.toDouble(ctx, o2);" + mapPostfix(value) + "}";
		}

		if (value.startsWith("BOOLEAN_")) {
			return "{" + "boolean v1 = Types.toBoolean(ctx, o1); boolean v2 = Types.toBoolean(ctx, o2);" + mapPostfix(value) + "}";
		}

		if (value.startsWith("COMPARABLE_")) {
			return "{" + "Comparable<?> v1 = (Comparable<?>)o1; Comparable<?> v2 = (Comparable<?>)o2;" + mapPostfix(value) + "}";
		}

		return "return XXX; // " + value;
	}

	private static String mapPostfix(String value) {
		if (value.equals("BOOLEAN_GT")) {
			return "return v1 && !v2;";
		}

		if (value.equals("BOOLEAN_LT")) {
			return "return !v1 && v2;";
		}

		if (value.equals("STRING_EQ")) {
			return "return v1.equals(v2);";
		}

		if (value.equals("STRING_NEQ")) {
			return "return !v1.equals(v2);";
		}

		int underscore = value.indexOf('_');
		int space = value.indexOf(' ');
		String check;
		if (space == -1) {
			check = "";
		} else {
			check = value.substring(space + 1);
			value = value.substring(0, space);
		}

		String postfix = value.substring(underscore + 1);
		if (postfix.equals("COMPARE")) {
			return "return internalCompare(ctx, v1, v2)" + check + ";";
		}

		Map<String, String> postfixes = Maps.newHashMap();
		postfixes.put("LT", "<");
		postfixes.put("GT", ">");
		postfixes.put("LTE", "<=");
		postfixes.put("GTE", ">=");
		postfixes.put("EQ", "==");
		postfixes.put("NEQ", "!=");

		if (postfixes.containsKey(postfix)) {
			return "return v1 " + postfixes.get(postfix) + " v2;";
		}

		throw new RuntimeException("Unexpected: " + value);
	}
}
