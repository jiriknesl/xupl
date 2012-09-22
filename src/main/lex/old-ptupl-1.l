%x DUR W D H M S N BS64 BS32 BS16 BS10 BS8 BS2
%s REST

open      "{"
close     "}[.]"
indent    ^[ \t]+
next      [, \t\n][ \t\n]*

nest      "&{"[^}]+"}"|[\|]

attrs     =[ \t\n]

comeol    "//"[^\n]+[\n]

version   v[0-9]([.][0-9])*([-][^ .{\t\n]+)?
name	    [A-Za-z\200-\3770-9!"#$%'()*+\-/:;<>?[\\\]^_`~]+
str       \"([^\"\\\n]|(\\['\"?\\abfnrtv])|(\\([0123456]{1,3}))|(\\x[[:xdigit:]]+)|(\\u([[:xdigit:]]{4}))|(\\U([[:xdigit:]]{8})))*\" 

dseq      ([0-9]+)
dseq_opt  ([0-9]*)
frac      (({dseq_opt}"."{dseq})|{dseq}".")
exp       ([eE][+-]?{dseq})
exp_opt   ({exp}?)
fsuff     [flFL]
fsuff_opt ({fsuff}?)
hpref     (0[xX])
hdseq     ([[:xdigit:]]+)
hdseq_opt ([[:xdigit:]]*)
hfrac     (({hdseq_opt}"."{hdseq})|({hdseq}"."))
bexp      ([pP][+-]?{dseq})
dfc       (({frac}{exp_opt}{fsuff_opt})|({dseq}{exp}{fsuff_opt}))
hfc       (({hpref}{hfrac}{bexp}{fsuff_opt})|({hpref}{hdseq}{bexp}{fsuff_opt}))   
fpc       ({dfc}|{hfc})

%{
#include <stdio.h>
#include "xupl.tab.h"

// [!"#$%&'()*+,\-./:;<=>?@[\\\]^_`{|}~]	

void count();
void swallow(int n);
#define SEND(token) swallow(token)
//#define SEND(token) return(token)
%}

%%
<INITIAL>^#[^\n]*\n { BEGIN(REST); }

<*>"/*"			        { comment(); }
<*>{comeol}         { count(); printf("%s[%.*s]\n","comment",(int)strlen(yytext)-3,yytext+2); SEND(COMMENT); }
<*>{str}            { count(); printf("%s[%.*s]\n","str",(int)strlen(yytext)-2,yytext+1); SEND(COMMENT); }
                  
<*>{indent}	        { count(); printf("%s[%lu]","indent",strlen(yytext)); SEND(INDENT); }
                  
<*>{attrs}          { count(); printf("%s[%.1s]","attrs",yytext); }
                  
<*>{fpc}            { count(); printf("%s[%s]","float",yytext); }
<*>{version}        { count(); printf("%s[%s]","version",yytext); }
<*>{nest}           { count(); printf("%s[%s]","nest",yytext); }
<*>{next}|{open}    { count(); printf("\n"); SEND(NEXT); }
<*>{close}          { count(); SEND(NEXT); }
                  
<*>{name}           { count(); printf("%s[%s]","name",yytext); }
                  
<*>.                { count(); printf("%s[%s]","",yytext); SEND(NEXT); }
%%


yywrap()
{
	return(1);
}

void swallow(int n) {}

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
		putchar(c1);
}


int column = 0;

void count()
{
	int i;

	for (i = 0; yytext[i] != '\0'; i++)
		if (yytext[i] == '\n')
			column = 0;
		else if (yytext[i] == '\t')
			column += 8 - (column % 8);
		else
			column++;
}
