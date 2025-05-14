%{
    #include "10.tab.h"
    #include<stdio.h>
    #include<stdlib.h>
%}

%%

[0-9]+ {yylval=atoi(yytext);return NUM;}
[+\-*/()] {return yytext[0];}
[ \t]+ {}
\n {return '\n';}
. {return yytext[0];}

%%

int yywrap(){
    return 1;
}