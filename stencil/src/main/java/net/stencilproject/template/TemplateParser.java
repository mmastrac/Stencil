// $ANTLR 3.4 /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g 2011-09-20 19:49:25
package net.stencilproject.template;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TemplateParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AS", "BLOCK", "BY", "COLON", "COMMA", "COMMENT", "CONTINUE", "DIV", "DOLLAR", "DOT", "DQUOTE", "ELIF", "ELSE", "END", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "FALSE", "FLOAT", "FOR", "GT", "GTE", "HEX_DIGIT", "HEX_ESC", "IAND", "ID", "IF", "IN", "INCLUDE", "INT", "INT_HEX", "IOR", "JOIN", "LIMIT", "LIST", "LPAREN", "LSHIFT", "LSQUARE", "LT", "LTE", "MINUS", "MOD", "MUL", "NE", "NOT", "NULL", "OR", "ORDER", "PIPE", "PLUS", "PRINT", "QDOT", "QUESTION", "RPAREN", "RSHIFT", "RSQUARE", "SCOPE_LOOKUP", "SEMI", "SQUOTE", "STRING", "TEMPLATE_COMMENT", "TEMPLATE_LITERAL", "TEMPLATE_PRINT_END", "TEMPLATE_PRINT_START", "TEMPLATE_RAW", "TEMPLATE_STATEMENT_END", "TEMPLATE_STATEMENT_START", "TILDE", "TO", "TRUE", "UNARY_MINUS", "UNARY_PLUS", "UNICODE_ESC", "VAR", "WS", "XOR"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

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
    public String getGrammarFileName() { return "/Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g"; }


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:156:1: id : ID ;
    public final TemplateParser.id_return id() throws RecognitionException {
        TemplateParser.id_return retval = new TemplateParser.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID1=null;

        Object ID1_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:157:2: ( ID )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:157:4: ID
            {
            root_0 = (Object)adaptor.nil();


            ID1=(Token)match(input,ID,FOLLOW_ID_in_id1205); 
            ID1_tree = 
            (Object)adaptor.create(ID1)
            ;
            adaptor.addChild(root_0, ID1_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"


    public static class id_relaxed_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_relaxed"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:160:1: id_relaxed : ( ID | JOIN | ELSE | FOR | CONTINUE );
    public final TemplateParser.id_relaxed_return id_relaxed() throws RecognitionException {
        TemplateParser.id_relaxed_return retval = new TemplateParser.id_relaxed_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:161:2: ( ID | JOIN | ELSE | FOR | CONTINUE )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:
            {
            root_0 = (Object)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( input.LA(1)==CONTINUE||input.LA(1)==ELSE||input.LA(1)==FOR||input.LA(1)==ID||input.LA(1)==JOIN ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set2)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id_relaxed"


    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:163:1: string : STRING ;
    public final TemplateParser.string_return string() throws RecognitionException {
        TemplateParser.string_return retval = new TemplateParser.string_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING3=null;

        Object STRING3_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:164:2: ( STRING )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:164:4: STRING
            {
            root_0 = (Object)adaptor.nil();


            STRING3=(Token)match(input,STRING,FOLLOW_STRING_in_string1241); 
            STRING3_tree = 
            new StringNode(STRING3) 
            ;
            adaptor.addChild(root_0, STRING3_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string"


    public static class template_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_literal"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:167:1: template_literal : TEMPLATE_LITERAL ;
    public final TemplateParser.template_literal_return template_literal() throws RecognitionException {
        TemplateParser.template_literal_return retval = new TemplateParser.template_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEMPLATE_LITERAL4=null;

        Object TEMPLATE_LITERAL4_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:168:2: ( TEMPLATE_LITERAL )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:168:4: TEMPLATE_LITERAL
            {
            root_0 = (Object)adaptor.nil();


            TEMPLATE_LITERAL4=(Token)match(input,TEMPLATE_LITERAL,FOLLOW_TEMPLATE_LITERAL_in_template_literal1255); 
            TEMPLATE_LITERAL4_tree = 
            new TemplateLiteralNode(TEMPLATE_LITERAL4) 
            ;
            adaptor.addChild(root_0, TEMPLATE_LITERAL4_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_literal"


    public static class template_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:171:1: template_statement : TEMPLATE_STATEMENT_START ^ statements TEMPLATE_STATEMENT_END !;
    public final TemplateParser.template_statement_return template_statement() throws RecognitionException {
        TemplateParser.template_statement_return retval = new TemplateParser.template_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEMPLATE_STATEMENT_START5=null;
        Token TEMPLATE_STATEMENT_END7=null;
        TemplateParser.statements_return statements6 =null;


        Object TEMPLATE_STATEMENT_START5_tree=null;
        Object TEMPLATE_STATEMENT_END7_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:172:2: ( TEMPLATE_STATEMENT_START ^ statements TEMPLATE_STATEMENT_END !)
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:172:4: TEMPLATE_STATEMENT_START ^ statements TEMPLATE_STATEMENT_END !
            {
            root_0 = (Object)adaptor.nil();


            TEMPLATE_STATEMENT_START5=(Token)match(input,TEMPLATE_STATEMENT_START,FOLLOW_TEMPLATE_STATEMENT_START_in_template_statement1269); 
            TEMPLATE_STATEMENT_START5_tree = 
            (Object)adaptor.create(TEMPLATE_STATEMENT_START5)
            ;
            root_0 = (Object)adaptor.becomeRoot(TEMPLATE_STATEMENT_START5_tree, root_0);


            pushFollow(FOLLOW_statements_in_template_statement1272);
            statements6=statements();

            state._fsp--;

            adaptor.addChild(root_0, statements6.getTree());

            TEMPLATE_STATEMENT_END7=(Token)match(input,TEMPLATE_STATEMENT_END,FOLLOW_TEMPLATE_STATEMENT_END_in_template_statement1274); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_statement"


    public static class template_print_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_print"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:175:1: template_print : TEMPLATE_PRINT_START ^ expression ( COMMA ! expression )* TEMPLATE_PRINT_END !;
    public final TemplateParser.template_print_return template_print() throws RecognitionException {
        TemplateParser.template_print_return retval = new TemplateParser.template_print_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEMPLATE_PRINT_START8=null;
        Token COMMA10=null;
        Token TEMPLATE_PRINT_END12=null;
        TemplateParser.expression_return expression9 =null;

        TemplateParser.expression_return expression11 =null;


        Object TEMPLATE_PRINT_START8_tree=null;
        Object COMMA10_tree=null;
        Object TEMPLATE_PRINT_END12_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:176:2: ( TEMPLATE_PRINT_START ^ expression ( COMMA ! expression )* TEMPLATE_PRINT_END !)
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:176:4: TEMPLATE_PRINT_START ^ expression ( COMMA ! expression )* TEMPLATE_PRINT_END !
            {
            root_0 = (Object)adaptor.nil();


            TEMPLATE_PRINT_START8=(Token)match(input,TEMPLATE_PRINT_START,FOLLOW_TEMPLATE_PRINT_START_in_template_print1286); 
            TEMPLATE_PRINT_START8_tree = 
            (Object)adaptor.create(TEMPLATE_PRINT_START8)
            ;
            root_0 = (Object)adaptor.becomeRoot(TEMPLATE_PRINT_START8_tree, root_0);


            pushFollow(FOLLOW_expression_in_template_print1289);
            expression9=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression9.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:176:37: ( COMMA ! expression )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:176:38: COMMA ! expression
            	    {
            	    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_template_print1292); 

            	    pushFollow(FOLLOW_expression_in_template_print1295);
            	    expression11=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression11.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            TEMPLATE_PRINT_END12=(Token)match(input,TEMPLATE_PRINT_END,FOLLOW_TEMPLATE_PRINT_END_in_template_print1299); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_print"


    public static class template_comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_comment"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:179:1: template_comment : TEMPLATE_COMMENT ;
    public final TemplateParser.template_comment_return template_comment() throws RecognitionException {
        TemplateParser.template_comment_return retval = new TemplateParser.template_comment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEMPLATE_COMMENT13=null;

        Object TEMPLATE_COMMENT13_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:180:2: ( TEMPLATE_COMMENT )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:180:4: TEMPLATE_COMMENT
            {
            root_0 = (Object)adaptor.nil();


            TEMPLATE_COMMENT13=(Token)match(input,TEMPLATE_COMMENT,FOLLOW_TEMPLATE_COMMENT_in_template_comment1312); 
            TEMPLATE_COMMENT13_tree = 
            (Object)adaptor.create(TEMPLATE_COMMENT13)
            ;
            adaptor.addChild(root_0, TEMPLATE_COMMENT13_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_comment"


    public static class template_raw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_raw"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:183:1: template_raw : TEMPLATE_RAW ;
    public final TemplateParser.template_raw_return template_raw() throws RecognitionException {
        TemplateParser.template_raw_return retval = new TemplateParser.template_raw_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TEMPLATE_RAW14=null;

        Object TEMPLATE_RAW14_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:184:2: ( TEMPLATE_RAW )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:184:4: TEMPLATE_RAW
            {
            root_0 = (Object)adaptor.nil();


            TEMPLATE_RAW14=(Token)match(input,TEMPLATE_RAW,FOLLOW_TEMPLATE_RAW_in_template_raw1324); 
            TEMPLATE_RAW14_tree = 
            new TemplateRawNode(TEMPLATE_RAW14) 
            ;
            adaptor.addChild(root_0, TEMPLATE_RAW14_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_raw"


    public static class template_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:187:1: template : ( template_literal | template_statement | template_comment | template_raw | template_print )* EOF ;
    public final TemplateParser.template_return template() throws RecognitionException {
        TemplateParser.template_return retval = new TemplateParser.template_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF20=null;
        TemplateParser.template_literal_return template_literal15 =null;

        TemplateParser.template_statement_return template_statement16 =null;

        TemplateParser.template_comment_return template_comment17 =null;

        TemplateParser.template_raw_return template_raw18 =null;

        TemplateParser.template_print_return template_print19 =null;


        Object EOF20_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:188:2: ( ( template_literal | template_statement | template_comment | template_raw | template_print )* EOF )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:188:4: ( template_literal | template_statement | template_comment | template_raw | template_print )* EOF
            {
            root_0 = (Object)adaptor.nil();


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:188:4: ( template_literal | template_statement | template_comment | template_raw | template_print )*
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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:188:5: template_literal
            	    {
            	    pushFollow(FOLLOW_template_literal_in_template1339);
            	    template_literal15=template_literal();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_literal15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:189:4: template_statement
            	    {
            	    pushFollow(FOLLOW_template_statement_in_template1344);
            	    template_statement16=template_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_statement16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:190:4: template_comment
            	    {
            	    pushFollow(FOLLOW_template_comment_in_template1349);
            	    template_comment17=template_comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_comment17.getTree());

            	    }
            	    break;
            	case 4 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:191:4: template_raw
            	    {
            	    pushFollow(FOLLOW_template_raw_in_template1354);
            	    template_raw18=template_raw();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_raw18.getTree());

            	    }
            	    break;
            	case 5 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:192:4: template_print
            	    {
            	    pushFollow(FOLLOW_template_print_in_template1359);
            	    template_print19=template_print();

            	    state._fsp--;

            	    adaptor.addChild(root_0, template_print19.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            EOF20=(Token)match(input,EOF,FOLLOW_EOF_in_template1365); 
            EOF20_tree = 
            (Object)adaptor.create(EOF20)
            ;
            adaptor.addChild(root_0, EOF20_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template"


    public static class statements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statements"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:195:1: statements : ( statement ( SEMI ! ( statements )? )? | blocked_statement ( COLON ! ( statements )? )? );
    public final TemplateParser.statements_return statements() throws RecognitionException {
        TemplateParser.statements_return retval = new TemplateParser.statements_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SEMI22=null;
        Token COLON25=null;
        TemplateParser.statement_return statement21 =null;

        TemplateParser.statements_return statements23 =null;

        TemplateParser.blocked_statement_return blocked_statement24 =null;

        TemplateParser.statements_return statements26 =null;


        Object SEMI22_tree=null;
        Object COLON25_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:196:2: ( statement ( SEMI ! ( statements )? )? | blocked_statement ( COLON ! ( statements )? )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==CONTINUE||(LA7_0 >= END && LA7_0 <= EQ)||(LA7_0 >= EXTENDS && LA7_0 <= FLOAT)||LA7_0==ID||(LA7_0 >= INCLUDE && LA7_0 <= INT_HEX)||LA7_0==LPAREN||LA7_0==LSQUARE||LA7_0==MINUS||(LA7_0 >= NOT && LA7_0 <= NULL)||LA7_0==PLUS||LA7_0==STRING||LA7_0==TILDE||LA7_0==TRUE||LA7_0==VAR) ) {
                alt7=1;
            }
            else if ( (LA7_0==BLOCK||(LA7_0 >= ELIF && LA7_0 <= ELSE)||LA7_0==FOR||LA7_0==IF||LA7_0==JOIN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:196:4: statement ( SEMI ! ( statements )? )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_statements1374);
                    statement21=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement21.getTree());

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:196:14: ( SEMI ! ( statements )? )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==SEMI) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:196:15: SEMI ! ( statements )?
                            {
                            SEMI22=(Token)match(input,SEMI,FOLLOW_SEMI_in_statements1377); 

                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:196:21: ( statements )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==BLOCK||LA3_0==CONTINUE||(LA3_0 >= ELIF && LA3_0 <= EQ)||(LA3_0 >= EXTENDS && LA3_0 <= FOR)||(LA3_0 >= ID && LA3_0 <= IF)||(LA3_0 >= INCLUDE && LA3_0 <= INT_HEX)||LA3_0==JOIN||LA3_0==LPAREN||LA3_0==LSQUARE||LA3_0==MINUS||(LA3_0 >= NOT && LA3_0 <= NULL)||LA3_0==PLUS||LA3_0==STRING||LA3_0==TILDE||LA3_0==TRUE||LA3_0==VAR) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:196:21: statements
                                    {
                                    pushFollow(FOLLOW_statements_in_statements1380);
                                    statements23=statements();

                                    state._fsp--;

                                    adaptor.addChild(root_0, statements23.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:197:4: blocked_statement ( COLON ! ( statements )? )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_blocked_statement_in_statements1388);
                    blocked_statement24=blocked_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, blocked_statement24.getTree());

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:197:22: ( COLON ! ( statements )? )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==COLON) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:197:23: COLON ! ( statements )?
                            {
                            COLON25=(Token)match(input,COLON,FOLLOW_COLON_in_statements1391); 

                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:197:30: ( statements )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==BLOCK||LA5_0==CONTINUE||(LA5_0 >= ELIF && LA5_0 <= EQ)||(LA5_0 >= EXTENDS && LA5_0 <= FOR)||(LA5_0 >= ID && LA5_0 <= IF)||(LA5_0 >= INCLUDE && LA5_0 <= INT_HEX)||LA5_0==JOIN||LA5_0==LPAREN||LA5_0==LSQUARE||LA5_0==MINUS||(LA5_0 >= NOT && LA5_0 <= NULL)||LA5_0==PLUS||LA5_0==STRING||LA5_0==TILDE||LA5_0==TRUE||LA5_0==VAR) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:197:30: statements
                                    {
                                    pushFollow(FOLLOW_statements_in_statements1394);
                                    statements26=statements();

                                    state._fsp--;

                                    adaptor.addChild(root_0, statements26.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statements"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:199:1: statement : ( extends_statement | include_statement | var_statement | continue_statement | end_statement | print_statement | assignment_statement );
    public final TemplateParser.statement_return statement() throws RecognitionException {
        TemplateParser.statement_return retval = new TemplateParser.statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TemplateParser.extends_statement_return extends_statement27 =null;

        TemplateParser.include_statement_return include_statement28 =null;

        TemplateParser.var_statement_return var_statement29 =null;

        TemplateParser.continue_statement_return continue_statement30 =null;

        TemplateParser.end_statement_return end_statement31 =null;

        TemplateParser.print_statement_return print_statement32 =null;

        TemplateParser.assignment_statement_return assignment_statement33 =null;



        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:2: ( extends_statement | include_statement | var_statement | continue_statement | end_statement | print_statement | assignment_statement )
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
            case FALSE:
            case FLOAT:
            case ID:
            case INT:
            case INT_HEX:
            case LPAREN:
            case LSQUARE:
            case MINUS:
            case NOT:
            case NULL:
            case PLUS:
            case STRING:
            case TILDE:
            case TRUE:
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:4: extends_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_extends_statement_in_statement1407);
                    extends_statement27=extends_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, extends_statement27.getTree());

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:24: include_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_include_statement_in_statement1411);
                    include_statement28=include_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, include_statement28.getTree());

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:44: var_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_var_statement_in_statement1415);
                    var_statement29=var_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, var_statement29.getTree());

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:60: continue_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_continue_statement_in_statement1419);
                    continue_statement30=continue_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, continue_statement30.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:81: end_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_end_statement_in_statement1423);
                    end_statement31=end_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, end_statement31.getTree());

                    }
                    break;
                case 6 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:97: print_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_print_statement_in_statement1427);
                    print_statement32=print_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, print_statement32.getTree());

                    }
                    break;
                case 7 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:200:115: assignment_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignment_statement_in_statement1431);
                    assignment_statement33=assignment_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_statement33.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class blocked_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blocked_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:202:1: blocked_statement : ( if_statement | elif_statement | for_statement | else_statement | block_statement | join_statement );
    public final TemplateParser.blocked_statement_return blocked_statement() throws RecognitionException {
        TemplateParser.blocked_statement_return retval = new TemplateParser.blocked_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TemplateParser.if_statement_return if_statement34 =null;

        TemplateParser.elif_statement_return elif_statement35 =null;

        TemplateParser.for_statement_return for_statement36 =null;

        TemplateParser.else_statement_return else_statement37 =null;

        TemplateParser.block_statement_return block_statement38 =null;

        TemplateParser.join_statement_return join_statement39 =null;



        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:2: ( if_statement | elif_statement | for_statement | else_statement | block_statement | join_statement )
            int alt9=6;
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
            case JOIN:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:4: if_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_if_statement_in_blocked_statement1440);
                    if_statement34=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement34.getTree());

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:19: elif_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elif_statement_in_blocked_statement1444);
                    elif_statement35=elif_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, elif_statement35.getTree());

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:36: for_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_for_statement_in_blocked_statement1448);
                    for_statement36=for_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, for_statement36.getTree());

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:52: else_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_else_statement_in_blocked_statement1452);
                    else_statement37=else_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, else_statement37.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:69: block_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_statement_in_blocked_statement1456);
                    block_statement38=block_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, block_statement38.getTree());

                    }
                    break;
                case 6 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:203:87: join_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_join_statement_in_blocked_statement1460);
                    join_statement39=join_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, join_statement39.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blocked_statement"


    public static class assignment_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:205:1: assignment_statement : assignment_expression ;
    public final TemplateParser.assignment_statement_return assignment_statement() throws RecognitionException {
        TemplateParser.assignment_statement_return retval = new TemplateParser.assignment_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TemplateParser.assignment_expression_return assignment_expression40 =null;



        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:206:2: ( assignment_expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:206:4: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_assignment_statement1469);
            assignment_expression40=assignment_expression();

            state._fsp--;

            adaptor.addChild(root_0, assignment_expression40.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_statement"


    public static class print_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "print_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:208:1: print_statement : EQ expression ( COMMA expression )* -> ^( PRINT ( expression )+ ) ;
    public final TemplateParser.print_statement_return print_statement() throws RecognitionException {
        TemplateParser.print_statement_return retval = new TemplateParser.print_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQ41=null;
        Token COMMA43=null;
        TemplateParser.expression_return expression42 =null;

        TemplateParser.expression_return expression44 =null;


        Object EQ41_tree=null;
        Object COMMA43_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:209:2: ( EQ expression ( COMMA expression )* -> ^( PRINT ( expression )+ ) )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:209:4: EQ expression ( COMMA expression )*
            {
            EQ41=(Token)match(input,EQ,FOLLOW_EQ_in_print_statement1478);  
            stream_EQ.add(EQ41);


            pushFollow(FOLLOW_expression_in_print_statement1480);
            expression42=expression();

            state._fsp--;

            stream_expression.add(expression42.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:209:18: ( COMMA expression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:209:19: COMMA expression
            	    {
            	    COMMA43=(Token)match(input,COMMA,FOLLOW_COMMA_in_print_statement1483);  
            	    stream_COMMA.add(COMMA43);


            	    pushFollow(FOLLOW_expression_in_print_statement1485);
            	    expression44=expression();

            	    state._fsp--;

            	    stream_expression.add(expression44.getTree());

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
            // 209:38: -> ^( PRINT ( expression )+ )
            {
                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:209:41: ^( PRINT ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PRINT, "PRINT")
                , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "print_statement"


    public static class var_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:211:1: var_statement : VAR ^ id ( EQ ! expression )? ;
    public final TemplateParser.var_statement_return var_statement() throws RecognitionException {
        TemplateParser.var_statement_return retval = new TemplateParser.var_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR45=null;
        Token EQ47=null;
        TemplateParser.id_return id46 =null;

        TemplateParser.expression_return expression48 =null;


        Object VAR45_tree=null;
        Object EQ47_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:212:2: ( VAR ^ id ( EQ ! expression )? )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:212:4: VAR ^ id ( EQ ! expression )?
            {
            root_0 = (Object)adaptor.nil();


            VAR45=(Token)match(input,VAR,FOLLOW_VAR_in_var_statement1505); 
            VAR45_tree = 
            (Object)adaptor.create(VAR45)
            ;
            root_0 = (Object)adaptor.becomeRoot(VAR45_tree, root_0);


            pushFollow(FOLLOW_id_in_var_statement1508);
            id46=id();

            state._fsp--;

            adaptor.addChild(root_0, id46.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:212:12: ( EQ ! expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EQ) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:212:13: EQ ! expression
                    {
                    EQ47=(Token)match(input,EQ,FOLLOW_EQ_in_var_statement1511); 

                    pushFollow(FOLLOW_expression_in_var_statement1514);
                    expression48=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression48.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var_statement"


    public static class block_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:214:1: block_statement : BLOCK ^ string ;
    public final TemplateParser.block_statement_return block_statement() throws RecognitionException {
        TemplateParser.block_statement_return retval = new TemplateParser.block_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BLOCK49=null;
        TemplateParser.string_return string50 =null;


        Object BLOCK49_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:215:2: ( BLOCK ^ string )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:215:4: BLOCK ^ string
            {
            root_0 = (Object)adaptor.nil();


            BLOCK49=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block_statement1525); 
            BLOCK49_tree = 
            (Object)adaptor.create(BLOCK49)
            ;
            root_0 = (Object)adaptor.becomeRoot(BLOCK49_tree, root_0);


            pushFollow(FOLLOW_string_in_block_statement1528);
            string50=string();

            state._fsp--;

            adaptor.addChild(root_0, string50.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_statement"


    public static class extends_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extends_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:217:1: extends_statement : EXTENDS ^ string ;
    public final TemplateParser.extends_statement_return extends_statement() throws RecognitionException {
        TemplateParser.extends_statement_return retval = new TemplateParser.extends_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXTENDS51=null;
        TemplateParser.string_return string52 =null;


        Object EXTENDS51_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:218:2: ( EXTENDS ^ string )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:218:4: EXTENDS ^ string
            {
            root_0 = (Object)adaptor.nil();


            EXTENDS51=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extends_statement1537); 
            EXTENDS51_tree = 
            (Object)adaptor.create(EXTENDS51)
            ;
            root_0 = (Object)adaptor.becomeRoot(EXTENDS51_tree, root_0);


            pushFollow(FOLLOW_string_in_extends_statement1540);
            string52=string();

            state._fsp--;

            adaptor.addChild(root_0, string52.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extends_statement"


    public static class include_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:220:1: include_statement : INCLUDE ^ string ;
    public final TemplateParser.include_statement_return include_statement() throws RecognitionException {
        TemplateParser.include_statement_return retval = new TemplateParser.include_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INCLUDE53=null;
        TemplateParser.string_return string54 =null;


        Object INCLUDE53_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:221:2: ( INCLUDE ^ string )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:221:4: INCLUDE ^ string
            {
            root_0 = (Object)adaptor.nil();


            INCLUDE53=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_include_statement1549); 
            INCLUDE53_tree = 
            (Object)adaptor.create(INCLUDE53)
            ;
            root_0 = (Object)adaptor.becomeRoot(INCLUDE53_tree, root_0);


            pushFollow(FOLLOW_string_in_include_statement1552);
            string54=string();

            state._fsp--;

            adaptor.addChild(root_0, string54.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include_statement"


    public static class else_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:223:1: else_statement : ELSE ;
    public final TemplateParser.else_statement_return else_statement() throws RecognitionException {
        TemplateParser.else_statement_return retval = new TemplateParser.else_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELSE55=null;

        Object ELSE55_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:224:2: ( ELSE )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:224:4: ELSE
            {
            root_0 = (Object)adaptor.nil();


            ELSE55=(Token)match(input,ELSE,FOLLOW_ELSE_in_else_statement1561); 
            ELSE55_tree = 
            (Object)adaptor.create(ELSE55)
            ;
            adaptor.addChild(root_0, ELSE55_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_statement"


    public static class join_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:226:1: join_statement : JOIN ;
    public final TemplateParser.join_statement_return join_statement() throws RecognitionException {
        TemplateParser.join_statement_return retval = new TemplateParser.join_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token JOIN56=null;

        Object JOIN56_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:227:2: ( JOIN )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:227:4: JOIN
            {
            root_0 = (Object)adaptor.nil();


            JOIN56=(Token)match(input,JOIN,FOLLOW_JOIN_in_join_statement1570); 
            JOIN56_tree = 
            (Object)adaptor.create(JOIN56)
            ;
            adaptor.addChild(root_0, JOIN56_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_statement"


    public static class elif_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elif_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:229:1: elif_statement : ELIF ^ expression ;
    public final TemplateParser.elif_statement_return elif_statement() throws RecognitionException {
        TemplateParser.elif_statement_return retval = new TemplateParser.elif_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ELIF57=null;
        TemplateParser.expression_return expression58 =null;


        Object ELIF57_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:230:2: ( ELIF ^ expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:230:4: ELIF ^ expression
            {
            root_0 = (Object)adaptor.nil();


            ELIF57=(Token)match(input,ELIF,FOLLOW_ELIF_in_elif_statement1579); 
            ELIF57_tree = 
            (Object)adaptor.create(ELIF57)
            ;
            root_0 = (Object)adaptor.becomeRoot(ELIF57_tree, root_0);


            pushFollow(FOLLOW_expression_in_elif_statement1582);
            expression58=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression58.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elif_statement"


    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:232:1: if_statement : IF ^ expression ;
    public final TemplateParser.if_statement_return if_statement() throws RecognitionException {
        TemplateParser.if_statement_return retval = new TemplateParser.if_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IF59=null;
        TemplateParser.expression_return expression60 =null;


        Object IF59_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:233:2: ( IF ^ expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:233:4: IF ^ expression
            {
            root_0 = (Object)adaptor.nil();


            IF59=(Token)match(input,IF,FOLLOW_IF_in_if_statement1591); 
            IF59_tree = 
            (Object)adaptor.create(IF59)
            ;
            root_0 = (Object)adaptor.becomeRoot(IF59_tree, root_0);


            pushFollow(FOLLOW_expression_in_if_statement1594);
            expression60=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression60.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class for_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:235:1: for_statement : FOR ^ id IN ! expression ( ORDER BY ! expression )? ( LIMIT expression )? ;
    public final TemplateParser.for_statement_return for_statement() throws RecognitionException {
        TemplateParser.for_statement_return retval = new TemplateParser.for_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FOR61=null;
        Token IN63=null;
        Token ORDER65=null;
        Token BY66=null;
        Token LIMIT68=null;
        TemplateParser.id_return id62 =null;

        TemplateParser.expression_return expression64 =null;

        TemplateParser.expression_return expression67 =null;

        TemplateParser.expression_return expression69 =null;


        Object FOR61_tree=null;
        Object IN63_tree=null;
        Object ORDER65_tree=null;
        Object BY66_tree=null;
        Object LIMIT68_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:236:2: ( FOR ^ id IN ! expression ( ORDER BY ! expression )? ( LIMIT expression )? )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:236:4: FOR ^ id IN ! expression ( ORDER BY ! expression )? ( LIMIT expression )?
            {
            root_0 = (Object)adaptor.nil();


            FOR61=(Token)match(input,FOR,FOLLOW_FOR_in_for_statement1603); 
            FOR61_tree = 
            (Object)adaptor.create(FOR61)
            ;
            root_0 = (Object)adaptor.becomeRoot(FOR61_tree, root_0);


            pushFollow(FOLLOW_id_in_for_statement1606);
            id62=id();

            state._fsp--;

            adaptor.addChild(root_0, id62.getTree());

            IN63=(Token)match(input,IN,FOLLOW_IN_in_for_statement1608); 

            pushFollow(FOLLOW_expression_in_for_statement1611);
            expression64=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression64.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:236:27: ( ORDER BY ! expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ORDER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:236:28: ORDER BY ! expression
                    {
                    ORDER65=(Token)match(input,ORDER,FOLLOW_ORDER_in_for_statement1614); 
                    ORDER65_tree = 
                    (Object)adaptor.create(ORDER65)
                    ;
                    adaptor.addChild(root_0, ORDER65_tree);


                    BY66=(Token)match(input,BY,FOLLOW_BY_in_for_statement1616); 

                    pushFollow(FOLLOW_expression_in_for_statement1619);
                    expression67=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression67.getTree());

                    }
                    break;

            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:236:51: ( LIMIT expression )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LIMIT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:236:52: LIMIT expression
                    {
                    LIMIT68=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_for_statement1624); 
                    LIMIT68_tree = 
                    (Object)adaptor.create(LIMIT68)
                    ;
                    adaptor.addChild(root_0, LIMIT68_tree);


                    pushFollow(FOLLOW_expression_in_for_statement1626);
                    expression69=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression69.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_statement"


    public static class continue_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "continue_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:238:1: continue_statement : CONTINUE ;
    public final TemplateParser.continue_statement_return continue_statement() throws RecognitionException {
        TemplateParser.continue_statement_return retval = new TemplateParser.continue_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CONTINUE70=null;

        Object CONTINUE70_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:239:2: ( CONTINUE )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:239:4: CONTINUE
            {
            root_0 = (Object)adaptor.nil();


            CONTINUE70=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continue_statement1637); 
            CONTINUE70_tree = 
            (Object)adaptor.create(CONTINUE70)
            ;
            adaptor.addChild(root_0, CONTINUE70_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "continue_statement"


    public static class end_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "end_statement"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:241:1: end_statement : END ;
    public final TemplateParser.end_statement_return end_statement() throws RecognitionException {
        TemplateParser.end_statement_return retval = new TemplateParser.end_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token END71=null;

        Object END71_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:242:2: ( END )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:242:4: END
            {
            root_0 = (Object)adaptor.nil();


            END71=(Token)match(input,END,FOLLOW_END_in_end_statement1646); 
            END71_tree = 
            (Object)adaptor.create(END71)
            ;
            adaptor.addChild(root_0, END71_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "end_statement"


    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:244:1: list : ( ( '[' ']' ) -> ^( LIST ) | ( '[' list_expressions ']' ) -> ^( LIST list_expressions ) );
    public final TemplateParser.list_return list() throws RecognitionException {
        TemplateParser.list_return retval = new TemplateParser.list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal72=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token char_literal76=null;
        TemplateParser.list_expressions_return list_expressions75 =null;


        Object char_literal72_tree=null;
        Object char_literal73_tree=null;
        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleSubtreeStream stream_list_expressions=new RewriteRuleSubtreeStream(adaptor,"rule list_expressions");
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:245:2: ( ( '[' ']' ) -> ^( LIST ) | ( '[' list_expressions ']' ) -> ^( LIST list_expressions ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LSQUARE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RSQUARE) ) {
                    alt14=1;
                }
                else if ( ((LA14_1 >= FALSE && LA14_1 <= FLOAT)||LA14_1==ID||(LA14_1 >= INT && LA14_1 <= INT_HEX)||LA14_1==LPAREN||LA14_1==LSQUARE||LA14_1==MINUS||(LA14_1 >= NOT && LA14_1 <= NULL)||LA14_1==PLUS||LA14_1==STRING||LA14_1==TILDE||LA14_1==TRUE) ) {
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:245:4: ( '[' ']' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:245:4: ( '[' ']' )
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:245:5: '[' ']'
                    {
                    char_literal72=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_list1656);  
                    stream_LSQUARE.add(char_literal72);


                    char_literal73=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_list1658);  
                    stream_RSQUARE.add(char_literal73);


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
                    // 245:14: -> ^( LIST )
                    {
                        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:245:17: ^( LIST )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:246:4: ( '[' list_expressions ']' )
                    {
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:246:4: ( '[' list_expressions ']' )
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:246:5: '[' list_expressions ']'
                    {
                    char_literal74=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_list1671);  
                    stream_LSQUARE.add(char_literal74);


                    pushFollow(FOLLOW_list_expressions_in_list1673);
                    list_expressions75=list_expressions();

                    state._fsp--;

                    stream_list_expressions.add(list_expressions75.getTree());

                    char_literal76=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_list1675);  
                    stream_RSQUARE.add(char_literal76);


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
                    // 246:31: -> ^( LIST list_expressions )
                    {
                        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:246:34: ^( LIST list_expressions )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(LIST, "LIST")
                        , root_1);

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list"


    public static class list_expressions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list_expressions"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:248:1: list_expressions : weakest_binding_expression ( ',' ! weakest_binding_expression )* ;
    public final TemplateParser.list_expressions_return list_expressions() throws RecognitionException {
        TemplateParser.list_expressions_return retval = new TemplateParser.list_expressions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal78=null;
        TemplateParser.weakest_binding_expression_return weakest_binding_expression77 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression79 =null;


        Object char_literal78_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:249:2: ( weakest_binding_expression ( ',' ! weakest_binding_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:249:5: weakest_binding_expression ( ',' ! weakest_binding_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_weakest_binding_expression_in_list_expressions1694);
            weakest_binding_expression77=weakest_binding_expression();

            state._fsp--;

            adaptor.addChild(root_0, weakest_binding_expression77.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:249:32: ( ',' ! weakest_binding_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:249:33: ',' ! weakest_binding_expression
            	    {
            	    char_literal78=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expressions1697); 

            	    pushFollow(FOLLOW_weakest_binding_expression_in_list_expressions1700);
            	    weakest_binding_expression79=weakest_binding_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, weakest_binding_expression79.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list_expressions"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:254:1: atom : (sid= id -> ^( SCOPE_LOOKUP[sid.start] ) | constant | list | '(' ! expression ^ ')' !);
    public final TemplateParser.atom_return atom() throws RecognitionException {
        TemplateParser.atom_return retval = new TemplateParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        Token char_literal84=null;
        TemplateParser.id_return sid =null;

        TemplateParser.constant_return constant80 =null;

        TemplateParser.list_return list81 =null;

        TemplateParser.expression_return expression83 =null;


        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:255:2: (sid= id -> ^( SCOPE_LOOKUP[sid.start] ) | constant | list | '(' ! expression ^ ')' !)
            int alt16=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt16=1;
                }
                break;
            case FALSE:
            case FLOAT:
            case INT:
            case INT_HEX:
            case NULL:
            case STRING:
            case TRUE:
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:255:4: sid= id
                    {
                    pushFollow(FOLLOW_id_in_atom1715);
                    sid=id();

                    state._fsp--;

                    stream_id.add(sid.getTree());

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
                    // 255:11: -> ^( SCOPE_LOOKUP[sid.start] )
                    {
                        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:255:14: ^( SCOPE_LOOKUP[sid.start] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(SCOPE_LOOKUP, sid.start)
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:256:4: constant
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_constant_in_atom1727);
                    constant80=constant();

                    state._fsp--;

                    adaptor.addChild(root_0, constant80.getTree());

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:257:4: list
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_list_in_atom1732);
                    list81=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list81.getTree());

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:258:4: '(' ! expression ^ ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom1737); 

                    pushFollow(FOLLOW_expression_in_atom1740);
                    expression83=expression();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(expression83.getTree(), root_0);

                    char_literal84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom1743); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:262:1: expression : weakest_binding_expression ;
    public final TemplateParser.expression_return expression() throws RecognitionException {
        TemplateParser.expression_return retval = new TemplateParser.expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression85 =null;



        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:263:2: ( weakest_binding_expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:263:4: weakest_binding_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_weakest_binding_expression_in_expression1756);
            weakest_binding_expression85=weakest_binding_expression();

            state._fsp--;

            adaptor.addChild(root_0, weakest_binding_expression85.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class weakest_binding_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "weakest_binding_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:266:1: weakest_binding_expression : assignment_expression ;
    public final TemplateParser.weakest_binding_expression_return weakest_binding_expression() throws RecognitionException {
        TemplateParser.weakest_binding_expression_return retval = new TemplateParser.weakest_binding_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TemplateParser.assignment_expression_return assignment_expression86 =null;



        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:267:2: ( assignment_expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:267:4: assignment_expression
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_assignment_expression_in_weakest_binding_expression1767);
            assignment_expression86=assignment_expression();

            state._fsp--;

            adaptor.addChild(root_0, assignment_expression86.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "weakest_binding_expression"


    public static class assignment_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:270:1: assignment_expression : ( id '=' ^)* in_expression ;
    public final TemplateParser.assignment_expression_return assignment_expression() throws RecognitionException {
        TemplateParser.assignment_expression_return retval = new TemplateParser.assignment_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal88=null;
        TemplateParser.id_return id87 =null;

        TemplateParser.in_expression_return in_expression89 =null;


        Object char_literal88_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:271:2: ( ( id '=' ^)* in_expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:271:4: ( id '=' ^)* in_expression
            {
            root_0 = (Object)adaptor.nil();


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:271:4: ( id '=' ^)*
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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:271:5: id '=' ^
            	    {
            	    pushFollow(FOLLOW_id_in_assignment_expression1779);
            	    id87=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, id87.getTree());

            	    char_literal88=(Token)match(input,EQ,FOLLOW_EQ_in_assignment_expression1781); 
            	    char_literal88_tree = 
            	    (Object)adaptor.create(char_literal88)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal88_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            pushFollow(FOLLOW_in_expression_in_assignment_expression1786);
            in_expression89=in_expression();

            state._fsp--;

            adaptor.addChild(root_0, in_expression89.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"


    public static class in_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:274:1: in_expression : conditional_expression ( IN ^ conditional_expression )* ;
    public final TemplateParser.in_expression_return in_expression() throws RecognitionException {
        TemplateParser.in_expression_return retval = new TemplateParser.in_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IN91=null;
        TemplateParser.conditional_expression_return conditional_expression90 =null;

        TemplateParser.conditional_expression_return conditional_expression92 =null;


        Object IN91_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:275:2: ( conditional_expression ( IN ^ conditional_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:275:4: conditional_expression ( IN ^ conditional_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_in_expression1797);
            conditional_expression90=conditional_expression();

            state._fsp--;

            adaptor.addChild(root_0, conditional_expression90.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:275:27: ( IN ^ conditional_expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IN) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:275:28: IN ^ conditional_expression
            	    {
            	    IN91=(Token)match(input,IN,FOLLOW_IN_in_in_expression1800); 
            	    IN91_tree = 
            	    (Object)adaptor.create(IN91)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(IN91_tree, root_0);


            	    pushFollow(FOLLOW_conditional_expression_in_in_expression1803);
            	    conditional_expression92=conditional_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, conditional_expression92.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_expression"


    public static class conditional_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:278:1: conditional_expression : range_expression ( '?' ^ weakest_binding_expression ':' ! weakest_binding_expression )? ;
    public final TemplateParser.conditional_expression_return conditional_expression() throws RecognitionException {
        TemplateParser.conditional_expression_return retval = new TemplateParser.conditional_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        TemplateParser.range_expression_return range_expression93 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression95 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression97 =null;


        Object char_literal94_tree=null;
        Object char_literal96_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:279:2: ( range_expression ( '?' ^ weakest_binding_expression ':' ! weakest_binding_expression )? )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:279:4: range_expression ( '?' ^ weakest_binding_expression ':' ! weakest_binding_expression )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_range_expression_in_conditional_expression1816);
            range_expression93=range_expression();

            state._fsp--;

            adaptor.addChild(root_0, range_expression93.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:279:21: ( '?' ^ weakest_binding_expression ':' ! weakest_binding_expression )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==QUESTION) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:279:22: '?' ^ weakest_binding_expression ':' ! weakest_binding_expression
                    {
                    char_literal94=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_conditional_expression1819); 
                    char_literal94_tree = 
                    (Object)adaptor.create(char_literal94)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal94_tree, root_0);


                    pushFollow(FOLLOW_weakest_binding_expression_in_conditional_expression1822);
                    weakest_binding_expression95=weakest_binding_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, weakest_binding_expression95.getTree());

                    char_literal96=(Token)match(input,COLON,FOLLOW_COLON_in_conditional_expression1824); 

                    pushFollow(FOLLOW_weakest_binding_expression_in_conditional_expression1827);
                    weakest_binding_expression97=weakest_binding_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, weakest_binding_expression97.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"


    public static class range_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "range_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:282:1: range_expression : bitwise_or_expression ( TO ^ weakest_binding_expression ( BY ! weakest_binding_expression )? )? ;
    public final TemplateParser.range_expression_return range_expression() throws RecognitionException {
        TemplateParser.range_expression_return retval = new TemplateParser.range_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TO99=null;
        Token BY101=null;
        TemplateParser.bitwise_or_expression_return bitwise_or_expression98 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression100 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression102 =null;


        Object TO99_tree=null;
        Object BY101_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:283:2: ( bitwise_or_expression ( TO ^ weakest_binding_expression ( BY ! weakest_binding_expression )? )? )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:283:4: bitwise_or_expression ( TO ^ weakest_binding_expression ( BY ! weakest_binding_expression )? )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwise_or_expression_in_range_expression1840);
            bitwise_or_expression98=bitwise_or_expression();

            state._fsp--;

            adaptor.addChild(root_0, bitwise_or_expression98.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:283:26: ( TO ^ weakest_binding_expression ( BY ! weakest_binding_expression )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==TO) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:283:27: TO ^ weakest_binding_expression ( BY ! weakest_binding_expression )?
                    {
                    TO99=(Token)match(input,TO,FOLLOW_TO_in_range_expression1843); 
                    TO99_tree = 
                    (Object)adaptor.create(TO99)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TO99_tree, root_0);


                    pushFollow(FOLLOW_weakest_binding_expression_in_range_expression1846);
                    weakest_binding_expression100=weakest_binding_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, weakest_binding_expression100.getTree());

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:283:58: ( BY ! weakest_binding_expression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BY) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:283:59: BY ! weakest_binding_expression
                            {
                            BY101=(Token)match(input,BY,FOLLOW_BY_in_range_expression1849); 

                            pushFollow(FOLLOW_weakest_binding_expression_in_range_expression1852);
                            weakest_binding_expression102=weakest_binding_expression();

                            state._fsp--;

                            adaptor.addChild(root_0, weakest_binding_expression102.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "range_expression"


    public static class bitwise_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwise_or_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:286:1: bitwise_or_expression : bitwise_and_expression ( IOR ^ bitwise_and_expression )* ;
    public final TemplateParser.bitwise_or_expression_return bitwise_or_expression() throws RecognitionException {
        TemplateParser.bitwise_or_expression_return retval = new TemplateParser.bitwise_or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IOR104=null;
        TemplateParser.bitwise_and_expression_return bitwise_and_expression103 =null;

        TemplateParser.bitwise_and_expression_return bitwise_and_expression105 =null;


        Object IOR104_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:287:2: ( bitwise_and_expression ( IOR ^ bitwise_and_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:287:4: bitwise_and_expression ( IOR ^ bitwise_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitwise_and_expression_in_bitwise_or_expression1867);
            bitwise_and_expression103=bitwise_and_expression();

            state._fsp--;

            adaptor.addChild(root_0, bitwise_and_expression103.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:287:27: ( IOR ^ bitwise_and_expression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==IOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:287:28: IOR ^ bitwise_and_expression
            	    {
            	    IOR104=(Token)match(input,IOR,FOLLOW_IOR_in_bitwise_or_expression1870); 
            	    IOR104_tree = 
            	    (Object)adaptor.create(IOR104)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(IOR104_tree, root_0);


            	    pushFollow(FOLLOW_bitwise_and_expression_in_bitwise_or_expression1873);
            	    bitwise_and_expression105=bitwise_and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwise_and_expression105.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitwise_or_expression"


    public static class bitwise_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bitwise_and_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:290:1: bitwise_and_expression : logical_or_expression ( IAND ^ logical_or_expression )* ;
    public final TemplateParser.bitwise_and_expression_return bitwise_and_expression() throws RecognitionException {
        TemplateParser.bitwise_and_expression_return retval = new TemplateParser.bitwise_and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IAND107=null;
        TemplateParser.logical_or_expression_return logical_or_expression106 =null;

        TemplateParser.logical_or_expression_return logical_or_expression108 =null;


        Object IAND107_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:291:2: ( logical_or_expression ( IAND ^ logical_or_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:291:4: logical_or_expression ( IAND ^ logical_or_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_or_expression_in_bitwise_and_expression1886);
            logical_or_expression106=logical_or_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_or_expression106.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:291:26: ( IAND ^ logical_or_expression )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==IAND) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:291:27: IAND ^ logical_or_expression
            	    {
            	    IAND107=(Token)match(input,IAND,FOLLOW_IAND_in_bitwise_and_expression1889); 
            	    IAND107_tree = 
            	    (Object)adaptor.create(IAND107)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(IAND107_tree, root_0);


            	    pushFollow(FOLLOW_logical_or_expression_in_bitwise_and_expression1892);
            	    logical_or_expression108=logical_or_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_or_expression108.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bitwise_and_expression"


    public static class logical_or_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_or_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:294:1: logical_or_expression : logical_xor_expression ( OR ^ logical_xor_expression )* ;
    public final TemplateParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
        TemplateParser.logical_or_expression_return retval = new TemplateParser.logical_or_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token OR110=null;
        TemplateParser.logical_xor_expression_return logical_xor_expression109 =null;

        TemplateParser.logical_xor_expression_return logical_xor_expression111 =null;


        Object OR110_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:295:2: ( logical_xor_expression ( OR ^ logical_xor_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:295:4: logical_xor_expression ( OR ^ logical_xor_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_xor_expression_in_logical_or_expression1905);
            logical_xor_expression109=logical_xor_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_xor_expression109.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:295:27: ( OR ^ logical_xor_expression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:295:28: OR ^ logical_xor_expression
            	    {
            	    OR110=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expression1908); 
            	    OR110_tree = 
            	    (Object)adaptor.create(OR110)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(OR110_tree, root_0);


            	    pushFollow(FOLLOW_logical_xor_expression_in_logical_or_expression1911);
            	    logical_xor_expression111=logical_xor_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_xor_expression111.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_or_expression"


    public static class logical_xor_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_xor_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:298:1: logical_xor_expression : logical_and_expression ( '^' ^ logical_and_expression )* ;
    public final TemplateParser.logical_xor_expression_return logical_xor_expression() throws RecognitionException {
        TemplateParser.logical_xor_expression_return retval = new TemplateParser.logical_xor_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal113=null;
        TemplateParser.logical_and_expression_return logical_and_expression112 =null;

        TemplateParser.logical_and_expression_return logical_and_expression114 =null;


        Object char_literal113_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:299:2: ( logical_and_expression ( '^' ^ logical_and_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:299:4: logical_and_expression ( '^' ^ logical_and_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logical_and_expression_in_logical_xor_expression1924);
            logical_and_expression112=logical_and_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_and_expression112.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:299:27: ( '^' ^ logical_and_expression )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==XOR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:299:28: '^' ^ logical_and_expression
            	    {
            	    char_literal113=(Token)match(input,XOR,FOLLOW_XOR_in_logical_xor_expression1927); 
            	    char_literal113_tree = 
            	    (Object)adaptor.create(char_literal113)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal113_tree, root_0);


            	    pushFollow(FOLLOW_logical_and_expression_in_logical_xor_expression1930);
            	    logical_and_expression114=logical_and_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_and_expression114.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_xor_expression"


    public static class logical_and_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_and_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:302:1: logical_and_expression : equality_expression ( AND ^ equality_expression )* ;
    public final TemplateParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
        TemplateParser.logical_and_expression_return retval = new TemplateParser.logical_and_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND116=null;
        TemplateParser.equality_expression_return equality_expression115 =null;

        TemplateParser.equality_expression_return equality_expression117 =null;


        Object AND116_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:303:2: ( equality_expression ( AND ^ equality_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:303:4: equality_expression ( AND ^ equality_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_logical_and_expression1944);
            equality_expression115=equality_expression();

            state._fsp--;

            adaptor.addChild(root_0, equality_expression115.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:303:24: ( AND ^ equality_expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:303:25: AND ^ equality_expression
            	    {
            	    AND116=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expression1947); 
            	    AND116_tree = 
            	    (Object)adaptor.create(AND116)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AND116_tree, root_0);


            	    pushFollow(FOLLOW_equality_expression_in_logical_and_expression1950);
            	    equality_expression117=equality_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equality_expression117.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_and_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:306:1: equality_expression : relational_expression ( ( '==' ^| '!=' ^) relational_expression )* ;
    public final TemplateParser.equality_expression_return equality_expression() throws RecognitionException {
        TemplateParser.equality_expression_return retval = new TemplateParser.equality_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal119=null;
        Token string_literal120=null;
        TemplateParser.relational_expression_return relational_expression118 =null;

        TemplateParser.relational_expression_return relational_expression121 =null;


        Object string_literal119_tree=null;
        Object string_literal120_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:2: ( relational_expression ( ( '==' ^| '!=' ^) relational_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:4: relational_expression ( ( '==' ^| '!=' ^) relational_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression1963);
            relational_expression118=relational_expression();

            state._fsp--;

            adaptor.addChild(root_0, relational_expression118.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:26: ( ( '==' ^| '!=' ^) relational_expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==EQEQ||LA28_0==NE) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:27: ( '==' ^| '!=' ^) relational_expression
            	    {
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:27: ( '==' ^| '!=' ^)
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
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:28: '==' ^
            	            {
            	            string_literal119=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_equality_expression1967); 
            	            string_literal119_tree = 
            	            (Object)adaptor.create(string_literal119)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal119_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:307:34: '!=' ^
            	            {
            	            string_literal120=(Token)match(input,NE,FOLLOW_NE_in_equality_expression1970); 
            	            string_literal120_tree = 
            	            (Object)adaptor.create(string_literal120)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal120_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1974);
            	    relational_expression121=relational_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relational_expression121.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:310:1: relational_expression : shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* ;
    public final TemplateParser.relational_expression_return relational_expression() throws RecognitionException {
        TemplateParser.relational_expression_return retval = new TemplateParser.relational_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal123=null;
        Token char_literal124=null;
        Token string_literal125=null;
        Token string_literal126=null;
        TemplateParser.shift_expression_return shift_expression122 =null;

        TemplateParser.shift_expression_return shift_expression127 =null;


        Object char_literal123_tree=null;
        Object char_literal124_tree=null;
        Object string_literal125_tree=null;
        Object string_literal126_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:2: ( shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:4: shift_expression ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression1987);
            shift_expression122=shift_expression();

            state._fsp--;

            adaptor.addChild(root_0, shift_expression122.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:21: ( ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= GT && LA30_0 <= GTE)||(LA30_0 >= LT && LA30_0 <= LTE)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:22: ( '<' ^| '>' ^| '<=' ^| '>=' ^) shift_expression
            	    {
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:22: ( '<' ^| '>' ^| '<=' ^| '>=' ^)
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
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:23: '<' ^
            	            {
            	            char_literal123=(Token)match(input,LT,FOLLOW_LT_in_relational_expression1991); 
            	            char_literal123_tree = 
            	            (Object)adaptor.create(char_literal123)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal123_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:28: '>' ^
            	            {
            	            char_literal124=(Token)match(input,GT,FOLLOW_GT_in_relational_expression1994); 
            	            char_literal124_tree = 
            	            (Object)adaptor.create(char_literal124)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(char_literal124_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:33: '<=' ^
            	            {
            	            string_literal125=(Token)match(input,LTE,FOLLOW_LTE_in_relational_expression1997); 
            	            string_literal125_tree = 
            	            (Object)adaptor.create(string_literal125)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal125_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:311:39: '>=' ^
            	            {
            	            string_literal126=(Token)match(input,GTE,FOLLOW_GTE_in_relational_expression2000); 
            	            string_literal126_tree = 
            	            (Object)adaptor.create(string_literal126)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal126_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shift_expression_in_relational_expression2004);
            	    shift_expression127=shift_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expression127.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class shift_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:314:1: shift_expression : additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* ;
    public final TemplateParser.shift_expression_return shift_expression() throws RecognitionException {
        TemplateParser.shift_expression_return retval = new TemplateParser.shift_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal129=null;
        Token string_literal130=null;
        TemplateParser.additive_expression_return additive_expression128 =null;

        TemplateParser.additive_expression_return additive_expression131 =null;


        Object string_literal129_tree=null;
        Object string_literal130_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:2: ( additive_expression ( ( '<<' ^| '>>' ^) additive_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:4: additive_expression ( ( '<<' ^| '>>' ^) additive_expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression2017);
            additive_expression128=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression128.getTree());

            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:24: ( ( '<<' ^| '>>' ^) additive_expression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LSHIFT||LA32_0==RSHIFT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:25: ( '<<' ^| '>>' ^) additive_expression
            	    {
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:25: ( '<<' ^| '>>' ^)
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
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:26: '<<' ^
            	            {
            	            string_literal129=(Token)match(input,LSHIFT,FOLLOW_LSHIFT_in_shift_expression2021); 
            	            string_literal129_tree = 
            	            (Object)adaptor.create(string_literal129)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal129_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:315:32: '>>' ^
            	            {
            	            string_literal130=(Token)match(input,RSHIFT,FOLLOW_RSHIFT_in_shift_expression2024); 
            	            string_literal130_tree = 
            	            (Object)adaptor.create(string_literal130)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(string_literal130_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_additive_expression_in_shift_expression2028);
            	    additive_expression131=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression131.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shift_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:318:1: additive_expression : ( multiplicative_expression ) ( '+' ^ multiplicative_expression | '-' ^ multiplicative_expression )* ;
    public final TemplateParser.additive_expression_return additive_expression() throws RecognitionException {
        TemplateParser.additive_expression_return retval = new TemplateParser.additive_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal133=null;
        Token char_literal135=null;
        TemplateParser.multiplicative_expression_return multiplicative_expression132 =null;

        TemplateParser.multiplicative_expression_return multiplicative_expression134 =null;

        TemplateParser.multiplicative_expression_return multiplicative_expression136 =null;


        Object char_literal133_tree=null;
        Object char_literal135_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:2: ( ( multiplicative_expression ) ( '+' ^ multiplicative_expression | '-' ^ multiplicative_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:4: ( multiplicative_expression ) ( '+' ^ multiplicative_expression | '-' ^ multiplicative_expression )*
            {
            root_0 = (Object)adaptor.nil();


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:4: ( multiplicative_expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:5: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2043);
            multiplicative_expression132=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression132.getTree());

            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:32: ( '+' ^ multiplicative_expression | '-' ^ multiplicative_expression )*
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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:33: '+' ^ multiplicative_expression
            	    {
            	    char_literal133=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression2047); 
            	    char_literal133_tree = 
            	    (Object)adaptor.create(char_literal133)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal133_tree, root_0);


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2050);
            	    multiplicative_expression134=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression134.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:319:66: '-' ^ multiplicative_expression
            	    {
            	    char_literal135=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression2054); 
            	    char_literal135_tree = 
            	    (Object)adaptor.create(char_literal135)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal135_tree, root_0);


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2057);
            	    multiplicative_expression136=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression136.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:322:1: multiplicative_expression : ( unary_expression ) ( MUL ^ unary_expression | DIV ^ unary_expression | '%' ^ unary_expression )* ;
    public final TemplateParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        TemplateParser.multiplicative_expression_return retval = new TemplateParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MUL138=null;
        Token DIV140=null;
        Token char_literal142=null;
        TemplateParser.unary_expression_return unary_expression137 =null;

        TemplateParser.unary_expression_return unary_expression139 =null;

        TemplateParser.unary_expression_return unary_expression141 =null;

        TemplateParser.unary_expression_return unary_expression143 =null;


        Object MUL138_tree=null;
        Object DIV140_tree=null;
        Object char_literal142_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:2: ( ( unary_expression ) ( MUL ^ unary_expression | DIV ^ unary_expression | '%' ^ unary_expression )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:4: ( unary_expression ) ( MUL ^ unary_expression | DIV ^ unary_expression | '%' ^ unary_expression )*
            {
            root_0 = (Object)adaptor.nil();


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:4: ( unary_expression )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:5: unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2071);
            unary_expression137=unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, unary_expression137.getTree());

            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:23: ( MUL ^ unary_expression | DIV ^ unary_expression | '%' ^ unary_expression )*
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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:24: MUL ^ unary_expression
            	    {
            	    MUL138=(Token)match(input,MUL,FOLLOW_MUL_in_multiplicative_expression2075); 
            	    MUL138_tree = 
            	    (Object)adaptor.create(MUL138)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(MUL138_tree, root_0);


            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2078);
            	    unary_expression139=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression139.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:48: DIV ^ unary_expression
            	    {
            	    DIV140=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression2082); 
            	    DIV140_tree = 
            	    (Object)adaptor.create(DIV140)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(DIV140_tree, root_0);


            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2085);
            	    unary_expression141=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression141.getTree());

            	    }
            	    break;
            	case 3 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:323:72: '%' ^ unary_expression
            	    {
            	    char_literal142=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicative_expression2089); 
            	    char_literal142_tree = 
            	    (Object)adaptor.create(char_literal142)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(char_literal142_tree, root_0);


            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2092);
            	    unary_expression143=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression143.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class unary_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:326:1: unary_expression : ( postfix_expression | '+' unary_expression -> ^( UNARY_PLUS unary_expression ) | '-' unary_expression -> ^( UNARY_MINUS unary_expression ) | '~' ^ unary_expression | NOT ^ unary_expression );
    public final TemplateParser.unary_expression_return unary_expression() throws RecognitionException {
        TemplateParser.unary_expression_return retval = new TemplateParser.unary_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal145=null;
        Token char_literal147=null;
        Token char_literal149=null;
        Token NOT151=null;
        TemplateParser.postfix_expression_return postfix_expression144 =null;

        TemplateParser.unary_expression_return unary_expression146 =null;

        TemplateParser.unary_expression_return unary_expression148 =null;

        TemplateParser.unary_expression_return unary_expression150 =null;

        TemplateParser.unary_expression_return unary_expression152 =null;


        Object char_literal145_tree=null;
        Object char_literal147_tree=null;
        Object char_literal149_tree=null;
        Object NOT151_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:327:2: ( postfix_expression | '+' unary_expression -> ^( UNARY_PLUS unary_expression ) | '-' unary_expression -> ^( UNARY_MINUS unary_expression ) | '~' ^ unary_expression | NOT ^ unary_expression )
            int alt35=5;
            switch ( input.LA(1) ) {
            case FALSE:
            case FLOAT:
            case ID:
            case INT:
            case INT_HEX:
            case LPAREN:
            case LSQUARE:
            case NULL:
            case STRING:
            case TRUE:
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:327:4: postfix_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression2105);
                    postfix_expression144=postfix_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, postfix_expression144.getTree());

                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:328:4: '+' unary_expression
                    {
                    char_literal145=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression2110);  
                    stream_PLUS.add(char_literal145);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2112);
                    unary_expression146=unary_expression();

                    state._fsp--;

                    stream_unary_expression.add(unary_expression146.getTree());

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
                    // 328:25: -> ^( UNARY_PLUS unary_expression )
                    {
                        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:328:28: ^( UNARY_PLUS unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_PLUS, "UNARY_PLUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:329:4: '-' unary_expression
                    {
                    char_literal147=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression2125);  
                    stream_MINUS.add(char_literal147);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2127);
                    unary_expression148=unary_expression();

                    state._fsp--;

                    stream_unary_expression.add(unary_expression148.getTree());

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
                    // 329:25: -> ^( UNARY_MINUS unary_expression )
                    {
                        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:329:28: ^( UNARY_MINUS unary_expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS")
                        , root_1);

                        adaptor.addChild(root_1, stream_unary_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:330:4: '~' ^ unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal149=(Token)match(input,TILDE,FOLLOW_TILDE_in_unary_expression2140); 
                    char_literal149_tree = 
                    (Object)adaptor.create(char_literal149)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(char_literal149_tree, root_0);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2143);
                    unary_expression150=unary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expression150.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:331:4: NOT ^ unary_expression
                    {
                    root_0 = (Object)adaptor.nil();


                    NOT151=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression2148); 
                    NOT151_tree = 
                    (Object)adaptor.create(NOT151)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NOT151_tree, root_0);


                    pushFollow(FOLLOW_unary_expression_in_unary_expression2151);
                    unary_expression152=unary_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, unary_expression152.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class postfix_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:334:1: postfix_expression : ( atom -> atom ) ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE pid= id_relaxed ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID[pid.start] ) ) | QDOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression id ) ) | DOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression id ) ) )* ;
    public final TemplateParser.postfix_expression_return postfix_expression() throws RecognitionException {
        TemplateParser.postfix_expression_return retval = new TemplateParser.postfix_expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal154=null;
        Token char_literal156=null;
        Token PIPE157=null;
        Token char_literal158=null;
        Token char_literal160=null;
        Token char_literal162=null;
        Token QDOT163=null;
        Token char_literal165=null;
        Token char_literal167=null;
        Token char_literal169=null;
        Token DOT170=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal176=null;
        TemplateParser.id_relaxed_return pid =null;

        TemplateParser.atom_return atom153 =null;

        TemplateParser.sliceops_return sliceops155 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression159 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression161 =null;

        TemplateParser.id_return id164 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression166 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression168 =null;

        TemplateParser.id_return id171 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression173 =null;

        TemplateParser.weakest_binding_expression_return weakest_binding_expression175 =null;


        Object char_literal154_tree=null;
        Object char_literal156_tree=null;
        Object PIPE157_tree=null;
        Object char_literal158_tree=null;
        Object char_literal160_tree=null;
        Object char_literal162_tree=null;
        Object QDOT163_tree=null;
        Object char_literal165_tree=null;
        Object char_literal167_tree=null;
        Object char_literal169_tree=null;
        Object DOT170_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_PIPE=new RewriteRuleTokenStream(adaptor,"token PIPE");
        RewriteRuleTokenStream stream_QDOT=new RewriteRuleTokenStream(adaptor,"token QDOT");
        RewriteRuleTokenStream stream_LSQUARE=new RewriteRuleTokenStream(adaptor,"token LSQUARE");
        RewriteRuleTokenStream stream_RSQUARE=new RewriteRuleTokenStream(adaptor,"token RSQUARE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_id_relaxed=new RewriteRuleSubtreeStream(adaptor,"rule id_relaxed");
        RewriteRuleSubtreeStream stream_sliceops=new RewriteRuleSubtreeStream(adaptor,"rule sliceops");
        RewriteRuleSubtreeStream stream_weakest_binding_expression=new RewriteRuleSubtreeStream(adaptor,"rule weakest_binding_expression");
        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:335:2: ( ( atom -> atom ) ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE pid= id_relaxed ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID[pid.start] ) ) | QDOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression id ) ) | DOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression id ) ) )* )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:335:4: ( atom -> atom ) ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE pid= id_relaxed ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID[pid.start] ) ) | QDOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression id ) ) | DOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression id ) ) )*
            {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:335:4: ( atom -> atom )
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:335:5: atom
            {
            pushFollow(FOLLOW_atom_in_postfix_expression2163);
            atom153=atom();

            state._fsp--;

            stream_atom.add(atom153.getTree());

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
            // 335:9: -> atom
            {
                adaptor.addChild(root_0, stream_atom.nextTree());

            }


            retval.tree = root_0;

            }


            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:336:3: ( '[' sliceops ']' -> ^( '[' $postfix_expression sliceops ) | PIPE pid= id_relaxed ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID[pid.start] ) ) | QDOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression id ) ) | DOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression id ) ) )*
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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:337:4: '[' sliceops ']'
            	    {
            	    char_literal154=(Token)match(input,LSQUARE,FOLLOW_LSQUARE_in_postfix_expression2175);  
            	    stream_LSQUARE.add(char_literal154);


            	    pushFollow(FOLLOW_sliceops_in_postfix_expression2177);
            	    sliceops155=sliceops();

            	    state._fsp--;

            	    stream_sliceops.add(sliceops155.getTree());

            	    char_literal156=(Token)match(input,RSQUARE,FOLLOW_RSQUARE_in_postfix_expression2179);  
            	    stream_RSQUARE.add(char_literal156);


            	    // AST REWRITE
            	    // elements: LSQUARE, postfix_expression, sliceops
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 337:21: -> ^( '[' $postfix_expression sliceops )
            	    {
            	        // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:337:24: ^( '[' $postfix_expression sliceops )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        stream_LSQUARE.nextNode()
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_sliceops.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;

            	    }
            	    break;
            	case 2 :
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:339:4: PIPE pid= id_relaxed ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID[pid.start] ) )
            	    {
            	    PIPE157=(Token)match(input,PIPE,FOLLOW_PIPE_in_postfix_expression2199);  
            	    stream_PIPE.add(PIPE157);


            	    pushFollow(FOLLOW_id_relaxed_in_postfix_expression2203);
            	    pid=id_relaxed();

            	    state._fsp--;

            	    stream_id_relaxed.add(pid.getTree());

            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:340:5: ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* ) | -> ^( PIPE $postfix_expression ID[pid.start] ) )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==LPAREN) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==AND||(LA38_0 >= BY && LA38_0 <= COMMA)||LA38_0==DIV||LA38_0==DOT||LA38_0==EQEQ||(LA38_0 >= GT && LA38_0 <= GTE)||LA38_0==IAND||LA38_0==IN||LA38_0==IOR||LA38_0==LIMIT||(LA38_0 >= LSHIFT && LA38_0 <= NE)||(LA38_0 >= OR && LA38_0 <= PLUS)||(LA38_0 >= QDOT && LA38_0 <= RSQUARE)||LA38_0==SEMI||LA38_0==TEMPLATE_PRINT_END||LA38_0==TEMPLATE_STATEMENT_END||LA38_0==TO||LA38_0==XOR) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:341:6: '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')'
            	            {
            	            char_literal158=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2217);  
            	            stream_LPAREN.add(char_literal158);


            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:341:10: ( weakest_binding_expression ( ',' weakest_binding_expression )* )?
            	            int alt37=2;
            	            int LA37_0 = input.LA(1);

            	            if ( ((LA37_0 >= FALSE && LA37_0 <= FLOAT)||LA37_0==ID||(LA37_0 >= INT && LA37_0 <= INT_HEX)||LA37_0==LPAREN||LA37_0==LSQUARE||LA37_0==MINUS||(LA37_0 >= NOT && LA37_0 <= NULL)||LA37_0==PLUS||LA37_0==STRING||LA37_0==TILDE||LA37_0==TRUE) ) {
            	                alt37=1;
            	            }
            	            switch (alt37) {
            	                case 1 :
            	                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:341:11: weakest_binding_expression ( ',' weakest_binding_expression )*
            	                    {
            	                    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2220);
            	                    weakest_binding_expression159=weakest_binding_expression();

            	                    state._fsp--;

            	                    stream_weakest_binding_expression.add(weakest_binding_expression159.getTree());

            	                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:341:38: ( ',' weakest_binding_expression )*
            	                    loop36:
            	                    do {
            	                        int alt36=2;
            	                        int LA36_0 = input.LA(1);

            	                        if ( (LA36_0==COMMA) ) {
            	                            alt36=1;
            	                        }


            	                        switch (alt36) {
            	                    	case 1 :
            	                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:341:39: ',' weakest_binding_expression
            	                    	    {
            	                    	    char_literal160=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression2223);  
            	                    	    stream_COMMA.add(char_literal160);


            	                    	    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2225);
            	                    	    weakest_binding_expression161=weakest_binding_expression();

            	                    	    state._fsp--;

            	                    	    stream_weakest_binding_expression.add(weakest_binding_expression161.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop36;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            char_literal162=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2231);  
            	            stream_RPAREN.add(char_literal162);


            	            // AST REWRITE
            	            // elements: PIPE, postfix_expression, weakest_binding_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 342:7: -> ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:342:10: ^( PIPE $postfix_expression ID[pid.start] ( weakest_binding_expression )* )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_PIPE.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, 
            	                (Object)adaptor.create(ID, pid.start)
            	                );

            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:342:51: ( weakest_binding_expression )*
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
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:344:7: 
            	            {
            	            // AST REWRITE
            	            // elements: PIPE, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 344:7: -> ^( PIPE $postfix_expression ID[pid.start] )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:344:10: ^( PIPE $postfix_expression ID[pid.start] )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_PIPE.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, 
            	                (Object)adaptor.create(ID, pid.start)
            	                );

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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:347:4: QDOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression id ) )
            	    {
            	    QDOT163=(Token)match(input,QDOT,FOLLOW_QDOT_in_postfix_expression2294);  
            	    stream_QDOT.add(QDOT163);


            	    pushFollow(FOLLOW_id_in_postfix_expression2296);
            	    id164=id();

            	    state._fsp--;

            	    stream_id.add(id164.getTree());

            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:348:5: ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( QDOT $postfix_expression id ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==LPAREN) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==AND||(LA41_0 >= BY && LA41_0 <= COMMA)||LA41_0==DIV||LA41_0==DOT||LA41_0==EQEQ||(LA41_0 >= GT && LA41_0 <= GTE)||LA41_0==IAND||LA41_0==IN||LA41_0==IOR||LA41_0==LIMIT||(LA41_0 >= LSHIFT && LA41_0 <= NE)||(LA41_0 >= OR && LA41_0 <= PLUS)||(LA41_0 >= QDOT && LA41_0 <= RSQUARE)||LA41_0==SEMI||LA41_0==TEMPLATE_PRINT_END||LA41_0==TEMPLATE_STATEMENT_END||LA41_0==TO||LA41_0==XOR) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:349:6: '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')'
            	            {
            	            char_literal165=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2310);  
            	            stream_LPAREN.add(char_literal165);


            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:349:10: ( weakest_binding_expression ( ',' weakest_binding_expression )* )?
            	            int alt40=2;
            	            int LA40_0 = input.LA(1);

            	            if ( ((LA40_0 >= FALSE && LA40_0 <= FLOAT)||LA40_0==ID||(LA40_0 >= INT && LA40_0 <= INT_HEX)||LA40_0==LPAREN||LA40_0==LSQUARE||LA40_0==MINUS||(LA40_0 >= NOT && LA40_0 <= NULL)||LA40_0==PLUS||LA40_0==STRING||LA40_0==TILDE||LA40_0==TRUE) ) {
            	                alt40=1;
            	            }
            	            switch (alt40) {
            	                case 1 :
            	                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:349:11: weakest_binding_expression ( ',' weakest_binding_expression )*
            	                    {
            	                    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2313);
            	                    weakest_binding_expression166=weakest_binding_expression();

            	                    state._fsp--;

            	                    stream_weakest_binding_expression.add(weakest_binding_expression166.getTree());

            	                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:349:38: ( ',' weakest_binding_expression )*
            	                    loop39:
            	                    do {
            	                        int alt39=2;
            	                        int LA39_0 = input.LA(1);

            	                        if ( (LA39_0==COMMA) ) {
            	                            alt39=1;
            	                        }


            	                        switch (alt39) {
            	                    	case 1 :
            	                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:349:39: ',' weakest_binding_expression
            	                    	    {
            	                    	    char_literal167=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression2316);  
            	                    	    stream_COMMA.add(char_literal167);


            	                    	    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2318);
            	                    	    weakest_binding_expression168=weakest_binding_expression();

            	                    	    state._fsp--;

            	                    	    stream_weakest_binding_expression.add(weakest_binding_expression168.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop39;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            char_literal169=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2324);  
            	            stream_RPAREN.add(char_literal169);


            	            // AST REWRITE
            	            // elements: LPAREN, postfix_expression, weakest_binding_expression, id
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 350:7: -> ^( '(' $postfix_expression id ( weakest_binding_expression )* )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:350:10: ^( '(' $postfix_expression id ( weakest_binding_expression )* )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_LPAREN.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_id.nextTree());

            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:350:39: ( weakest_binding_expression )*
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
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:352:7: 
            	            {
            	            // AST REWRITE
            	            // elements: id, QDOT, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 352:7: -> ^( QDOT $postfix_expression id )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:352:10: ^( QDOT $postfix_expression id )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_QDOT.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_id.nextTree());

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
            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:355:4: DOT id ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression id ) )
            	    {
            	    DOT170=(Token)match(input,DOT,FOLLOW_DOT_in_postfix_expression2385);  
            	    stream_DOT.add(DOT170);


            	    pushFollow(FOLLOW_id_in_postfix_expression2387);
            	    id171=id();

            	    state._fsp--;

            	    stream_id.add(id171.getTree());

            	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:356:5: ( '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')' -> ^( '(' $postfix_expression id ( weakest_binding_expression )* ) | -> ^( DOT $postfix_expression id ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==LPAREN) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==AND||(LA44_0 >= BY && LA44_0 <= COMMA)||LA44_0==DIV||LA44_0==DOT||LA44_0==EQEQ||(LA44_0 >= GT && LA44_0 <= GTE)||LA44_0==IAND||LA44_0==IN||LA44_0==IOR||LA44_0==LIMIT||(LA44_0 >= LSHIFT && LA44_0 <= NE)||(LA44_0 >= OR && LA44_0 <= PLUS)||(LA44_0 >= QDOT && LA44_0 <= RSQUARE)||LA44_0==SEMI||LA44_0==TEMPLATE_PRINT_END||LA44_0==TEMPLATE_STATEMENT_END||LA44_0==TO||LA44_0==XOR) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:357:6: '(' ( weakest_binding_expression ( ',' weakest_binding_expression )* )? ')'
            	            {
            	            char_literal172=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_postfix_expression2401);  
            	            stream_LPAREN.add(char_literal172);


            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:357:10: ( weakest_binding_expression ( ',' weakest_binding_expression )* )?
            	            int alt43=2;
            	            int LA43_0 = input.LA(1);

            	            if ( ((LA43_0 >= FALSE && LA43_0 <= FLOAT)||LA43_0==ID||(LA43_0 >= INT && LA43_0 <= INT_HEX)||LA43_0==LPAREN||LA43_0==LSQUARE||LA43_0==MINUS||(LA43_0 >= NOT && LA43_0 <= NULL)||LA43_0==PLUS||LA43_0==STRING||LA43_0==TILDE||LA43_0==TRUE) ) {
            	                alt43=1;
            	            }
            	            switch (alt43) {
            	                case 1 :
            	                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:357:11: weakest_binding_expression ( ',' weakest_binding_expression )*
            	                    {
            	                    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2404);
            	                    weakest_binding_expression173=weakest_binding_expression();

            	                    state._fsp--;

            	                    stream_weakest_binding_expression.add(weakest_binding_expression173.getTree());

            	                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:357:38: ( ',' weakest_binding_expression )*
            	                    loop42:
            	                    do {
            	                        int alt42=2;
            	                        int LA42_0 = input.LA(1);

            	                        if ( (LA42_0==COMMA) ) {
            	                            alt42=1;
            	                        }


            	                        switch (alt42) {
            	                    	case 1 :
            	                    	    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:357:39: ',' weakest_binding_expression
            	                    	    {
            	                    	    char_literal174=(Token)match(input,COMMA,FOLLOW_COMMA_in_postfix_expression2407);  
            	                    	    stream_COMMA.add(char_literal174);


            	                    	    pushFollow(FOLLOW_weakest_binding_expression_in_postfix_expression2409);
            	                    	    weakest_binding_expression175=weakest_binding_expression();

            	                    	    state._fsp--;

            	                    	    stream_weakest_binding_expression.add(weakest_binding_expression175.getTree());

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop42;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            char_literal176=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_postfix_expression2415);  
            	            stream_RPAREN.add(char_literal176);


            	            // AST REWRITE
            	            // elements: weakest_binding_expression, id, LPAREN, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 358:7: -> ^( '(' $postfix_expression id ( weakest_binding_expression )* )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:358:10: ^( '(' $postfix_expression id ( weakest_binding_expression )* )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_LPAREN.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_id.nextTree());

            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:358:39: ( weakest_binding_expression )*
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
            	            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:360:7: 
            	            {
            	            // AST REWRITE
            	            // elements: DOT, id, postfix_expression
            	            // token labels: 
            	            // rule labels: retval
            	            // token list labels: 
            	            // rule list labels: 
            	            // wildcard labels: 
            	            retval.tree = root_0;
            	            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	            root_0 = (Object)adaptor.nil();
            	            // 360:7: -> ^( DOT $postfix_expression id )
            	            {
            	                // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:360:10: ^( DOT $postfix_expression id )
            	                {
            	                Object root_1 = (Object)adaptor.nil();
            	                root_1 = (Object)adaptor.becomeRoot(
            	                stream_DOT.nextNode()
            	                , root_1);

            	                adaptor.addChild(root_1, stream_retval.nextTree());

            	                adaptor.addChild(root_1, stream_id.nextTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"


    public static class sliceops_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sliceops"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:365:1: sliceops : ( expression ( ':' ( expression )? ( ':' ( expression )? )? )? | ':' ( expression )? ( ':' ( expression )? )? );
    public final TemplateParser.sliceops_return sliceops() throws RecognitionException {
        TemplateParser.sliceops_return retval = new TemplateParser.sliceops_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal184=null;
        TemplateParser.expression_return expression177 =null;

        TemplateParser.expression_return expression179 =null;

        TemplateParser.expression_return expression181 =null;

        TemplateParser.expression_return expression183 =null;

        TemplateParser.expression_return expression185 =null;


        Object char_literal178_tree=null;
        Object char_literal180_tree=null;
        Object char_literal182_tree=null;
        Object char_literal184_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:2: ( expression ( ':' ( expression )? ( ':' ( expression )? )? )? | ':' ( expression )? ( ':' ( expression )? )? )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0 >= FALSE && LA53_0 <= FLOAT)||LA53_0==ID||(LA53_0 >= INT && LA53_0 <= INT_HEX)||LA53_0==LPAREN||LA53_0==LSQUARE||LA53_0==MINUS||(LA53_0 >= NOT && LA53_0 <= NULL)||LA53_0==PLUS||LA53_0==STRING||LA53_0==TILDE||LA53_0==TRUE) ) {
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:4: expression ( ':' ( expression )? ( ':' ( expression )? )? )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_sliceops2483);
                    expression177=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression177.getTree());

                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:15: ( ':' ( expression )? ( ':' ( expression )? )? )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==COLON) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:16: ':' ( expression )? ( ':' ( expression )? )?
                            {
                            char_literal178=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2486); 
                            char_literal178_tree = 
                            (Object)adaptor.create(char_literal178)
                            ;
                            adaptor.addChild(root_0, char_literal178_tree);


                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:20: ( expression )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( ((LA46_0 >= FALSE && LA46_0 <= FLOAT)||LA46_0==ID||(LA46_0 >= INT && LA46_0 <= INT_HEX)||LA46_0==LPAREN||LA46_0==LSQUARE||LA46_0==MINUS||(LA46_0 >= NOT && LA46_0 <= NULL)||LA46_0==PLUS||LA46_0==STRING||LA46_0==TILDE||LA46_0==TRUE) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:20: expression
                                    {
                                    pushFollow(FOLLOW_expression_in_sliceops2488);
                                    expression179=expression();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expression179.getTree());

                                    }
                                    break;

                            }


                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:32: ( ':' ( expression )? )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==COLON) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:33: ':' ( expression )?
                                    {
                                    char_literal180=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2492); 
                                    char_literal180_tree = 
                                    (Object)adaptor.create(char_literal180)
                                    ;
                                    adaptor.addChild(root_0, char_literal180_tree);


                                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:37: ( expression )?
                                    int alt47=2;
                                    int LA47_0 = input.LA(1);

                                    if ( ((LA47_0 >= FALSE && LA47_0 <= FLOAT)||LA47_0==ID||(LA47_0 >= INT && LA47_0 <= INT_HEX)||LA47_0==LPAREN||LA47_0==LSQUARE||LA47_0==MINUS||(LA47_0 >= NOT && LA47_0 <= NULL)||LA47_0==PLUS||LA47_0==STRING||LA47_0==TILDE||LA47_0==TRUE) ) {
                                        alt47=1;
                                    }
                                    switch (alt47) {
                                        case 1 :
                                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:366:37: expression
                                            {
                                            pushFollow(FOLLOW_expression_in_sliceops2494);
                                            expression181=expression();

                                            state._fsp--;

                                            adaptor.addChild(root_0, expression181.getTree());

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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:4: ':' ( expression )? ( ':' ( expression )? )?
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal182=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2504); 
                    char_literal182_tree = 
                    (Object)adaptor.create(char_literal182)
                    ;
                    adaptor.addChild(root_0, char_literal182_tree);


                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:8: ( expression )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0 >= FALSE && LA50_0 <= FLOAT)||LA50_0==ID||(LA50_0 >= INT && LA50_0 <= INT_HEX)||LA50_0==LPAREN||LA50_0==LSQUARE||LA50_0==MINUS||(LA50_0 >= NOT && LA50_0 <= NULL)||LA50_0==PLUS||LA50_0==STRING||LA50_0==TILDE||LA50_0==TRUE) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:8: expression
                            {
                            pushFollow(FOLLOW_expression_in_sliceops2506);
                            expression183=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression183.getTree());

                            }
                            break;

                    }


                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:20: ( ':' ( expression )? )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==COLON) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:21: ':' ( expression )?
                            {
                            char_literal184=(Token)match(input,COLON,FOLLOW_COLON_in_sliceops2510); 
                            char_literal184_tree = 
                            (Object)adaptor.create(char_literal184)
                            ;
                            adaptor.addChild(root_0, char_literal184_tree);


                            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:25: ( expression )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( ((LA51_0 >= FALSE && LA51_0 <= FLOAT)||LA51_0==ID||(LA51_0 >= INT && LA51_0 <= INT_HEX)||LA51_0==LPAREN||LA51_0==LSQUARE||LA51_0==MINUS||(LA51_0 >= NOT && LA51_0 <= NULL)||LA51_0==PLUS||LA51_0==STRING||LA51_0==TILDE||LA51_0==TRUE) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:367:25: expression
                                    {
                                    pushFollow(FOLLOW_expression_in_sliceops2512);
                                    expression185=expression();

                                    state._fsp--;

                                    adaptor.addChild(root_0, expression185.getTree());

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sliceops"


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:370:1: constant : ( INT | INT_HEX | FLOAT | string | TRUE | FALSE | NULL );
    public final TemplateParser.constant_return constant() throws RecognitionException {
        TemplateParser.constant_return retval = new TemplateParser.constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT186=null;
        Token INT_HEX187=null;
        Token FLOAT188=null;
        Token TRUE190=null;
        Token FALSE191=null;
        Token NULL192=null;
        TemplateParser.string_return string189 =null;


        Object INT186_tree=null;
        Object INT_HEX187_tree=null;
        Object FLOAT188_tree=null;
        Object TRUE190_tree=null;
        Object FALSE191_tree=null;
        Object NULL192_tree=null;

        try {
            // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:5: ( INT | INT_HEX | FLOAT | string | TRUE | FALSE | NULL )
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
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:8: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT186=(Token)match(input,INT,FOLLOW_INT_in_constant2530); 
                    INT186_tree = 
                    (Object)adaptor.create(INT186)
                    ;
                    adaptor.addChild(root_0, INT186_tree);


                    }
                    break;
                case 2 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:14: INT_HEX
                    {
                    root_0 = (Object)adaptor.nil();


                    INT_HEX187=(Token)match(input,INT_HEX,FOLLOW_INT_HEX_in_constant2534); 
                    INT_HEX187_tree = 
                    (Object)adaptor.create(INT_HEX187)
                    ;
                    adaptor.addChild(root_0, INT_HEX187_tree);


                    }
                    break;
                case 3 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:24: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT188=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant2538); 
                    FLOAT188_tree = 
                    (Object)adaptor.create(FLOAT188)
                    ;
                    adaptor.addChild(root_0, FLOAT188_tree);


                    }
                    break;
                case 4 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:32: string
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_string_in_constant2542);
                    string189=string();

                    state._fsp--;

                    adaptor.addChild(root_0, string189.getTree());

                    }
                    break;
                case 5 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:41: TRUE
                    {
                    root_0 = (Object)adaptor.nil();


                    TRUE190=(Token)match(input,TRUE,FOLLOW_TRUE_in_constant2546); 
                    TRUE190_tree = 
                    (Object)adaptor.create(TRUE190)
                    ;
                    adaptor.addChild(root_0, TRUE190_tree);


                    }
                    break;
                case 6 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:48: FALSE
                    {
                    root_0 = (Object)adaptor.nil();


                    FALSE191=(Token)match(input,FALSE,FOLLOW_FALSE_in_constant2550); 
                    FALSE191_tree = 
                    (Object)adaptor.create(FALSE191)
                    ;
                    adaptor.addChild(root_0, FALSE191_tree);


                    }
                    break;
                case 7 :
                    // /Users/matthew/Documents/twitrants/stencil-git/stencil/src/main/java/net/stencilproject/template/Template.g:371:56: NULL
                    {
                    root_0 = (Object)adaptor.nil();


                    NULL192=(Token)match(input,NULL,FOLLOW_NULL_in_constant2554); 
                    NULL192_tree = 
                    (Object)adaptor.create(NULL192)
                    ;
                    adaptor.addChild(root_0, NULL192_tree);


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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_id1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_LITERAL_in_template_literal1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_STATEMENT_START_in_template_statement1269 = new BitSet(new long[]{0x011894BB078F0840L,0x0000000000011404L});
    public static final BitSet FOLLOW_statements_in_template_statement1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_TEMPLATE_STATEMENT_END_in_template_statement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_PRINT_START_in_template_print1286 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_template_print1289 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMA_in_template_print1292 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_template_print1295 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
    public static final BitSet FOLLOW_TEMPLATE_PRINT_END_in_template_print1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_COMMENT_in_template_comment1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEMPLATE_RAW_in_template_raw1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_literal_in_template1339 = new BitSet(new long[]{0x0000000000000000L,0x00000000000002D8L});
    public static final BitSet FOLLOW_template_statement_in_template1344 = new BitSet(new long[]{0x0000000000000000L,0x00000000000002D8L});
    public static final BitSet FOLLOW_template_comment_in_template1349 = new BitSet(new long[]{0x0000000000000000L,0x00000000000002D8L});
    public static final BitSet FOLLOW_template_raw_in_template1354 = new BitSet(new long[]{0x0000000000000000L,0x00000000000002D8L});
    public static final BitSet FOLLOW_template_print_in_template1359 = new BitSet(new long[]{0x0000000000000000L,0x00000000000002D8L});
    public static final BitSet FOLLOW_EOF_in_template1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_statements1377 = new BitSet(new long[]{0x011894BB078F0842L,0x0000000000011404L});
    public static final BitSet FOLLOW_statements_in_statements1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blocked_statement_in_statements1388 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_in_statements1391 = new BitSet(new long[]{0x011894BB078F0842L,0x0000000000011404L});
    public static final BitSet FOLLOW_statements_in_statements1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extends_statement_in_statement1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_statement_in_statement1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_statement_in_statement1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continue_statement_in_statement1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_statement_in_statement1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_statement_in_statement1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_blocked_statement1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elif_statement_in_blocked_statement1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_blocked_statement1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_else_statement_in_blocked_statement1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_statement_in_blocked_statement1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_statement_in_blocked_statement1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_statement1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_print_statement1478 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_print_statement1480 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_print_statement1483 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_print_statement1485 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_VAR_in_var_statement1505 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_id_in_var_statement1508 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_EQ_in_var_statement1511 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_var_statement1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block_statement1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_block_statement1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_extends_statement1537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_extends_statement1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_include_statement1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_string_in_include_statement1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_else_statement1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JOIN_in_join_statement1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELIF_in_elif_statement1579 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_elif_statement1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_if_statement1591 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_if_statement1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_statement1603 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_id_in_for_statement1606 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IN_in_for_statement1608 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_for_statement1611 = new BitSet(new long[]{0x0040010000000002L});
    public static final BitSet FOLLOW_ORDER_in_for_statement1614 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BY_in_for_statement1616 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_for_statement1619 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_LIMIT_in_for_statement1624 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_for_statement1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continue_statement1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_statement1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_list1656 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_list1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_list1671 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_list_expressions_in_list1673 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_list1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_list_expressions1694 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_list_expressions1697 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_list_expressions1700 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_id_in_atom1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_atom1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_atom1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom1737 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_atom1740 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atom1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_expression1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_weakest_binding_expression1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assignment_expression1779 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQ_in_assignment_expression1781 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_in_expression_in_assignment_expression1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_in_expression1797 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_IN_in_in_expression1800 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_conditional_expression_in_in_expression1803 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_range_expression_in_conditional_expression1816 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_conditional_expression1819 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_conditional_expression1822 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_conditional_expression1824 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_conditional_expression1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwise_or_expression_in_range_expression1840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_TO_in_range_expression1843 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_range_expression1846 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_BY_in_range_expression1849 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_range_expression1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwise_and_expression_in_bitwise_or_expression1867 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_IOR_in_bitwise_or_expression1870 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_bitwise_and_expression_in_bitwise_or_expression1873 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_bitwise_and_expression1886 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_IAND_in_bitwise_and_expression1889 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_logical_or_expression_in_bitwise_and_expression1892 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_logical_xor_expression_in_logical_or_expression1905 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_or_expression1908 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_logical_xor_expression_in_logical_or_expression1911 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_xor_expression1924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_XOR_in_logical_xor_expression1927 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_xor_expression1930 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression1944 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_logical_and_expression1947 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_equality_expression_in_logical_and_expression1950 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1963 = new BitSet(new long[]{0x0004000000100002L});
    public static final BitSet FOLLOW_EQEQ_in_equality_expression1967 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_NE_in_equality_expression1970 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1974 = new BitSet(new long[]{0x0004000000100002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1987 = new BitSet(new long[]{0x0000600018000002L});
    public static final BitSet FOLLOW_LT_in_relational_expression1991 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_GT_in_relational_expression1994 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_LTE_in_relational_expression1997 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_GTE_in_relational_expression2000 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression2004 = new BitSet(new long[]{0x0000600018000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2017 = new BitSet(new long[]{0x2000080000000002L});
    public static final BitSet FOLLOW_LSHIFT_in_shift_expression2021 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_RSHIFT_in_shift_expression2024 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression2028 = new BitSet(new long[]{0x2000080000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2043 = new BitSet(new long[]{0x0100800000000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression2047 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2050 = new BitSet(new long[]{0x0100800000000002L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression2054 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2057 = new BitSet(new long[]{0x0100800000000002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2071 = new BitSet(new long[]{0x0003000000001002L});
    public static final BitSet FOLLOW_MUL_in_multiplicative_expression2075 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2078 = new BitSet(new long[]{0x0003000000001002L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression2082 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2085 = new BitSet(new long[]{0x0003000000001002L});
    public static final BitSet FOLLOW_MOD_in_multiplicative_expression2089 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2092 = new BitSet(new long[]{0x0003000000001002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression2110 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_expression2125 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_unary_expression2140 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_expression2148 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_postfix_expression2163 = new BitSet(new long[]{0x0480100000004002L});
    public static final BitSet FOLLOW_LSQUARE_in_postfix_expression2175 = new BitSet(new long[]{0x0118943103000100L,0x0000000000001404L});
    public static final BitSet FOLLOW_sliceops_in_postfix_expression2177 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_postfix_expression2179 = new BitSet(new long[]{0x0480100000004002L});
    public static final BitSet FOLLOW_PIPE_in_postfix_expression2199 = new BitSet(new long[]{0x0000008104020800L});
    public static final BitSet FOLLOW_id_relaxed_in_postfix_expression2203 = new BitSet(new long[]{0x0480140000004002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2217 = new BitSet(new long[]{0x1118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2220 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression2223 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2225 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2231 = new BitSet(new long[]{0x0480100000004002L});
    public static final BitSet FOLLOW_QDOT_in_postfix_expression2294 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_id_in_postfix_expression2296 = new BitSet(new long[]{0x0480140000004002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2310 = new BitSet(new long[]{0x1118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2313 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression2316 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2318 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2324 = new BitSet(new long[]{0x0480100000004002L});
    public static final BitSet FOLLOW_DOT_in_postfix_expression2385 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_id_in_postfix_expression2387 = new BitSet(new long[]{0x0480140000004002L});
    public static final BitSet FOLLOW_LPAREN_in_postfix_expression2401 = new BitSet(new long[]{0x1118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2404 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_postfix_expression2407 = new BitSet(new long[]{0x0118943103000000L,0x0000000000001404L});
    public static final BitSet FOLLOW_weakest_binding_expression_in_postfix_expression2409 = new BitSet(new long[]{0x1000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_postfix_expression2415 = new BitSet(new long[]{0x0480100000004002L});
    public static final BitSet FOLLOW_expression_in_sliceops2483 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_in_sliceops2486 = new BitSet(new long[]{0x0118943103000102L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_sliceops2488 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_in_sliceops2492 = new BitSet(new long[]{0x0118943103000002L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_sliceops2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_sliceops2504 = new BitSet(new long[]{0x0118943103000102L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_sliceops2506 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COLON_in_sliceops2510 = new BitSet(new long[]{0x0118943103000002L,0x0000000000001404L});
    public static final BitSet FOLLOW_expression_in_sliceops2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_constant2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_HEX_in_constant2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constant2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_constant2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_constant2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_constant2554 = new BitSet(new long[]{0x0000000000000002L});

}