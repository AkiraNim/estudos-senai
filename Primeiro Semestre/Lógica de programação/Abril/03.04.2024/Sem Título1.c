#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>
#include <time.h>

#define MAX_CHAR 50
#define MAX_PRODUCT 30

typedef struct{
	int productId, productStock, productAux;
	char productName[MAX_CHAR];
	float productPrice;
}Stock;

Stock product[MAX_PRODUCT];
int counter = 0;

void productRegistration();
void productSearch();
void productList();

int main(){
	setlocale(LC_ALL,"");
	int i, option=0;
	while(option!=4){
		system("cls");
		fflush(stdin);
		printf("\nOlá bem vindo a plataforma de estoque\n\nPara começar digite a opção que deseja\n1- Cadastrar produto\n2- Buscar pelo nome ou codigo do produto\n3- Listar todos os produtos cadastrados\n4- Sair\n");
		scanf("%d", &option);
		switch(option){
			case 1: 
				if(counter<30) productRegistration();
				else printf("\nNumero de cadastros excedeu o limte.\n");
				system("pause");
				break;
			case 2:
				productSearch();
				break;
			case 3:
				productList();
				break;
			case 4:
				printf("\nVocê escolheu sair.\n");
				break;
			default:
				printf("\nOpção invalida.\n\n");
				system("pause");
				break;
		}
	}
}
void productRegistration(){
	int sortNumber;
		fflush(stdin);
		system("cls");
		printf("\nVocê escolheu cadastrar um produto.\n\n\nDigite o nome do produto: ");
		gets(product[counter].productName);
		fflush(stdin);
		srand(time(NULL));
		sortNumber = rand()%10000;
		product[counter].productId = sortNumber;
		printf("\nO codigo do produto é: %d", product[counter].productId);
		printf("\nQuantos produtos tem no estoque? ");
		scanf("%d", &product[counter].productStock);
		printf("\nQual o preço do produto? ");
		scanf("%f", &product[counter].productPrice);
		printf("\n\nProduto '%s' cadastrado", product[counter].productName);
		product[counter].productAux=1;
		counter++;
}
void productSearch(){
	int i, switchAux, productIdAux;
	char productNameAux[MAX_CHAR];
		fflush(stdin);
		system("cls");
		while(1){
			printf("\nVocê escolheu pesquisar por um produto.\n\n\nComo deseja buscar pelo produto?\n1- Digitar nome.\n2- Digitar codigo\n");
			scanf("%d", &switchAux);
			if(switchAux==1){
				printf("\nDigite o nome do produto: ");
				fflush(stdin);
				gets(productNameAux);
				for(i = 0; i < MAX_PRODUCT; i++){
					if(strcmp(productNameAux, product[i].productName)==0){
						printf("\nProduto encontrado\nNome: %s\nCodigo: %d\nPreço: %.2f\nEstoque: %d\n\n", product[i].productName, product[i].productId, product[i].productPrice, product[i].productStock);
						system("pause");
						break;
					}
					else{
						printf("\nProduto não encontrado\n");
						system("pause");
						break;
					}
				}
			}
			if(switchAux==2){
				printf("\nDigite o codigo do produto: ");
				scanf("%d", &productIdAux);
				for(i=0; i< MAX_PRODUCT; i++){
					if(productIdAux==product[i].productId){
						printf("\nProduto encontrado\nNome: %s\nCodigo: %d\nPreço: %.2f\nEstoque: %d\n\n", product[i].productName, product[i].productId, product[i].productPrice, product[i].productStock);
						system("pause");
						break;
					}
					else{
						printf("\nProduto não encontrado\n");
						system("pause");
						break;
					}
				}
			}
			break;
		}
		
}
void productList(){
	int i;
		system("cls");
		printf("\nVocê escolheu listar todos os produtos.\n\n");
		for(i=0; i<MAX_PRODUCT;i++){
			if(product[i].productAux==1) printf("\nNome: %s\nCodigo: %d\nPreço: %.2f\nEstoque: %d\n\n", product[i].productName, product[i].productId, product[i].productPrice, product[i].productStock);
		}
		if (product[0].productAux==0 && product[2].productAux==0) printf("\nNão foram cadastrados produtos ainda.\n\n");
		system("pause");
}