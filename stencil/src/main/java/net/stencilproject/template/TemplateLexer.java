// $ANTLR 3.4 /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g 2011-09-20 19:49:25
package net.stencilproject.template;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TemplateLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AND=4;
    public static final int AS=5;
    public static final int BLOCK=6;
    public static final int BY=7;
    public static final int COLON=8;
    public static final int COMMA=9;
    public static final int COMMENT=10;
    public static final int CONTINUE=11;
    public static final int DIV=12;
    public static final int DOLLAR=13;
    public static final int DOT=14;
    public static final int DQUOTE=15;
    public static final int ELIF=16;
    public static final int ELSE=17;
    public static final int END=18;
    public static final int EQ=19;
    public static final int EQEQ=20;
    public static final int ESC_SEQ=21;
    public static final int EXPONENT=22;
    public static final int EXTENDS=23;
    public static final int FALSE=24;
    public static final int FLOAT=25;
    public static final int FOR=26;
    public static final int GT=27;
    public static final int GTE=28;
    public static final int HEX_DIGIT=29;
    public static final int HEX_ESC=30;
    public static final int IAND=31;
    public static final int ID=32;
    public static final int IF=33;
    public static final int IN=34;
    public static final int INCLUDE=35;
    public static final int INT=36;
    public static final int INT_HEX=37;
    public static final int IOR=38;
    public static final int JOIN=39;
    public static final int LIMIT=40;
    public static final int LIST=41;
    public static final int LPAREN=42;
    public static final int LSHIFT=43;
    public static final int LSQUARE=44;
    public static final int LT=45;
    public static final int LTE=46;
    public static final int MINUS=47;
    public static final int MOD=48;
    public static final int MUL=49;
    public static final int NE=50;
    public static final int NOT=51;
    public static final int NULL=52;
    public static final int OR=53;
    public static final int ORDER=54;
    public static final int PIPE=55;
    public static final int PLUS=56;
    public static final int PRINT=57;
    public static final int QDOT=58;
    public static final int QUESTION=59;
    public static final int RPAREN=60;
    public static final int RSHIFT=61;
    public static final int RSQUARE=62;
    public static final int SCOPE_LOOKUP=63;
    public static final int SEMI=64;
    public static final int SQUOTE=65;
    public static final int STRING=66;
    public static final int TEMPLATE_COMMENT=67;
    public static final int TEMPLATE_LITERAL=68;
    public static final int TEMPLATE_PRINT_END=69;
    public static final int TEMPLATE_PRINT_START=70;
    public static final int TEMPLATE_RAW=71;
    public static final int TEMPLATE_STATEMENT_END=72;
    public static final int TEMPLATE_STATEMENT_START=73;
    public static final int TILDE=74;
    public static final int TO=75;
    public static final int TRUE=76;
    public static final int UNARY_MINUS=77;
    public static final int UNARY_PLUS=78;
    public static final int UNICODE_ESC=79;
    public static final int VAR=80;
    public static final int WS=81;
    public static final int XOR=82;

        boolean literalMode = true;


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TemplateLexer() {} 
    public TemplateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TemplateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g"; }

    // $ANTLR start "TEMPLATE_COMMENT"
    public final void mTEMPLATE_COMMENT() throws RecognitionException {
        try {
            int _type = TEMPLATE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:23:2: ( '{#' ( options {greedy=false; } : . )* '#}' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:23:4: '{#' ( options {greedy=false; } : . )* '#}'
            {
            match("{#"); 



            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:23:9: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='#') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='}') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1 >= '\u0000' && LA1_1 <= '|')||(LA1_1 >= '~' && LA1_1 <= '\uFFFF')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\"')||(LA1_0 >= '$' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:23:37: .
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPLATE_COMMENT"

    // $ANTLR start "TEMPLATE_RAW"
    public final void mTEMPLATE_RAW() throws RecognitionException {
        try {
            int _type = TEMPLATE_RAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:28:2: ( '{%%%' ID ( WS )+ ( options {greedy=false; } : . )* '%%%}' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:28:4: '{%%%' ID ( WS )+ ( options {greedy=false; } : . )* '%%%}'
            {
            match("{%%%"); 



            mID(); 


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:28:14: ( WS )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:28:14: WS
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


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:28:18: ( options {greedy=false; } : . )*
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
                            else if ( ((LA3_4 >= '\u0000' && LA3_4 <= '|')||(LA3_4 >= '~' && LA3_4 <= '\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_3 >= '\u0000' && LA3_3 <= '$')||(LA3_3 >= '&' && LA3_3 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '$')||(LA3_1 >= '&' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '$')||(LA3_0 >= '&' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:28:46: .
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPLATE_RAW"

    // $ANTLR start "TEMPLATE_STATEMENT_START"
    public final void mTEMPLATE_STATEMENT_START() throws RecognitionException {
        try {
            int _type = TEMPLATE_STATEMENT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:31:26: ( '{%' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:31:28: '{%'
            {
            match("{%"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPLATE_STATEMENT_START"

    // $ANTLR start "TEMPLATE_STATEMENT_END"
    public final void mTEMPLATE_STATEMENT_END() throws RecognitionException {
        try {
            int _type = TEMPLATE_STATEMENT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:32:25: ( '%}' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:32:27: '%}'
            {
            match("%}"); 



            literalMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPLATE_STATEMENT_END"

    // $ANTLR start "TEMPLATE_PRINT_START"
    public final void mTEMPLATE_PRINT_START() throws RecognitionException {
        try {
            int _type = TEMPLATE_PRINT_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:34:22: ( '{{' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:34:24: '{{'
            {
            match("{{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPLATE_PRINT_START"

    // $ANTLR start "TEMPLATE_PRINT_END"
    public final void mTEMPLATE_PRINT_END() throws RecognitionException {
        try {
            int _type = TEMPLATE_PRINT_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:35:21: ( '}}' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:35:23: '}}'
            {
            match("}}"); 



            literalMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEMPLATE_PRINT_END"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:38:5: ( 'if' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:38:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:39:6: ( 'for' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:39:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:40:5: ( 'in' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:40:8: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:41:5: ( 'as' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:41:8: 'as'
            {
            match("as"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:42:7: ( 'else' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:42:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:43:7: ( 'elif' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:43:10: 'elif'
            {
            match("elif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:44:6: ( 'end' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:44:9: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:45:9: ( 'include' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:45:12: 'include'
            {
            match("include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:46:7: ( 'limit' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:46:10: 'limit'
            {
            match("limit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:47:5: ( 'var' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:47:8: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:48:9: ( 'continue' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:48:11: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:49:9: ( 'extends' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:49:11: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "BLOCK"
    public final void mBLOCK() throws RecognitionException {
        try {
            int _type = BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:50:7: ( 'block' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:50:9: 'block'
            {
            match("block"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:51:6: ( 'join' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:51:8: 'join'
            {
            match("join"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:53:6: ( 'true' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:53:8: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:54:7: ( 'false' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:54:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:55:6: ( 'null' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:55:8: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "IAND"
    public final void mIAND() throws RecognitionException {
        try {
            int _type = IAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:57:6: ( 'iand' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:57:8: 'iand'
            {
            match("iand"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IAND"

    // $ANTLR start "IOR"
    public final void mIOR() throws RecognitionException {
        try {
            int _type = IOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:58:5: ( 'ior' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:58:7: 'ior'
            {
            match("ior"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IOR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:59:5: ( 'and' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:59:8: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:60:4: ( 'or' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:60:7: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:61:5: ( 'not' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:61:8: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:63:8: ( 'order' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:63:10: 'order'
            {
            match("order"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:64:4: ( 'by' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:64:6: 'by'
            {
            match("by"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:65:4: ( 'to' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:65:6: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:67:7: ( '=' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:67:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:68:7: ( '==' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:68:10: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:69:4: ( '!=' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:69:6: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:70:7: ( '<' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:70:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:71:5: ( '<=' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:71:7: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:72:5: ( '>' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:72:8: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:73:5: ( '>=' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:73:7: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:74:7: ( '+' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:74:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:75:7: ( '-' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:75:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:76:5: ( '*' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:76:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:77:5: ( '/' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:77:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:78:5: ( '%' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:78:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:79:9: ( '[' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:79:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:80:9: ( ']' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:80:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:81:8: ( '(' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:81:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:82:8: ( ')' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:82:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:83:6: ( '.' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:83:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "QDOT"
    public final void mQDOT() throws RecognitionException {
        try {
            int _type = QDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:84:6: ( '?.' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:84:8: '?.'
            {
            match("?."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QDOT"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:85:8: ( '$' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:85:11: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:86:7: ( '~' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:86:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "LSHIFT"
    public final void mLSHIFT() throws RecognitionException {
        try {
            int _type = LSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:87:8: ( '<<' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:87:11: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSHIFT"

    // $ANTLR start "RSHIFT"
    public final void mRSHIFT() throws RecognitionException {
        try {
            int _type = RSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:88:8: ( '>>' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:88:11: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSHIFT"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:89:5: ( '^' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:89:8: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:90:7: ( ':' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:90:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:91:8: ( '\\'' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:91:11: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:92:8: ( '\"' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:92:11: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:93:6: ( ';' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:93:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:94:7: ( ',' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:94:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:95:9: ( '?' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:95:11: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:96:6: ( '|' )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:96:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:98:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:98:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:98:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:101:5: ( ( '0' .. '9' )+ )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:101:7: ( '0' .. '9' )+
            {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:101:7: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INT_HEX"
    public final void mINT_HEX() throws RecognitionException {
        try {
            int _type = INT_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:104:9: ( '0' 'x' ( HEX_DIGIT )+ )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:104:11: '0' 'x' ( HEX_DIGIT )+
            {
            match('0'); 

            match('x'); 

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:104:19: ( HEX_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'F')||(LA6_0 >= 'a' && LA6_0 <= 'f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_HEX"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:108:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:108:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:108:9: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:108:25: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:108:37: ( EXPONENT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='E'||LA9_0=='e') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:108:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:109:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:109:13: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:109:25: ( EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:109:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:110:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:110:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:114:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:114:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:114:16: (~ ( '\\n' | '\\r' ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:114:30: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:114:30: '\\r'
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:115:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:115:16: ( options {greedy=false; } : . )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='*') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='/') ) {
                                alt16=2;
                            }
                            else if ( ((LA16_1 >= '\u0000' && LA16_1 <= '.')||(LA16_1 >= '0' && LA16_1 <= '\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0 >= '\u0000' && LA16_0 <= ')')||(LA16_0 >= '+' && LA16_0 <= '\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:115:44: .
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:118:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:118:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:126:5: ( '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' ) | ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' ) )
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
                        alt22=3;
                    }
                }
                else if ( ((LA22_1 >= '\u0000' && LA22_1 <= '!')||(LA22_1 >= '#' && LA22_1 <= '\uFFFF')) ) {
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
                        alt22=4;
                    }
                }
                else if ( ((LA22_2 >= '\u0000' && LA22_2 <= '&')||(LA22_2 >= '(' && LA22_2 <= '\uFFFF')) ) {
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:126:10: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 



                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:126:16: ( options {greedy=false; } : . )*
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
                                else if ( ((LA18_3 >= '\u0000' && LA18_3 <= '!')||(LA18_3 >= '#' && LA18_3 <= '\uFFFF')) ) {
                                    alt18=1;
                                }


                            }
                            else if ( ((LA18_1 >= '\u0000' && LA18_1 <= '!')||(LA18_1 >= '#' && LA18_1 <= '\uFFFF')) ) {
                                alt18=1;
                            }


                        }
                        else if ( ((LA18_0 >= '\u0000' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '\uFFFF')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:126:44: .
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:127:10: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 



                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:127:19: ( options {greedy=false; } : . )*
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
                                else if ( ((LA19_3 >= '\u0000' && LA19_3 <= '&')||(LA19_3 >= '(' && LA19_3 <= '\uFFFF')) ) {
                                    alt19=1;
                                }


                            }
                            else if ( ((LA19_1 >= '\u0000' && LA19_1 <= '&')||(LA19_1 >= '(' && LA19_1 <= '\uFFFF')) ) {
                                alt19=1;
                            }


                        }
                        else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '&')||(LA19_0 >= '(' && LA19_0 <= '\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:127:47: .
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:128:10: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:128:10: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:128:11: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:128:15: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0=='\\') ) {
                            alt20=1;
                        }
                        else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:128:17: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:128:27: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:129:10: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:129:10: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:129:11: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:129:16: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='\\') ) {
                            alt21=1;
                        }
                        else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:129:18: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:129:28: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:134:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:134:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:134:22: ( '+' | '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+'||LA23_0=='-') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:134:33: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:137:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:141:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | HEX_ESC | UNICODE_ESC )
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:141:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:142:9: HEX_ESC
                    {
                    mHEX_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:143:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "HEX_ESC"
    public final void mHEX_ESC() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:149:5: ( '\\\\' 'x' HEX_DIGIT HEX_DIGIT )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:149:9: '\\\\' 'x' HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('x'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:154:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:154:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:8: ( TEMPLATE_COMMENT | TEMPLATE_RAW | TEMPLATE_STATEMENT_START | TEMPLATE_STATEMENT_END | TEMPLATE_PRINT_START | TEMPLATE_PRINT_END | IF | FOR | IN | AS | ELSE | ELIF | END | INCLUDE | LIMIT | VAR | CONTINUE | EXTENDS | BLOCK | JOIN | TRUE | FALSE | NULL | IAND | IOR | AND | OR | NOT | ORDER | BY | TO | EQ | EQEQ | NE | LT | LTE | GT | GTE | PLUS | MINUS | MUL | DIV | MOD | LSQUARE | RSQUARE | LPAREN | RPAREN | DOT | QDOT | DOLLAR | TILDE | LSHIFT | RSHIFT | XOR | COLON | SQUOTE | DQUOTE | SEMI | COMMA | QUESTION | PIPE | ID | INT | INT_HEX | FLOAT | COMMENT | WS | STRING )
        int alt26=68;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:10: TEMPLATE_COMMENT
                {
                mTEMPLATE_COMMENT(); 


                }
                break;
            case 2 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:27: TEMPLATE_RAW
                {
                mTEMPLATE_RAW(); 


                }
                break;
            case 3 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:40: TEMPLATE_STATEMENT_START
                {
                mTEMPLATE_STATEMENT_START(); 


                }
                break;
            case 4 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:65: TEMPLATE_STATEMENT_END
                {
                mTEMPLATE_STATEMENT_END(); 


                }
                break;
            case 5 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:88: TEMPLATE_PRINT_START
                {
                mTEMPLATE_PRINT_START(); 


                }
                break;
            case 6 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:109: TEMPLATE_PRINT_END
                {
                mTEMPLATE_PRINT_END(); 


                }
                break;
            case 7 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:128: IF
                {
                mIF(); 


                }
                break;
            case 8 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:131: FOR
                {
                mFOR(); 


                }
                break;
            case 9 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:135: IN
                {
                mIN(); 


                }
                break;
            case 10 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:138: AS
                {
                mAS(); 


                }
                break;
            case 11 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:141: ELSE
                {
                mELSE(); 


                }
                break;
            case 12 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:146: ELIF
                {
                mELIF(); 


                }
                break;
            case 13 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:151: END
                {
                mEND(); 


                }
                break;
            case 14 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:155: INCLUDE
                {
                mINCLUDE(); 


                }
                break;
            case 15 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:163: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 16 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:169: VAR
                {
                mVAR(); 


                }
                break;
            case 17 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:173: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 18 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:182: EXTENDS
                {
                mEXTENDS(); 


                }
                break;
            case 19 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:190: BLOCK
                {
                mBLOCK(); 


                }
                break;
            case 20 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:196: JOIN
                {
                mJOIN(); 


                }
                break;
            case 21 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:201: TRUE
                {
                mTRUE(); 


                }
                break;
            case 22 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:206: FALSE
                {
                mFALSE(); 


                }
                break;
            case 23 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:212: NULL
                {
                mNULL(); 


                }
                break;
            case 24 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:217: IAND
                {
                mIAND(); 


                }
                break;
            case 25 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:222: IOR
                {
                mIOR(); 


                }
                break;
            case 26 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:226: AND
                {
                mAND(); 


                }
                break;
            case 27 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:230: OR
                {
                mOR(); 


                }
                break;
            case 28 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:233: NOT
                {
                mNOT(); 


                }
                break;
            case 29 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:237: ORDER
                {
                mORDER(); 


                }
                break;
            case 30 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:243: BY
                {
                mBY(); 


                }
                break;
            case 31 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:246: TO
                {
                mTO(); 


                }
                break;
            case 32 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:249: EQ
                {
                mEQ(); 


                }
                break;
            case 33 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:252: EQEQ
                {
                mEQEQ(); 


                }
                break;
            case 34 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:257: NE
                {
                mNE(); 


                }
                break;
            case 35 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:260: LT
                {
                mLT(); 


                }
                break;
            case 36 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:263: LTE
                {
                mLTE(); 


                }
                break;
            case 37 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:267: GT
                {
                mGT(); 


                }
                break;
            case 38 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:270: GTE
                {
                mGTE(); 


                }
                break;
            case 39 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:274: PLUS
                {
                mPLUS(); 


                }
                break;
            case 40 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:279: MINUS
                {
                mMINUS(); 


                }
                break;
            case 41 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:285: MUL
                {
                mMUL(); 


                }
                break;
            case 42 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:289: DIV
                {
                mDIV(); 


                }
                break;
            case 43 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:293: MOD
                {
                mMOD(); 


                }
                break;
            case 44 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:297: LSQUARE
                {
                mLSQUARE(); 


                }
                break;
            case 45 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:305: RSQUARE
                {
                mRSQUARE(); 


                }
                break;
            case 46 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:313: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 47 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:320: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 48 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:327: DOT
                {
                mDOT(); 


                }
                break;
            case 49 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:331: QDOT
                {
                mQDOT(); 


                }
                break;
            case 50 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:336: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 51 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:343: TILDE
                {
                mTILDE(); 


                }
                break;
            case 52 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:349: LSHIFT
                {
                mLSHIFT(); 


                }
                break;
            case 53 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:356: RSHIFT
                {
                mRSHIFT(); 


                }
                break;
            case 54 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:363: XOR
                {
                mXOR(); 


                }
                break;
            case 55 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:367: COLON
                {
                mCOLON(); 


                }
                break;
            case 56 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:373: SQUOTE
                {
                mSQUOTE(); 


                }
                break;
            case 57 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:380: DQUOTE
                {
                mDQUOTE(); 


                }
                break;
            case 58 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:387: SEMI
                {
                mSEMI(); 


                }
                break;
            case 59 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:392: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 60 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:398: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 61 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:407: PIPE
                {
                mPIPE(); 


                }
                break;
            case 62 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:412: ID
                {
                mID(); 


                }
                break;
            case 63 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:415: INT
                {
                mINT(); 


                }
                break;
            case 64 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:419: INT_HEX
                {
                mINT_HEX(); 


                }
                break;
            case 65 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:427: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 66 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:433: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 67 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:441: WS
                {
                mWS(); 


                }
                break;
            case 68 :
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:1:444: STRING
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
            return "107:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA26_eotS =
        "\2\uffff\1\57\1\uffff\14\47\1\107\1\uffff\1\112\1\115\3\uffff\1"+
        "\117\4\uffff\1\120\1\123\4\uffff\1\125\1\126\4\uffff\2\130\2\uffff"+
        "\1\132\3\uffff\1\133\1\135\4\47\1\142\10\47\1\154\2\47\1\157\2\47"+
        "\1\163\26\uffff\1\47\1\uffff\1\47\1\166\1\167\1\47\1\uffff\1\171"+
        "\2\47\1\174\2\47\1\177\2\47\1\uffff\2\47\1\uffff\1\47\1\u0085\1"+
        "\47\1\uffff\1\47\1\u0088\2\uffff\1\47\1\uffff\1\u008a\1\u008b\1"+
        "\uffff\2\47\1\uffff\2\47\1\u0090\1\u0091\1\u0092\1\uffff\2\47\1"+
        "\uffff\1\u0095\2\uffff\1\47\1\u0097\1\47\1\u0099\3\uffff\1\u009a"+
        "\1\47\1\uffff\1\47\1\uffff\1\47\2\uffff\1\u009e\1\u009f\1\47\2\uffff"+
        "\1\u00a1\1\uffff";
    static final String DFA26_eofS =
        "\u00a2\uffff";
    static final String DFA26_minS =
        "\1\11\1\43\1\175\1\uffff\2\141\1\156\1\154\1\151\1\141\1\157\1\154"+
        "\3\157\1\162\1\75\1\uffff\1\74\1\75\3\uffff\1\52\4\uffff\1\60\1"+
        "\56\4\uffff\2\0\4\uffff\2\56\2\uffff\1\45\3\uffff\2\60\1\156\2\162"+
        "\1\154\1\60\1\144\1\151\1\144\1\164\1\155\1\162\1\156\1\157\1\60"+
        "\1\151\1\165\1\60\1\154\1\164\1\60\26\uffff\1\154\1\uffff\1\144"+
        "\2\60\1\163\1\uffff\1\60\1\145\1\146\1\60\1\145\1\151\1\60\1\164"+
        "\1\143\1\uffff\1\156\1\145\1\uffff\1\154\1\60\1\145\1\uffff\1\165"+
        "\1\60\2\uffff\1\145\1\uffff\2\60\1\uffff\1\156\1\164\1\uffff\1\151"+
        "\1\153\3\60\1\uffff\1\162\1\144\1\uffff\1\60\2\uffff\1\144\1\60"+
        "\1\156\1\60\3\uffff\1\60\1\145\1\uffff\1\163\1\uffff\1\165\2\uffff"+
        "\2\60\1\145\2\uffff\1\60\1\uffff";
    static final String DFA26_maxS =
        "\1\176\1\173\1\175\1\uffff\2\157\1\163\1\170\1\151\1\141\1\157\1"+
        "\171\1\157\1\162\1\165\1\162\1\75\1\uffff\1\75\1\76\3\uffff\1\57"+
        "\4\uffff\1\71\1\56\4\uffff\2\uffff\4\uffff\1\170\1\145\2\uffff\1"+
        "\45\3\uffff\2\172\1\156\2\162\1\154\1\172\1\144\1\163\1\144\1\164"+
        "\1\155\1\162\1\156\1\157\1\172\1\151\1\165\1\172\1\154\1\164\1\172"+
        "\26\uffff\1\154\1\uffff\1\144\2\172\1\163\1\uffff\1\172\1\145\1"+
        "\146\1\172\1\145\1\151\1\172\1\164\1\143\1\uffff\1\156\1\145\1\uffff"+
        "\1\154\1\172\1\145\1\uffff\1\165\1\172\2\uffff\1\145\1\uffff\2\172"+
        "\1\uffff\1\156\1\164\1\uffff\1\151\1\153\3\172\1\uffff\1\162\1\144"+
        "\1\uffff\1\172\2\uffff\1\144\1\172\1\156\1\172\3\uffff\1\172\1\145"+
        "\1\uffff\1\163\1\uffff\1\165\2\uffff\2\172\1\145\2\uffff\1\172\1"+
        "\uffff";
    static final String DFA26_acceptS =
        "\3\uffff\1\6\15\uffff\1\42\2\uffff\1\47\1\50\1\51\1\uffff\1\54\1"+
        "\55\1\56\1\57\2\uffff\1\62\1\63\1\66\1\67\2\uffff\1\72\1\73\1\75"+
        "\1\76\2\uffff\1\103\1\1\1\uffff\1\5\1\4\1\53\26\uffff\1\41\1\40"+
        "\1\44\1\64\1\43\1\46\1\65\1\45\1\102\1\52\1\60\1\101\1\61\1\74\1"+
        "\104\1\70\1\71\1\100\1\77\1\2\1\3\1\7\1\uffff\1\11\4\uffff\1\12"+
        "\11\uffff\1\36\2\uffff\1\37\3\uffff\1\33\2\uffff\1\31\1\10\1\uffff"+
        "\1\32\2\uffff\1\15\2\uffff\1\20\5\uffff\1\34\2\uffff\1\30\1\uffff"+
        "\1\13\1\14\4\uffff\1\24\1\25\1\27\2\uffff\1\26\1\uffff\1\17\1\uffff"+
        "\1\23\1\35\3\uffff\1\16\1\22\1\uffff\1\21";
    static final String DFA26_specialS =
        "\42\uffff\1\0\1\1\176\uffff}>";
    static final String[] DFA26_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\21\1\43\1\uffff\1\36\1\2"+
            "\1\uffff\1\42\1\32\1\33\1\26\1\24\1\45\1\25\1\34\1\27\1\50\11"+
            "\51\1\41\1\44\1\22\1\20\1\23\1\35\1\uffff\32\47\1\30\1\uffff"+
            "\1\31\1\40\1\47\1\uffff\1\6\1\13\1\12\1\47\1\7\1\5\2\47\1\4"+
            "\1\14\1\47\1\10\1\47\1\16\1\17\4\47\1\15\1\47\1\11\4\47\1\1"+
            "\1\46\1\3\1\37",
            "\1\53\1\uffff\1\54\125\uffff\1\55",
            "\1\56",
            "",
            "\1\62\4\uffff\1\60\7\uffff\1\61\1\63",
            "\1\65\15\uffff\1\64",
            "\1\67\4\uffff\1\66",
            "\1\70\1\uffff\1\71\11\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\14\uffff\1\77",
            "\1\100",
            "\1\102\2\uffff\1\101",
            "\1\104\5\uffff\1\103",
            "\1\105",
            "\1\106",
            "",
            "\1\111\1\110",
            "\1\113\1\114",
            "",
            "",
            "",
            "\1\116\4\uffff\1\116",
            "",
            "",
            "",
            "",
            "\12\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "\0\124",
            "\0\124",
            "",
            "",
            "",
            "",
            "\1\121\1\uffff\12\51\13\uffff\1\121\37\uffff\1\121\22\uffff"+
            "\1\127",
            "\1\121\1\uffff\12\51\13\uffff\1\121\37\uffff\1\121",
            "",
            "",
            "\1\131",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\134\27\47",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\143",
            "\1\145\11\uffff\1\144",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\155",
            "\1\156",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\160",
            "\1\161",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\162\26\47",
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
            "\1\164",
            "",
            "\1\165",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\170",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\172",
            "\1\173",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\175",
            "\1\176",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u0089",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u008c",
            "\1\u008d",
            "",
            "\1\u008e",
            "\1\u008f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u0096",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0098",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00a0",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
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
            return "1:1: Tokens : ( TEMPLATE_COMMENT | TEMPLATE_RAW | TEMPLATE_STATEMENT_START | TEMPLATE_STATEMENT_END | TEMPLATE_PRINT_START | TEMPLATE_PRINT_END | IF | FOR | IN | AS | ELSE | ELIF | END | INCLUDE | LIMIT | VAR | CONTINUE | EXTENDS | BLOCK | JOIN | TRUE | FALSE | NULL | IAND | IOR | AND | OR | NOT | ORDER | BY | TO | EQ | EQEQ | NE | LT | LTE | GT | GTE | PLUS | MINUS | MUL | DIV | MOD | LSQUARE | RSQUARE | LPAREN | RPAREN | DOT | QDOT | DOLLAR | TILDE | LSHIFT | RSHIFT | XOR | COLON | SQUOTE | DQUOTE | SEMI | COMMA | QUESTION | PIPE | ID | INT | INT_HEX | FLOAT | COMMENT | WS | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_34 = input.LA(1);

                        s = -1;
                        if ( ((LA26_34 >= '\u0000' && LA26_34 <= '\uFFFF')) ) {s = 84;}

                        else s = 85;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA26_35 = input.LA(1);

                        s = -1;
                        if ( ((LA26_35 >= '\u0000' && LA26_35 <= '\uFFFF')) ) {s = 84;}

                        else s = 86;

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