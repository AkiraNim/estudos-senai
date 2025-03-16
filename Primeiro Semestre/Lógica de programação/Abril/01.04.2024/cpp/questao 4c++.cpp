#include<iostream>
#include<string>
#include <locale>
#include <string.h>
#include <stdio.h>
#define MAX 30
typedef struct{
	int year, aux;
	char brand[250], model[50];
	float price;
}Carro;

Carro car[MAX];
int counter=0;

void carRegister();
void carSearch();
void carList();
void switchCase(int option);
int main(){
	setlocale(LC_CTYPE, "");
	int option;
	for(int i=0; i<MAX; i++){
		car[i].aux=1;
	}
	while(option !=4){
		std::cout << "Escolha uma das opções abaixo:\n\n1-Cadastrar Carro\n2-Buscar Carro pelo nome\n3-Listar Carros\n4-Sair\n\n";
		std::cin >> option;
		system("cls");
		switchCase(option);
	}
}
void carRegister(){
	std::cout << "Você escolheu cadastrar um Carro.\n\n";
				system("pause");
				system("cls");
				if(counter!=MAX){
					fflush(stdin);
					std::cout << "\nDigite a marca do Carro: ";
					gets(car[counter].brand);
					fflush(stdin);
					strlwr(car[counter].brand);
					std::cout << "\nDigite o ano do carro " << car[counter].brand << ": ";
					std::cin >> car[counter].year;
					std::cout << "\nDigite o nome do modelo do carro " << car[counter].brand << ": ";
					std::cin >> car[counter].model;
					std::cout << "\nDigite o preço do carro " << car[counter].brand << ": R$";
					std::cin >> car[counter].price;
					car[counter].aux=0;
					counter++;
				}
				else{
					std::cout << "\nNumero maximo de Carros alcançado.\n";
					system("pause");
				}
				system("cls");
}
void carSearch(){
	int aux=-1;
	char brand[250];
	std::cout << "Você escolheu procurar por um Carro em específico.\n\n";
				system("pause");
				system("cls");
				std::cout << "\nDigite o nome do Carro: ";
				std::cin >> brand;
				for(int i=0; i<MAX; i++){
					if(strcmp(brand, car[i].brand)==0){
					std::cout << "\nCarro da marca "<< car[i].brand <<" encontrado.\n";
					std::cout << "Ano do carro: " << car[i].year << "\n";
					std::cout<< "Modelo: " << car[i].model << "\n";
					std::cout<< "Preço: " << car[i].price << "\n";
					aux=1;
					system("pause");
					}
				}
				if(aux==-1){
					std::cout << "\nCarro " << brand << " não encontrado, tente novamente.\n\n";
					system("pause");
				}
				system("cls");
}
void carList(){
	std::cout << "Você escolheu listar todos os Carros cadastrados.\n\n";
				system("pause");
				system("cls");
				for(int i=0; i<MAX; i++){
					if(car[i].aux==0){
						std::cout << "\nMarca: " << car[i].brand << "\n";
						std::cout << "Ano do carro: " << car[i].year << "\n";
						std::cout<< "Modelo: " << car[i].model << "\n";
						std::cout<< "Preço: " << car[i].price << "\n\n";
					}
				}				
				if(car[0].aux==1 && car[1].aux==1){
					std::cout << "\nNão foram cadastrados Carros ainda.\n\n";
				}
				system("pause");
				system("cls");
}
void switchCase(int option){
	switch(option){
			case 1:
				carRegister();
				break;
			case 2:
				carSearch();
				break;
			case 3:
				carList();
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