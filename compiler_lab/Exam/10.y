%{
    #include<stdio.h>
    #include<stdlib.h>
    int yylex();
    void yyerror(char *s);
%}

%token NUM
%left '+' '-'
%left '*' '/'
%right UMINUS

%%

input : | input line;

line : '\n' | expr '\n' {printf("Result: %d\n",$1);};

expr : NUM {$$ = $1;}
| expr '+' expr {$$ = $1 + $3;}
| expr '-' expr {$$ = $1 - $3;}
| expr '*' expr {$$ = $1 * $3;}
| expr '/' expr {$$ = $3!=0 ? $1/$3 : 0;}
| '-' expr %prec UMINUS {$$=-$2;}
| '(' expr ')' {$$=$2;}
;

%%

void yyerror(char *s){
    fprintf(stderr,"Error: %s\n",s);
}

int main(){
    printf("Enter an expression: \n");
    return yyparse();
}