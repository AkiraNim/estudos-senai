#include<iostream>
#include<string>
#include <locale>
#include <string.h>
#include <stdio.h>
#define MAX 30
typedef struct{
	int age, aux;
	char name[250], office[50];
	float wage;
}Funcionario;

Funcionario employee[MAX];
int counter=0;

void employeeRegister();
void employeeSearch();
void employeeList();
void switchCase(int option);
int main(){
	setlocale(LC_CTYPE, "");
	int option;
	for(int i=0; i<MAX; i++){
		employee[i].aux=1;
	}
	while(option !=4){
		std::cout << "Escolha uma das opções abaixo:\n\n1-Cadastrar Funcionario\n2-Buscar Funcionario pelo nome\n3-Listar Funcionarios\n4-Sair\n\n";
		std::cin >> option;
		system("cls");
		switchCase(option);
	}
}
void employeeRegister(){
	std::cout << "Você escolheu cadastrar um Funcionario.\n\n";
				system("pause");
				system("cls");
				if(counter!=MAX){
					fflush(stdin);
					std::cout << "\nDigite o nome do Funcionario: ";
					gets(employee[counter].name);
					fflush(stdin);
					strlwr(employee[counter].name);
					std::cout << "\nDigite a idade de " << employee[counter].name << ": ";
					std::cin >> employee[counter].age;
					std::cout << "\nDigite o cargo de " << employee[counter].name << ": ";
					std::cin >> employee[counter].office;
					std::cout << "\nDigite o salario de " << employee[counter].name << ": R$";
					std::cin >> employee[counter].wage;
					employee[counter].aux=0;
					counter++;
				}
				else{
					std::cout << "\nNumero maximo de Funcionarios alcançado.\n";
					system("pause");
				}
				system("cls");
}
void employeeSearch(){
	int aux=-1;
	char name[250];
		system("cls");
		std::cout << "Você escolheu procurar por um Funcionario em específico.\n\n";
		std::cout << "\nDigite o nome do Funcionario: ";
		std::cin >> name;
		for(int i=0; i<MAX; i++){
			if(strcmp(name, employee[i].name)==0){
				std::cout << "\nFuncionario "<< employee[i].name <<" encontrado.\n";
				std::cout << "Idade: " << employee[i].age << "\n";
				std::cout<< "Cargo: " << employee[i].office << "\n";
				std::cout<< "Salario: " << employee[i].wage << "\n";
				aux=1;
				system("pause");
			}
		}
			if(aux==-1){
				std::cout << "\nFuncionario " << name << " não encontrado, tente novamente.\n\n";
				system("pause");
			}
		system("cls");
}
void employeeList(){
	std::cout << "Você escolheu listar todos os Funcionarios cadastrados.\n\n";
	system("pause");
	system("cls");
	for(int i=0; i<MAX; i++){
		if(employee[i].aux==0){
			std::cout << "\nFuncionario: " << employee[i].name << "\n";
			std::cout << "Idade: " << employee[i].age << "\n";
			std::cout<< "Cargo: " << employee[i].office << "\n";
			std::cout<< "Salario: " << employee[i].wage << "\n\n";
		}
	}				
	if(employee[0].aux==1 && employee[1].aux==1){
		std::cout << "\nNão foram cadastrados Funcionarios ainda.\n\n";
	}
	system("pause");
	system("cls");
}
void switchCase(int option){
	switch(option){
			case 1:
				employeeRegister();
				break;
			case 2:
				employeeSearch();
				break;
			case 3:
				employeeList();
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