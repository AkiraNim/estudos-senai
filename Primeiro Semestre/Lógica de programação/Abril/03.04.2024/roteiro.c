#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX_CHAR 50
#define MAX_PRODUCTS 25

typedef struct{
	
}Stock;

Stock products[MAX_PRODUCTS];



int main(){
	setlocale(LC_ALL,"");
	int option=1;
	while(option<4){
		system("cls");
		fflush(stdin);
		printf("\nBem vindo ao menu da IqOption\n\nSelecione uma das opções abaixo\n1- Cadastrar produto.\n2- Buscar produto.\n3- Listar produtos cadastrados.\n4- Sair do sistema.\n");
		scanf("%d", &option);
		switch(option){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				printf("\nVocê escolheu sair.\n");
				system("pause");
		}
	}
}