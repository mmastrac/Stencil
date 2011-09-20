// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g 2010-12-06 14:34:39
package net.stencilproject.template;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class TemplateParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SCOPE_LOOKUP", "LIST", "TEMPLATE_LITERAL", "PRINT", "UNARY_PLUS", "UNARY_MINUS", "TEMPLATE_COMMENT", "ID", "WS", "TEMPLATE_RAW", "TEMPLATE_STATEMENT_START", "TEMPLATE_STATEMENT_END", "TEMPLATE_PRINT_START", "TEMPLATE_PRINT_END", "IF", "FOR", "IN", "AS", "ELSE", "ELIF", "END", "INCLUDE", "LIMIT", "VAR", "CONTINUE", "EXTENDS", "BLOCK", "TRUE", "FALSE", "NULL", "IAND", "IOR", "AND", "OR", "NOT", "ORDER", "BY", "TO", "EQ", "EQEQ", "NE", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "DOT", "QDOT", "DOLLAR", "TILDE", "LSHIFT", "RSHIFT", "XOR", "COLON", "SQUOTE", "DQUOTE", "SEMI", "COMMA", "QUESTION", "PIPE", "INT", "HEX_DIGIT", "INT_HEX", "EXPONENT", "FLOAT", "COMMENT", "ESC_SEQ", "STRING", "HEX_ESC", "UNICODE_ESC"
    };
    public static final int DOLLAR=60;
    public static final int EXPONENT=75;
    public static final int LT=45;
    public static final int LSQUARE=54;
    public static final int ORDER=39;
    public static final int MOD=53;
    public static final int LIMIT=26;
    public static final int GTE=48;
    public static final int TEMPLATE_PRINT_END=17;
    public static final int DQUOTE=67;
    public static final int FOR=19;
    public static final int FLOAT=76;
    public static final int TEMPLATE_PRINT_START=16;
    public static final int SCOPE_LOOKUP=4;
    public static final int NOT=38;
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
    public static final int XOR=64;
    public static final int TEMPLATE_COMMENT=10;
    public static final int TO=41;
    public static final int LSHIFT=62;
    public static final int UNICODE_ESC=81;
    public static final int NULL=33;
    public static final int ELSE=22;
    public static final int HEX_DIGIT=73;
    public static final int UNARY_MINUS=9;
    public static final int INT=72;
    public static final int TEMPLATE_STATEMENT_START=14;
    public static final int SQUOTE=66;
    public static final int RSQUARE=55;
    public static final int MINUS=50;
    public static final int LIST=5;
    public static final int SEMI=68;
    public static final int MUL=51;
    public static final int TRUE=31;
    public static final int PRINT=7;
    public static final int IAND=34;
    public static final int COLON=65;
    public static final int HEX_ESC=80;
    public static final int ELIF=23;
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
    public static final int TEMPLATE_STATEMENT_END=15;
    public static final int EXTENDS=29;
    public static final int STRING=79;

    // delegates
    // delegators


        public TemplateParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TemplateParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return TemplateParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g"; }


    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:155:1: string : STRING ;
    public final TemplateParser.string_return string() throws RecognitionException {
        TemplateParser.string_return retval = new TemplateParser.string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING1=null;

        Object STRING1_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:156:2: ( STRING )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:156:4: STRING
            {
            root_0 = (Object)adaptor.nil();

            STRING1=(Token)match(input,STRING,FOLLOW_STRING_in_string1198); 
            STRING1_tree = new StringNode(STRING1) ;
            adaptor.addChild(root_0, STRING1_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    public static class template_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template_literal"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:159:1: template_literal : TEMPLATE_LITERAL ;
    public final TemplateParser.template_literal_return template_literal() throws RecognitionException {
        TemplateParser.template_literal_return retval = new TemplateParser.template_literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEMPLATE_LITERAL2=null;

        Object TEMPLATE_LITERAL2_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:160:2: ( TEMPLATE_LITERAL )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:160:4: TEMPLATE_LITERAL
            {
            root_0 = (Object)adaptor.nil();

            TEMPLATE_LITERAL2=(Token)match(input,TEMPLATE_LITERAL,FOLLOW_TEMPLATE_LITERAL_in_template_literal1212); 
            TEMPLATE_LITERAL2_tree = new TemplateLiteralNode(TEMPLATE_LITERAL2) ;
            adaptor.addChild(root_0, TEMPLATE_LITERAL2_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template_literal"

    public static class template_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:163:1: template_statement : TEMPLATE_STATEMENT_START statements TEMPLATE_STATEMENT_END ;
    public final TemplateParser.template_statement_return template_statement() throws RecognitionException {
        TemplateParser.template_statement_return retval = new TemplateParser.template_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEMPLATE_STATEMENT_START3=null;
        Token TEMPLATE_STATEMENT_END5=null;
        TemplateParser.statements_return statements4 = null;


        Object TEMPLATE_STATEMENT_START3_tree=null;
        Object TEMPLATE_STATEMENT_END5_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:164:2: ( TEMPLATE_STATEMENT_START statements TEMPLATE_STATEMENT_END )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:164:4: TEMPLATE_STATEMENT_START statements TEMPLATE_STATEMENT_END
            {
            root_0 = (Object)adaptor.nil();

            TEMPLATE_STATEMENT_START3=(Token)match(input,TEMPLATE_STATEMENT_START,FOLLOW_TEMPLATE_STATEMENT_START_in_template_statement1226); 
            TEMPLATE_STATEMENT_START3_tree = (Object)adaptor.create(TEMPLATE_STATEMENT_START3);
            root_0 = (Object)adaptor.becomeRoot(TEMPLATE_STATEMENT_START3_tree, root_0);

            pushFollow(FOLLOW_statements_in_template_statement1229);
            statements4=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements4.getTree());
            TEMPLATE_STATEMENT_END5=(Token)match(input,TEMPLATE_STATEMENT_END,FOLLOW_TEMPLATE_STATEMENT_END_in_template_statement1231); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template_statement"

    public static class template_print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template_print"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:167:1: template_print : TEMPLATE_PRINT_START expression ( COMMA expression )* TEMPLATE_PRINT_END ;
    public final TemplateParser.template_print_return template_print() throws RecognitionException {
        TemplateParser.template_print_return retval = new TemplateParser.template_print_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEMPLATE_PRINT_START6=null;
        Token COMMA8=null;
        Token TEMPLATE_PRINT_END10=null;
        TemplateParser.expression_return expression7 = null;

        TemplateParser.expression_return expression9 = null;


        Object TEMPLATE_PRINT_START6_tree=null;
        Object COMMA8_tree=null;
        Object TEMPLATE_PRINT_END10_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:168:2: ( TEMPLATE_PRINT_START expression ( COMMA expression )* TEMPLATE_PRINT_END )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:168:4: TEMPLATE_PRINT_START expression ( COMMA expression )* TEMPLATE_PRINT_END
            {
            root_0 = (Object)adaptor.nil();

            TEMPLATE_PRINT_START6=(Token)match(input,TEMPLATE_PRINT_START,FOLLOW_TEMPLATE_PRINT_START_in_template_print1243); 
            TEMPLATE_PRINT_START6_tree = (Object)adaptor.create(TEMPLATE_PRINT_START6);
            root_0 = (Object)adaptor.becomeRoot(TEMPLATE_PRINT_START6_tree, root_0);

            pushFollow(FOLLOW_expression_in_template_print1246);
            expression7=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression7.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:168:37: ( COMMA expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:168:38: COMMA expression
            	    {
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_template_print1249); 
            	    pushFollow(FOLLOW_expression_in_template_print1252);
            	    expression9=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression9.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            TEMPLATE_PRINT_END10=(Token)match(input,TEMPLATE_PRINT_END,FOLLOW_TEMPLATE_PRINT_END_in_template_print1256); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template_print"

    public static class template_comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template_comment"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:171:1: template_comment : TEMPLATE_COMMENT ;
    public final TemplateParser.template_comment_return template_comment() throws RecognitionException {
        TemplateParser.template_comment_return retval = new TemplateParser.template_comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEMPLATE_COMMENT11=null;

        Object TEMPLATE_COMMENT11_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:172:2: ( TEMPLATE_COMMENT )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:172:4: TEMPLATE_COMMENT
            {
            root_0 = (Object)adaptor.nil();

            TEMPLATE_COMMENT11=(Token)match(input,TEMPLATE_COMMENT,FOLLOW_TEMPLATE_COMMENT_in_template_comment1269); 
            TEMPLATE_COMMENT11_tree = (Object)adaptor.create(TEMPLATE_COMMENT11);
            adaptor.addChild(root_0, TEMPLATE_COMMENT11_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template_comment"

    public static class template_raw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template_raw"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:175:1: template_raw : TEMPLATE_RAW ;
    public final TemplateParser.template_raw_return template_raw() throws RecognitionException {
        TemplateParser.template_raw_return retval = new TemplateParser.template_raw_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TEMPLATE_RAW12=null;

        Object TEMPLATE_RAW12_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:176:2: ( TEMPLATE_RAW )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:176:4: TEMPLATE_RAW
            {
            root_0 = (Object)adaptor.nil();

            TEMPLATE_RAW12=(Token)match(input,TEMPLATE_RAW,FOLLOW_TEMPLATE_RAW_in_template_raw1281); 
            TEMPLATE_RAW12_tree = new TemplateRawNode(TEMPLATE_RAW12) ;
            adaptor.addChild(root_0, TEMPLATE_RAW12_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template_raw"

    public static class template_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:179:1: template : ( template_literal | template_statement | template_comment | template_raw | template_print )* EOF ;
    public final TemplateParser.template_return template() throws RecognitionException {
        TemplateParser.template_return retval = new TemplateParser.template_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF18=null;
        TemplateParser.template_literal_return template_literal13 = null;

        TemplateParser.template_statement_return template_statement14 = null;

        TemplateParser.template_comment_return template_comment15 = null;

        TemplateParser.template_raw_return template_raw16 = null;

        TemplateParser.template_print_return template_print17 = null;


        Object EOF18_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:180:2: ( ( template_literal | template_statement | template_comment | template_raw | template_print )* EOF )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:180:4: ( template_literal | template_statement | template_comment | template_raw | template_print )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:180:4: ( template_literal | template_statement | template_comment | template_raw | template_print )*
            loop2:
            do {
                int alt2=6;
                switch ( input.LA(1) ) {
                case TEMPLATE_LITERAL:
                    {
                    alt2=1;
                    }
                    break;
                case TEMPLATE_STATEMENT_START:
                    {
                    alt2=2;
                    }
                    break;
                case TEMPLATE_COMMENT:
                    {
                    alt2=3;
                    }
                    break;
                case TEMPLATE_RAW:
                    {
                    alt2=4;
                    }
                    break;
                case TEMPLATE_PRINT_START:
                    {
                    alt2=5;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:180:5: template_literal
            	    {
            	    pushFollow(FOLLOW_template_literal_in_template1296);
            	    template_literal13=template_literal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_literal13.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:181:4: template_statement
            	    {
            	    pushFollow(FOLLOW_template_statement_in_template1301);
            	    template_statement14=template_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_statement14.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:182:4: template_comment
            	    {
            	    pushFollow(FOLLOW_template_comment_in_template1306);
            	    template_comment15=template_comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_comment15.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:183:4: template_raw
            	    {
            	    pushFollow(FOLLOW_template_raw_in_template1311);
            	    template_raw16=template_raw();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_raw16.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:184:4: template_print
            	    {
            	    pushFollow(FOLLOW_template_print_in_template1316);
            	    template_print17=template_print();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_print17.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF18=(Token)match(input,EOF,FOLLOW_EOF_in_template1322); 
            EOF18_tree = (Object)adaptor.create(EOF18);
            adaptor.addChild(root_0, EOF18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template"

    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statements"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:187:1: statements : ( statement ( SEMI ( statements )? )? | blocked_statement ( COLON ( statements )? )? );
    public final TemplateParser.statements_return statements() throws RecognitionException {
        TemplateParser.statements_return retval = new TemplateParser.statements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMI20=null;
        Token COLON23=null;
        TemplateParser.statement_return statement19 = null;

        TemplateParser.statements_return statements21 = null;

        TemplateParser.blocked_statement_return blocked_statement22 = null;

        TemplateParser.statements_return statements24 = null;


        Object SEMI20_tree=null;
        Object COLON23_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:188:2: ( statement ( SEMI ( statements )? )? | blocked_statement ( COLON ( statements )? )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||(LA7_0>=END && LA7_0<=INCLUDE)||(LA7_0>=VAR && LA7_0<=EXTENDS)||(LA7_0>=TRUE && LA7_0<=NULL)||LA7_0==NOT||LA7_0==EQ||(LA7_0>=PLUS && LA7_0<=MINUS)||LA7_0==LSQUARE||LA7_0==LPAREN||LA7_0==TILDE||LA7_0==INT||LA7_0==INT_HEX||LA7_0==FLOAT||LA7_0==STRING) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=IF && LA7_0<=FOR)||(LA7_0>=ELSE && LA7_0<=ELIF)||LA7_0==BLOCK) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:188:4: statement ( SEMI ( statements )? )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_statements1331);
                    statement19=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement19.getTree());
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:188:14: ( SEMI ( statements )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==SEMI) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:188:15: SEMI ( statements )?
                            {
                            SEMI20=(Token)match(input,SEMI,FOLLOW_SEMI_in_statements1334); 
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:188:21: ( statements )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==ID||(LA3_0>=IF && LA3_0<=FOR)||(LA3_0>=ELSE && LA3_0<=INCLUDE)||(LA3_0>=VAR && LA3_0<=NULL)||LA3_0==NOT||LA3_0==EQ||(LA3_0>=PLUS && LA3_0<=MINUS)||LA3_0==LSQUARE||LA3_0==LPAREN||LA3_0==TILDE||LA3_0==INT||LA3_0==INT_HEX||LA3_0==FLOAT||LA3_0==STRING) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:188:21: statements
                                    {
                                    pushFollow(FOLLOW_statements_in_statements1337);
                                    statements21=statements();

                                    state._fsp--;

                                    adaptor.addChild(root_0, statements21.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:189:4: blocked_statement ( COLON ( statements )? )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blocked_statement_in_statements1345);
                    blocked_statement22=blocked_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, blocked_statement22.getTree());
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:189:22: ( COLON ( statements )? )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COLON) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:189:23: COLON ( statements )?
                            {
                            COLON23=(Token)match(input,COLON,FOLLOW_COLON_in_statements1348); 
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:189:30: ( statements )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==ID||(LA5_0>=IF && LA5_0<=FOR)||(LA5_0>=ELSE && LA5_0<=INCLUDE)||(LA5_0>=VAR && LA5_0<=NULL)||LA5_0==NOT||LA5_0==EQ||(LA5_0>=PLUS && LA5_0<=MINUS)||LA5_0==LSQUARE||LA5_0==LPAREN||LA5_0==TILDE||LA5_0==INT||LA5_0==INT_HEX||LA5_0==FLOAT||LA5_0==STRING) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:189:30: statements
                                    {
                                    pushFollow(FOLLOW_statements_in_statements1351);
                                    statements24=statements();

                                    state._fsp--;

                                    adaptor.addChild(root_0, statements24.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statements"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:191:1: statement : ( extends_statement | include_statement | var_statement | continue_statement | end_statement | print_statement | assignment_statement );
    public final TemplateParser.statement_return statement() throws RecognitionException {
        TemplateParser.statement_return retval = new TemplateParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TemplateParser.extends_statement_return extends_statement25 = null;

        TemplateParser.include_statement_return include_statement26 = null;

        TemplateParser.var_statement_return var_statement27 = null;

        TemplateParser.continue_statement_return continue_statement28 = null;

        TemplateParser.end_statement_return end_statement29 = null;

        TemplateParser.print_statement_return print_statement30 = null;

        TemplateParser.assignment_statement_return assignment_statement31 = null;



        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:2: ( extends_statement | include_statement | var_statement | continue_statement | end_statement | print_statement | assignment_statement )
            int alt8=7;
            switch ( input.LA(1) ) {
            case EXTENDS:
                {
                alt8=1;
                }
                break;
            case INCLUDE:
                {
                alt8=2;
                }
                break;
            case VAR:
                {
                alt8=3;
                }
                break;
            case CONTINUE:
                {
                alt8=4;
                }
                break;
            case END:
                {
                alt8=5;
                }
                break;
            case EQ:
                {
                alt8=6;
                }
                break;
            case ID:
            case TRUE:
            case FALSE:
            case NULL:
            case NOT:
            case PLUS:
            case MINUS:
            case LSQUARE:
            case LPAREN:
            case TILDE:
            case INT:
            case INT_HEX:
            case FLOAT:
            case STRING:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:4: extends_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_extends_statement_in_statement1364);
                    extends_statement25=extends_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, extends_statement25.getTree());

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:24: include_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_include_statement_in_statement1368);
                    include_statement26=include_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, include_statement26.getTree());

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:44: var_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_var_statement_in_statement1372);
                    var_statement27=var_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, var_statement27.getTree());

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:60: continue_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continue_statement_in_statement1376);
                    continue_statement28=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement28.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:81: end_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_end_statement_in_statement1380);
                    end_statement29=end_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, end_statement29.getTree());

                    }
                    break;
                case 6 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:97: print_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_print_statement_in_statement1384);
                    print_statement30=print_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, print_statement30.getTree());

                    }
                    break;
                case 7 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:192:115: assignment_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_statement_in_statement1388);
                    assignment_statement31=assignment_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_statement31.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class blocked_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blocked_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:194:1: blocked_statement : ( if_statement | elif_statement | for_statement | else_statement | block_statement );
    public final TemplateParser.blocked_statement_return blocked_statement() throws RecognitionException {
        TemplateParser.blocked_statement_return retval = new TemplateParser.blocked_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TemplateParser.if_statement_return if_statement32 = null;

        TemplateParser.elif_statement_return elif_statement33 = null;

        TemplateParser.for_statement_return for_statement34 = null;

        TemplateParser.else_statement_return else_statement35 = null;

        TemplateParser.block_statement_return block_statement36 = null;



        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:195:2: ( if_statement | elif_statement | for_statement | else_statement | block_statement )
            int alt9=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                alt9=1;
                }
                break;
            case ELIF:
                {
                alt9=2;
                }
                break;
            case FOR:
                {
                alt9=3;
                }
                break;
            case ELSE:
                {
                alt9=4;
                }
                break;
            case BLOCK:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:195:4: if_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_blocked_statement1397);
                    if_statement32=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement32.getTree());

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:195:19: elif_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_elif_statement_in_blocked_statement1401);
                    elif_statement33=elif_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, elif_statement33.getTree());

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:195:36: for_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_for_statement_in_blocked_statement1405);
                    for_statement34=for_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_statement34.getTree());

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:195:52: else_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_else_statement_in_blocked_statement1409);
                    else_statement35=else_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, else_statement35.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:195:69: block_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_block_statement_in_blocked_statement1413);
                    block_statement36=block_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, block_statement36.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blocked_statement"

    public static class assignment_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:197:1: assignment_statement : assignment_expression ;
    public final TemplateParser.assignment_statement_return assignment_statement() throws RecognitionException {
        TemplateParser.assignment_statement_return retval = new TemplateParser.assignment_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TemplateParser.assignment_expression_return assignment_expression37 = null;



        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:198:2: ( assignment_expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:198:4: assignment_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1422);
            assignment_expression37=assignment_expression();

            state._fsp--;

            adaptor.addChild(root_0, assignment_expression37.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_statement"

    public static class print_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:200:1: print_statement : EQ expression ( COMMA expression )* -> ^( PRINT ( expression )+ ) ;
    public final TemplateParser.print_statement_return print_statement() throws RecognitionException {
        TemplateParser.print_statement_return retval = new TemplateParser.print_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQ38=null;
        Token COMMA40=null;
        TemplateParser.expression_return expression39 = null;

        TemplateParser.expression_return expression41 = null;


        Object EQ38_tree=null;
        Object COMMA40_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:201:2: ( EQ expression ( COMMA expression )* -> ^( PRINT ( expression )+ ) )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:201:4: EQ expression ( COMMA expression )*
            {
            EQ38=(Token)match(input,EQ,FOLLOW_EQ_in_print_statement1431);  
            stream_EQ.add(EQ38);

            pushFollow(FOLLOW_expression_in_print_statement1433);
            expression39=expression();

            state._fsp--;

            stream_expression.add(expression39.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:201:18: ( COMMA expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:201:19: COMMA expression
            	    {
            	    COMMA40=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1436);  
            	    stream_COMMA.add(COMMA40);

            	    pushFollow(FOLLOW_expression_in_print_statement1438);
            	    expression41=expression();

            	    state._fsp--;

            	    stream_expression.add(expression41.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 201:38: -> ^( PRINT ( expression )+ )
            {
                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:201:41: ^( PRINT ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PRINT, "PRINT"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_statement"

    public static class var_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:203:1: var_statement : VAR ID ( EQ expression )? ;
    public final TemplateParser.var_statement_return var_statement() throws RecognitionException {
        TemplateParser.var_statement_return retval = new TemplateParser.var_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR42=null;
        Token ID43=null;
        Token EQ44=null;
        TemplateParser.expression_return expression45 = null;


        Object VAR42_tree=null;
        Object ID43_tree=null;
        Object EQ44_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:204:2: ( VAR ID ( EQ expression )? )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:204:4: VAR ID ( EQ expression )?
            {
            root_0 = (Object)adaptor.nil();

            VAR42=(Token)match(input,VAR,FOLLOW_VAR_in_var_statement1458); 
            VAR42_tree = (Object)adaptor.create(VAR42);
            root_0 = (Object)adaptor.becomeRoot(VAR42_tree, root_0);

            ID43=(Token)match(input,ID,FOLLOW_ID_in_var_statement1461); 
            ID43_tree = (Object)adaptor.create(ID43);
            adaptor.addChild(root_0, ID43_tree);

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:204:12: ( EQ expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EQ) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:204:13: EQ expression
                    {
                    EQ44=(Token)match(input,EQ,FOLLOW_EQ_in_var_statement1464); 
                    pushFollow(FOLLOW_expression_in_var_statement1467);
                    expression45=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression45.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_statement"

    public static class block_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:206:1: block_statement : BLOCK string ;
    public final TemplateParser.block_statement_return block_statement() throws RecognitionException {
        TemplateParser.block_statement_return retval = new TemplateParser.block_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BLOCK46=null;
        TemplateParser.string_return string47 = null;


        Object BLOCK46_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:207:2: ( BLOCK string )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:207:4: BLOCK string
            {
            root_0 = (Object)adaptor.nil();

            BLOCK46=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block_statement1478); 
            BLOCK46_tree = (Object)adaptor.create(BLOCK46);
            root_0 = (Object)adaptor.becomeRoot(BLOCK46_tree, root_0);

            pushFollow(FOLLOW_string_in_block_statement1481);
            string47=string();

            state._fsp--;

            adaptor.addChild(root_0, string47.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block_statement"

    public static class extends_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extends_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:209:1: extends_statement : EXTENDS string ;
    public final TemplateParser.extends_statement_return extends_statement() throws RecognitionException {
        TemplateParser.extends_statement_return retval = new TemplateParser.extends_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EXTENDS48=null;
        TemplateParser.string_return string49 = null;


        Object EXTENDS48_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:210:2: ( EXTENDS string )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:210:4: EXTENDS string
            {
            root_0 = (Object)adaptor.nil();

            EXTENDS48=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extends_statement1490); 
            EXTENDS48_tree = (Object)adaptor.create(EXTENDS48);
            root_0 = (Object)adaptor.becomeRoot(EXTENDS48_tree, root_0);

            pushFollow(FOLLOW_string_in_extends_statement1493);
            string49=string();

            state._fsp--;

            adaptor.addChild(root_0, string49.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extends_statement"

    public static class include_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "include_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:212:1: include_statement : INCLUDE string ;
    public final TemplateParser.include_statement_return include_statement() throws RecognitionException {
        TemplateParser.include_statement_return retval = new TemplateParser.include_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INCLUDE50=null;
        TemplateParser.string_return string51 = null;


        Object INCLUDE50_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:213:2: ( INCLUDE string )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:213:4: INCLUDE string
            {
            root_0 = (Object)adaptor.nil();

            INCLUDE50=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include_statement1502); 
            INCLUDE50_tree = (Object)adaptor.create(INCLUDE50);
            root_0 = (Object)adaptor.becomeRoot(INCLUDE50_tree, root_0);

            pushFollow(FOLLOW_string_in_include_statement1505);
            string51=string();

            state._fsp--;

            adaptor.addChild(root_0, string51.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "include_statement"

    public static class else_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:215:1: else_statement : ELSE ;
    public final TemplateParser.else_statement_return else_statement() throws RecognitionException {
        TemplateParser.else_statement_return retval = new TemplateParser.else_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELSE52=null;

        Object ELSE52_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:216:2: ( ELSE )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:216:4: ELSE
            {
            root_0 = (Object)adaptor.nil();

            ELSE52=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_statement1514); 
            ELSE52_tree = (Object)adaptor.create(ELSE52);
            adaptor.addChild(root_0, ELSE52_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_statement"

    public static class elif_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elif_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:218:1: elif_statement : ELIF expression ;
    public final TemplateParser.elif_statement_return elif_statement() throws RecognitionException {
        TemplateParser.elif_statement_return retval = new TemplateParser.elif_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ELIF53=null;
        TemplateParser.expression_return expression54 = null;


        Object ELIF53_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:219:2: ( ELIF expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:219:4: ELIF expression
            {
            root_0 = (Object)adaptor.nil();

            ELIF53=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif_statement1523); 
            ELIF53_tree = (Object)adaptor.create(ELIF53);
            root_0 = (Object)adaptor.becomeRoot(ELIF53_tree, root_0);

            pushFollow(FOLLOW_expression_in_elif_statement1526);
            expression54=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression54.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elif_statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:221:1: if_statement : IF expression ;
    public final TemplateParser.if_statement_return if_statement() throws RecognitionException {
        TemplateParser.if_statement_return retval = new TemplateParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF55=null;
        TemplateParser.expression_return expression56 = null;


        Object IF55_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:222:2: ( IF expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:222:4: IF expression
            {
            root_0 = (Object)adaptor.nil();

            IF55=(Token)match(input,IF,FOLLOW_IF_in_if_statement1535); 
            IF55_tree = (Object)adaptor.create(IF55);
            root_0 = (Object)adaptor.becomeRoot(IF55_tree, root_0);

            pushFollow(FOLLOW_expression_in_if_statement1538);
            expression56=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression56.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class for_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:224:1: for_statement : FOR ID IN expression ( ORDER BY expression )? ( LIMIT expression )? ;
    public final TemplateParser.for_statement_return for_statement() throws RecognitionException {
        TemplateParser.for_statement_return retval = new TemplateParser.for_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FOR57=null;
        Token ID58=null;
        Token IN59=null;
        Token ORDER61=null;
        Token BY62=null;
        Token LIMIT64=null;
        TemplateParser.expression_return expression60 = null;

        TemplateParser.expression_return expression63 = null;

        TemplateParser.expression_return expression65 = null;


        Object FOR57_tree=null;
        Object ID58_tree=null;
        Object IN59_tree=null;
        Object ORDER61_tree=null;
        Object BY62_tree=null;
        Object LIMIT64_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:225:2: ( FOR ID IN expression ( ORDER BY expression )? ( LIMIT expression )? )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:225:4: FOR ID IN expression ( ORDER BY expression )? ( LIMIT expression )?
            {
            root_0 = (Object)adaptor.nil();

            FOR57=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1547); 
            FOR57_tree = (Object)adaptor.create(FOR57);
            root_0 = (Object)adaptor.becomeRoot(FOR57_tree, root_0);

            ID58=(Token)match(input,ID,FOLLOW_ID_in_for_statement1550); 
            ID58_tree = (Object)adaptor.create(ID58);
            adaptor.addChild(root_0, ID58_tree);

            IN59=(Token)match(input,IN,FOLLOW_IN_in_for_statement1552); 
            pushFollow(FOLLOW_expression_in_for_statement1555);
            expression60=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression60.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:225:27: ( ORDER BY expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ORDER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:225:28: ORDER BY expression
                    {
                    ORDER61=(Token)match(input,ORDER,FOLLOW_ORDER_in_for_statement1558); 
                    ORDER61_tree = (Object)adaptor.create(ORDER61);
                    adaptor.addChild(root_0, ORDER61_tree);

                    BY62=(Token)match(input,BY,FOLLOW_BY_in_for_statement1560); 
                    pushFollow(FOLLOW_expression_in_for_statement1563);
                    expression63=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression63.getTree());

                    }
                    break;

            }

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:225:51: ( LIMIT expression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LIMIT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:225:52: LIMIT expression
                    {
                    LIMIT64=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_for_statement1568); 
                    LIMIT64_tree = (Object)adaptor.create(LIMIT64);
                    adaptor.addChild(root_0, LIMIT64_tree);

                    pushFollow(FOLLOW_expression_in_for_statement1570);
                    expression65=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression65.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class continue_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continue_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:227:1: continue_statement : CONTINUE ;
    public final TemplateParser.continue_statement_return continue_statement() throws RecognitionException {
        TemplateParser.continue_statement_return retval = new TemplateParser.continue_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONTINUE66=null;

        Object CONTINUE66_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:228:2: ( CONTINUE )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:228:4: CONTINUE
            {
            root_0 = (Object)adaptor.nil();

            CONTINUE66=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement1581); 
            CONTINUE66_tree = (Object)adaptor.create(CONTINUE66);
            adaptor.addChild(root_0, CONTINUE66_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "continue_statement"

    public static class end_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "end_statement"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:230:1: end_statement : END ;
    public final TemplateParser.end_statement_return end_statement() throws RecognitionException {
        TemplateParser.end_statement_return retval = new TemplateParser.end_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token END67=null;

        Object END67_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:231:2: ( END )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:231:4: END
            {
            root_0 = (Object)adaptor.nil();

            END67=(Token)match(input,END,FOLLOW_END_in_end_statement1590); 
            END67_tree = (Object)adaptor.create(END67);
            adaptor.addChild(root_0, END67_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "end_statement"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:233:1: list : ( ( '[' ']' ) -> ^( LIST ) | ( '[' list_expressions ']' ) -> ^( LIST list_expressions ) );
    public final TemplateParser.list_return list() throws RecognitionException {
        TemplateParser.list_return retval = new TemplateParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal68=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal72=null;
        TemplateParser.list_expressions_return list_expressions71 = null;


        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        Object char_literal70_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleSubtreeStream stream_list_expressions=new RewriteRuleSubtreeStream(adaptor,"rule list_expressions");
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:234:2: ( ( '[' ']' ) -> ^( LIST ) | ( '[' list_expressions ']' ) -> ^( LIST list_expressions ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LSQUARE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RSQUARE) ) {
                    alt14=1;
                }
                else if ( (LA14_1==ID||(LA14_1>=TRUE && LA14_1<=NULL)||LA14_1==NOT||(LA14_1>=PLUS && LA14_1<=MINUS)||LA14_1==LSQUARE||LA14_1==LPAREN||LA14_1==TILDE||LA14_1==INT||LA14_1==INT_HEX||LA14_1==FLOAT||LA14_1==STRING) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:234:4: ( '[' ']' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:234:4: ( '[' ']' )
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:234:5: '[' ']'
                    {
                    char_literal68=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_list1600);  
                    stream_LSQUARE.add(char_literal68);

                    char_literal69=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_list1602);  
                    stream_RSQUARE.add(char_literal69);


                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:14: -> ^( LIST )
                    {
                        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:234:17: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:235:4: ( '[' list_expressions ']' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:235:4: ( '[' list_expressions ']' )
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:235:5: '[' list_expressions ']'
                    {
                    char_literal70=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_list1615);  
                    stream_LSQUARE.add(char_literal70);

                    pushFollow(FOLLOW_list_expressions_in_list1617);
                    list_expressions71=list_expressions();

                    state._fsp--;

                    stream_list_expressions.add(list_expressions71.getTree());
                    char_literal72=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_list1619);  
                    stream_RSQUARE.add(char_literal72);


                    }



                    // AST REWRITE
                    // elements: list_expressions
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:31: -> ^( LIST list_expressions )
                    {
                        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:235:34: ^( LIST list_expressions )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                        adaptor.addChild(root_1, stream_list_expressions.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class list_expressions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_expressions"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:237:1: list_expressions : weakest_binding_expression ( ',' weakest_binding_expression )* ;
    public final TemplateParser.list_expressions_return list_expressions() throws RecognitionException {
        TemplateParser.list_expressions_return retval = new TemplateParser.list_expressions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal74=null;
        TemplateParser.weakest_binding_expression_return weakest_binding_expression73 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression75 = null;


        Object char_literal74_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:238:2: ( weakest_binding_expression ( ',' weakest_binding_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:238:5: weakest_binding_expression ( ',' weakest_binding_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_weakest_binding_expression_in_list_expressions1638);
            weakest_binding_expression73=weakest_binding_expression();

            state._fsp--;

            adaptor.addChild(root_0, weakest_binding_expression73.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:238:32: ( ',' weakest_binding_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:238:33: ',' weakest_binding_expression
            	    {
            	    char_literal74=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expressions1641); 
            	    pushFollow(FOLLOW_weakest_binding_expression_in_list_expressions1644);
            	    weakest_binding_expression75=weakest_binding_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, weakest_binding_expression75.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_expressions"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:243:1: atom : (id= ID -> ^( SCOPE_LOOKUP[$id] ) | constant | list | '(' expression ')' );
    public final TemplateParser.atom_return atom() throws RecognitionException {
        TemplateParser.atom_return retval = new TemplateParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id=null;
        Token char_literal78=null;
        Token char_literal80=null;
        TemplateParser.constant_return constant76 = null;

        TemplateParser.list_return list77 = null;

        TemplateParser.expression_return expression79 = null;


        Object id_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:244:2: (id= ID -> ^( SCOPE_LOOKUP[$id] ) | constant | list | '(' expression ')' )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt16=1;
                }
                break;
            case TRUE:
            case FALSE:
            case NULL:
            case INT:
            case INT_HEX:
            case FLOAT:
            case STRING:
                {
                alt16=2;
                }
                break;
            case LSQUARE:
                {
                alt16=3;
                }
                break;
            case LPAREN:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:244:4: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_atom1659);  
                    stream_ID.add(id);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:10: -> ^( SCOPE_LOOKUP[$id] )
                    {
                        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:244:13: ^( SCOPE_LOOKUP[$id] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SCOPE_LOOKUP, id), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:245:4: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_atom1671);
                    constant76=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant76.getTree());

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:246:4: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_atom1676);
                    list77=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list77.getTree());

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:247:4: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal78=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1681); 
                    pushFollow(FOLLOW_expression_in_atom1684);
                    expression79=expression();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(expression79.getTree(), root_0);
                    char_literal80=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1687); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:251:1: expression : weakest_binding_expression ;
    public final TemplateParser.expression_return expression() throws RecognitionException {
        TemplateParser.expression_return retval = new TemplateParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression81 = null;



        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:252:2: ( weakest_binding_expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:252:4: weakest_binding_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_weakest_binding_expression_in_expression1700);
            weakest_binding_expression81=weakest_binding_expression();

            state._fsp--;

            adaptor.addChild(root_0, weakest_binding_expression81.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class weakest_binding_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "weakest_binding_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:255:1: weakest_binding_expression : assignment_expression ;
    public final TemplateParser.weakest_binding_expression_return weakest_binding_expression() throws RecognitionException {
        TemplateParser.weakest_binding_expression_return retval = new TemplateParser.weakest_binding_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        TemplateParser.assignment_expression_return assignment_expression82 = null;



        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:256:2: ( assignment_expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:256:4: assignment_expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignment_expression_in_weakest_binding_expression1711);
            assignment_expression82=assignment_expression();

            state._fsp--;

            adaptor.addChild(root_0, assignment_expression82.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "weakest_binding_expression"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:259:1: assignment_expression : ( ID '=' )* in_expression ;
    public final TemplateParser.assignment_expression_return assignment_expression() throws RecognitionException {
        TemplateParser.assignment_expression_return retval = new TemplateParser.assignment_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID83=null;
        Token char_literal84=null;
        TemplateParser.in_expression_return in_expression85 = null;


        Object ID83_tree=null;
        Object char_literal84_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:260:2: ( ( ID '=' )* in_expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:260:4: ( ID '=' )* in_expression
            {
            root_0 = (Object)adaptor.nil();

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:260:4: ( ID '=' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==EQ) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:260:5: ID '='
            	    {
            	    ID83=(Token)match(input,ID,FOLLOW_ID_in_assignment_expression1723); 
            	    ID83_tree = (Object)adaptor.create(ID83);
            	    adaptor.addChild(root_0, ID83_tree);

            	    char_literal84=(Token)match(input,EQ,FOLLOW_EQ_in_assignment_expression1725); 
            	    char_literal84_tree = (Object)adaptor.create(char_literal84);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal84_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            pushFollow(FOLLOW_in_expression_in_assignment_expression1730);
            in_expression85=in_expression();

            state._fsp--;

            adaptor.addChild(root_0, in_expression85.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"

    public static class in_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:263:1: in_expression : conditional_expression ( IN conditional_expression )* ;
    public final TemplateParser.in_expression_return in_expression() throws RecognitionException {
        TemplateParser.in_expression_return retval = new TemplateParser.in_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IN87=null;
        TemplateParser.conditional_expression_return conditional_expression86 = null;

        TemplateParser.conditional_expression_return conditional_expression88 = null;


        Object IN87_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:264:2: ( conditional_expression ( IN conditional_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:264:4: conditional_expression ( IN conditional_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_conditional_expression_in_in_expression1741);
            conditional_expression86=conditional_expression();

            state._fsp--;

            adaptor.addChild(root_0, conditional_expression86.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:264:27: ( IN conditional_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IN) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:264:28: IN conditional_expression
            	    {
            	    IN87=(Token)match(input,IN,FOLLOW_IN_in_in_expression1744); 
            	    IN87_tree = (Object)adaptor.create(IN87);
            	    root_0 = (Object)adaptor.becomeRoot(IN87_tree, root_0);

            	    pushFollow(FOLLOW_conditional_expression_in_in_expression1747);
            	    conditional_expression88=conditional_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditional_expression88.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "in_expression"

    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:267:1: conditional_expression : range_expression ( '?' weakest_binding_expression ':' weakest_binding_expression )? ;
    public final TemplateParser.conditional_expression_return conditional_expression() throws RecognitionException {
        TemplateParser.conditional_expression_return retval = new TemplateParser.conditional_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal90=null;
        Token char_literal92=null;
        TemplateParser.range_expression_return range_expression89 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression91 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression93 = null;


        Object char_literal90_tree=null;
        Object char_literal92_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:268:2: ( range_expression ( '?' weakest_binding_expression ':' weakest_binding_expression )? )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:268:4: range_expression ( '?' weakest_binding_expression ':' weakest_binding_expression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_range_expression_in_conditional_expression1760);
            range_expression89=range_expression();

            state._fsp--;

            adaptor.addChild(root_0, range_expression89.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:268:21: ( '?' weakest_binding_expression ':' weakest_binding_expression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==QUESTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:268:22: '?' weakest_binding_expression ':' weakest_binding_expression
                    {
                    char_literal90=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditional_expression1763); 
                    char_literal90_tree = (Object)adaptor.create(char_literal90);
                    root_0 = (Object)adaptor.becomeRoot(char_literal90_tree, root_0);

                    pushFollow(FOLLOW_weakest_binding_expression_in_conditional_expression1766);
                    weakest_binding_expression91=weakest_binding_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, weakest_binding_expression91.getTree());
                    char_literal92=(Token)match(input,COLON,FOLLOW_COLON_in_conditional_expression1768); 
                    pushFollow(FOLLOW_weakest_binding_expression_in_conditional_expression1771);
                    weakest_binding_expression93=weakest_binding_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, weakest_binding_expression93.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"

    public static class range_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:271:1: range_expression : bitwise_or_expression ( TO weakest_binding_expression ( BY weakest_binding_expression )? )? ;
    public final TemplateParser.range_expression_return range_expression() throws RecognitionException {
        TemplateParser.range_expression_return retval = new TemplateParser.range_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TO95=null;
        Token BY97=null;
        TemplateParser.bitwise_or_expression_return bitwise_or_expression94 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression96 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression98 = null;


        Object TO95_tree=null;
        Object BY97_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:272:2: ( bitwise_or_expression ( TO weakest_binding_expression ( BY weakest_binding_expression )? )? )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:272:4: bitwise_or_expression ( TO weakest_binding_expression ( BY weakest_binding_expression )? )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwise_or_expression_in_range_expression1784);
            bitwise_or_expression94=bitwise_or_expression();

            state._fsp--;

            adaptor.addChild(root_0, bitwise_or_expression94.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:272:26: ( TO weakest_binding_expression ( BY weakest_binding_expression )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==TO) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:272:27: TO weakest_binding_expression ( BY weakest_binding_expression )?
                    {
                    TO95=(Token)match(input,TO,FOLLOW_TO_in_range_expression1787); 
                    TO95_tree = (Object)adaptor.create(TO95);
                    root_0 = (Object)adaptor.becomeRoot(TO95_tree, root_0);

                    pushFollow(FOLLOW_weakest_binding_expression_in_range_expression1790);
                    weakest_binding_expression96=weakest_binding_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, weakest_binding_expression96.getTree());
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:272:58: ( BY weakest_binding_expression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BY) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:272:59: BY weakest_binding_expression
                            {
                            BY97=(Token)match(input,BY,FOLLOW_BY_in_range_expression1793); 
                            pushFollow(FOLLOW_weakest_binding_expression_in_range_expression1796);
                            weakest_binding_expression98=weakest_binding_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, weakest_binding_expression98.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "range_expression"

    public static class bitwise_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_or_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:275:1: bitwise_or_expression : bitwise_and_expression ( IOR bitwise_and_expression )* ;
    public final TemplateParser.bitwise_or_expression_return bitwise_or_expression() throws RecognitionException {
        TemplateParser.bitwise_or_expression_return retval = new TemplateParser.bitwise_or_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IOR100=null;
        TemplateParser.bitwise_and_expression_return bitwise_and_expression99 = null;

        TemplateParser.bitwise_and_expression_return bitwise_and_expression101 = null;


        Object IOR100_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:276:2: ( bitwise_and_expression ( IOR bitwise_and_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:276:4: bitwise_and_expression ( IOR bitwise_and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_bitwise_and_expression_in_bitwise_or_expression1811);
            bitwise_and_expression99=bitwise_and_expression();

            state._fsp--;

            adaptor.addChild(root_0, bitwise_and_expression99.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:276:27: ( IOR bitwise_and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==IOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:276:28: IOR bitwise_and_expression
            	    {
            	    IOR100=(Token)match(input,IOR,FOLLOW_IOR_in_bitwise_or_expression1814); 
            	    IOR100_tree = (Object)adaptor.create(IOR100);
            	    root_0 = (Object)adaptor.becomeRoot(IOR100_tree, root_0);

            	    pushFollow(FOLLOW_bitwise_and_expression_in_bitwise_or_expression1817);
            	    bitwise_and_expression101=bitwise_and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwise_and_expression101.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwise_or_expression"

    public static class bitwise_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_and_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:279:1: bitwise_and_expression : logical_or_expression ( IAND logical_or_expression )* ;
    public final TemplateParser.bitwise_and_expression_return bitwise_and_expression() throws RecognitionException {
        TemplateParser.bitwise_and_expression_return retval = new TemplateParser.bitwise_and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IAND103=null;
        TemplateParser.logical_or_expression_return logical_or_expression102 = null;

        TemplateParser.logical_or_expression_return logical_or_expression104 = null;


        Object IAND103_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:280:2: ( logical_or_expression ( IAND logical_or_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:280:4: logical_or_expression ( IAND logical_or_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logical_or_expression_in_bitwise_and_expression1830);
            logical_or_expression102=logical_or_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_or_expression102.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:280:26: ( IAND logical_or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==IAND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:280:27: IAND logical_or_expression
            	    {
            	    IAND103=(Token)match(input,IAND,FOLLOW_IAND_in_bitwise_and_expression1833); 
            	    IAND103_tree = (Object)adaptor.create(IAND103);
            	    root_0 = (Object)adaptor.becomeRoot(IAND103_tree, root_0);

            	    pushFollow(FOLLOW_logical_or_expression_in_bitwise_and_expression1836);
            	    logical_or_expression104=logical_or_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_or_expression104.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwise_and_expression"

    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:283:1: logical_or_expression : logical_xor_expression ( OR logical_xor_expression )* ;
    public final TemplateParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        TemplateParser.logical_or_expression_return retval = new TemplateParser.logical_or_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR106=null;
        TemplateParser.logical_xor_expression_return logical_xor_expression105 = null;

        TemplateParser.logical_xor_expression_return logical_xor_expression107 = null;


        Object OR106_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:284:2: ( logical_xor_expression ( OR logical_xor_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:284:4: logical_xor_expression ( OR logical_xor_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logical_xor_expression_in_logical_or_expression1849);
            logical_xor_expression105=logical_xor_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_xor_expression105.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:284:27: ( OR logical_xor_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:284:28: OR logical_xor_expression
            	    {
            	    OR106=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression1852); 
            	    OR106_tree = (Object)adaptor.create(OR106);
            	    root_0 = (Object)adaptor.becomeRoot(OR106_tree, root_0);

            	    pushFollow(FOLLOW_logical_xor_expression_in_logical_or_expression1855);
            	    logical_xor_expression107=logical_xor_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_xor_expression107.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"

    public static class logical_xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_xor_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:287:1: logical_xor_expression : logical_and_expression ( '^' logical_and_expression )* ;
    public final TemplateParser.logical_xor_expression_return logical_xor_expression() throws RecognitionException {
        TemplateParser.logical_xor_expression_return retval = new TemplateParser.logical_xor_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal109=null;
        TemplateParser.logical_and_expression_return logical_and_expression108 = null;

        TemplateParser.logical_and_expression_return logical_and_expression110 = null;


        Object char_literal109_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:288:2: ( logical_and_expression ( '^' logical_and_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:288:4: logical_and_expression ( '^' logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expression_in_logical_xor_expression1868);
            logical_and_expression108=logical_and_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_and_expression108.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:288:27: ( '^' logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==XOR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:288:28: '^' logical_and_expression
            	    {
            	    char_literal109=(Token)match(input,XOR,FOLLOW_XOR_in_logical_xor_expression1871); 
            	    char_literal109_tree = (Object)adaptor.create(char_literal109);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal109_tree, root_0);

            	    pushFollow(FOLLOW_logical_and_expression_in_logical_xor_expression1874);
            	    logical_and_expression110=logical_and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_and_expression110.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_xor_expression"

    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:291:1: logical_and_expression : equality_expression ( AND equality_expression )* ;
    public final TemplateParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        TemplateParser.logical_and_expression_return retval = new TemplateParser.logical_and_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND112=null;
        TemplateParser.equality_expression_return equality_expression111 = null;

        TemplateParser.equality_expression_return equality_expression113 = null;


        Object AND112_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:292:2: ( equality_expression ( AND equality_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:292:4: equality_expression ( AND equality_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equality_expression_in_logical_and_expression1888);
            equality_expression111=equality_expression();

            state._fsp--;

            adaptor.addChild(root_0, equality_expression111.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:292:24: ( AND equality_expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:292:25: AND equality_expression
            	    {
            	    AND112=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression1891); 
            	    AND112_tree = (Object)adaptor.create(AND112);
            	    root_0 = (Object)adaptor.becomeRoot(AND112_tree, root_0);

            	    pushFollow(FOLLOW_equality_expression_in_logical_and_expression1894);
            	    equality_expression113=equality_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equality_expression113.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"

    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:295:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
    public final TemplateParser.equality_expression_return equality_expression() throws RecognitionException {
        TemplateParser.equality_expression_return retval = new TemplateParser.equality_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal115=null;
        Token string_literal116=null;
        TemplateParser.relational_expression_return relational_expression114 = null;

        TemplateParser.relational_expression_return relational_expression117 = null;


        Object string_literal115_tree=null;
        Object string_literal116_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:4: relational_expression ( ( '==' | '!=' ) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_equality_expression1907);
            relational_expression114=relational_expression();

            state._fsp--;

            adaptor.addChild(root_0, relational_expression114.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:26: ( ( '==' | '!=' ) relational_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=EQEQ && LA28_0<=NE)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:27: ( '==' | '!=' ) relational_expression
            	    {
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:27: ( '==' | '!=' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==EQEQ) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==NE) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:28: '=='
            	            {
            	            string_literal115=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_equality_expression1911); 
            	            string_literal115_tree = (Object)adaptor.create(string_literal115);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal115_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:296:34: '!='
            	            {
            	            string_literal116=(Token)match(input,NE,FOLLOW_NE_in_equality_expression1914); 
            	            string_literal116_tree = (Object)adaptor.create(string_literal116);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal116_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1918);
            	    relational_expression117=relational_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_expression117.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equality_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:299:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
    public final TemplateParser.relational_expression_return relational_expression() throws RecognitionException {
        TemplateParser.relational_expression_return retval = new TemplateParser.relational_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal119=null;
        Token char_literal120=null;
        Token string_literal121=null;
        Token string_literal122=null;
        TemplateParser.shift_expression_return shift_expression118 = null;

        TemplateParser.shift_expression_return shift_expression123 = null;


        Object char_literal119_tree=null;
        Object char_literal120_tree=null;
        Object string_literal121_tree=null;
        Object string_literal122_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:2: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:4: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_shift_expression_in_relational_expression1931);
            shift_expression118=shift_expression();

            state._fsp--;

            adaptor.addChild(root_0, shift_expression118.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:21: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=LT && LA30_0<=GTE)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:22: ( '<' | '>' | '<=' | '>=' ) shift_expression
            	    {
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:22: ( '<' | '>' | '<=' | '>=' )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case LT:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case LTE:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case GTE:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:23: '<'
            	            {
            	            char_literal119=(Token)match(input,LT,FOLLOW_LT_in_relational_expression1935); 
            	            char_literal119_tree = (Object)adaptor.create(char_literal119);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal119_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:28: '>'
            	            {
            	            char_literal120=(Token)match(input,GT,FOLLOW_GT_in_relational_expression1938); 
            	            char_literal120_tree = (Object)adaptor.create(char_literal120);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal120_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:33: '<='
            	            {
            	            string_literal121=(Token)match(input,LTE,FOLLOW_LTE_in_relational_expression1941); 
            	            string_literal121_tree = (Object)adaptor.create(string_literal121);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal121_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:300:39: '>='
            	            {
            	            string_literal122=(Token)match(input,GTE,FOLLOW_GTE_in_relational_expression1944); 
            	            string_literal122_tree = (Object)adaptor.create(string_literal122);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal122_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1948);
            	    shift_expression123=shift_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expression123.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class shift_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shift_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:303:1: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
    public final TemplateParser.shift_expression_return shift_expression() throws RecognitionException {
        TemplateParser.shift_expression_return retval = new TemplateParser.shift_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal125=null;
        Token string_literal126=null;
        TemplateParser.additive_expression_return additive_expression124 = null;

        TemplateParser.additive_expression_return additive_expression127 = null;


        Object string_literal125_tree=null;
        Object string_literal126_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:2: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:4: additive_expression ( ( '<<' | '>>' ) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_shift_expression1961);
            additive_expression124=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression124.getTree());
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:24: ( ( '<<' | '>>' ) additive_expression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=LSHIFT && LA32_0<=RSHIFT)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:25: ( '<<' | '>>' ) additive_expression
            	    {
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:25: ( '<<' | '>>' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==LSHIFT) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==RSHIFT) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:26: '<<'
            	            {
            	            string_literal125=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression1965); 
            	            string_literal125_tree = (Object)adaptor.create(string_literal125);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:304:32: '>>'
            	            {
            	            string_literal126=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression1968); 
            	            string_literal126_tree = (Object)adaptor.create(string_literal126);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal126_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1972);
            	    additive_expression127=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression127.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shift_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:307:1: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
    public final TemplateParser.additive_expression_return additive_expression() throws RecognitionException {
        TemplateParser.additive_expression_return retval = new TemplateParser.additive_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal129=null;
        Token char_literal131=null;
        TemplateParser.multiplicative_expression_return multiplicative_expression128 = null;

        TemplateParser.multiplicative_expression_return multiplicative_expression130 = null;

        TemplateParser.multiplicative_expression_return multiplicative_expression132 = null;


        Object char_literal129_tree=null;
        Object char_literal131_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:2: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:4: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:4: ( multiplicative_expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:5: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1987);
            multiplicative_expression128=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression128.getTree());

            }

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:32: ( '+' multiplicative_expression | '-' multiplicative_expression )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==PLUS) ) {
                    alt33=1;
                }
                else if ( (LA33_0==MINUS) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:33: '+' multiplicative_expression
            	    {
            	    char_literal129=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression1991); 
            	    char_literal129_tree = (Object)adaptor.create(char_literal129);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal129_tree, root_0);

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1994);
            	    multiplicative_expression130=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression130.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:308:66: '-' multiplicative_expression
            	    {
            	    char_literal131=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression1998); 
            	    char_literal131_tree = (Object)adaptor.create(char_literal131);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal131_tree, root_0);

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2001);
            	    multiplicative_expression132=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression132.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:311:1: multiplicative_expression : ( unary_expression ) ( MUL unary_expression | DIV unary_expression | '%' unary_expression )* ;
    public final TemplateParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        TemplateParser.multiplicative_expression_return retval = new TemplateParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MUL134=null;
        Token DIV136=null;
        Token char_literal138=null;
        TemplateParser.unary_expression_return unary_expression133 = null;

        TemplateParser.unary_expression_return unary_expression135 = null;

        TemplateParser.unary_expression_return unary_expression137 = null;

        TemplateParser.unary_expression_return unary_expression139 = null;


        Object MUL134_tree=null;
        Object DIV136_tree=null;
        Object char_literal138_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:2: ( ( unary_expression ) ( MUL unary_expression | DIV unary_expression | '%' unary_expression )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:4: ( unary_expression ) ( MUL unary_expression | DIV unary_expression | '%' unary_expression )*
            {
            root_0 = (Object)adaptor.nil();

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:4: ( unary_expression )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:5: unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2015);
            unary_expression133=unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, unary_expression133.getTree());

            }

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:23: ( MUL unary_expression | DIV unary_expression | '%' unary_expression )*
            loop34:
            do {
                int alt34=4;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt34=1;
                    }
                    break;
                case DIV:
                    {
                    alt34=2;
                    }
                    break;
                case MOD:
                    {
                    alt34=3;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:24: MUL unary_expression
            	    {
            	    MUL134=(Token)match(input,MUL,FOLLOW_MUL_in_multiplicative_expression2019); 
            	    MUL134_tree = (Object)adaptor.create(MUL134);
            	    root_0 = (Object)adaptor.becomeRoot(MUL134_tree, root_0);

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2022);
            	    unary_expression135=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression135.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:48: DIV unary_expression
            	    {
            	    DIV136=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression2026); 
            	    DIV136_tree = (Object)adaptor.create(DIV136);
            	    root_0 = (Object)adaptor.becomeRoot(DIV136_tree, root_0);

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2029);
            	    unary_expression137=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression137.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:312:72: '%' unary_expression
            	    {
            	    char_literal138=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicative_expression2033); 
            	    char_literal138_tree = (Object)adaptor.create(char_literal138);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal138_tree, root_0);

            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2036);
            	    unary_expression139=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression139.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:315:1: unary_expression : ( postfix_expression | '+' unary_expression -> ^( UNARY_PLUS unary_expression ) | '-' unary_expression -> ^( UNARY_MINUS unary_expression ) | '~' unary_expression | NOT unary_expression );
    public final TemplateParser.unary_expression_return unary_expression() throws RecognitionException {
        TemplateParser.unary_expression_return retval = new TemplateParser.unary_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal141=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Token NOT147=null;
        TemplateParser.postfix_expression_return postfix_expression140 = null;

        TemplateParser.unary_expression_return unary_expression142 = null;

        TemplateParser.unary_expression_return unary_expression144 = null;

        TemplateParser.unary_expression_return unary_expression146 = null;

        TemplateParser.unary_expression_return unary_expression148 = null;


        Object char_literal141_tree=null;
        Object char_literal143_tree=null;
        Object char_literal145_tree=null;
        Object NOT147_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:316:2: ( postfix_expression | '+' unary_expression -> ^( UNARY_PLUS unary_expression ) | '-' unary_expression -> ^( UNARY_MINUS unary_expression ) | '~' unary_expression | NOT unary_expression )
            int alt35=5;
            switch ( input.LA(1) ) {
            case ID:
            case TRUE:
            case FALSE:
            case NULL:
            case LSQUARE:
            case LPAREN:
            case INT:
            case INT_HEX:
            case FLOAT:
            case STRING:
                {
                alt35=1;
                }
                break;
            case PLUS:
                {
                alt35=2;
                }
                break;
            case MINUS:
                {
                alt35=3;
                }
                break;
            case TILDE:
                {
                alt35=4;
                }
                break;
            case NOT:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:316:4: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2049);
                    postfix_expression140=postfix_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expression140.getTree());

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:317:4: '+' unary_expression
                    {
                    char_literal141=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression2054);  
                    stream_PLUS.add(char_literal141);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression2056);
                    unary_expression142=unary_expression();

                    state._fsp--;

                    stream_unary_expression.add(unary_expression142.getTree());


                    // AST REWRITE
                    // elements: unary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 317:25: -> ^( UNARY_PLUS unary_expression )
                    {
                        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:317:28: ^( UNARY_PLUS unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_PLUS, "UNARY_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:318:4: '-' unary_expression
                    {
                    char_literal143=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression2069);  
                    stream_MINUS.add(char_literal143);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression2071);
                    unary_expression144=unary_expression();

                    state._fsp--;

                    stream_unary_expression.add(unary_expression144.getTree());


                    // AST REWRITE
                    // elements: unary_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:25: -> ^( UNARY_MINUS unary_expression )
                    {
                        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:318:28: ^( UNARY_MINUS unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:319:4: '~' unary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal145=(Token)match(input,TILDE,FOLLOW_TILDE_in_unary_expression2084); 
                    char_literal145_tree = (Object)adaptor.create(char_literal145);
                    root_0 = (Object)adaptor.becomeRoot(char_literal145_tree, root_0);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression2087);
                    unary_expression146=unary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expression146.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:320:4: NOT unary_expression
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT147=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression2092); 
                    NOT147_tree = (Object)adaptor.create(NOT147);
                    root_0 = (Object)adaptor.becomeRoot(NOT147_tree, root_0);

                    pushFollow(FOLLOW_unary_expression_in_unary_expression2095);
                    unary_expression148=unary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expression148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:323:1: postfix_expression : ( atom -> atom ) ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID ) ) | QDOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression ID ) ) | DOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression ID ) ) )* ;
    public final TemplateParser.postfix_expression_return postfix_expression() throws RecognitionException {
        TemplateParser.postfix_expression_return retval = new TemplateParser.postfix_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal150=null;
        Token char_literal152=null;
        Token PIPE153=null;
        Token ID154=null;
        Token char_literal155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        Token QDOT160=null;
        Token ID161=null;
        Token char_literal162=null;
        Token char_literal164=null;
        Token char_literal166=null;
        Token DOT167=null;
        Token ID168=null;
        Token char_literal169=null;
        Token char_literal171=null;
        Token char_literal173=null;
        TemplateParser.atom_return atom149 = null;

        TemplateParser.sliceops_return sliceops151 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression156 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression158 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression163 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression165 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression170 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression172 = null;


        Object char_literal150_tree=null;
        Object char_literal152_tree=null;
        Object PIPE153_tree=null;
        Object ID154_tree=null;
        Object char_literal155_tree=null;
        Object char_literal157_tree=null;
        Object char_literal159_tree=null;
        Object QDOT160_tree=null;
        Object ID161_tree=null;
        Object char_literal162_tree=null;
        Object char_literal164_tree=null;
        Object char_literal166_tree=null;
        Object DOT167_tree=null;
        Object ID168_tree=null;
        Object char_literal169_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
        RewriteRuleTokenStream stream_QDOT=new RewriteRuleTokenStream(adaptor,"token QDOT");
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_sliceops=new RewriteRuleSubtreeStream(adaptor,"rule sliceops");
        RewriteRuleSubtreeStream stream_weakest_binding_expression=new RewriteRuleSubtreeStream(adaptor,"rule weakest_binding_expression");
        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:324:2: ( ( atom -> atom ) ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID ) ) | QDOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression ID ) ) | DOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression ID ) ) )* )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:324:4: ( atom -> atom ) ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID ) ) | QDOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression ID ) ) | DOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression ID ) ) )*
            {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:324:4: ( atom -> atom )
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:324:5: atom
            {
            pushFollow(FOLLOW_atom_in_postfix_expression2107);
            atom149=atom();

            state._fsp--;

            stream_atom.add(atom149.getTree());


            // AST REWRITE
            // elements: atom
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 324:9: -> atom
            {
                adaptor.addChild(root_0, stream_atom.nextTree());

            }

            retval.tree = root_0;
            }

            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:325:3: ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID ) ) | QDOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression ID ) ) | DOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression ID ) ) )*
            loop45:
            do {
                int alt45=5;
                switch ( input.LA(1) ) {
                case LSQUARE:
                    {
                    alt45=1;
                    }
                    break;
                case PIPE:
                    {
                    alt45=2;
                    }
                    break;
                case QDOT:
                    {
                    alt45=3;
                    }
                    break;
                case DOT:
                    {
                    alt45=4;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:326:4: '[' sliceops ']'
            	    {
            	    char_literal150=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_postfix_expression2119);  
            	    stream_LSQUARE.add(char_literal150);

            	    pushFollow(FOLLOW_sliceops_in_postfix_expression2121);
            	    sliceops151=sliceops();

            	    state._fsp--;

            	    stream_sliceops.add(sliceops151.getTree());
            	    char_literal152=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_postfix_expression2123);  
            	    stream_RSQUARE.add(char_literal152);



            	    // AST REWRITE
            	    // elements: sliceops, postfix_expression, LSQUARE
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 326:21: -> ^( '[' $postfix_expression sliceops )
            	    {
            	        // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:326:24: ^( '[' $postfix_expression sliceops )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(stream_LSQUARE.nextNode(), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_sliceops.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:328:4: PIPE ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID ) )
            	    {
            	    PIPE153=(Token)match(input,PIPE,FOLLOW_PIPE_in_postfix_expression2143);  
            	    stream_PIPE.add(PIPE153);

            	    ID154=(Token)match(input,ID,FOLLOW_ID_in_postfix_expression2145);  
            	    stream_ID.add(ID154);

            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:329:5: ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==LPAREN) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==TEMPLATE_STATEMENT_END||LA38_0==TEMPLATE_PRINT_END||LA38_0==IN||LA38_0==LIMIT||(LA38_0>=IAND && LA38_0<=OR)||(LA38_0>=ORDER && LA38_0<=TO)||(LA38_0>=EQEQ && LA38_0<=RSQUARE)||(LA38_0>=RPAREN && LA38_0<=QDOT)||(LA38_0>=LSHIFT && LA38_0<=COLON)||(LA38_0>=SEMI && LA38_0<=PIPE)) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:330:6: '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')'
            	            {
            	            char_literal155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2159);  
            	            stream_LPAREN.add(char_literal155);

            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:330:10: ( weakest_binding_expression ( ',' weakest_binding_expression )* )?
            	            int alt37=2;
            	            int LA37_0 = input.LA(1);

            	            if ( (LA37_0==ID||(LA37_0>=TRUE && LA37_0<=NULL)||LA37_0==NOT||(LA37_0>=PLUS && LA37_0<=MINUS)||LA37_0==LSQUARE||LA37_0==LPAREN||LA37_0==TILDE||LA37_0==INT||LA37_0==INT_HEX||LA37_0==FLOAT||LA37_0==STRING) ) {
            	                alt37=1;
            	            }
            	            switch (alt37) {
            	                case 1 :
            	                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:330:11: weakest_binding_expression ( ',' weakest_binding_expression )*
            	                    {
            	                    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2162);
            	                    weakest_binding_expression156=weakest_binding_expression();

            	                    state._fsp--;

            	                    stream_weakest_binding_expression.add(weakest_binding_expression156.getTree());
            	                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:330:38: ( ',' weakest_binding_expression )*
            	                    loop36:
            	                    do {
            	                        int alt36=2;
            	                        int LA36_0 = input.LA(1);

            	                        if ( (LA36_0==COMMA) ) {
            	                            alt36=1;
            	                        }


            	                        switch (alt36) {
            	                    	case 1 :
            	                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:330:39: ',' weakest_binding_expression
            	                    	    {
            	                    	    char_literal157=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression2165);  
            	                    	    stream_COMMA.add(char_literal157);

            	                    	    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2167);
            	                    	    weakest_binding_expression158=weakest_binding_expression();

            	                    	    state._fsp--;

            	                    	    stream_weakest_binding_expression.add(weakest_binding_expression158.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop36;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            char_literal159=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2173);  
            	            stream_RPAREN.add(char_literal159);



            	            // AST REWRITE
            	            // elements: ID, postfix_expression, weakest_binding_expression, PIPE
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 331:7: -> ^( PIPE $postfix_expression ID ( weakest_binding_expression )* )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:331:10: ^( PIPE $postfix_expression ID ( weakest_binding_expression )* )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_PIPE.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:331:40: ( weakest_binding_expression )*
            	                while ( stream_weakest_binding_expression.hasNext() ) {
            	                    adaptor.addChild(root_1, stream_weakest_binding_expression.nextTree());

            	                }
            	                stream_weakest_binding_expression.reset();

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:333:7: 
            	            {

            	            // AST REWRITE
            	            // elements: postfix_expression, ID, PIPE
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 333:7: -> ^( PIPE $postfix_expression ID )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:333:10: ^( PIPE $postfix_expression ID )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_PIPE.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:336:4: QDOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression ID ) )
            	    {
            	    QDOT160=(Token)match(input,QDOT,FOLLOW_QDOT_in_postfix_expression2234);  
            	    stream_QDOT.add(QDOT160);

            	    ID161=(Token)match(input,ID,FOLLOW_ID_in_postfix_expression2236);  
            	    stream_ID.add(ID161);

            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:337:5: ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression ID ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==LPAREN) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==TEMPLATE_STATEMENT_END||LA41_0==TEMPLATE_PRINT_END||LA41_0==IN||LA41_0==LIMIT||(LA41_0>=IAND && LA41_0<=OR)||(LA41_0>=ORDER && LA41_0<=TO)||(LA41_0>=EQEQ && LA41_0<=RSQUARE)||(LA41_0>=RPAREN && LA41_0<=QDOT)||(LA41_0>=LSHIFT && LA41_0<=COLON)||(LA41_0>=SEMI && LA41_0<=PIPE)) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:338:6: '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')'
            	            {
            	            char_literal162=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2250);  
            	            stream_LPAREN.add(char_literal162);

            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:338:10: ( weakest_binding_expression ( ',' weakest_binding_expression )* )?
            	            int alt40=2;
            	            int LA40_0 = input.LA(1);

            	            if ( (LA40_0==ID||(LA40_0>=TRUE && LA40_0<=NULL)||LA40_0==NOT||(LA40_0>=PLUS && LA40_0<=MINUS)||LA40_0==LSQUARE||LA40_0==LPAREN||LA40_0==TILDE||LA40_0==INT||LA40_0==INT_HEX||LA40_0==FLOAT||LA40_0==STRING) ) {
            	                alt40=1;
            	            }
            	            switch (alt40) {
            	                case 1 :
            	                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:338:11: weakest_binding_expression ( ',' weakest_binding_expression )*
            	                    {
            	                    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2253);
            	                    weakest_binding_expression163=weakest_binding_expression();

            	                    state._fsp--;

            	                    stream_weakest_binding_expression.add(weakest_binding_expression163.getTree());
            	                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:338:38: ( ',' weakest_binding_expression )*
            	                    loop39:
            	                    do {
            	                        int alt39=2;
            	                        int LA39_0 = input.LA(1);

            	                        if ( (LA39_0==COMMA) ) {
            	                            alt39=1;
            	                        }


            	                        switch (alt39) {
            	                    	case 1 :
            	                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:338:39: ',' weakest_binding_expression
            	                    	    {
            	                    	    char_literal164=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression2256);  
            	                    	    stream_COMMA.add(char_literal164);

            	                    	    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2258);
            	                    	    weakest_binding_expression165=weakest_binding_expression();

            	                    	    state._fsp--;

            	                    	    stream_weakest_binding_expression.add(weakest_binding_expression165.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop39;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            char_literal166=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2264);  
            	            stream_RPAREN.add(char_literal166);



            	            // AST REWRITE
            	            // elements: LPAREN, weakest_binding_expression, ID, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 339:7: -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:339:10: ^( '(' $postfix_expression ID ( weakest_binding_expression )* )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_LPAREN.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:339:39: ( weakest_binding_expression )*
            	                while ( stream_weakest_binding_expression.hasNext() ) {
            	                    adaptor.addChild(root_1, stream_weakest_binding_expression.nextTree());

            	                }
            	                stream_weakest_binding_expression.reset();

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:341:7: 
            	            {

            	            // AST REWRITE
            	            // elements: ID, QDOT, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 341:7: -> ^( QDOT $postfix_expression ID )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:341:10: ^( QDOT $postfix_expression ID )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_QDOT.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 4 :
            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:344:4: DOT ID ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression ID ) )
            	    {
            	    DOT167=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression2325);  
            	    stream_DOT.add(DOT167);

            	    ID168=(Token)match(input,ID,FOLLOW_ID_in_postfix_expression2327);  
            	    stream_ID.add(ID168);

            	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:345:5: ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression ID ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==LPAREN) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==TEMPLATE_STATEMENT_END||LA44_0==TEMPLATE_PRINT_END||LA44_0==IN||LA44_0==LIMIT||(LA44_0>=IAND && LA44_0<=OR)||(LA44_0>=ORDER && LA44_0<=TO)||(LA44_0>=EQEQ && LA44_0<=RSQUARE)||(LA44_0>=RPAREN && LA44_0<=QDOT)||(LA44_0>=LSHIFT && LA44_0<=COLON)||(LA44_0>=SEMI && LA44_0<=PIPE)) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:346:6: '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')'
            	            {
            	            char_literal169=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2341);  
            	            stream_LPAREN.add(char_literal169);

            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:346:10: ( weakest_binding_expression ( ',' weakest_binding_expression )* )?
            	            int alt43=2;
            	            int LA43_0 = input.LA(1);

            	            if ( (LA43_0==ID||(LA43_0>=TRUE && LA43_0<=NULL)||LA43_0==NOT||(LA43_0>=PLUS && LA43_0<=MINUS)||LA43_0==LSQUARE||LA43_0==LPAREN||LA43_0==TILDE||LA43_0==INT||LA43_0==INT_HEX||LA43_0==FLOAT||LA43_0==STRING) ) {
            	                alt43=1;
            	            }
            	            switch (alt43) {
            	                case 1 :
            	                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:346:11: weakest_binding_expression ( ',' weakest_binding_expression )*
            	                    {
            	                    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2344);
            	                    weakest_binding_expression170=weakest_binding_expression();

            	                    state._fsp--;

            	                    stream_weakest_binding_expression.add(weakest_binding_expression170.getTree());
            	                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:346:38: ( ',' weakest_binding_expression )*
            	                    loop42:
            	                    do {
            	                        int alt42=2;
            	                        int LA42_0 = input.LA(1);

            	                        if ( (LA42_0==COMMA) ) {
            	                            alt42=1;
            	                        }


            	                        switch (alt42) {
            	                    	case 1 :
            	                    	    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:346:39: ',' weakest_binding_expression
            	                    	    {
            	                    	    char_literal171=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression2347);  
            	                    	    stream_COMMA.add(char_literal171);

            	                    	    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2349);
            	                    	    weakest_binding_expression172=weakest_binding_expression();

            	                    	    state._fsp--;

            	                    	    stream_weakest_binding_expression.add(weakest_binding_expression172.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop42;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            char_literal173=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2355);  
            	            stream_RPAREN.add(char_literal173);



            	            // AST REWRITE
            	            // elements: LPAREN, weakest_binding_expression, postfix_expression, ID
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 347:7: -> ^( '(' $postfix_expression ID ( weakest_binding_expression )* )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:347:10: ^( '(' $postfix_expression ID ( weakest_binding_expression )* )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_LPAREN.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:347:39: ( weakest_binding_expression )*
            	                while ( stream_weakest_binding_expression.hasNext() ) {
            	                    adaptor.addChild(root_1, stream_weakest_binding_expression.nextTree());

            	                }
            	                stream_weakest_binding_expression.reset();

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:349:7: 
            	            {

            	            // AST REWRITE
            	            // elements: DOT, ID, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 349:7: -> ^( DOT $postfix_expression ID )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:349:10: ^( DOT $postfix_expression ID )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());
            	                adaptor.addChild(root_1, stream_ID.nextNode());

            	                adaptor.addChild(root_0, root_1);
            	                }

            	            }

            	            retval.tree = root_0;
            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class sliceops_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sliceops"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:354:1: sliceops : ( expression ( ':' ( expression )? ( ':' ( expression )? )? )? | ':' ( expression )? ( ':' ( expression )? )? );
    public final TemplateParser.sliceops_return sliceops() throws RecognitionException {
        TemplateParser.sliceops_return retval = new TemplateParser.sliceops_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal175=null;
        Token char_literal177=null;
        Token char_literal179=null;
        Token char_literal181=null;
        TemplateParser.expression_return expression174 = null;

        TemplateParser.expression_return expression176 = null;

        TemplateParser.expression_return expression178 = null;

        TemplateParser.expression_return expression180 = null;

        TemplateParser.expression_return expression182 = null;


        Object char_literal175_tree=null;
        Object char_literal177_tree=null;
        Object char_literal179_tree=null;
        Object char_literal181_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:2: ( expression ( ':' ( expression )? ( ':' ( expression )? )? )? | ':' ( expression )? ( ':' ( expression )? )? )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ID||(LA53_0>=TRUE && LA53_0<=NULL)||LA53_0==NOT||(LA53_0>=PLUS && LA53_0<=MINUS)||LA53_0==LSQUARE||LA53_0==LPAREN||LA53_0==TILDE||LA53_0==INT||LA53_0==INT_HEX||LA53_0==FLOAT||LA53_0==STRING) ) {
                alt53=1;
            }
            else if ( (LA53_0==COLON) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:4: expression ( ':' ( expression )? ( ':' ( expression )? )? )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_sliceops2423);
                    expression174=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression174.getTree());
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:15: ( ':' ( expression )? ( ':' ( expression )? )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COLON) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:16: ':' ( expression )? ( ':' ( expression )? )?
                            {
                            char_literal175=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2426); 
                            char_literal175_tree = (Object)adaptor.create(char_literal175);
                            adaptor.addChild(root_0, char_literal175_tree);

                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:20: ( expression )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==ID||(LA46_0>=TRUE && LA46_0<=NULL)||LA46_0==NOT||(LA46_0>=PLUS && LA46_0<=MINUS)||LA46_0==LSQUARE||LA46_0==LPAREN||LA46_0==TILDE||LA46_0==INT||LA46_0==INT_HEX||LA46_0==FLOAT||LA46_0==STRING) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:20: expression
                                    {
                                    pushFollow(FOLLOW_expression_in_sliceops2428);
                                    expression176=expression();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expression176.getTree());

                                    }
                                    break;

                            }

                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:32: ( ':' ( expression )? )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==COLON) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:33: ':' ( expression )?
                                    {
                                    char_literal177=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2432); 
                                    char_literal177_tree = (Object)adaptor.create(char_literal177);
                                    adaptor.addChild(root_0, char_literal177_tree);

                                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:37: ( expression )?
                                    int alt47=2;
                                    int LA47_0 = input.LA(1);

                                    if ( (LA47_0==ID||(LA47_0>=TRUE && LA47_0<=NULL)||LA47_0==NOT||(LA47_0>=PLUS && LA47_0<=MINUS)||LA47_0==LSQUARE||LA47_0==LPAREN||LA47_0==TILDE||LA47_0==INT||LA47_0==INT_HEX||LA47_0==FLOAT||LA47_0==STRING) ) {
                                        alt47=1;
                                    }
                                    switch (alt47) {
                                        case 1 :
                                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:355:37: expression
                                            {
                                            pushFollow(FOLLOW_expression_in_sliceops2434);
                                            expression178=expression();

                                            state._fsp--;

                                            adaptor.addChild(root_0, expression178.getTree());

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:4: ':' ( expression )? ( ':' ( expression )? )?
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal179=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2444); 
                    char_literal179_tree = (Object)adaptor.create(char_literal179);
                    adaptor.addChild(root_0, char_literal179_tree);

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:8: ( expression )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==ID||(LA50_0>=TRUE && LA50_0<=NULL)||LA50_0==NOT||(LA50_0>=PLUS && LA50_0<=MINUS)||LA50_0==LSQUARE||LA50_0==LPAREN||LA50_0==TILDE||LA50_0==INT||LA50_0==INT_HEX||LA50_0==FLOAT||LA50_0==STRING) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:8: expression
                            {
                            pushFollow(FOLLOW_expression_in_sliceops2446);
                            expression180=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression180.getTree());

                            }
                            break;

                    }

                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:20: ( ':' ( expression )? )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==COLON) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:21: ':' ( expression )?
                            {
                            char_literal181=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2450); 
                            char_literal181_tree = (Object)adaptor.create(char_literal181);
                            adaptor.addChild(root_0, char_literal181_tree);

                            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:25: ( expression )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==ID||(LA51_0>=TRUE && LA51_0<=NULL)||LA51_0==NOT||(LA51_0>=PLUS && LA51_0<=MINUS)||LA51_0==LSQUARE||LA51_0==LPAREN||LA51_0==TILDE||LA51_0==INT||LA51_0==INT_HEX||LA51_0==FLOAT||LA51_0==STRING) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:356:25: expression
                                    {
                                    pushFollow(FOLLOW_expression_in_sliceops2452);
                                    expression182=expression();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expression182.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sliceops"

    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:359:1: constant : ( INT | INT_HEX | FLOAT | string | TRUE | FALSE | NULL );
    public final TemplateParser.constant_return constant() throws RecognitionException {
        TemplateParser.constant_return retval = new TemplateParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT183=null;
        Token INT_HEX184=null;
        Token FLOAT185=null;
        Token TRUE187=null;
        Token FALSE188=null;
        Token NULL189=null;
        TemplateParser.string_return string186 = null;


        Object INT183_tree=null;
        Object INT_HEX184_tree=null;
        Object FLOAT185_tree=null;
        Object TRUE187_tree=null;
        Object FALSE188_tree=null;
        Object NULL189_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:5: ( INT | INT_HEX | FLOAT | string | TRUE | FALSE | NULL )
            int alt54=7;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt54=1;
                }
                break;
            case INT_HEX:
                {
                alt54=2;
                }
                break;
            case FLOAT:
                {
                alt54=3;
                }
                break;
            case STRING:
                {
                alt54=4;
                }
                break;
            case TRUE:
                {
                alt54=5;
                }
                break;
            case FALSE:
                {
                alt54=6;
                }
                break;
            case NULL:
                {
                alt54=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:8: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT183=(Token)match(input,INT,FOLLOW_INT_in_constant2470); 
                    INT183_tree = (Object)adaptor.create(INT183);
                    adaptor.addChild(root_0, INT183_tree);


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:14: INT_HEX
                    {
                    root_0 = (Object)adaptor.nil();

                    INT_HEX184=(Token)match(input,INT_HEX,FOLLOW_INT_HEX_in_constant2474); 
                    INT_HEX184_tree = (Object)adaptor.create(INT_HEX184);
                    adaptor.addChild(root_0, INT_HEX184_tree);


                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:24: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT185=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant2478); 
                    FLOAT185_tree = (Object)adaptor.create(FLOAT185);
                    adaptor.addChild(root_0, FLOAT185_tree);


                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:32: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_constant2482);
                    string186=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string186.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:41: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE187=(Token)match(input,TRUE,FOLLOW_TRUE_in_constant2486); 
                    TRUE187_tree = (Object)adaptor.create(TRUE187);
                    adaptor.addChild(root_0, TRUE187_tree);


                    }
                    break;
                case 6 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:48: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE188=(Token)match(input,FALSE,FOLLOW_FALSE_in_constant2490); 
                    FALSE188_tree = (Object)adaptor.create(FALSE188);
                    adaptor.addChild(root_0, FALSE188_tree);


                    }
                    break;
                case 7 :
                    // /Users/matthew/Documents/twitrants/stencil/src/com/dotspots/templating/Template.g:360:56: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    NULL189=(Token)match(input,NULL,FOLLOW_NULL_in_constant2494); 
                    NULL189_tree = (Object)adaptor.create(NULL189);
                    adaptor.addChild(root_0, NULL189_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    // Delegated rules


 

    public static final BitSet FOLLOW_STRING_in_string1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_LITERAL_in_template_literal1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_STATEMENT_START_in_template_statement1226 = new BitSet(new long[]{0x21460443FBCC0800L,0x0000000000009500L});
    public static final BitSet FOLLOW_statements_in_template_statement1229 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_TEMPLATE_STATEMENT_END_in_template_statement1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_PRINT_START_in_template_print1243 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_template_print1246 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_template_print1249 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_template_print1252 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000020L});
    public static final BitSet FOLLOW_TEMPLATE_PRINT_END_in_template_print1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_COMMENT_in_template_comment1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_RAW_in_template_raw1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_literal_in_template1296 = new BitSet(new long[]{0x0000000000016440L});
    public static final BitSet FOLLOW_template_statement_in_template1301 = new BitSet(new long[]{0x0000000000016440L});
    public static final BitSet FOLLOW_template_comment_in_template1306 = new BitSet(new long[]{0x0000000000016440L});
    public static final BitSet FOLLOW_template_raw_in_template1311 = new BitSet(new long[]{0x0000000000016440L});
    public static final BitSet FOLLOW_template_print_in_template1316 = new BitSet(new long[]{0x0000000000016440L});
    public static final BitSet FOLLOW_EOF_in_template1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1331 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statements1334 = new BitSet(new long[]{0x21460443FBCC0802L,0x0000000000009500L});
    public static final BitSet FOLLOW_statements_in_statements1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocked_statement_in_statements1345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_statements1348 = new BitSet(new long[]{0x21460443FBCC0802L,0x0000000000009500L});
    public static final BitSet FOLLOW_statements_in_statements1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extends_statement_in_statement1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_statement_in_statement1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_statement_in_statement1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_statement_in_statement1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_blocked_statement1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elif_statement_in_blocked_statement1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_blocked_statement1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_else_statement_in_blocked_statement1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_statement_in_blocked_statement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_print_statement1431 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_print_statement1433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_print_statement1436 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_print_statement1438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_VAR_in_var_statement1458 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_var_statement1461 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_EQ_in_var_statement1464 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_var_statement1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block_statement1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_string_in_block_statement1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_extends_statement1490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_string_in_extends_statement1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_statement1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_string_in_include_statement1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif_statement1523 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_elif_statement1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1535 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_if_statement1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1547 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_for_statement1550 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IN_in_for_statement1552 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_for_statement1555 = new BitSet(new long[]{0x0000008004000002L});
    public static final BitSet FOLLOW_ORDER_in_for_statement1558 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_BY_in_for_statement1560 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_for_statement1563 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LIMIT_in_for_statement1568 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_for_statement1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_statement1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_list1600 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_list1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_list1615 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_list_expressions_in_list1617 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_list1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_list_expressions1638 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_list_expressions1641 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_list_expressions1644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_atom1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atom1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_atom1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1681 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_atom1684 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_expression1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_weakest_binding_expression1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment_expression1723 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_EQ_in_assignment_expression1725 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_in_expression_in_assignment_expression1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_in_expression1741 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IN_in_in_expression1744 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_conditional_expression_in_in_expression1747 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_range_expression_in_conditional_expression1760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_QUESTION_in_conditional_expression1763 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_conditional_expression1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_conditional_expression1768 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_conditional_expression1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwise_or_expression_in_range_expression1784 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_TO_in_range_expression1787 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_range_expression1790 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_BY_in_range_expression1793 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_range_expression1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwise_and_expression_in_bitwise_or_expression1811 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IOR_in_bitwise_or_expression1814 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_bitwise_and_expression_in_bitwise_or_expression1817 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_bitwise_and_expression1830 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IAND_in_bitwise_and_expression1833 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_logical_or_expression_in_bitwise_and_expression1836 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_logical_xor_expression_in_logical_or_expression1849 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression1852 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_logical_xor_expression_in_logical_or_expression1855 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_xor_expression1868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_XOR_in_logical_xor_expression1871 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_xor_expression1874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression1888 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression1891 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression1894 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1907 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_EQEQ_in_equality_expression1911 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_NE_in_equality_expression1914 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1918 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1931 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_LT_in_relational_expression1935 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_GT_in_relational_expression1938 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_LTE_in_relational_expression1941 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_GTE_in_relational_expression1944 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1948 = new BitSet(new long[]{0x0001E00000000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1961 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression1965 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression1968 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1972 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1987 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression1991 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1994 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression1998 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2001 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2015 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_MUL_in_multiplicative_expression2019 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2022 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression2026 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2029 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_MOD_in_multiplicative_expression2033 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2036 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression2054 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression2069 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_unary_expression2084 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression2092 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_postfix_expression2107 = new BitSet(new long[]{0x0C40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LSQUARE_in_postfix_expression2119 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009502L});
    public static final BitSet FOLLOW_sliceops_in_postfix_expression2121 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_postfix_expression2123 = new BitSet(new long[]{0x0C40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_PIPE_in_postfix_expression2143 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression2145 = new BitSet(new long[]{0x0D40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2159 = new BitSet(new long[]{0x23460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2162 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression2165 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2167 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2173 = new BitSet(new long[]{0x0C40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_QDOT_in_postfix_expression2234 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression2236 = new BitSet(new long[]{0x0D40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2250 = new BitSet(new long[]{0x23460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2253 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression2256 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2258 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2264 = new BitSet(new long[]{0x0C40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression2325 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_postfix_expression2327 = new BitSet(new long[]{0x0D40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2341 = new BitSet(new long[]{0x23460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2344 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression2347 = new BitSet(new long[]{0x21460443BB000800L,0x0000000000009500L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2349 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2355 = new BitSet(new long[]{0x0C40000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_expression_in_sliceops2423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sliceops2426 = new BitSet(new long[]{0x21460443BB000802L,0x0000000000009502L});
    public static final BitSet FOLLOW_expression_in_sliceops2428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sliceops2432 = new BitSet(new long[]{0x21460443BB000802L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_sliceops2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sliceops2444 = new BitSet(new long[]{0x21460443BB000802L,0x0000000000009502L});
    public static final BitSet FOLLOW_expression_in_sliceops2446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sliceops2450 = new BitSet(new long[]{0x21460443BB000802L,0x0000000000009500L});
    public static final BitSet FOLLOW_expression_in_sliceops2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constant2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_HEX_in_constant2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_constant2494 = new BitSet(new long[]{0x0000000000000002L});

}