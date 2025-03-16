#include <stdio.h>
#include <stdlib.h>
int main(){
	
	FILE *file;
	char frase[100];
	file = fopen("teste3.txt", "a");
	
	if(file==NULL){
		printf("\nArquivo nao encontrado.");
		return 0;
	}
	
	fprintf(file, "primeira linhas\n");
	fputs("Segunda linha\n", file);
	
	fclose(file);
}