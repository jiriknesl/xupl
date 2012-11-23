grammar Xupl;

@header {
package org.nicerobot.xupl.parser;
}

xupl    : node EOF;

node    : WS* name attrs? ( OPEN node+ CLOSE )? ;

attrs   : SPACE+ attr ( SPACE? ',' SPACE? attr )*;

attr    : name value | value name;

name    : ID;

value   : ~(ID);


START   : 'a'..'z'|'A'..'Z'|'_';

BLOCK   : '('|'['|OPEN|CLOSE|']'|')';

ID      : START ~(WS|BLOCK)*;

NID     : ~(START) ~(WS|BLOCK)*;

OPEN    : '{'|':';

CLOSE   : '}'|'.';

SPACE   : ' '|'\t';

WS      : SPACE|'\n';
