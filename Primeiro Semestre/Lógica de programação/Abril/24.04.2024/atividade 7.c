#include<stdio.h>
#include<stdlib.h>

int calcular(int a){
	int b;
		printf("Digite um valor: ");
		scanf("%d", &b);
		a=a*b;
		printf("Valor: %d", a);
		return a;
}

int main(){
	int *a;
	
		a=(int*) malloc(sizeof(int));
		*a=2;
		*a=calcular(*a);
		
		return 0;
}
