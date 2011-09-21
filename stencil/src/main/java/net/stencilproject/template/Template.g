grammar Template;
options {
	output=AST;
}

tokens {
	SCOPE_LOOKUP;
	LIST;
	TEMPLATE_LITERAL;
	PRINT;
	UNARY_PLUS;
	UNARY_MINUS;
}


@header {package net.stencilproject.template;}
@lexer::header {package net.stencilproject.template;}
@lexer::members {
    boolean literalMode = true;
}

TEMPLATE_COMMENT
	: '{#' ( options {greedy=false;} : . )* '#}' {literalMode = true;}
	;

	
TEMPLATE_RAW
	: '{%%%' ID WS+ ( options {greedy=false;} : . )* '%%%}' {literalMode = true;}
	;

TEMPLATE_STATEMENT_START	: '{%';
TEMPLATE_STATEMENT_END		: '%}' {literalMode = true;};	

TEMPLATE_PRINT_START	: '{{';
TEMPLATE_PRINT_END 	: '}}' {literalMode = true;};


IF 	: 	'if';
FOR 	: 	'for';
IN 	: 	'in';
AS 	: 	'as';
ELSE 	: 	'else';
ELIF 	: 	'elif';
END 	: 	'end';
INCLUDE	: 	'include';
LIMIT	: 	'limit';
VAR	: 	'var';
CONTINUE:	'continue';
EXTENDS	:	'extends';
BLOCK	:	'block';
JOIN	:	'join';

TRUE	:	'true';
FALSE	:	'false';
NULL	:	'null';

IAND	:	'iand';
IOR	:	'ior';
AND	: 	'and';
OR	: 	'or';
NOT	: 	'not';

ORDER 	:	'order';
BY	:	'by';
TO	:	'to';

EQ   	:  	'=';
EQEQ 	: 	'==';
NE	:	'!=';
LT   	: 	'<';
LTE	:	'<=';
GT 	: 	'>';
GTE	:	'>=';
PLUS 	: 	'+';
MINUS	: 	'-';
MUL	: 	'*';
DIV	: 	'/';
MOD	:	'%';
LSQUARE : 	'[';
RSQUARE : 	']';
LPAREN	: 	'(';
RPAREN	: 	')';
DOT 	: 	'.';
QDOT	:	'?.';
DOLLAR	: 	'$';
TILDE	: 	'~';
LSHIFT	: 	'<<';
RSHIFT	: 	'>>';
XOR	: 	'^';
COLON	: 	':';
SQUOTE	: 	'\'';
DQUOTE	: 	'"';
SEMI	:	';';
COMMA	:	',';
QUESTION:	'?';
PIPE	:	'|';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

INT_HEX :	'0' 'x' HEX_DIGIT+
	;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :     '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |     '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING
    :    '"""' ( options {greedy=false;} : . )* '"""' 
    |    '\'\'\'' ( options {greedy=false;} : . )* '\'\'\'' 
    |    ('"' ( ESC_SEQ | ~('\\'|'"') )* '"')
    |    ('\'' ( ESC_SEQ | ~('\\'|'\'') )* '\'')
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   HEX_ESC
    |   UNICODE_ESC
    ;


fragment
HEX_ESC
    :   '\\' 'x' HEX_DIGIT HEX_DIGIT
    ;
    
fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

id
	: ID
	;

id_relaxed
	: ID | JOIN | ELSE | FOR | CONTINUE;

string
	: STRING<StringNode>
	;

template_literal
	: TEMPLATE_LITERAL<TemplateLiteralNode>
	;

template_statement
	: TEMPLATE_STATEMENT_START^ statements TEMPLATE_STATEMENT_END!
	;

template_print
	: TEMPLATE_PRINT_START^ expression (COMMA! expression)* TEMPLATE_PRINT_END!
	;
	
template_comment
	: TEMPLATE_COMMENT
	;
	
template_raw
	: TEMPLATE_RAW<TemplateRawNode>
	;

template
	: (template_literal
	| template_statement
	| template_comment
	| template_raw
	| template_print
	)* EOF;

statements
	:	statement (SEMI! statements?)?
	|	blocked_statement (COLON! statements?)?;

statement 
	: extends_statement | include_statement | var_statement | continue_statement | end_statement | print_statement | assignment_statement;

blocked_statement
	: if_statement | elif_statement | for_statement | else_statement | block_statement | join_statement;

assignment_statement
	: assignment_expression;

print_statement
	: EQ expression (COMMA expression)* -> ^(PRINT expression+);

var_statement
	: VAR^ id (EQ! expression)?;

block_statement
	: BLOCK^ string;

extends_statement
	: EXTENDS^ string;

include_statement
	: INCLUDE^ string;

else_statement
	: ELSE;

join_statement
	: JOIN;

elif_statement
	: ELIF^ expression;

if_statement
	: IF^ expression;

for_statement
	: FOR^ id IN! expression (ORDER BY! expression)? (LIMIT expression)?;

continue_statement
	: CONTINUE;

end_statement
	: END;

list
	: ('[' ']') -> ^(LIST)
	| ('[' list_expressions ']') -> ^(LIST list_expressions);

list_expressions
	:  weakest_binding_expression (','! weakest_binding_expression)*;

/*
	Atoms are the most basic elements of expressions.
*/
atom
	: sid=id -> ^(SCOPE_LOOKUP[sid.start])
	| constant
	| list
	| '('! expression^ ')'!
	;


expression
	: weakest_binding_expression
	;

weakest_binding_expression
	: assignment_expression
	;

assignment_expression
	: (id '='^)* in_expression
	;

in_expression
	: conditional_expression (IN^ conditional_expression)*
	;

conditional_expression
	: range_expression ('?'^ weakest_binding_expression ':'! weakest_binding_expression)?
	;

range_expression
	: bitwise_or_expression (TO^ weakest_binding_expression (BY! weakest_binding_expression)?)?
	;

bitwise_or_expression
	: bitwise_and_expression (IOR^ bitwise_and_expression)*
	;

bitwise_and_expression
	: logical_or_expression (IAND^ logical_or_expression)*
	;

logical_or_expression
	: logical_xor_expression (OR^ logical_xor_expression)*
	;

logical_xor_expression
	: logical_and_expression ('^'^ logical_and_expression)*
	;
 
logical_and_expression
	: equality_expression (AND^ equality_expression)*
	;

equality_expression
	: relational_expression (('=='^|'!='^) relational_expression)*
	;

relational_expression
	: shift_expression (('<'^|'>'^|'<='^|'>='^) shift_expression)*
	;

shift_expression
	: additive_expression (('<<'^|'>>'^) additive_expression)*
	;
	
additive_expression
	: (multiplicative_expression) ('+'^ multiplicative_expression | '-'^ multiplicative_expression)*
	;

multiplicative_expression
	: (unary_expression) (MUL^ unary_expression | DIV^ unary_expression | '%'^ unary_expression)*
	;

unary_expression
	: postfix_expression
	| '+' unary_expression -> ^(UNARY_PLUS unary_expression)
	| '-' unary_expression -> ^(UNARY_MINUS unary_expression)
	| '~'^ unary_expression
	| NOT^ unary_expression
	;

postfix_expression
	: (atom->atom)
		(
			'[' sliceops ']' -> ^('[' $postfix_expression sliceops)
		|
			PIPE pid=id_relaxed 
				(
					'(' (weakest_binding_expression (',' weakest_binding_expression)*)? ')'
						-> ^(PIPE $postfix_expression ID[pid.start] weakest_binding_expression*)
				|  
						-> ^(PIPE $postfix_expression ID[pid.start])
				) 
		|
			QDOT id 
				(
					'(' (weakest_binding_expression (',' weakest_binding_expression)*)? ')'
						-> ^('(' $postfix_expression id weakest_binding_expression*)
				|  
						-> ^(QDOT $postfix_expression id)
				) 
		|
			DOT id 
				(
					'(' (weakest_binding_expression (',' weakest_binding_expression)*)? ')'
						-> ^('(' $postfix_expression id weakest_binding_expression*)
				|  
						-> ^(DOT $postfix_expression id)
				) 
		)*
	;

sliceops
	: expression (':' expression? (':' expression?)?)?
	| ':' expression? (':' expression?)?
	;

constant
    :  INT | INT_HEX | FLOAT | string | TRUE | FALSE | NULL
    ;



