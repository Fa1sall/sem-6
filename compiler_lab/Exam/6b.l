%{
    #include<stdio.h>
    int char_count=0;
    int word_count=0;
    int line_count=0;
%}

%%

[a-zA-z]+ {word_count++; char_count+=yyleng;}
[ \t]+ {char_count++;}
\n {line_count++; char_count++;}
. {char_count++;}

%%

int main(){
    printf("Enter sentence: \n");
    yylex();
    printf("Char count: %d\n",char_count);
    printf("Word count: %d\n",word_count);
    printf("Line count: %d\n",line_count);
    return 0;
}

int yywrap(){
    return 1;
}