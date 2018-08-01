# Stencil: Simple Templating for Java

  1. [Introduction][1]
  2. [Basics][2]

   [1]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#introduction
   [2]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#basics

    1. [Print blocks][3]
    2. [Statement blocks][4]
    3. [Comment blocks][5]
    4. [Escaping][6]

   [3]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#print-blocks
   [4]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#statement-blocks
   [5]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#comment-blocks
   [6]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#escaping

  3. [XML Templates][7]
  4. [Expressions][8]

   [7]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#xml
   [8]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#expressions

    1. [Numbers][9]
    2. [Strings][10]
    3. [Lists][11]
    4. [Maps][12]
    5. [Ranges][13]
    6. [Properties][14]
    7. [Filters][15]
    8. [Math Operators][16]
    9. [Boolean Operators][17]
    10. [Bitwise Operators][18]
    11. [Comparison Operators][19]
    12. [Conditional Operator][20]
    13. [In Operator][21]

   [9]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#numbers
   [10]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#strings
   [11]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#lists
   [12]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#maps
   [13]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#ranges
   [14]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#properties
   [15]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#filters
   [16]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#math-operators
   [17]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#boolean-operators
   [18]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#bitwise-operators
   [19]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#comparison-operators
   [20]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#conditional-operator
   [21]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#in-operator

  5. [Statements][22]

   [22]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#statements

    1. [if][23]
    2. [for][24]
    3. [var][25]
    4. [Assignment][26]
    5. [Print][27]

   [23]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#if
   [24]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#for
   [25]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#var
   [26]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#assignment
   [27]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#print

  6. [Variables][28]

   [28]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#variables

## Introduction

Stencil is a modern templating language for webby things, inspired heavily by
Django Templates, the Twig Project, the Python language and others.

Stencil templates can either be raw text or XML. XML templates can target XML,
HTML or mail messages (through a custom XML format).

The goals of Stencil are ease-of-use, predictable behavior and syntax and
readability.

## Basics

The code that generates the output from a Stencil template **binds** a set of
objects to a set of global names. These globally-bound objects and their
fields can then be rendered by the template.

A Stencil template contains text or XML content alongside commands in
specially delimited blocks. There are four kinds of blocks:

  1. [Print blocks][29], surrounded by `{{` and `}}`, which are used to print values into the output.
  2. [Statement blocks][30], surrounded by `{%` and `%}`, which are used to control the flow of execution in the template.
  3. [Comment blocks][31], surrounded by `{#` and `#}`, which are ignored in the final output.
  4. [Escape blocks][32], surrounded by `{%%%` and `%%%}`, which are used to escape blocks that contain content that looks like special Stencil syntax

   [29]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#print-blocks
   [30]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#statement-blocks
   [31]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#comment-blocks
   [32]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#escaping

### Print Blocks

You can output a value in a template by putting a reference to it directly in
a print block.

    
    
    
    
    
    2 + 2 = {{ 4 }}
    
    
    
    2 + 2 = 4
    

A value can be any sort of [expression][33]:

    
       [33]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#expressions

    
    
    
    2 + 2 = {{ 2 + 2 }}
    
    
    
    2 + 2 = 4
    

A value can also be a reference to globally-bound object, or a field one of
the globally-bound objects:

    
    
    
    
    
    Hello, {{ person.name }}, you look {{ person.mood }} today!
    
    
    
    Hello, Bob, you look happy today!
    

Occasionally you'll want to surround a printed value with something that looks
like the template print delimiters, `{{` and `}}`. Stencil is smart enough to
deal with this case without any special syntax:

    
    
    
    
    
    {{ person.age }} {{{ person.age }}} {{{{ person.age }}}}
    
    
    
    1 {1} {{1}} 
    

### Statement Blocks

Statement blocks are used to control the flow of executing in the template.

A statement block can contain one or more [ statements][34], like if and for.

    
       [34]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#statements

    
    
    
    {%
        if person.mood == 'happy':
            ='great!';
        else:
            ='uh-oh!';
        end;
    %}
    
    
    
    great!
    

### Escaping

If you want to specify something that looks like template syntax, like `{{
something }}` or `{% something %}`, you can either print the first few
characters with a template print block, or use the raw template markers,
`{%%%` and `%%%}`:

    
    
    
    
    
    This is an example of Stencil formatting: {{ '{{' }} x }}
    
    {%%%
    This is an example of Stencil formatting: {{ x }}
    %%%}
    
    
    
    This is an example of Stencil formatting: {{ x }}
    
    This is an example of Stencil formatting: {{ x }}
    

## XML Templates

TODO

## Expressions

TODO: prose

### Numbers

Numbers in Stencil are either integers or floats. If a number starts with 0x,
it is interpreted as a hexadecimal integer. If a number in a template has a
decimal point, it is interpreted as a float, otherwise it is interpreted as an
integer.

    
    
    
    
    
    1234
    0x1234
    1234.0
    

### Strings

Strings in Stencil are always immutable and support UTF-16 unicode (characters
from \u0000-\uffff).

Strings are written as they are in Javascript and Python:

    
    
    
    
    
    "This is a string"
    'This is also a string!'
    

You can escape quote characters within a string with a backslash, `\`. A
single quote doesn't need to be escaped when double quotes are used for the
string and vice-versa:

    
    
    
    
    
    "\"He said that, didn't he?\" said Chuck."
    '"He said that, didn\'t he?" said Chuck.'
    

Other characters can be specified with their hex equivalent (via `\xAB`) or
their unicode hex equivalent (via `\uABCD`):

    
    
    
    
    
    "Non-breaking space: \u00a0."
    "The lowercase letter f: \x66"
    

Any character may be escaped with a backslash, including the backslash itself:

Escape Code Equivalent Description

\\

\

Backslash

\"

"

Double quote

\'

'

Single quote

Control characters may also be specified using shortcuts:

Escape Code Equivalent Description

\b

\u0008

Horizontal backspace

\t

\u0009

Horizontal tab

\n

\u000a

Linefeed

\f

\u000c

Form feed

\r

\u000d

Carriage return

Strings containing many escape characters may use the alternative syntax. If
you start a string with """ or ''', the string continues until the matching
""" or ''' is encountered. No escape characters are processed inside of these
strings:

    
    
    
    
    
    {{ """foo\n""
    bar""" }}
    {{ '''foo"""bar''' }}
    
    
    
    foo\n""
    bar
    foo"""bar
    

Strings can be sliced as they can in Python by specifying the start, end and
stride. If the start is omitted, the start is assumed to be the beginning of
the string. If the end is omitted, the end is assumed to be the end of the
string. If the stride is omitted, it is assumed to be `1`.

The slice operator uses the form `[start:end:stride]`. It is not an error to
specify an index that isn't valid. The beginning and end index will always be
clamped to the beginning and end of the string if it is out of bounds.

    
    
    
    
    
    "0123456789"[2] -> "2"
    "0123456789"[:2] -> "01"
    "0123456789"[:-2] -> "01234567"
    "0123456789"[-1] -> "9"
    "0123456789"[2:11] -> "23456789"
    "0123456789"[2:10] -> "23456789"
    "0123456789"[2:10:2] -> "2468"
    "0123456789"[2:4] -> "23"
    "0123456789"[2:-2] -> "234567"
    "0123456789"[-11:2] -> "01"
    

### Lists

Lists in Stencil may be provided by an object property or specified inline in
the template as a literal.

You can access individual list elements using the index operator. Negative
indexes are relative to the end of the array (-1 is the last element):

    
    
    
    
    
    {{ x[0] }} 
    {{ x[1] }} 
    {{ x[2] }}
    {{ x[-1] }}
    {{ x[-2] }}
    
    
    
    Item at index 0
    Item at index 1
    Item at index 2
    Item at index 2
    Item at index 1
    

Lists can also be sliced with the slice operator. The slice operator uses the
form `[start:end:stride]`. It is not an error to specify an index that isn't
valid. The beginning and end index will always be clamped to the beginning and
end of the string if it is out of bounds:

    
    
    
    
    
    {% for y in x[2:] %}{{ y }}{% end %} 
    
    
    
    Item at index 2
    Item at index 3
    Item at index 4
    ...
    

Stencil allows you to specify a list literal directly in the code using the
list syntax. The list literals can be used with the [for][35] statement:

    
       [35]: http://github.com/mmastrac/Stencil/raw/master/docs/index.html#for

    
    
    
    {% for x in [1,2,3] %}
    {{ x }}
    {% end %}
    
    
    
    1
    2
    3
    

### Maps

Maps in Stencil may be provided by an object property.

#### Accessing a single item in the map

Use `x.blah` or `x["blah"]`

#### Iterating a map

Each step in the for loop will return a pair of key and value in an array,
like so:

    
    
    
    
    
    {% for x in map %}
    key = {{ x[0] }}, value = {{ x[1] }}
    {% end %}
    
    
    
    key = a, value = 1
    key = b, value = 2
    

### Ranges

Ranges in Stencil allow iteration between two numeric values. A range is
indicated by the `to` keyword:

    
    
    
    
    
    {% for i in 1 to 10 %}{{ i }} {% end %}
    {% for i in 10 to 1 %}{{ i }} {% end %}
    
    
    
    1 2 3 4 5 6 7 8 9 10
    10 9 8 7 6 5 4 3 2 1
    

Ranges automatically choose +1 or -1 as the stride, depending on the relative
values of the start and end. If you want to override this, use the `by`
keyword:

    
    
    
    
    
    {% for i in 1 to 10 by 2 %}{{ i }} {% end %}
    {% for i in 10 to 1 by -2 %}{{ i }} {% end %}
    
    
    
    1 3 5 7 9
    10 8 6 4 2
    

The start number in a range is always printed. The end number in a range is
printed if the iteration falls on it exactly:

    
    
    
    
    
    {% for i in 1 to 9 by 2 %}{{ i }} {% end %}
    {% for i in 1 to 10 by 2 %}{{ i }} {% end %}
    {% for i in 1 to 11 by 2 %}{{ i }} {% end %}
    
    
    
    1 3 5 7 9
    1 3 5 7 9
    1 3 5 7 9 11
    

### Properties

You can retrieve properties from an object using the dot operator:

    
    
    
    
    
    person.name
    
    
    
    Bob
    

If the left-hand side of the dot operator doesn't exist, the operator returns
null and prints a warning. To avoid the warning in this case, use the ?.
operator:

    
    
    
    
    
    noperson.name
    
    
    
    _no output, returns a warning_
    
    
    
    
    
    
    noperson?.name
    
    
    
    _no output, no warning_
    

### Filters

Filters transform output, much like unix pipe commands. A filter is invoked
using the filter operator |, followed by the name of the filter to invoke.

The built-in filters offer ways to convert between types, format strings and
more.

Name Description Example

raw

Converts the input into a raw string, bypassing HTML escaping

`"&nbsp;"|raw`

escape

Converts the input into a raw string, HTML escaping along the way

`"<div>"|escape`

urlencode

URL-encodes the given string

`'urlunsafe%#'|urlencode`

string

Converts the input into a regular string

`1234|string`

int

Converts the input into an integer, or null if it can't be converted

`"1234"|int`

float

Converts the input into a float, or null if it can't be converted

`"1234.1"|float`

size

Retrieves the size of the input (string or array length)

`[1,2,3]|size`

join

Joins a collection of items together

`[1,2,3]|join`

format

Formats a string from the passed array or singular object using the [Java
formatting rules][36]

`[1,2,'a']|format("%d/%d: %s")`

   [36]: http://java.sun.com/j2se/1.5.0/docs/api/java/util/Formatter.html

### Math Operators

Stencil provides a set of math operators for common operations.

TODO

### Boolean Operators

Boolean operators coerce their operand(s) to a boolean before performing the
operations.

Symbol Description Example

and

Boolean AND

true and true

or

Boolean OR

true or false

^

Boolean XOR

true ^ false

not

Boolean NOT

not false

### Bitwise Operators

Bitwise operators coerce their operand(s) to integer before performing the
operations.

Symbol Description Example

and

Bitwise AND

1234 and 7

or

Bitwise OR

1234 or 7

^

Bitwise XOR

1234 ^ 7

~

Bitwise ones-compliment

~1234

<<

Bitwise left-shift

1234 << 2

>>

Bitwise right-shift

1234 >> 2

### Comparison Operators

Stencil provides a set of common operators for comparing two values. For all
comparisons, a set of conversions will happen internally:

  * A null value will always compare less than any other value and equal to another null value
  * If one of the arguments is a string, the two arguments are compared using their string equivalents
  * Otherwise, the two arguments are compared as floats

Symbol Description Example

<

Less-than

2 < 3

>

Greater-than

3 > 2

==

Equals

2 == 2

==

Not-equals

3 != 2

### Conditional Operator

Stencil offers a conditional operator that, depending on the boolean value of
its first argument, will return either the second or third argument. If the
first argument is true, it returns the second argument. If the first argument
is false, it returns the third argument.

The first argument is coerced to boolean before being evaluated.

    
    
    
    
    
    {{ person.mood == 'happy' ? 'Yay!' : 'Boo!' }}
    {{ person.emailAddresses 
        ? "You've set up email" 
        : "You haven't set up email" }}
    
    
    
    Yay!
    You haven't set up email
    

### In Operator

The `in` operator tests whether the left-hand-side argument is contained
within the right-hand-side argument.

If the right-hand-side argument is a string, Stencil tests for the left-hand-
side argument within it:

    
    
    
    
    
    "cab" in "death cab"
    1 in "1stop"
    "bar" in "foo"
    
    
    
    true
    true
    false
    

If the right-hand-side is a list, array, range or iterable, Stencil tests for
the element within it:

    
    
    
    
    
    "cab" in ["car", "bus", "cab"]
    1 in [1,2,3]
    10 in 1 to 100
    
    
    
    true
    true
    true
    

If the right-hand-side is a map, Stencil tests for the element as a key within
the map, using the standard map lookup rules:

    
    
    
    
    
    _(assuming map = {"cab":1})_
    "cab" in map
    "car" in map
    
    
    
    true
    false
    

## Control Statements

Templates can contain control statements that affect the flow of execution of
the template based on values of the input.

### if

An `if` block will optionally render a part of the template, based on a
condition expression. The result of the condition expression is coerced to a
boolean.

    
    
    
    
    
    {% if person.mood == "happy" %}
         Glad to see you!
    {% end %}
    
    {% if person.mood == "sad" %}
         What's wrong?
    {% end %}
    
    
    
    Glad to see you!
    

You can also specify an `else` block that will be executed if the condition
evaluates to `false`:

    
    
    
    
    
    {% if person.mood == "happy" %}
         Glad to see you!
    {% else %}
         What's wrong?
    {% end %}
    
    
    
    Glad to see you!
    

If you have a number of `if` blocks and only want one to execute, you can use
`elif`:

    
    
    
    
    
    {% if person.mood == "happy" %}
        Glad to see you!
    {% elif person.mood == "mad" %}
        Whoa, calm down!
    {% elif person.mood == "sad" %}
        What's wrong?
    {% else %}
        I can't read you!
    {% end %}
    
    
    
    What's wrong?
    

## for

A `for` block can be used to loop over a collection of objects.

Syntax:

    
    
    {% for id in collection 
        [where where_expression] 
        [order by order_expression] 
        [limit limit_expression] %}
    
    
    
    
    
    
    <p>Your addresses:</p>
    <ul>
    {% for x in person.emailAddresses %}
         <li>{{ x }}</li>
    {% end %}
    </ul>
    
    
    
    <p>Your addresses:</p>
    <ul>
         <li>bobs@yeruncle.com</li>
         <li>bob@example.com</li>
    </ul>
    

If you pass a string as the loop object, you can loop over its characters:

    
    
    
    
    
    Hello, {% for x in person.name %}[{{ x }}]{% end %}!
    
    
    
    Hello, [B][o][b]!
    

You can specify an `else` block to a `for` loop that will be executed if there
are no items in the collection:

    
    
    
    
    
    <p>Your addresses:</p>
    <ul>
    {% for x in person.emailAddresses %}
         <li>{{ x }}</li>
    {% else %}
         <li>Nothing!</li>
    {% end %}
    </ul>
    
    
    
    <p>Your addresses:</p>
    <ul>
         <li>Nothing!</li>
    </ul>
    

A `for` loop may also have a limit. The limit is evaluated at run-time, so it
may be any numeric expression:

    
    
    
    
    
    <p>Your addresses:</p>
    <ul>
    {% for x in person.emailAddresses limit person.emailAddressesToShow %}
         <li>{{ x }}</li>
    {% end %}
    </ul>
    
    
    
    <p>Your addresses:</p>
    <ul>
         <li>bobs@yeruncle.com</li>
         <li>bob@example.com</li>
    </ul>
    

You can force a `for` loop to continue to the next item with the `continue`
command:

    
    
    
    
    
    <p>Your addresses:</p>
    <ul>
    {% for x in person.emailAddresses %}
        {% if x.hidden: continue; end; %}
        <li>{{ x.address }}</li>
    {% end %}
    </ul>
    
    
    
    <p>Your addresses:</p>
    <ul>
         <li>bob@example.com</li>
    </ul>
    

## Variables

Stencil templates allow you to define and assign to local variables to
implement simple counters and logic:

    
    
    
    
    
    {% var x = 1 %}
    x is now {{ x }}
    {% x = x + 1 %}
    x is now {{ x }}
    
    
    
    x is now 1
    x is now 2
    

Variables are scoped, meaning that the assignment operator will assign to the
variable with the given name in the closest matching scope and accessing the
variable by name will access the variable in the closed scope. When the block
ends, the variable is torn down and no longer exists:

    
    
    
    
    
    {% var x = 1 %}
    x is now {{ x }}
    {% if true %}
        {% var x = 10 %}
        x is now {{ x }}
        {% x = x + 1 %}
        x is now {{ x }}
    {% end %}
    {% x = x + 1 %}
    x is now {{ x }}
    
    
    
    x is now 1
    x is now 10
    x is now 11
    x is now 2
    

## Type Coercion

TODO

### To Boolean

TODO

### To Integer

TODO

### To Float

TODO

### To String

TODO

