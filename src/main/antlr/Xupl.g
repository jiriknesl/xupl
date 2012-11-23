lexer grammar Xupl;

options {
  language=Java;
}

@header {
package org.nicerobot.xupl;
}

XML
  : '?xml'
  | '?xupl'
  ;

ID
	: START ~(BLOCK|CONTINUE|WHITE)*
  ;

NID
	:	~(START|BLOCK|CONTINUE|WHITE) ~(WHITE)*
	;

fragment START
	: 'a'..'z'|'A'..'Z'|'_'
	;

fragment BLOCK
	: '('|'['|'{'|'}'|']'|')'|':'
	;

fragment CONTINUE
	: '.'|','
	;
fragment WHITE
	: (' '|'\t'|'\r'|'\n')
	;
	
fragment GREED
	: (options {greedy=false;}:.)
	;

DOC
  : '!!!' GREED+ '!!!'
  ;

CDATA
  : '"""' GREED* '"""'
  | '\'\'\'' GREED* '\'\'\''
  ;

VERBATIM
  : '<<<' GREED* '>>>'
  ;

STR
  : '"' ~('"')* '"'
  | '\'' ~('\'')* '\''
  ;

COMMENT
  : ('//'|'#') ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
  | '/*' GREED* '*/' {$channel=HIDDEN;}
  ;

WS
  : WHITE+ {$channel=HIDDEN;}
  ;
