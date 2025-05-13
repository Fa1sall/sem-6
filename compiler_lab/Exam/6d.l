%{
    #include<stdio.h>
    #include<stdlib.h>
%}

%%

[0-9]+ {int n = atoi(yytext); 
        if (n%2==0){
            printf("Even");
        }else{
            printf("Odd");
        }
        }

%%

int main(){
    printf("Enter numbers: ");
    yylex();
    return 0;
}

int yywrap(){
    return 1;
}