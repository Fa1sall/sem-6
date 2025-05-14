%{
	#include<stdio.h>
	#include<stdlib.h>
	void yyerror(char *s);
	int yylex();
%}

%token Zero One;

%%

seq: S {printf("Accepted\n");};
S: S A | A;
A: Zero Zero | One One;

%%

int main(){
	printf("Enter input: \n");
	yyparse();
	printf("Parsing Finished...");
	return 0;
}

void yyerror(char *s){
	fprintf(stderr,"Error: %s\n",s);
}