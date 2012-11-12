#include <stdio.h>
#include <string.h>

%%{
  machine checker;
  write data;
}%%

unsigned char checker( const char *str )
{
  /* standart Ragel variables */
  const char *p = str, *pe = str + strlen( str ) - 1; //-1 to strip "\n"
  const char *eof = pe;
  int cs;

  unsigned char correct = 0;

  %%{
    action PUSH { printf("push "); }
    action POP { printf("-pop "); }
    action ATTR { printf("attr "); fgoto attr; }
    action OPEN { printf("open "); }

    id = [a-zA-Z_][^ :{\t\v\f\n\r]*;

    attr := id space ([^a-zA-Z_] space)? [0-9]+ %ATTR;
    main := id %PUSH;

    write init;
    write exec;
  }%%
  
  return correct;
};


#define BUFSIZE 1024
int main()
{
  char buf[BUFSIZE];
  while ( fgets( buf, sizeof(buf), stdin ) != 0 ) {
    printf( "%d\n", checker( buf ));
  }
  return 0;
}
