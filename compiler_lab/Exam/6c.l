%{
    #include<stdio.h>
    int vowel_count=0;
    int consonant_count=0;
    int total_count=0;
%}

%%

[aAeEiIoOuU] {vowel_count++;total_count++;}
[a-zA-Z] {total_count++;}
. {}

%%

int main(){
    printf("Enter sentence: ");
    yylex();
    printf("Vowels count: %d\n",vowel_count);
    consonant_count = total_count - vowel_count;
    printf("Consonant count: %d\n",consonant_count);
    return 0;
}

int yywrap(){
    return 1;
}