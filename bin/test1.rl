#include <string.h>
#include <stdio.h>

%%{
  machine checker;
  write data;
}%%

unsigned char checker( const char *str )
{
  /* standard Ragel variables */
  const char *p = str, *pe = str + strlen( str ) - 1; //-1 to strip "\n"
  const char *eof = pe;
  int cs;

  unsigned char correct = 0;

  %%{
    action final { printf("entire match"); correct = 1; }
    action partial { printf("partial match"); correct = 1; }

    url = 'url';
    
    main := ( 'foo' | 'bar' | url ) @/partial %final;

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
    printf( "%d\n", checker( buf ));
  }
  return 0;
}
