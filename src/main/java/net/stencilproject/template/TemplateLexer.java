// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g 2010-12-06 14:34:39
package net.stencilproject.template;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TemplateLexer extends Lexer {
    public static final int DOLLAR=60;
    public static final int EXPONENT=75;
    public static final int LT=45;
    public static final int LSQUARE=54;
    public static final int ORDER=39;
    public static final int LIMIT=26;
    public static final int MOD=53;
    public static final int GTE=48;
    public static final int TEMPLATE_PRINT_END=17;
    public static final int FOR=19;
    public static final int DQUOTE=67;
    public static final int TEMPLATE_PRINT_START=16;
    public static final int FLOAT=76;
    public static final int NOT=38;
    public static final int SCOPE_LOOKUP=4;
    public static final int ID=11;
    public static final int AND=36;
    public static final int EOF=-1;
    public static final int LTE=46;
    public static final int LPAREN=56;
    public static final int UNARY_PLUS=8;
    public static final int IF=18;
    public static final int INT_HEX=74;
    public static final int AS=21;
    public static final int RPAREN=57;
    public static final int ESC_SEQ=78;
    public static final int IN=20;
    public static final int CONTINUE=28;
    public static final int COMMA=69;
    public static final int INCLUDE=25;
    public static final int TILDE=61;
    public static final int PIPE=71;
    public static final int PLUS=49;
    public static final int VAR=27;
    public static final int EQ=42;
    public static final int COMMENT=77;
    public static final int DOT=58;
    public static final int RSHIFT=63;
    public static final int EQEQ=43;
    public static final int NE=44;
    public static final int BY=40;
    public static final int QDOT=59;
    public static final int TEMPLATE_COMMENT=10;
    public static final int XOR=64;
    public static final int TO=41;
    public static final int LSHIFT=62;
    public static final int NULL=33;
    public static final int UNICODE_ESC=81;
    public static final int ELSE=22;
    public static final int HEX_DIGIT=73;
    public static final int UNARY_MINUS=9;
    public static final int INT=72;
    public static final int TEMPLATE_STATEMENT_START=14;
    public static final int MINUS=50;
    public static final int RSQUARE=55;
    public static final int SQUOTE=66;
    public static final int LIST=5;
    public static final int TRUE=31;
    public static final int MUL=51;
    public static final int SEMI=68;
    public static final int PRINT=7;
    public static final int IAND=34;
    public static final int COLON=65;
    public static final int ELIF=23;
    public static final int HEX_ESC=80;
    public static final int TEMPLATE_RAW=13;
    public static final int WS=12;
    public static final int QUESTION=70;
    public static final int BLOCK=30;
    public static final int OR=37;
    public static final int GT=47;
    public static final int TEMPLATE_LITERAL=6;
    public static final int IOR=35;
    public static final int DIV=52;
    public static final int END=24;
    public static final int FALSE=32;
    public static final int EXTENDS=29;
    public static final int TEMPLATE_STATEMENT_END=15;
    public static final int STRING=79;

        boolean literalMode = true;


    // delegates
    // delegators

    public TemplateLexer() {;} 
    public TemplateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g"; }

    // $ANTLR start "TEMPLATE_COMMENT"
    public final void mTEMPLATE_COMMENT() throws RecognitionException {
        try {
            int _type = TEMPLATE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:23:2: ( '{#' ( options {greedy=false; } : . )* '#}' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:23:4: '{#' ( options {greedy=false; } : . )* '#}'
            {
            match("{#"); 

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:23:9: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='}') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='|')||(LA1_1>='~' && LA1_1<='\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\"')||(LA1_0>='$' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:23:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("#}"); 

            literalMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_COMMENT"

    // $ANTLR start "TEMPLATE_RAW"
    public final void mTEMPLATE_RAW() throws RecognitionException {
        try {
            int _type = TEMPLATE_RAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:28:2: ( '{%%%' ID ( WS )+ ( options {greedy=false; } : . )* '%%%}' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:28:4: '{%%%' ID ( WS )+ ( options {greedy=false; } : . )* '%%%}'
            {
            match("{%%%"); 

            mID(); 
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:28:14: ( WS )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:28:14: WS
            	    {
            	    mWS(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:28:18: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='%') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='%') ) {
                        int LA3_3 = input.LA(3);

                        if ( (LA3_3=='%') ) {
                            int LA3_4 = input.LA(4);

                            if ( (LA3_4=='}') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_4>='\u0000' && LA3_4<='|')||(LA3_4>='~' && LA3_4<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_3>='\u0000' && LA3_3<='$')||(LA3_3>='&' && LA3_3<='\uFFFF')) ) {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='$')||(LA3_1>='&' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='$')||(LA3_0>='&' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:28:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("%%%}"); 

            literalMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_RAW"

    // $ANTLR start "TEMPLATE_STATEMENT_START"
    public final void mTEMPLATE_STATEMENT_START() throws RecognitionException {
        try {
            int _type = TEMPLATE_STATEMENT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:31:26: ( '{%' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:31:28: '{%'
            {
            match("{%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_STATEMENT_START"

    // $ANTLR start "TEMPLATE_STATEMENT_END"
    public final void mTEMPLATE_STATEMENT_END() throws RecognitionException {
        try {
            int _type = TEMPLATE_STATEMENT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:32:25: ( '%}' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:32:27: '%}'
            {
            match("%}"); 

            literalMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_STATEMENT_END"

    // $ANTLR start "TEMPLATE_PRINT_START"
    public final void mTEMPLATE_PRINT_START() throws RecognitionException {
        try {
            int _type = TEMPLATE_PRINT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:34:22: ( '{{' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:34:24: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_PRINT_START"

    // $ANTLR start "TEMPLATE_PRINT_END"
    public final void mTEMPLATE_PRINT_END() throws RecognitionException {
        try {
            int _type = TEMPLATE_PRINT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:35:21: ( '}}' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:35:23: '}}'
            {
            match("}}"); 

            literalMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEMPLATE_PRINT_END"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:38:5: ( 'if' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:38:8: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:39:6: ( 'for' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:39:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:40:5: ( 'in' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:40:8: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:41:5: ( 'as' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:41:8: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:42:7: ( 'else' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:42:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:43:7: ( 'elif' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:43:10: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:44:6: ( 'end' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:44:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:45:9: ( 'include' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:45:12: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:46:7: ( 'limit' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:46:10: 'limit'
            {
            match("limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:47:5: ( 'var' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:47:8: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:48:9: ( 'continue' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:48:11: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:49:9: ( 'extends' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:49:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:50:7: ( 'block' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:50:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:52:6: ( 'true' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:52:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:53:7: ( 'false' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:53:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:54:6: ( 'null' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:54:8: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "IAND"
    public final void mIAND() throws RecognitionException {
        try {
            int _type = IAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:56:6: ( 'iand' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:56:8: 'iand'
            {
            match("iand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IAND"

    // $ANTLR start "IOR"
    public final void mIOR() throws RecognitionException {
        try {
            int _type = IOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:57:5: ( 'ior' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:57:7: 'ior'
            {
            match("ior"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IOR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:58:5: ( 'and' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:58:8: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:59:4: ( 'or' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:59:7: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:60:5: ( 'not' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:60:8: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:62:8: ( 'order' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:62:10: 'order'
            {
            match("order"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:63:4: ( 'by' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:63:6: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:64:4: ( 'to' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:64:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:66:7: ( '=' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:66:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:67:7: ( '==' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:67:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:68:4: ( '!=' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:68:6: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:69:7: ( '<' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:69:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:70:5: ( '<=' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:70:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:71:5: ( '>' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:71:8: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:72:5: ( '>=' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:72:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:73:7: ( '+' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:73:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:74:7: ( '-' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:74:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:75:5: ( '*' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:75:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:76:5: ( '/' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:76:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:77:5: ( '%' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:77:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:78:9: ( '[' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:78:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:79:9: ( ']' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:79:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:80:8: ( '(' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:80:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:81:8: ( ')' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:81:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:82:6: ( '.' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:82:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "QDOT"
    public final void mQDOT() throws RecognitionException {
        try {
            int _type = QDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:83:6: ( '?.' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:83:8: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QDOT"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:84:8: ( '$' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:84:11: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:85:7: ( '~' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:85:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "LSHIFT"
    public final void mLSHIFT() throws RecognitionException {
        try {
            int _type = LSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:86:8: ( '<<' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:86:11: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSHIFT"

    // $ANTLR start "RSHIFT"
    public final void mRSHIFT() throws RecognitionException {
        try {
            int _type = RSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:87:8: ( '>>' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:87:11: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSHIFT"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:88:5: ( '^' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:88:8: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:89:7: ( ':' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:89:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:90:8: ( '\\'' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:90:11: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:91:8: ( '\"' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:91:11: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:92:6: ( ';' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:92:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:93:7: ( ',' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:93:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:94:9: ( '?' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:94:11: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:95:6: ( '|' )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:95:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:97:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:97:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:97:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:100:5: ( ( '0' .. '9' )+ )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:100:7: ( '0' .. '9' )+
            {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:100:7: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:100:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INT_HEX"
    public final void mINT_HEX() throws RecognitionException {
        try {
            int _type = INT_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:103:9: ( '0' 'x' ( HEX_DIGIT )+ )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:103:11: '0' 'x' ( HEX_DIGIT )+
            {
            match('0'); 
            match('x'); 
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:103:19: ( HEX_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:103:19: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_HEX"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    match('.'); 
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:37: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:107:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:108:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:108:13: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:108:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:108:25: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:108:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:109:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:109:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:109:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:113:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='/') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='/') ) {
                    alt17=1;
                }
                else if ( (LA17_1=='*') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:113:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:113:16: (~ ( '\\n' | '\\r' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:113:16: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:113:30: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:113:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:114:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:114:16: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='*') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='/') ) {
                                alt16=2;
                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:114:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:117:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:117:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:125:5: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' ) | ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' ) )
            int alt22=4;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='\"') ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3=='\"') ) {
                        alt22=1;
                    }
                    else {
                        alt22=3;}
                }
                else if ( ((LA22_1>='\u0000' && LA22_1<='!')||(LA22_1>='#' && LA22_1<='\uFFFF')) ) {
                    alt22=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0=='\'') ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2=='\'') ) {
                    int LA22_5 = input.LA(3);

                    if ( (LA22_5=='\'') ) {
                        alt22=2;
                    }
                    else {
                        alt22=4;}
                }
                else if ( ((LA22_2>='\u0000' && LA22_2<='&')||(LA22_2>='(' && LA22_2<='\uFFFF')) ) {
                    alt22=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:125:10: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:125:16: ( options {greedy=false; } : . )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\"') ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1=='\"') ) {
                                int LA18_3 = input.LA(3);

                                if ( (LA18_3=='\"') ) {
                                    alt18=2;
                                }
                                else if ( ((LA18_3>='\u0000' && LA18_3<='!')||(LA18_3>='#' && LA18_3<='\uFFFF')) ) {
                                    alt18=1;
                                }


                            }
                            else if ( ((LA18_1>='\u0000' && LA18_1<='!')||(LA18_1>='#' && LA18_1<='\uFFFF')) ) {
                                alt18=1;
                            }


                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:125:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:126:10: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:126:19: ( options {greedy=false; } : . )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\'') ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1=='\'') ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3=='\'') ) {
                                    alt19=2;
                                }
                                else if ( ((LA19_3>='\u0000' && LA19_3<='&')||(LA19_3>='(' && LA19_3<='\uFFFF')) ) {
                                    alt19=1;
                                }


                            }
                            else if ( ((LA19_1>='\u0000' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\uFFFF')) ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:126:47: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:127:10: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:127:10: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:127:11: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:127:15: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:127:17: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:127:27: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }


                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:128:10: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:128:10: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\'' )
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:128:11: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:128:16: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:128:18: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:128:28: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:132:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:132:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:132:22: ( '+' | '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+'||LA23_0=='-') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:132:33: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:132:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:135:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:135:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:139:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | HEX_ESC | UNICODE_ESC )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt25=1;
                    }
                    break;
                case 'x':
                    {
                    alt25=2;
                    }
                    break;
                case 'u':
                    {
                    alt25=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:139:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:140:9: HEX_ESC
                    {
                    mHEX_ESC(); 

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:141:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "HEX_ESC"
    public final void mHEX_ESC() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:147:5: ( '\\\\' 'x' HEX_DIGIT HEX_DIGIT )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:147:9: '\\\\' 'x' HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('x'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:152:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:152:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:8: ( TEMPLATE_COMMENT | TEMPLATE_RAW | TEMPLATE_STATEMENT_START | TEMPLATE_STATEMENT_END | TEMPLATE_PRINT_START | TEMPLATE_PRINT_END | IF | FOR | IN | AS | ELSE | ELIF | END | INCLUDE | LIMIT | VAR | CONTINUE | EXTENDS | BLOCK | TRUE | FALSE | NULL | IAND | IOR | AND | OR | NOT | ORDER | BY | TO | EQ | EQEQ | NE | LT | LTE | GT | GTE | PLUS | MINUS | MUL | DIV | MOD | LSQUARE | RSQUARE | LPAREN | RPAREN | DOT | QDOT | DOLLAR | TILDE | LSHIFT | RSHIFT | XOR | COLON | SQUOTE | DQUOTE | SEMI | COMMA | QUESTION | PIPE | ID | INT | INT_HEX | FLOAT | COMMENT | WS | STRING )
        int alt26=67;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:10: TEMPLATE_COMMENT
                {
                mTEMPLATE_COMMENT(); 

                }
                break;
            case 2 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:27: TEMPLATE_RAW
                {
                mTEMPLATE_RAW(); 

                }
                break;
            case 3 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:40: TEMPLATE_STATEMENT_START
                {
                mTEMPLATE_STATEMENT_START(); 

                }
                break;
            case 4 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:65: TEMPLATE_STATEMENT_END
                {
                mTEMPLATE_STATEMENT_END(); 

                }
                break;
            case 5 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:88: TEMPLATE_PRINT_START
                {
                mTEMPLATE_PRINT_START(); 

                }
                break;
            case 6 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:109: TEMPLATE_PRINT_END
                {
                mTEMPLATE_PRINT_END(); 

                }
                break;
            case 7 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:128: IF
                {
                mIF(); 

                }
                break;
            case 8 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:131: FOR
                {
                mFOR(); 

                }
                break;
            case 9 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:135: IN
                {
                mIN(); 

                }
                break;
            case 10 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:138: AS
                {
                mAS(); 

                }
                break;
            case 11 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:141: ELSE
                {
                mELSE(); 

                }
                break;
            case 12 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:146: ELIF
                {
                mELIF(); 

                }
                break;
            case 13 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:151: END
                {
                mEND(); 

                }
                break;
            case 14 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:155: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 15 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:163: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 16 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:169: VAR
                {
                mVAR(); 

                }
                break;
            case 17 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:173: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 18 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:182: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 19 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:190: BLOCK
                {
                mBLOCK(); 

                }
                break;
            case 20 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:196: TRUE
                {
                mTRUE(); 

                }
                break;
            case 21 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:201: FALSE
                {
                mFALSE(); 

                }
                break;
            case 22 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:207: NULL
                {
                mNULL(); 

                }
                break;
            case 23 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:212: IAND
                {
                mIAND(); 

                }
                break;
            case 24 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:217: IOR
                {
                mIOR(); 

                }
                break;
            case 25 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:221: AND
                {
                mAND(); 

                }
                break;
            case 26 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:225: OR
                {
                mOR(); 

                }
                break;
            case 27 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:228: NOT
                {
                mNOT(); 

                }
                break;
            case 28 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:232: ORDER
                {
                mORDER(); 

                }
                break;
            case 29 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:238: BY
                {
                mBY(); 

                }
                break;
            case 30 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:241: TO
                {
                mTO(); 

                }
                break;
            case 31 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:244: EQ
                {
                mEQ(); 

                }
                break;
            case 32 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:247: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 33 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:252: NE
                {
                mNE(); 

                }
                break;
            case 34 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:255: LT
                {
                mLT(); 

                }
                break;
            case 35 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:258: LTE
                {
                mLTE(); 

                }
                break;
            case 36 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:262: GT
                {
                mGT(); 

                }
                break;
            case 37 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:265: GTE
                {
                mGTE(); 

                }
                break;
            case 38 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:269: PLUS
                {
                mPLUS(); 

                }
                break;
            case 39 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:274: MINUS
                {
                mMINUS(); 

                }
                break;
            case 40 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:280: MUL
                {
                mMUL(); 

                }
                break;
            case 41 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:284: DIV
                {
                mDIV(); 

                }
                break;
            case 42 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:288: MOD
                {
                mMOD(); 

                }
                break;
            case 43 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:292: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 44 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:300: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 45 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:308: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 46 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:315: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 47 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:322: DOT
                {
                mDOT(); 

                }
                break;
            case 48 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:326: QDOT
                {
                mQDOT(); 

                }
                break;
            case 49 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:331: DOLLAR
                {
                mDOLLAR(); 

                }
                break;
            case 50 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:338: TILDE
                {
                mTILDE(); 

                }
                break;
            case 51 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:344: LSHIFT
                {
                mLSHIFT(); 

                }
                break;
            case 52 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:351: RSHIFT
                {
                mRSHIFT(); 

                }
                break;
            case 53 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:358: XOR
                {
                mXOR(); 

                }
                break;
            case 54 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:362: COLON
                {
                mCOLON(); 

                }
                break;
            case 55 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:368: SQUOTE
                {
                mSQUOTE(); 

                }
                break;
            case 56 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:375: DQUOTE
                {
                mDQUOTE(); 

                }
                break;
            case 57 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:382: SEMI
                {
                mSEMI(); 

                }
                break;
            case 58 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:387: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 59 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:393: QUESTION
                {
                mQUESTION(); 

                }
                break;
            case 60 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:402: PIPE
                {
                mPIPE(); 

                }
                break;
            case 61 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:407: ID
                {
                mID(); 

                }
                break;
            case 62 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:410: INT
                {
                mINT(); 

                }
                break;
            case 63 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:414: INT_HEX
                {
                mINT_HEX(); 

                }
                break;
            case 64 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:422: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 65 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:428: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 66 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:436: WS
                {
                mWS(); 

                }
                break;
            case 67 :
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:1:439: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA13_eotS =
        "\5\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\2\56\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "106:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA26_eotS =
        "\2\uffff\1\56\1\uffff\13\46\1\105\1\uffff\1\110\1\113\3\uffff\1"+
        "\115\4\uffff\1\116\1\121\4\uffff\1\123\1\124\4\uffff\2\126\2\uffff"+
        "\1\130\3\uffff\1\131\1\133\4\46\1\140\10\46\1\152\1\46\1\154\2\46"+
        "\1\160\26\uffff\1\46\1\uffff\1\46\1\163\1\164\1\46\1\uffff\1\166"+
        "\2\46\1\171\2\46\1\174\2\46\1\uffff\1\46\1\uffff\1\46\1\u0081\1"+
        "\46\1\uffff\1\46\1\u0084\2\uffff\1\46\1\uffff\1\u0086\1\u0087\1"+
        "\uffff\2\46\1\uffff\2\46\1\u008c\1\u008d\1\uffff\2\46\1\uffff\1"+
        "\u0090\2\uffff\1\46\1\u0092\1\46\1\u0094\2\uffff\1\u0095\1\46\1"+
        "\uffff\1\46\1\uffff\1\46\2\uffff\1\u0099\1\u009a\1\46\2\uffff\1"+
        "\u009c\1\uffff";
    static final String DFA26_eofS =
        "\u009d\uffff";
    static final String DFA26_minS =
        "\1\11\1\43\1\175\1\uffff\2\141\1\156\1\154\1\151\1\141\1\157\1\154"+
        "\2\157\1\162\1\75\1\uffff\1\74\1\75\3\uffff\1\52\4\uffff\1\60\1"+
        "\56\4\uffff\2\0\4\uffff\2\56\2\uffff\1\45\3\uffff\2\60\1\156\2\162"+
        "\1\154\1\60\1\144\1\151\1\144\1\164\1\155\1\162\1\156\1\157\1\60"+
        "\1\165\1\60\1\154\1\164\1\60\26\uffff\1\154\1\uffff\1\144\2\60\1"+
        "\163\1\uffff\1\60\1\145\1\146\1\60\1\145\1\151\1\60\1\164\1\143"+
        "\1\uffff\1\145\1\uffff\1\154\1\60\1\145\1\uffff\1\165\1\60\2\uffff"+
        "\1\145\1\uffff\2\60\1\uffff\1\156\1\164\1\uffff\1\151\1\153\2\60"+
        "\1\uffff\1\162\1\144\1\uffff\1\60\2\uffff\1\144\1\60\1\156\1\60"+
        "\2\uffff\1\60\1\145\1\uffff\1\163\1\uffff\1\165\2\uffff\2\60\1\145"+
        "\2\uffff\1\60\1\uffff";
    static final String DFA26_maxS =
        "\1\176\1\173\1\175\1\uffff\2\157\1\163\1\170\1\151\1\141\1\157\1"+
        "\171\1\162\1\165\1\162\1\75\1\uffff\1\75\1\76\3\uffff\1\57\4\uffff"+
        "\1\71\1\56\4\uffff\2\uffff\4\uffff\1\170\1\145\2\uffff\1\45\3\uffff"+
        "\2\172\1\156\2\162\1\154\1\172\1\144\1\163\1\144\1\164\1\155\1\162"+
        "\1\156\1\157\1\172\1\165\1\172\1\154\1\164\1\172\26\uffff\1\154"+
        "\1\uffff\1\144\2\172\1\163\1\uffff\1\172\1\145\1\146\1\172\1\145"+
        "\1\151\1\172\1\164\1\143\1\uffff\1\145\1\uffff\1\154\1\172\1\145"+
        "\1\uffff\1\165\1\172\2\uffff\1\145\1\uffff\2\172\1\uffff\1\156\1"+
        "\164\1\uffff\1\151\1\153\2\172\1\uffff\1\162\1\144\1\uffff\1\172"+
        "\2\uffff\1\144\1\172\1\156\1\172\2\uffff\1\172\1\145\1\uffff\1\163"+
        "\1\uffff\1\165\2\uffff\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\6\14\uffff\1\41\2\uffff\1\46\1\47\1\50\1\uffff\1\53\1"+
        "\54\1\55\1\56\2\uffff\1\61\1\62\1\65\1\66\2\uffff\1\71\1\72\1\74"+
        "\1\75\2\uffff\1\102\1\1\1\uffff\1\5\1\4\1\52\25\uffff\1\40\1\37"+
        "\1\43\1\63\1\42\1\45\1\64\1\44\1\101\1\51\1\57\1\100\1\60\1\73\1"+
        "\103\1\67\1\70\1\77\1\76\1\2\1\3\1\7\1\uffff\1\11\4\uffff\1\12\11"+
        "\uffff\1\35\1\uffff\1\36\3\uffff\1\32\2\uffff\1\30\1\10\1\uffff"+
        "\1\31\2\uffff\1\15\2\uffff\1\20\4\uffff\1\33\2\uffff\1\27\1\uffff"+
        "\1\13\1\14\4\uffff\1\24\1\26\2\uffff\1\25\1\uffff\1\17\1\uffff\1"+
        "\23\1\34\3\uffff\1\16\1\22\1\uffff\1\21";
    static final String DFA26_specialS =
        "\41\uffff\1\0\1\1\172\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\51\2\uffff\1\51\22\uffff\1\51\1\20\1\42\1\uffff\1\35\1\2"+
            "\1\uffff\1\41\1\31\1\32\1\25\1\23\1\44\1\24\1\33\1\26\1\47\11"+
            "\50\1\40\1\43\1\21\1\17\1\22\1\34\1\uffff\32\46\1\27\1\uffff"+
            "\1\30\1\37\1\46\1\uffff\1\6\1\13\1\12\1\46\1\7\1\5\2\46\1\4"+
            "\2\46\1\10\1\46\1\15\1\16\4\46\1\14\1\46\1\11\4\46\1\1\1\45"+
            "\1\3\1\36",
            "\1\52\1\uffff\1\53\125\uffff\1\54",
            "\1\55",
            "",
            "\1\61\4\uffff\1\57\7\uffff\1\60\1\62",
            "\1\64\15\uffff\1\63",
            "\1\66\4\uffff\1\65",
            "\1\67\1\uffff\1\70\11\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\14\uffff\1\76",
            "\1\100\2\uffff\1\77",
            "\1\102\5\uffff\1\101",
            "\1\103",
            "\1\104",
            "",
            "\1\107\1\106",
            "\1\111\1\112",
            "",
            "",
            "",
            "\1\114\4\uffff\1\114",
            "",
            "",
            "",
            "",
            "\12\117",
            "\1\120",
            "",
            "",
            "",
            "",
            "\0\122",
            "\0\122",
            "",
            "",
            "",
            "",
            "\1\117\1\uffff\12\50\13\uffff\1\117\37\uffff\1\117\22\uffff"+
            "\1\125",
            "\1\117\1\uffff\12\50\13\uffff\1\117\37\uffff\1\117",
            "",
            "",
            "\1\127",
            "",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\2\46\1\132\27\46",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\141",
            "\1\143\11\uffff\1\142",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\153",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\155",
            "\1\156",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\3\46\1\157\26\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\161",
            "",
            "\1\162",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\165",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\167",
            "\1\170",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\172",
            "\1\173",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0082",
            "",
            "\1\u0083",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0085",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\u0091",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0093",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0096",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009b",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TEMPLATE_COMMENT | TEMPLATE_RAW | TEMPLATE_STATEMENT_START | TEMPLATE_STATEMENT_END | TEMPLATE_PRINT_START | TEMPLATE_PRINT_END | IF | FOR | IN | AS | ELSE | ELIF | END | INCLUDE | LIMIT | VAR | CONTINUE | EXTENDS | BLOCK | TRUE | FALSE | NULL | IAND | IOR | AND | OR | NOT | ORDER | BY | TO | EQ | EQEQ | NE | LT | LTE | GT | GTE | PLUS | MINUS | MUL | DIV | MOD | LSQUARE | RSQUARE | LPAREN | RPAREN | DOT | QDOT | DOLLAR | TILDE | LSHIFT | RSHIFT | XOR | COLON | SQUOTE | DQUOTE | SEMI | COMMA | QUESTION | PIPE | ID | INT | INT_HEX | FLOAT | COMMENT | WS | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_33 = input.LA(1);

                        s = -1;
                        if ( ((LA26_33>='\u0000' && LA26_33<='\uFFFF')) ) {s = 82;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_34 = input.LA(1);

                        s = -1;
                        if ( ((LA26_34>='\u0000' && LA26_34<='\uFFFF')) ) {s = 82;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}