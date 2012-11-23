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

NAME    : START ~(BLOCK)*;

START   : [a-zA-Z_];

VALUE   : ~(START|BLOCK) ~(BLOCK)*;

BLOCK   : [ \t\n\{\}\[\]\(\):.,];

NEXT    : [,];

OPEN    : [\{:];

CLOSE   : [\}.];

WS      : [ \t\n]* -> skip;
