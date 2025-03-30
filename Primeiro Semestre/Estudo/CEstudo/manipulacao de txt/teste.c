#include <stdio.h>
#include <stdlib.h>
int main(){
	
	FILE *file;
	char frase[100];
	file = fopen("teste.txt", "r");
	if(file==NULL){
		printf("\nArquivo nao encontrado.");
		return 0;
	}
	while(fgets(frase, 100, file) != NULL){
		printf("%s", frase);		
	}
	fclose(file);
	
}