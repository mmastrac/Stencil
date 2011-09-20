package net.stencilproject.template;

import static org.junit.Assert.assertEquals;

import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateParserException;
import net.stencilproject.template.Templater;

import org.junit.Test;

/**
 * Test some specific HTML mode issues.
 */
public class TestHtmlOutput {
	/**
	 * br tags should be written using the compatible syntax: &lt;br /&gt;
	 */
	@Test
	public void testBrTags() throws TemplateParserException {
		Templater templater = new Templater();
		Template template = templater.parseXml(true, "Break tags rock<br/>Just kidding");
		System.out.println(template);

		assertEquals("Break tags rock<br />Just kidding", template.process(null));
	}

	/**
	 * Eat CDATA tags in scripts.
	 */
	@Test
	public void testScriptCDATAInHtml() throws TemplateParserException {
		Templater templater = new Templater();
		Template template = templater.parseXml(true, "<script><![CDATA[alert('a&b');]]></script>");

		System.out.println(template);

		assertEquals("<script>alert('a&b');</script>", template.process(null));
	}

	/**
	 * CDATA tags outside of markup are escaped.
	 */
	@Test
	public void testCDATAInHtml() throws TemplateParserException {
		Templater templater = new Templater();
		Template template = templater.parseXml(true, "<p><![CDATA[a&b]]></p>");

		System.out.println(template);

		assertEquals("<p>a&amp;b</p>", template.process(null));
	}
}
