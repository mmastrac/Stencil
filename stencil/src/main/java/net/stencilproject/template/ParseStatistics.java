package net.stencilproject.template;

import java.util.Date;

/**
 * Contains statistics about the parsing process.
 */
public class ParseStatistics {
	private final int parseTimeMillis;

	private final Date parsedAt;

	public ParseStatistics(int parseTimeMillis, Date parsedAt) {
		this.parseTimeMillis = parseTimeMillis;
		this.parsedAt = parsedAt;
	}

	public int getParseTimeMillis() {
		return parseTimeMillis;
	}

	public Date getParsedAt() {
		return parsedAt;
	}
}
