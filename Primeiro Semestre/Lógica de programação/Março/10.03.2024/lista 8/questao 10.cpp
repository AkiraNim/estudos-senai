/*questao 10*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"portuguese");
	float wage, financing;
	printf("Digite seu salario: ");
	scanf(" %f", &wage);
	printf("\nAgora digite o valor do financiamento requerido: ");
	scanf(" %f", &financing);
	if(financing<=wage*5){
		printf("\nFinanciamento concedido.");
	}
	else{
		printf("\nFinanciamento negado.");
	}
}