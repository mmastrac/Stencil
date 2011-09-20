/**
 * 
 */
package net.stencilproject.template;

enum Opcode {
	/**
	 * Drops an item from the stack. (x -> )
	 */
	DROP,

	/**
	 * Duplicates an item on the stack. (x -> x x)
	 */
	DUP,

	/**
	 * Unconditionally branches.
	 */
	GOTO,

	/**
	 * Pushes PC+1 on the stack, sets PC to the value. (-> pc+1)
	 */
	GOSUB,

	/**
	 * Pops the return value. (pc -> )
	 */
	RETURN,

	/**
	 * pops() the top element and sets pc if false.
	 * 
	 * (boolean -> )
	 */
	BRANCH_FALSE,

	/**
	 * peeks() at the top element and sets pc if false.
	 * 
	 * (boolean -> boolean)
	 */
	DUP_BRANCH_FALSE,

	/**
	 * peeks() at the top element and sets pc if true.
	 * 
	 * (boolean -> boolean)
	 */
	DUP_BRANCH_TRUE,

	/**
	 * (iterable -> iterator)
	 */
	ITERATOR,

	/**
	 * (iterator limit -> limited_iterator)
	 */
	ITERATOR_LIMIT,

	/**
	 * Branches if no next item, or pushes the next item on the stack
	 * 
	 * (iterator -> iterator next)
	 */
	ITERATOR_NEXT_OR_BRANCH,

	/**
	 * Part of the hacky order-by support. Sets up an internal order-by builder.
	 * 
	 * ( -> )
	 */
	ITERATOR_START_ORDER_BY,

	/**
	 * Part of the hacky order-by support. Adds a value and sort-key to the internal order-by builder.
	 * 
	 * (value sort_key -> )
	 */
	ITERATOR_PROCESS_ORDER_BY,

	/**
	 * Part of the hacky order-by support. Eats the iterator off the stack and replaces it with an ordered version.
	 * 
	 * (iterator -> ordered_iterator)
	 */
	ITERATOR_END_ORDER_BY,

	/**
	 * (to_print -> )
	 */
	PRINT,

	/**
	 * (x y -> x-y)
	 */
	BINARY_MINUS,

	/**
	 * (x -> -x)
	 */
	UNARY_MINUS,

	/**
	 * (x y -> x+y)
	 */
	BINARY_PLUS,

	/**
	 * (x -> +x)
	 */
	UNARY_PLUS,

	/**
	 * (x y -> x*y)
	 */
	MUL,

	/**
	 * (x y -> x/y)
	 */
	DIV,

	/**
	 * (x y -> x>y)
	 */
	GT,

	/**
	 * (x y -> x<y)
	 */
	LT,

	/**
	 * (x y -> x>=y)
	 */
	GTE,

	/**
	 * (x y -> x<=y)
	 */
	LTE,

	/**
	 * (x y -> x==y)
	 */
	EQEQ,

	/**
	 * (x y -> x!=y)
	 */
	NE,

	/**
	 * (-> true)
	 */
	TRUE,

	/**
	 * (-> false)
	 */
	FALSE,

	/**
	 * (-> null)
	 */
	NULL,

	LITERAL_INT,

	LITERAL_FLOAT,

	LITERAL_STRING,

	/**
	 * (x "a" -> x.a)
	 */
	DOT,

	/**
	 * (x "a" -> x == null ? null : x.a)
	 */
	QDOT,

	SLICE,

	LOCAL_STORE,

	LOCAL_LOAD,

	SCOPE_LOOKUP,

	PIPE,

	INVOKE,

	LITERAL_LIST,

	BITWISE_NOT,

	BOOLEAN_NOT,

	LSHIFT,

	RSHIFT,

	XOR,

	AND,

	OR,

	IAND,

	IOR,

	PRINT_LITERAL,

	/**
	 * (a b -> range(a,b))
	 */
	NEW_RANGE,

	/**
	 * (a b c -> range(a,b,c))
	 */
	NEW_RANGE_BY,

	/**
	 * (a b -> (a in b))
	 */
	IN,
}