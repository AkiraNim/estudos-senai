#include <stdio.h>
#include <stdlib.h>
int main(void){
	int valor = 27;
	int *ptr;
	
	ptr = &valor;
	
	printf("Utilizando pointers\n\n\n");
	printf("Conteudo da variavel 'valor' %d\n", valor);
	printf("Endereco da variavel 'valor' %x\n", &valor);
	printf("Conteudo da variavel 'ptr' %d\n", *ptr);
	printf("Endereço da variavel 'ptr' %x", &ptr);
}
