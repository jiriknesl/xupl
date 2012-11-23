grammar Hello;

@header {
package org.nicerobot.hello.parser;
}

r       : 'hello' NAME;
NAME    : [A-Z] ~([0-9])*;
WS      : [ \t\n]* -> skip;
