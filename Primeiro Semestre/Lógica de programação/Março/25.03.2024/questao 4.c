#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
struct Carros{
	int year;
	char brand[50], model[50];
	float price;
};
int main(){
	setlocale(LC_ALL,"portuguese");
	struct Carros concessionaria[3];
	printf("\nBem vindo ao cadastro da concessionaria\n");
	for(int i=0; i<3;i++){
		fflush(stdin);
		printf("\nDigite a marca do carro que deseja cadastrar: ");
		gets(concessionaria[i].brand);
		printf("\nAgora digite o nome do modelo do carro: ");
		gets(concessionaria[i].model);
		printf("\nAgora digite o ano do carro: ");
		scanf("%d", &concessionaria[i].year);
		printf("\nAgora digite o preço do carro: ");
		scanf("%f", &concessionaria[i].price);
		system("cls");
	}
	for(int i =0; i<3; i++){
		printf("Marca do carro: %s\nModelo: %s\nAno: %d\nPreço: %.2f\n\n",concessionaria[i].brand,concessionaria[i].model,concessionaria[i].year,concessionaria[i].price);
	}
}