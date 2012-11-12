#include <stdio.h>
#include <string.h>

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
    action final { printf("match\n"); }
    action doctype { printf("doctype\n"); fnext doctype;  }
    action any { printf("$%c\n",fc);  }

    ID = [a-zA-Z_][a-zA-Z0-9_]*;
    PRENS = [!\#.]|'::';
    POSTNS = [@\\];
    name = ID ((PRENS|POSTNS) ID)?;

    CHAR = '\'' [^'] '\'';
    STR = '"' [^"]* '"';
    EXPONENT = /e/i [+\-]? digit+;
    FLOAT = (digit+ '.' digit* | '.' digit+) EXPONENT? | digit+ EXPONENT;
    value = [^ \t\r\n\t\v]*;

    OP = space* [^",:.0-9a-zA-Z_()\[\]]+ space*;
  
    attrN = name OP? value | value OP? name;
    attrP = name OP? value | value OP? name;
    attrB = name OP? value | value OP? name;

    attributes = space+ attrN ( ',' attrN)* 
      | '(' attrP ( [,;.] attrP)* ')' 
      | '[' attrB ( [,;.] attrB)* ']';

    doctype = '!!!';

    document = name attributes? ('{' document* '}')?;

    main := ('?xml' attributes?) space* doctype? document;

    write init;
    write exec;
  }%%
  
  return correct;
}

#define BUFSIZE 1024
int main()
{
  char buf[BUFSIZE];
  while ( fgets( buf, sizeof(buf), stdin ) != 0 && xupl( buf ) == 0);
  return 0;
}
