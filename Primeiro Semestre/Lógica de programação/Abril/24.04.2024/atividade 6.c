#include<stdio.h>
#include<stdlib.h>

int ler(){
	int a;
		printf("Digite um valor: ");
		scanf("%d", &a);
		printf("Valor: %d", a);
		return a;
}

int main(){
	int *a;
	
		a=(int*) malloc(sizeof(int));
		*a=ler();
		
		return 0;
}
