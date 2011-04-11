package net.stencilproject.template.xml;

enum State {

	// [^&<]
	PCDATA {
		@Override
		void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '&') {
				p.emitIfNotEmpty(TokenType.VALUE, -1);
				p.emit(TokenType.ENTITY_OPEN, 0);
				p.push(ENTITY_START);
				return;
			}

			if (c == '<') {
				p.emitIfNotEmpty(TokenType.VALUE, -1);
				p.state(OPEN_ANGLE);
				return;
			}

			if (c == '>' && p.lookback("]]>")) {
				throw new NotWellFormedException("Character data cannot contain ]]>", c);
			}
		}

		@Override
		void enter(XmlPushLexer p) {
			p.mode(Mode.PCDATA);
		}
	},

	// <
	OPEN_ANGLE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '!') {
				p.state(OPEN_ANGLE_BANG);
				return;
			}

			if (c == '?') {
				p.state(PI);
				return;
			}

			if (c == '/') {
				p.state(CLOSE_ELEMENT);
				return;
			}

			if (XmlChars.isNameStart(c)) {
				p.mode(Mode.ELEMENT);
				p.emit(TokenType.START_ELEMENT_OPEN, -1);
				p.name(START_ELEMENT_ATTRIBUTE, TokenType.START_ELEMENT_NAME, c);
				return;
			}

			throw new NotWellFormedException("Expected <!, <?, start element or end element", c);
		}
	},

	// <!
	OPEN_ANGLE_BANG {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == 'D') {
				p.state(DOCTYPE);
				return;
			}

			if (c == '-') {
				p.state(COMMENT);
				return;
			}

			if (c == '[') {
				p.state(CDATA);
				return;
			}

			throw new NotWellFormedException("Expected <!DOCTYPE, <![CDATA[ or <!--", c);
		}
	},

	// <?
	PI {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isNameStart(c)) {
				p.name(PI_DATA_START, TokenType.PI_NAME, c);
				return;
			}

			throw new NotWellFormedException("Expected name after <?", c);
		}

		@Override
		void enter(XmlPushLexer p) {
			p.mode(Mode.PROCESSING_INSTRUCTION);
			p.emit(TokenType.PI_OPEN, 0);
		}
	},

	PI_DATA_START {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isWhitespace(c)) {
				p.state(PI_DATA);
				return;
			}

			if (c == '?') {
				p.state(PI_NO_WS_END_1);
				return;
			}

			throw new NotWellFormedException("Expected whitespace or ?>", c);
		}
	},

	PI_NO_WS_END_1 {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '>') {
				p.emit(TokenType.PI_CLOSE, 0);
				p.state(PCDATA);
				return;
			}

			throw new NotWellFormedException("Expected ?> after name", c);
		}
	},

	PI_DATA_START_2 {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isWhitespace(c)) {
				// Ignore
				return;
			}

		}
	},

	// <?name ...?>
	PI_DATA {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (p.stepConsumeTo(c)) {
				p.emit(TokenType.VALUE, -2);
				p.emit(TokenType.PI_CLOSE, 0);
				p.state(PCDATA);
			}
		}

		@Override
		void enter(XmlPushLexer p) {
			p.consumeTo("?>");
		}
	},

	// <!-_-
	COMMENT {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '-') {
				p.emit(TokenType.COMMENT_OPEN, 0);
				p.state(COMMENT_BODY);
				return;
			}

			throw new NotWellFormedException("Expected <!--", c);
		}

		@Override
		void enter(XmlPushLexer p) {
			p.mode(Mode.COMMENT);
		}
	},

	// <!--_
	COMMENT_BODY {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '-') {
				p.state(COMMENT_END_1);
				return;
			}

		}
	},

	// <!-- blah -_->
	COMMENT_END_1 {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '-') {
				p.state(COMMENT_END_2);
				return;
			}

			p.state(COMMENT_BODY);
		}
	},

	// <!-- blah --_>
	COMMENT_END_2 {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '>') {
				p.emitIfNotEmpty(TokenType.VALUE, -3);
				p.emit(TokenType.COMMENT_CLOSE, 0);
				p.state(PCDATA);
				return;
			}

			throw new NotWellFormedException("Expected -->", c);
		}
	},

	// <![_CDATA[
	CDATA {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (p.stepConsumeTo(c)) {
				p.emitIfNotEmpty(TokenType.VALUE, -3);
				p.emit(TokenType.CDATA_CLOSE, 0);
				p.state(State.PCDATA);
			}
		}

		@Override
		void enter(XmlPushLexer p) {
			p.mode(Mode.CDATA);
			p.consumeTo("CDATA[", TokenType.CDATA_OPEN, "Expected CDATA after <![", "]]>");
		}
	},

	// <!D_OCTYPE
	DOCTYPE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			throw new NotWellFormedException("DOCTYPE declarations are not supported yet", c);

			// p.expect("OCTYPE", "Expected DOCTYPE after <!");
			// p.consumeTo(">", TokenType.PCDATA);
		}

		@Override
		void enter(XmlPushLexer p) {
			// p.mode(Mode.DOCTYPE);
		}
	},

	// <NAME_ NAME="value">
	START_ELEMENT_ATTRIBUTE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isWhitespace(c)) {
				return;
			}

			if (c == '/') {
				p.emitIfNotEmpty(TokenType.OPTIONAL_WS, -1);
				p.state(START_ELEMENT_EMPTY_CLOSE);
				return;
			}

			if (c == '>') {
				p.emitIfNotEmpty(TokenType.OPTIONAL_WS, -1);
				p.emit(TokenType.START_ELEMENT_CLOSE, 0);
				p.state(PCDATA);
				return;
			}

			if (XmlChars.isNameStart(c)) {
				p.emit(TokenType.REQUIRED_WS, -1);
				p.mode(Mode.ATTRIBUTE);
				p.name(ATTRIBUTE_EQUALS, TokenType.ATTRIBUTE_NAME, c);
				return;
			}
		}
	},

	// <NAME /_>
	START_ELEMENT_EMPTY_CLOSE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '>') {
				p.emit(TokenType.START_ELEMENT_EMPTY_CLOSE, 0);
				p.state(PCDATA);
				return;
			}

			throw new NotWellFormedException("Expected > after /", c);
		}
	},

	// <NAME NAME_=
	ATTRIBUTE_EQUALS {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isWhitespace(c)) {
				return;
			}

			if (c == '=') {
				p.emitIfNotEmpty(TokenType.OPTIONAL_WS, -1);
				p.emit(TokenType.ATTRIBUTE_EQUALS, 0);
				p.state(ATTRIBUTE_VALUE);
				return;
			}

			throw new NotWellFormedException("Expected = after attribute name", c);
		}
	},

	// <NAME NAME=_"VALUE" ...
	ATTRIBUTE_VALUE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isWhitespace(c)) {
				return;
			}

			if (c == '"') {
				p.emitIfNotEmpty(TokenType.OPTIONAL_WS, -1);
				p.emit(TokenType.START_ATTRIBUTE_VALUE, 0);
				p.state(ATTRIBUTE_VALUE_DOUBLE_QUOTE);
				return;
			}

			if (c == '\'') {
				p.emitIfNotEmpty(TokenType.OPTIONAL_WS, -1);
				p.emit(TokenType.START_ATTRIBUTE_VALUE, 0);
				p.state(ATTRIBUTE_VALUE_SINGLE_QUOTE);
				return;
			}

			throw new NotWellFormedException("Expected \" or \' after attribute =", c);
		}
	},

	// "_...."
	ATTRIBUTE_VALUE_DOUBLE_QUOTE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			attributeValue('"', p, c);
		}
	},

	// '_....'
	ATTRIBUTE_VALUE_SINGLE_QUOTE {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			attributeValue('\'', p, c);
		}
	},

	// </_NAME
	CLOSE_ELEMENT {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isNameStart(c)) {
				p.name(CLOSE_ELEMENT_END, TokenType.END_ELEMENT_NAME, c);
				return;
			}

			throw new NotWellFormedException("Expected name after </", c);
		}

		@Override
		void enter(XmlPushLexer p) {
			p.emit(TokenType.END_ELEMENT_OPEN, 0);
		}
	},

	// </NAME_>
	CLOSE_ELEMENT_END {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '>') {
				p.emit(TokenType.END_ELEMENT_CLOSE, 0);
				p.state(PCDATA);
				return;
			}

			throw new NotWellFormedException("Expected > after close tag", c);
		}
	},

	// NAME_CHAR
	NAME {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (XmlChars.isName(c)) {
				return;
			}

			p.emitName(c);
		}
	},

	// &(#...|name);
	ENTITY_START {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == '#') {
				p.state(CHARACTER_REFERENCE_NUMERIC);
				return;
			}

			if (XmlChars.isNameStart(c)) {
				p.name(ENTITY_END, TokenType.ENTITY_NAME, c);
				return;
			}

			throw new NotWellFormedException("Expected name after &", c);
		}
	},

	// &#_(1234|x1234);
	CHARACTER_REFERENCE_NUMERIC {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == 'x') {
				p.state(CHARACTER_REFERENCE_HEX);
				return;
			}

			if (XmlChars.isDecimalNumeric(c)) {

				p.state(CHARACTER_REFERENCE_DECIMAL);
				return;
			}

			throw new NotWellFormedException("Expected a hex or decimal character reference after &#", c);
		}
	},

	// &#x_1234;
	CHARACTER_REFERENCE_HEX {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == ';') {
				p.emit(TokenType.CHAR_REF_HEX, -1);
				p.pop();

				p.emit(TokenType.ENTITY_CLOSE, 0);
				return;
			}

			if (XmlChars.isHexNumeric(c)) {

				return;
			}

			throw new NotWellFormedException("Expected a hex digit character (A-F, a-f, 0-9)", c);
		}
	},

	// &#_1234;
	CHARACTER_REFERENCE_DECIMAL {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == ';') {
				p.emit(TokenType.CHAR_REF_DEC, -1);
				p.pop();

				p.emit(TokenType.ENTITY_CLOSE, 0);
				return;
			}

			if (XmlChars.isDecimalNumeric(c)) {
				return;
			}

			throw new NotWellFormedException("Expected a decimal digit character (0-9)", c);
		}
	},

	// &NAME_;
	ENTITY_END {
		@Override
		public void c(XmlPushLexer p, int c) throws NotWellFormedException {
			if (c == ';') {
				p.emit(TokenType.ENTITY_CLOSE, 0);
				p.pop();
				return;
			}

			throw new NotWellFormedException("Expected ; after entity name", c);
		}
	},

	;

	abstract void c(XmlPushLexer p, int c) throws NotWellFormedException;

	void attributeValue(char end, XmlPushLexer p, int c) throws NotWellFormedException {
		if (c == '<') {
			throw new NotWellFormedException("Cannot specify < inside attribute", c);
		}

		if (c == '&') {
			p.emitIfNotEmpty(TokenType.VALUE, -1);
			p.emit(TokenType.ENTITY_OPEN, 0);
			p.push(ENTITY_START);
			return;
		}

		if (c == end) {
			p.emitIfNotEmpty(TokenType.VALUE, -1);
			p.emit(TokenType.END_ATTRIBUTE_VALUE, 0);
			p.state(START_ELEMENT_ATTRIBUTE);
			p.mode(Mode.ELEMENT);
			return;
		}

	}

	void enter(XmlPushLexer p) {
	}

	TokenType getEntityValueTokenType() {
		return null;
	}
}