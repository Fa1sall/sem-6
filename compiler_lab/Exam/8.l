%{
	#include "8.tab.h"
%}

%%

0 {return Zero;}
1 {return One;}
[ \t] {return 0;}
\n {return 0;}
. {return yytext[0];}

%%

int yywrap(){
	return 1;
}
