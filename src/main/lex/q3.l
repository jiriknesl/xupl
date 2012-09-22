%x DUR W D H M S N BS64 BS32 BS16 BS10 BS8 BS2 Q3 UQ
%s REST

next      [, \t\n]
q3        ["]{3}
name      [A-Za-z\200-\3770-9!#$%()*+\-/:;<>?[\\\]^_`~.][A-Za-z\200-\3770-9!"#$%'()*+\-/:;<>?[\\\]^_`~.=@]*

%{
#include <stdio.h>
#include "xupl.tab.h"

void swallow(int n);
#define SEND(token) swallow(token)
//#define SEND(token) return(token)
%}

%%
<INITIAL>^#[^\n]*\n       { BEGIN(REST); }

<Q3>{q3}                  { printf("\n\nEND Q3\n\n"); BEGIN(UQ); SEND(NEXT); }
<Q3>.                     { printf("\n%s /Q3",yytext); }
<*>{q3}                   { printf("\n\nSTART Q3\n\n"); BEGIN(Q3); }

<*>{next}                 { printf("\n"); SEND(NEXT); }

<UQ>{name}                 { printf("\nname[%s]\n",yytext); SEND(NAME); }

<*>.                      { printf("%s",yytext); SEND(NEXT); }
%%


yywrap()
{
	return(1);
}

void swallow(int n) {}
