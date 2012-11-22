#include <stdio.h>
#include <string.h>

%%{
  machine xuplValue;
  write data;
}%%

unsigned char xuplValue( const char *str )
{
  const char *p = str, *pe = str + strlen( str ) - 1; //-1 to strip "\n"
  const char *eof = pe;
  int cs;

  unsigned char correct = 0;

  %%{
    action final { printf("entire match"); correct = 0; }

    CHAR = '\'' [^'] '\'';
    STR = '"' [^"]* '"';
    EXPONENT = /e/i [+\-]? digit+;
    FLOAT = (digit+ '.' digit* | '.' digit+) EXPONENT? | digit+ EXPONENT;
    value := STR | CHAR | digit+ | '0x' xdigit+ | '#' digit{1,2} [^ \t\r\n\t\v]+ | FLOAT %final;
    write init;
    write exec;
  }%%
  
  return correct;
}

%%{
  machine xupl;
  write data;
}%%

unsigned char xupl( const char *str )
{
  const char *p = str, *pe = str + strlen( str ) - 1; //-1 to strip "\n"
  const char *eof = pe;
  int cs;

  unsigned char correct = 0;

  %%{
    action final { printf("entire match"); correct = 0; }
    action partial { printf("partial match"); correct = 1; }

    xupldecl := '?xml';

    ID = [a-zA-Z_][a-zA-Z0-9_]*;
    PRENS = [!\#.]|'::';
    POSTNS = [@\\];
    name = ID ((PRENS|POSTNS) ID)?;
    CHAR = '\'' [^'] '\'';
    STR = '"' [^"]* '"';
    EXPONENT = /e/i [+\-]? digit+;
    FLOAT = (digit+ '.' digit* | '.' digit+) EXPONENT? | digit+ EXPONENT;
    value = [^ \t\r\n\t\v]*;

    OPN = space* [^",:.0-9a-zA-Z_]+ space*;
    OPP = space* [^",:.0-9a-zA-Z_()]+ space*;
    OPB = space* [^",:.0-9a-zA-Z_\[\]]+ space*;
  
    attrN = name OPN? value | value OPN? name;
    attrP = name OPP? value | value OPP? name;
    attrB = name OPB? value | value OPB? name;

    attributes = attrN ( ',' attrN)* | '(' attrP ( [,;.] attrP)* ')' | '[' attrB ( [,;.] attrB)* ']';

    main := space* name space+ attributes space* %final;

    write init;
    write exec;
  }%%
  
  return correct;
}

#define BUFSIZE 1024
int main()
{
  char buf[BUFSIZE];
  while ( fgets( buf, sizeof(buf), stdin ) != 0 ) {
    printf( "%d\n", xupl( buf ));
  }
  return 0;
}
