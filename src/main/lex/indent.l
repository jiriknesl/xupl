%{
/* need this for the call to getlogin() below */
#include <string.h>
%}

%%
^[ \t]+	printf("%d\n",strlen(yytext));
.|\n ;
%%

int main()
{
  yylex();
  return 0;
}
