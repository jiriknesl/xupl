%{
#define YYSTYPE double
#include <math.h>
#include <stdio.h>
int yylex (void);
void yyerror (char const *);
%}

%token WORD
%token STRING
%token CONSTANT

%% /* The grammar follows.  */
xupl
    :
    | node
    ;

node
    : tag children
    | STRING
    ;

nodes
    : 
    | node
    | node nodes

etag
    :
    | tag
    ;

tag
    : WORD 
    | WORD attributes
	  ;

children
    :  '{' nodes etag '}'
    |  '(' nodes etag ')'
    |  '[' nodes etag ']'
    |  ':' nodes      '.'
    ;

attribute
    : WORD STRING
    | WORD CONSTANT
    | STRING WORD
    | CONSTANT WORD
    ;

attributes
    : attribute
    | attribute ',' attributes
    ;
%%
