%{
    #include<stdio.h>
    int positives=0;
    int negatives=0;
%}

%%

[+]?[0-9]+ {positives++;}
[-][0-9]+ {negatives++;}

%%

int main(){
    printf("Enter numbers: \n");
    yylex();
    printf("Positives count: %d\n",positives);
    printf("Negatives count: %d\n",negatives);
    return 0;
}

int yywrap(){
    return 1;
}