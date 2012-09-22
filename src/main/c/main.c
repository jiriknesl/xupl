#include <stdio.h>

extern int yyparse(void);

/* yywrap -- return 1 if no more files to parse */
int yywrap(void)
{
  return 1;
}

/* yyerror -- show error message to user */
void yyerror(char *msg)
{
  fprintf(stderr, "%s\n", msg);
}

/* main -- call yyparse and print result */
int main(char *argv, int argc)
{
  int err;

  err = yyparse();
  if (err != 0) {
    printf("Parse ended with %d error(s)\n", err);
    return err;
  }
  return 0;
}
