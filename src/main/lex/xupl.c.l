name [a-zA-Z_][a-zA-Z0-9_]*

%s CDATA1
%s CDATA2
%s STRING1
%s STRING2
%s ELEMENT
%s ATTR0
%s ATTR1
%s ATTR2
%s DTD1
%s VALUE
%s VERBATIM
%s DOCUMENT
%s SPEC

%%

<INITIAL>[?]x(m|up)l                             { printf("<?xml");             BEGIN SPEC;}
<SPEC>\n                                         { printf(" ?>\n");             BEGIN DOCUMENT;}
<SPEC>.?                                         { printf("%s",yytext);}

<INITIAL,DOCUMENT>[?]html                        { printf("<!DOCTYPE html>\n<html>\n"); BEGIN ELEMENT;}

<INITIAL,DOCUMENT>{name}                         { printf("<%s>",yytext);       BEGIN ELEMENT;}

<DOCUMENT>\[\[\[                                 { printf("<![CDATA[");         BEGIN CDATA1;}
<CDATA1>\]\]\]                                   { printf("%c%c>\n",']',']');   BEGIN DOCUMENT;}
<CDATA1>.?;
<DOCUMENT>\[\[\"                                 { printf("<![CDATA[");         BEGIN CDATA2;}
<CDATA2>\"\]\]                                   { printf("%c%c>\n",']',']');   BEGIN DOCUMENT;}
<CDATA2>.?                                       { printf("%s",yytext);}

<DOCUMENT><<<                                    {                              BEGIN VERBATIM;}
<VERBATIM>>>>                                    {                              BEGIN DOCUMENT;}
<VERBATIM>.                                      { printf("%s",yytext);}

<DOCUMENT>\'\'\'                                 {                              BEGIN STRING1;}
<STRING1>\'\'\'                                  {                              BEGIN DOCUMENT;}
<STRING1>.?                                      { printf("%s",yytext);}
<DOCUMENT>\"\"\"                                 {                              BEGIN STRING2;}
<STRING2>\"\"\"                                  {                              BEGIN DOCUMENT;}
<STRING2>.?                                      { printf("%s",yytext);}

<DOCUMENT>\!\!\!                                 { printf("<!DOCTYPE ");        BEGIN DTD1;}
<DTD1>\!\!\!                                     { printf(">\n");               BEGIN DOCUMENT;}
<DTD1>.?;

<DOCUMENT>\/\/[^\n]*                             { printf("<!-- %s -->\n",yytext);}

<ATTR0,ELEMENT>[{]                               {                              BEGIN DOCUMENT;}
<DOCUMENT>[}]                                    { printf("</>\n");}

<ELEMENT>[\t ]+                                  {                              BEGIN ATTR0;}
<ELEMENT>\[                                      {                              BEGIN ATTR1;}
<ATTR1>\]                                        {                              BEGIN ELEMENT;}
<ELEMENT>\(                                      {                              BEGIN ATTR2;}
<ATTR2>\)                                        {                              BEGIN ELEMENT;}
<ATTR0>[^\n\t\f\v\r ,\;:0-9a-zA-Z_\{\"\']+       { printf("=");}
<ATTR1,ATTR2>[^\n\t\f\v\r ,\;:0-9a-zA-Z_()\[\]\"\']+ { printf("=");}
<ATTR0,ATTR1,ATTR2>{name}                        { printf("%s",yytext); }

<DOCUMENT>[!\#.]|::                              { printf("PreNS[%s]\n",yytext);}
<DOCUMENT>[@\\]                                  { printf("PostNS[%s]\n",yytext);}
<DOCUMENT>[\t ]+                                 { printf("%s",yytext);}
<DOCUMENT>[\n\r];

<DOCUMENT,ATTR0,ATTR1,ATTR2>\"[^\"\\\r\n]*(\\.[^\"\\\r\n]*)*\"     { printf("\"%s\"",yytext);}
<DOCUMENT,ATTR0,ATTR1,ATTR2>\'[^\'\\\r\n]*(\\.[^\'\\\r\n]*)*\'     { printf("\"%s\"",yytext);}

<DOCUMENT>[,\;:]                                 { printf("continue\n");}

<VALUE>[^\n\t\f\v\r ,\)\]]+                      { printf("VALUE[%s]\n",yytext);}

<DOCUMENT>.                                      { printf("unknown[%s]\n",yytext);}

%%

int main()
{
  yylex();
  return 0;
}
