%{
#include <string.h>

extern char yytext[];
%}

%union {char *s;}

%token VERSION ATTDEF ENDDEF EQ SLASH CLOSE END
%token <s> ENCODING NAME VALUE DATA COMMENT START
%type <s> name_opt

%%

document
 : prolog element misc_seq_opt
 ;
prolog
 : version_opt encoding_opt
   misc_seq_opt
 ;
version_opt
 : VERSION			{printf("<?XML-VERSION 1.0?>\n");}
 | /*empty*/
 ;
encoding_opt
 : ENCODING			{printf("<?XML-ENCODING %s?>\n",$1); free($1);}
 | /*empty*/
 ;
misc_seq_opt
 : misc_seq_opt misc
 | /*empty*/
 ;
misc
 : COMMENT			{printf("%s", $1);}
 | attribute_decl
 ;
attribute_decl
 : ATTDEF NAME			{printf("\n<?XML-ATT %s", $2);}
   attribute_seq_opt ENDDEF	{printf("?>\n");}
 ;	
element
 : START				{printf("\n<%s", $1); free($1);}
   attribute_seq_opt
   empty_or_content
 ;
empty_or_content
 : SLASH CLOSE			{printf("/>\n");}
 | CLOSE			{printf(">\n");}
   content END name_opt CLOSE	{printf("\n</%s>\n", $5);}
 ;
content
 : content DATA			{printf("%s", $2); free($2);}
 | content misc
 | content element
 | /*empty*/
 ;
name_opt
 : NAME				{$$ = $1;}
 | /*empty*/			{$$ = strdup("");}
 ;
attribute_seq_opt
 : attribute_seq_opt attribute
 | /*empty*/
 ;
attribute
 : NAME				{printf(" %s", $1); free($1);}
 | NAME EQ VALUE		{printf(" %s=%s", $1, $3); free($1); free($3);}
 ;

