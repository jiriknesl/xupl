grammar Hello;

@header {
package org.nicerobot.hello.parser;
}

r       : 'hello' name value;

name  : NAME;
value : VALUE;

WS      : [ \r\t\n]* -> skip;

NAME    : START (BLOCK)*;
VALUE   : ~[a-zA-Z_ \r\t\n\{\}\[\]\(\):.,] (BLOCK)*;

//NAME    : START (BLOCK)*;
//VALUE   : ~(START|BLOCK) (NBLOCK)*;

fragment START   : [a-zA-Z_];
fragment BLOCK   : ~[ \r\t\n\{\}\[\]\(\):.,];
