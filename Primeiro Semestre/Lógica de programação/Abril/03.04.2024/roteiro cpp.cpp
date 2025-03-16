#include<iostream>
#include<string>
#include <locale>
#include <string.h>
#include <time.h>

#define MAX_CHAR 50
#define MAX_PRODUCTS 25

typedef struct{
	int productId, productStock, productAux;
	char productName[MAX_CHAR];
	float productPrice;
}Stock;

Stock products[MAX_PRODUCTS];

void productRegistration(int i);
void productSearch();
void productList();

int main(){
	setlocale(LC_ALL,"");
	int option=1, i=0;
		while(option<4){
			system("cls");
			fflush(stdin);
			std::cout << "\nBem vindo ao menu da IqOption\n\nSelecione uma das opções abaixo\n1- Cadastrar produto.\n2- Buscar produto.\n3- Listar produtos cadastrados.\n4- Sair do sistema.\n";
			std::cin >> option;
			switch(option){
				case 1:
					if(i<MAX_PRODUCTS){
						std::cout << "\nVocê escolheu cadastrar um produto.\n\n";
						system("pause");
						system("cls");
						productRegistration(i);
						system("pause");
					i++;
					}
					else{
						std::cout << "\nNumero maximo de produtos cadastrados, utilize as outras opções";
					}
					break;
				case 2:
					std::cout << "\nVocê escolheu buscar um produto cadastrado.\n\n";
					system("pause");
					system("cls");
					productSearch();
					system("pause");
					break;
				case 3:
					std::cout << "\nVocê escolheu listar os produtos cadastrados.\n\n";
					system("pause");
					system("cls");
					productList();
					system("pause");
					break;
				case 4:
					std::cout << "\nVocê escolheu sair.\n\n";
					system("pause");
					break;
			}
		}	
}
void productRegistration(int i){
	fflush(stdin);
	std::cout << "\nDigite o nome do produto a ser cadastrado: ";
	gets(products[i].productName);
	std::cout << "\nDigite quantos produtos tem no estoque: ";
	std::cin >> products[i].productStock;
	std::cout << "\nDigite o preço do produto: ";
	std::cin >> products[i].productPrice;
	srand(time(NULL));
	products[i].productId = rand()%100000;
	std::cout << "\nO numero de Id do produto é: " << products[i].productId << ".\n\nProduto cadastrado com sucesso\n\n";
	products[i].productAux=1;
}
void productSearch(){
	int searchOption, searchProductId, i;
	char searchProductName[MAX_CHAR];
		fflush(stdin);
		std::cout << "\nSelecione uma das opções abaixo.\n1- Pesquisar produto pelo nome.\n2- Pesquisar produto pelo codigo.\n";
		std::cin >> searchOption;
		for(i=0; i<MAX_PRODUCTS; i++){
			if(searchOption==1){
				system("cls");
				fflush(stdin);
				std::cout << "\nDigite o nome do produto a ser buscado: ";
				gets(searchProductName);
				if(strcmp(searchProductName, products[i].productName)==0){
					std::cout << "\nProduto encontrado.\nNome: " << products[i].productName << "\nEstoque: " << products[i].productStock << "\nPreço: " << products[i].productPrice << "\nId: " << products[i].productId << "\n\n";
					break;
				}
				else{
					std::cout << "\nProduto não encontrado.\n\n";
					break;
				}
			}
			else if(searchOption==2){
				system("cls");
				fflush(stdin);
				std::cout << "\nDigite o Id do produto a ser buscado: ";
				std::cin >> searchProductId;
				if(searchProductId==products[i].productId){
					std::cout << "\nProduto encontrado.\nNome: " << products[i].productName << "\nEstoque: " << products[i].productStock << "\nPreço: " << products[i].productPrice << "\nId: " << products[i].productId << "\n\n";
					break;
				}
				else{
					std::cout << "\nProduto não encontrado.\n\n";
					break;
				}
			}
			else{
				std::cout << "\nOpção inválida.\n\n";
				break;
			}
		}
		fflush(stdin);
}
void productList(){
	int i;
		for(i=0; i<MAX_PRODUCTS; i++){
			if(products[i].productAux==1) std::cout << "\n\nNome: " << products[i].productName << "\nEstoque: " << products[i].productStock << "\nPreço: " << products[i].productPrice << "\nId: " << products[i].productId << "\n\n";
			
			if(products[i].productAux==0) break;
		}
		if(products[0].productAux==0 && products[1].productAux==0) std::cout << "\nNão foram cadastrados produtos ainda.\n\n";
}