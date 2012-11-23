grammar Xupl;

@header {
package org.nicerobot.xupl.parser;
}

xupl    : node EOF;

node    : name attrs? ( OPEN node+ CLOSE )? ;

attrs   : attr ( NEXT attr )*;

attr    : name value | value name;

name    : NAME;

value   : VALUE;

WS      : [ \r\t\n]* -> skip;

NAME    : START (BLOCK)*;
VALUE   : NSB (BLOCK)*;

fragment START   : [a-zA-Z_];
fragment BLOCK   : ~[ \r\t\n\{\}\[\]\(\):.,];
fragment NSB     : ~[a-zA-Z_ \r\t\n\{\}\[\]\(\):.,];

NEXT    : [,];
OPEN    : [\{:];
CLOSE   : [\}.];
