#include<iostream>
#include<string>
#include <locale>
#include <string.h>
#include <stdio.h>
#define MAX 30
typedef struct{
	int yearOfPublication, aux;
	char name[250], author[50];
	float price;
}Livro;

Livro book[MAX];
int counter=0;

void bookRegister();
void bookSearch();
void bookList();
void switchCase(int option);
int main(){
	setlocale(LC_CTYPE, "");
	int option;
	for(int i=0; i<MAX; i++){
		book[i].aux=1;
	}
	while(option !=4){
		std::cout << "Escolha uma das opções abaixo:\n\n1-Cadastrar Livro\n2-Buscar Livro pelo nome\n3-Listar Livros\n4-Sair\n\n";
		std::cin >> option;
		system("cls");
		switchCase(option);
	}
}
void bookRegister(){
	std::cout << "Você escolheu cadastrar um Livro.\n\n";
				system("pause");
				system("cls");
				if(counter!=MAX){
					fflush(stdin);
					std::cout << "\nDigite o nome do Livro: ";
					gets(book[counter].name);
					fflush(stdin);
					strlwr(book[counter].name);
					std::cout << "\nDigite o ano de Publicação do livro " << book[counter].name << ": ";
					std::cin >> book[counter].yearOfPublication;
					std::cout << "\nDigite o nome do Autor do livro " << book[counter].name << ": ";
					std::cin >> book[counter].author;
					std::cout << "\nDigite o preço do livro " << book[counter].name << ": R$";
					std::cin >> book[counter].price;
					book[counter].aux=0;
					counter++;
				}
				else{
					std::cout << "\nNumero maximo de Livros alcançado.\n";
					system("pause");
				}
				system("cls");
}
void bookSearch(){
	int aux=-1;
	char name[250];
	std::cout << "Você escolheu procurar por um Livro em específico.\n\n";
				system("pause");
				system("cls");
				std::cout << "\nDigite o nome do Livro: ";
				std::cin >> name;
				for(int i=0; i<MAX; i++){
					if(strcmp(name, book[i].name)==0){
					std::cout << "\nLivro "<< book[i].name <<" encontrado.\n";
					std::cout << "Ano de publicação: " << book[i].yearOfPublication << "\n";
					std::cout<< "Autor: " << book[i].author << "\n";
					std::cout<< "Preço: " << book[i].price << "\n";
					aux=1;
					system("pause");
					}
				}
				if(aux==-1){
					std::cout << "\nLivro " << name << " não encontrado, tente novamente.\n\n";
					system("pause");
				}
				system("cls");
}
void bookList(){
	std::cout << "Você escolheu listar todos os Livros cadastrados.\n\n";
				system("pause");
				system("cls");
				for(int i=0; i<MAX; i++){
					if(book[i].aux==0){
						std::cout << "\nLivro: " << book[i].name << "\n";
						std::cout << "Ano de publicação: " << book[i].yearOfPublication << "\n";
						std::cout<< "Autor: " << book[i].author << "\n";
						std::cout<< "Preço: " << book[i].price << "\n\n";
					}
				}				
				if(book[0].aux==1 && book[1].aux==1){
					std::cout << "\nNão foram cadastrados Livros ainda.\n\n";
				}
				system("pause");
				system("cls");
}
void switchCase(int option){
	switch(option){
			case 1:
				bookRegister();
				break;
			case 2:
				bookSearch();
				break;
			case 3:
				bookList();
				break;
			case 4:
				std::cout << "\nVocê escolheu sair\n\n";
				break;
			default: {
				std::cout << "\nComando invalido.";
				break;
			}
		}
}