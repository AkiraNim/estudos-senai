#include <stdio.h>
#include <stdlib.h>

int main(){
	int *numero;
	int *j;
	
		numero= (int*) malloc(sizeof(int));
		
		*numero = 7;
		printf("%x", numero);
		printf("\n%d", *numero);
		free(numero);
		printf("\n%d", *numero);
		
		j=(int*) calloc(1,sizeof(int));
		
		printf("\n%x", j);
		printf("\n%d", *j);
}
