%x DUR W D H M S N BS64 BS32 BS16 BS10 BS8 BS2 Q3
%s REST

// don't parse. only tokenize. spaces and indentations.
// don't interpret characters. scan them and deliver them to the parse
// which will decide how they are supposed to be ordered.
// a namespace's mime-type will specify the lexer and parser.

indent    ^[ \t]+

next      [, \t\n]
nest      "&{"[^}]+"}"|[\|\{]
close     [}]|[.][ \t\n]

attrs     =[ \t\n]

comeol    "//"[^\n]+[\n]

q3        ["]{3}
version   v[0-9]([.][0-9])*([-][^ .={\t\n]+)?
contact   @[^ ,={\|\t\n]+
color     "#"([0-9a-fA-F]{3}){1,2}
tags      "#"[^ ,={\|\t\n]+
size      [0-9]+([a-z]{1,3}|"%")
esc	      "&#"[0-9]+";"|"&#x"[0-9a-fA-F]+";"
name      [A-Za-z\200-\3770-9!"#$%'()*+\-/:;<>?[\\\]^_`~.][A-Za-z\200-\3770-9!"#$%'()*+\-/:;<>?[\\\]^_`~.=@]*
str       \"([^\"\\\n]|(\\['\"?\\abfnrtv])|(\\([0123456]{1,3}))|(\\x[[:xdigit:]]+)|(\\u([[:xdigit:]]{4}))|(\\U([[:xdigit:]]{8})))*\" 

URL       [^ \n\t:]+:\/\/[^ \t\n]*
URI       (([^:/?#]+):)(\/\/([^/?#]*))?([^?#]*)(\?([^#]*))?(#(.*))?
host      (([a-zA-Z]|[a-zA-Z][a-zA-Z0-9\-]*[a-zA-Z0-9])\.)*([A-Za-z]|[A-Za-z][A-Za-z0-9\-]*[A-Za-z0-9])
mailto    mailto:[^ ,={\|\t\n]*

ip4       (([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])

digit     [[:digit:]]
dseq      ({digit}+)
dseq_opt  ({digit}*)

durstart  ~
durweek   {dseq}w
durday    {dseq}d
durhrs    {dseq}h
durmin    {dseq}m
dursec    {dseq}([.]{dseq})?s

decimal   [1-9][0-9]*
octal     0[0-9]+

base2     2[#rb]
base8     8[#rb]
base10    10[#rb]
base16    16[#rb]|0[xX]
base32    32[#rb]
base64    64[#rb]

base2d    [01]+
base8d    [0-7]+
base16d   [[:xdigit:]]+
base32d   ([02-9a-hjkmnp-z]+|[02-9A-HJKMNP-Z])
base64d   [0-9a-zA-Z+/]+"="{0,2}
base10d   [0-9]+

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

int indented = 0;
#define SPACES "                                                                                                "
int isname();
void count();
void indent();
void indenting();
void swallow(int n);
#define SEND(token) swallow(token)
//#define SEND(token) return(token)
%}

%%
<INITIAL>^#[^\n]*\n       { BEGIN(REST); }
<*>"/*"			              { comment(); }
<*>{comeol}               { count(); printf("%s[%.*s]\n","comment",(int)strlen(yytext)-3,yytext+2); SEND(COMMENT); }

<Q3>{q3}                  { count(); printf("\n%s\n","Q3",yytext); BEGIN(REST); }
<Q3>.                     { count(); printf("%s",yytext); }
<*>{q3}                   { count(); printf("\n\n#####\n\n"); BEGIN(Q3); }

<*>{indent}	              { count(); indenting(); SEND(INDENT); }

<*>{attrs}                { count(); printf("%s[%.1s]","attrs",yytext); }

<*>{size}                 { count(); printf("%s[%s]","size",yytext); BEGIN(BS64); }
                          
<*>{durstart}             { count(); printf("%s","duration"); BEGIN(DUR); }
<DUR,W,D,H,M,S>{durweek}  { count(); printf(" %s weeks",yytext); BEGIN(D); }
<DUR,D,H,M,S>{durday}     { count(); printf(" %s days",yytext); BEGIN(H); }
<DUR,H,M,S>{durhrs}       { count(); printf(" %s hours",yytext); BEGIN(M); }
<DUR,M,S>{durmin}         { count(); printf(" %s minutes",yytext); BEGIN(S); }
<DUR,S>{dursec}           { count(); printf(" %s seconds",yytext); BEGIN(N); SEND(DURATION); }

<N,W,D,H,M,S>[ \t\n]      { count(); printf("\n"); BEGIN(REST); }

<*>{contact}              { count(); printf("%s[%s]","contact",yytext); SEND(CONTACT); }
<*>{color}                { count(); printf("%s[%s]","color",yytext); SEND(TAGS); }
<*>{tags}                 { count(); printf("%s[%s]","tags",yytext); SEND(TAGS); }
<*>{URL}                  { count(); printf("%s[%s]","url",yytext); SEND(URL); }
<*>{mailto}               { count(); printf("%s[%s]","email",yytext); SEND(MAILTO); }
<*>{version}              { count(); printf("%s[%s]","version",yytext); SEND(VERSION); }
<*>{fpc}                  { count(); printf("%s[%s]","float",yytext); SEND(FLOAT); }
<*>{str}                  { count(); printf("%s[%.*s]","str",(int)strlen(yytext)-2,yytext+1); SEND(STRING); }
                          
<*>{ip4}                  { count(); printf("%s[%s]","ip4",yytext);   SEND(IP4); }

<*>{nest}                 { count(); indent(); SEND(NEST); }
<*>{next}                 { count(); printf("\n"); indent(); SEND(NEXT); }
<*>{close}                { count(); printf("\n"); SEND(NEXT); }

<*>{name}                 { count(); if (isname()) SEND(NAME); else REJECT; }

<*>{base64}               { count(); printf("%s","base64"); BEGIN(BS64); }
<*>{base32}               { count(); printf("%s","base32"); BEGIN(BS32); }
<*>{base16}               { count(); printf("%s","base16"); BEGIN(BS16); }
<*>{base8}                { count(); printf("%s","base8"); BEGIN(BS8); }
<*>{base2}                { count(); printf("%s","base2"); BEGIN(BS2); }
<*>{base10}               { count(); printf("%s","base10"); BEGIN(BS10); }
<BS64>{base64d}           { count(); printf("[%s]",yytext); BEGIN(N); SEND(BASE64); }
<BS32>{base32d}           { count(); printf("[%s]",yytext); BEGIN(N); SEND(BASE32); }
<BS16>{base16d}           { count(); printf("[%s]",yytext); BEGIN(N); SEND(BASE16); }
<BS8>{base8d}             { count(); printf("[%s]",yytext); BEGIN(N); SEND(BASE8); }
<BS2>{base2d}             { count(); printf("[%s]",yytext); BEGIN(N); SEND(BASE2); }
<BS10>{base10d}           { count(); printf("[%s]",yytext); BEGIN(N); SEND(BASE10); }
<*>{decimal}              { count(); printf("%s[%s]","decimal",yytext); SEND(BASE10); }
<*>{octal}                { count(); printf("%s[%s]","octal",yytext); SEND(BASE8); }

<*>.                      { count(); printf("%s[%s]","unk",yytext); SEND(NEXT); }
%%


yywrap()
{
	return(1);
}

void swallow(int n) {}

int isname() {
  size_t n=strlen(yytext)-1;
  char c=yytext[n];
  switch (c) {
    case '.':
    case ',':
    case '=':
    printf("%s[%s]","REJECTED",yytext); 
    return 0;
  }
  printf("%s[%s]","name",yytext); 
  return 1;
}

comment()
{
	char c, c1;

loop:
	while ((c = input()) != '*' && c != 0)
		putchar(c);

	if ((c1 = input()) != '/' && c != 0)
	{
		unput(c1);
		goto loop;
	}

	if (c != 0)
		putchar(c1);
}

quote()
{
	char c, c1;

loop:
	while ((c = input()) != '*' && c != 0)
		putchar(c);

	if ((c1 = input()) != '/' && c != 0)
	{
		unput(c1);
		goto loop;
	}

	if (c != 0)
		putchar(c1);
}


int column = 0;

void indent() {
  printf("%.*s",indented,SPACES);
}

void indenting() {
  int i = (int)strlen(yytext);
  indented=i?i:indented;
  indent();
}

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
