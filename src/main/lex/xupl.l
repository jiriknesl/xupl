N     [\012\015]
S     [\000\011\013\014\016-\040]
L     [a-zA-Z\200-\377]
O     [^\000-\040a-zA-Z\200-\377]

T     "${"[^}]+"}"

G     \"(\\.|[^\\"])*\"

D			[0-9]
H			0[xX][a-fA-F0-9]+
E			[Ee][+-]?{D}+

MC    "/*"
SC    "//"[^\012\015]+{N}

%{
#include <stdio.h>
#include "xupl.tab.h"
%}

%%
{MC}              { comment(); }
{SC}              { }

{N}               { return(LINE); }
{T}+              { return(TEMPLATE); }
{S}+              { return(SPACE); }
{L}+              { return(WORD); }

{G}	              { return(STRING); }
{H}+	            { return(CONSTANT); }
0{D}+	            { return(CONSTANT); }
{D}+	            { return(CONSTANT); }

{D}+{E}     		  { return(CONSTANT); }
{D}*"."{D}+({E})?	{ return(CONSTANT); }
{D}+"."{D}*({E})?	{ return(CONSTANT); }

.                 { return(yytext[0]); }

%%

comment()
{
	char c, c1;

loop:
	while ((c = input()) != '*' && c != 0)
		;//putchar(c);

	if ((c1 = input()) != '/' && c != 0)
	{
		unput(c1);
		goto loop;
	}

	if (c != 0)
		;//putchar(c1);
}
