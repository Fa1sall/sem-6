%{
    #include <stdio.h>
    #include <stdlib.h>
    int line = 1;
%}

%%

[6-9][0-9]{9} {
    if (line==1) printf("Valid Mobile Number");
    line++;
}

[a-zA-Z0-9]+\@[a-zA-Z]+\.com {
    if(line==2) printf("Valid Email");
    line++;
}

(0[1-9]|[12][0-9]|3[01])[-/](0[1-9]|1[0-2])[-/][0-9]{4} {
    if(line==3) printf("Valid Date");
    return 0;
}

. {
    printf("Invalid Input\n");
    return 0;
}

%%

int main() {
    printf("Enter Mobile Number (In First Line) & Email (In Second Line) % Date (In Third Line): \n");
    yylex();
    return 0;
}

int yywrap() {
    return 1;
}
