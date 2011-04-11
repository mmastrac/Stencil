package net.stencilproject.template.xml;

import java.util.ArrayList;

import net.stencilproject.template.xml.Mode;
import net.stencilproject.template.xml.NotWellFormedException;
import net.stencilproject.template.xml.TokenType;
import net.stencilproject.template.xml.XmlPushLexer;
import net.stencilproject.template.xml.XmlTokenHandler;

import org.apache.commons.lang.StringEscapeUtils;
import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.Lists;

public class TestXmlPushLexer {
	@Test
	public void testEmptyDocumentElement() throws NotWellFormedException {
		parse(false, "<x />", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.OPTIONAL_WS, " " }, { TokenType.START_ELEMENT_EMPTY_CLOSE, "/>" }, });
	}

	@Test
	public void testEmptyDocumentElement2() throws NotWellFormedException {
		parse(false, "<x/>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_EMPTY_CLOSE, "/>" }, });
	}

	@Test
	public void testAttributeOnEmptyDocumentElement() throws NotWellFormedException {
		parse(false, "<x a='b'/>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.REQUIRED_WS, " " }, { TokenType.ATTRIBUTE_NAME, "a" }, { TokenType.ATTRIBUTE_EQUALS, "=" },
				{ TokenType.START_ATTRIBUTE_VALUE, "'" }, { TokenType.VALUE, "b" }, { TokenType.END_ATTRIBUTE_VALUE, "'" },
				{ TokenType.START_ELEMENT_EMPTY_CLOSE, "/>" }, });
	}

	@Test
	public void testAttributeOnEmptyDocumentElement2() throws NotWellFormedException {
		parse(false, "<x a='b'></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.REQUIRED_WS, " " }, { TokenType.ATTRIBUTE_NAME, "a" }, { TokenType.ATTRIBUTE_EQUALS, "=" },
				{ TokenType.START_ATTRIBUTE_VALUE, "'" }, { TokenType.VALUE, "b" }, { TokenType.END_ATTRIBUTE_VALUE, "'" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testAttributeWithWhitespace() throws NotWellFormedException {
		parse(false, "<x       a     =      'b'    />", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" },
				{ TokenType.START_ELEMENT_NAME, "x" }, { TokenType.REQUIRED_WS, "       " }, { TokenType.ATTRIBUTE_NAME, "a" },
				{ TokenType.OPTIONAL_WS, "     " }, { TokenType.ATTRIBUTE_EQUALS, "=" }, { TokenType.OPTIONAL_WS, "      " },
				{ TokenType.START_ATTRIBUTE_VALUE, "'" }, { TokenType.VALUE, "b" }, { TokenType.END_ATTRIBUTE_VALUE, "'" },
				{ TokenType.OPTIONAL_WS, "    " }, { TokenType.START_ELEMENT_EMPTY_CLOSE, "/>" }, });
	}

	@Test
	public void testAttributeWithEntity() throws NotWellFormedException {
		parse(false, "<x a='&foo;'></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.REQUIRED_WS, " " }, { TokenType.ATTRIBUTE_NAME, "a" }, { TokenType.ATTRIBUTE_EQUALS, "=" },
				{ TokenType.START_ATTRIBUTE_VALUE, "'" }, { TokenType.ENTITY_OPEN, "&" }, { TokenType.ENTITY_NAME, "foo" },
				{ TokenType.ENTITY_CLOSE, ";" }, { TokenType.END_ATTRIBUTE_VALUE, "'" }, { TokenType.START_ELEMENT_CLOSE, ">" },
				{ TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testTextWithEntity() throws NotWellFormedException {
		parse(false, "<x>&foo;</x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.ENTITY_OPEN, "&" }, { TokenType.ENTITY_NAME, "foo" },
				{ TokenType.ENTITY_CLOSE, ";" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testTextWithEntity2() throws NotWellFormedException {
		parse(false, "<x>x&foo;x</x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.VALUE, "x" }, { TokenType.ENTITY_OPEN, "&" },
				{ TokenType.ENTITY_NAME, "foo" }, { TokenType.ENTITY_CLOSE, ";" }, { TokenType.VALUE, "x" },
				{ TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testComment() throws NotWellFormedException {
		parse(false, "<x><!-- hey comment --></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" },
				{ TokenType.START_ELEMENT_NAME, "x" }, { TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.COMMENT_OPEN, "<!--" },
				{ TokenType.VALUE, " hey comment " }, { TokenType.COMMENT_CLOSE, "-->" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testComment2() throws NotWellFormedException {
		parse(false, "<x><!-- hey <x> &foo; comment --></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" },
				{ TokenType.START_ELEMENT_NAME, "x" }, { TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.COMMENT_OPEN, "<!--" },
				{ TokenType.VALUE, " hey <x> &foo; comment " }, { TokenType.COMMENT_CLOSE, "-->" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testComment3() throws NotWellFormedException {
		parse(false, "<x><!--- --></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.COMMENT_OPEN, "<!--" }, { TokenType.VALUE, "- " },
				{ TokenType.COMMENT_CLOSE, "-->" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testComment4() throws NotWellFormedException {
		parse(false, "<x><!-- - --></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.COMMENT_OPEN, "<!--" }, { TokenType.VALUE, " - " },
				{ TokenType.COMMENT_CLOSE, "-->" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testComment5() throws NotWellFormedException {
		parse(false, "<x><!----></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.COMMENT_OPEN, "<!--" }, { TokenType.COMMENT_CLOSE, "-->" },
				{ TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testCDATA() throws NotWellFormedException {
		parse(false, "<x><![CDATA[whoa!<>]]></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" },
				{ TokenType.START_ELEMENT_NAME, "x" }, { TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.CDATA_OPEN, "<![CDATA[" },
				{ TokenType.VALUE, "whoa!<>" }, { TokenType.CDATA_CLOSE, "]]>" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testCDATA2() throws NotWellFormedException {
		parse(false, "<x><![CDATA[]]></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.CDATA_OPEN, "<![CDATA[" }, { TokenType.CDATA_CLOSE, "]]>" },
				{ TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testPIEmpty() throws NotWellFormedException {
		parse(false, "<x><?foo ?></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.PI_OPEN, "<?" }, { TokenType.PI_NAME, "foo" },
				{ TokenType.VALUE, " " }, { TokenType.PI_CLOSE, "?>" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testPIEmpty2() throws NotWellFormedException {
		parse(false, "<x><?foo?></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.PI_OPEN, "<?" }, { TokenType.PI_NAME, "foo" },
				{ TokenType.PI_CLOSE, "?>" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testPI() throws NotWellFormedException {
		parse(false, "<x><?foo x?></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.PI_OPEN, "<?" }, { TokenType.PI_NAME, "foo" },
				{ TokenType.VALUE, " x" }, { TokenType.PI_CLOSE, "?>" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testPI2() throws NotWellFormedException {
		parse(false, "<x><?foo ??></x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.PI_OPEN, "<?" }, { TokenType.PI_NAME, "foo" },
				{ TokenType.VALUE, " ?" }, { TokenType.PI_CLOSE, "?>" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testPI3() throws NotWellFormedException {
		parse(false, "<?xml version='1.1' ?><x></x>", new Object[][] { { TokenType.PI_OPEN, "<?" }, { TokenType.PI_NAME, "xml" },
				{ TokenType.VALUE, " version='1.1' " }, { TokenType.PI_CLOSE, "?>" }, { TokenType.START_ELEMENT_OPEN, "<" },
				{ TokenType.START_ELEMENT_NAME, "x" }, { TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.END_ELEMENT_OPEN, "</" },
				{ TokenType.END_ELEMENT_NAME, "x" }, { TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testCharacterReference() throws NotWellFormedException {
		parse(false, "<x>&#xd;</x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.ENTITY_OPEN, "&" }, { TokenType.CHAR_REF_HEX, "#xd" },
				{ TokenType.ENTITY_CLOSE, ";" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testCharacterReference2() throws NotWellFormedException {
		parse(false, "<x>&#x44;</x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.ENTITY_OPEN, "&" }, { TokenType.CHAR_REF_HEX, "#x44" },
				{ TokenType.ENTITY_CLOSE, ";" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testCharacterReference3() throws NotWellFormedException {
		parse(false, "<x>&#66;</x>", new Object[][] { { TokenType.START_ELEMENT_OPEN, "<" }, { TokenType.START_ELEMENT_NAME, "x" },
				{ TokenType.START_ELEMENT_CLOSE, ">" }, { TokenType.ENTITY_OPEN, "&" }, { TokenType.CHAR_REF_DEC, "#66" },
				{ TokenType.ENTITY_CLOSE, ";" }, { TokenType.END_ELEMENT_OPEN, "</" }, { TokenType.END_ELEMENT_NAME, "x" },
				{ TokenType.END_ELEMENT_CLOSE, ">" }, });
	}

	@Test
	public void testNotWellFormedOpenAngleInAttribute() {
		try {
			parse(false, "<x b='<'></x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	@Test
	public void testNotWellFormedMarkedSectionDeclarationCloseInContent() {
		try {
			parse(false, "<x>]]></x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	@Test
	public void testNotWellFormedMarkedSectionDeclarationCloseInContent2() {
		try {
			parse(false, "<x> ]]></x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	@Test
	public void testNotWellFormedTwoDashesInComment() {
		try {
			parse(false, "<x><!-- ---></x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	@Test
	public void testNotWellFormedTwoDashesInComment2() {
		try {
			parse(false, "<x><!-- -- --></x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	@Test
	public void testNotWellFormedCharacterRef2() {
		try {
			parse(false, "<x>&#xy123a;</x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	@Test
	public void testNotWellFormedProcessingInstruction() {
		try {
			parse(false, "<x><?foo??></x>", null);
			Assert.fail("Should not have succeeded");
		} catch (NotWellFormedException e) {
			// success
		}
	}

	private void parse(boolean useMetaChars, String string, Object[][] expected) throws NotWellFormedException {
		final StringBuilder builder = new StringBuilder();
		final ArrayList<Object[]> actual = Lists.newArrayList();
		final XmlTokenHandler handler = new XmlTokenHandler() {
			@Override
			public void token(Mode mode, TokenType type, int[] value, int valueOffset, int valueLength) {
				String valueStr = value(value, valueOffset, valueLength);

				switch (type) {
				case VALUE:
					switch (mode) {
					case ATTRIBUTE:
					case PCDATA:
					case COMMENT:
					case CDATA:
					case PROCESSING_INSTRUCTION:
						break;
					default:
						Assert.fail("Unexpected mode: " + mode);
					}
					break;
				case START_ELEMENT_OPEN:
					Assert.assertEquals("<", valueStr);
					break;
				case START_ELEMENT_CLOSE:
					Assert.assertEquals(">", valueStr);
					break;
				case START_ELEMENT_EMPTY_CLOSE:
					Assert.assertEquals("/>", valueStr);
					break;
				case END_ELEMENT_OPEN:
					Assert.assertEquals("</", valueStr);
					break;
				case START_ELEMENT_NAME:
				case END_ELEMENT_NAME:
				case ATTRIBUTE_NAME:
				case ENTITY_NAME:
				case PI_NAME:
					break;
				case END_ELEMENT_CLOSE:
					Assert.assertEquals(">", valueStr);
					break;
				case ATTRIBUTE_EQUALS:
					Assert.assertEquals("=", valueStr);
					break;
				case START_ATTRIBUTE_VALUE:
					Assert.assertTrue(valueStr.equals("'") || valueStr.equals("\""));
					break;
				case END_ATTRIBUTE_VALUE:
					Assert.assertTrue(valueStr.equals("'") || valueStr.equals("\""));
					break;
				case ENTITY_OPEN:
					Assert.assertEquals("&", valueStr);
					break;
				case ENTITY_CLOSE:
					Assert.assertEquals(";", valueStr);
					break;
				case COMMENT_OPEN:
					Assert.assertEquals("<!--", valueStr);
					break;
				case COMMENT_CLOSE:
					Assert.assertEquals("-->", valueStr);
					break;
				case CDATA_OPEN:
					Assert.assertEquals("<![CDATA[", valueStr);
					break;
				case CDATA_CLOSE:
					Assert.assertEquals("]]>", valueStr);
					break;
				case PI_OPEN:
					Assert.assertEquals("<?", valueStr);
					break;
				case PI_CLOSE:
					Assert.assertEquals("?>", valueStr);
					break;
				case CHAR_REF_DEC:
					Integer.parseInt(valueStr.substring(1));
					break;
				case CHAR_REF_HEX:
					Integer.parseInt(valueStr.substring(2), 16);
					break;

				case OPTIONAL_WS:
					Assert.assertTrue(valueStr.matches("\\s*"));
					break;
				case REQUIRED_WS:
					Assert.assertTrue(valueStr.matches("\\s*"));
					break;

				default:
					Assert.fail("Unexpected token type: " + type);
				}

				StringBuilder actualValue = new StringBuilder();
				for (int i = 0; i < valueLength; i++) {
					final int c = value[i + valueOffset];
					if (c < 0) {
						// actualValue.append("##PLACEHOLDER##");
					} else {
						actualValue.append((char) c);
					}
				}
				builder.append(actualValue);

				actual.add(new Object[] { type, actualValue.toString() });
			}

			private String value(int[] value, int valueOffset, int valueLength) {
				String test = "";
				for (int i = 0; i < valueLength; i++) {
					if (value[i + valueOffset] >= 0) {
						test += (char) value[i + valueOffset];
					}
				}

				return test;
			}
		};
		XmlPushLexer parser = new XmlPushLexer(handler);
		if (useMetaChars) {
			parser.input(-1);
		}
		for (int i = 0; i < string.length(); i++) {
			parser.input(string.charAt(i));
			if (useMetaChars) {
				parser.input(-1);
			}
		}
		parser.finish();

		Assert.assertEquals(string, builder.toString());
		Assert.assertEquals(toString(expected), toString(actual.toArray(new Object[actual.size()][])));
	}

	private String toString(Object[][] array) {
		if (array == null) {
			return "null";
		}

		StringBuilder builder = new StringBuilder("new Object[][] {\n");

		for (Object[] x : array) {
			builder.append("{ TokenType.");
			builder.append(x[0]);
			builder.append(", ");
			builder.append('"');
			builder.append(StringEscapeUtils.escapeJava(x[1].toString()));
			builder.append('"');
			builder.append(" },\n");
		}

		builder.append("}");
		return builder.toString();
	}
}
