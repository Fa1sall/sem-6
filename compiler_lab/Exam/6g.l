%{
    #include<stdio.h>
%}

%%

^[aA].* {printf("Starts with A \n");}
.* {printf("Does not start with A \n");}

%%

int main(){
    printf("Enter String starting with A: \n");
    yylex();
    return 0;
}

int yywrap(){
    return 1;
}
