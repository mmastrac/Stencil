package net.stencilproject.template;

/**
 * Run-time statistics.
 */
public class RunStatistics {
	private final int runTimeMillis;
	private final int warningCount;
	private final int instructionCount;
	private final ParseStatistics parseStatistics;

	RunStatistics(ParseStatistics parseStatistics, int runTimeMillis, int instructionCount, int warningCount) {
		this.parseStatistics = parseStatistics;
		this.runTimeMillis = runTimeMillis;
		this.instructionCount = instructionCount;
		this.warningCount = warningCount;
	}

	public ParseStatistics getParseStatistics() {
		return parseStatistics;
	}

	public int getRunTimeMillis() {
		return runTimeMillis;
	}

	public int getWarningCount() {
		return warningCount;
	}

	public int getInstructionCount() {
		return instructionCount;
	}
}
