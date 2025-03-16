#include<iostream>
#include<string>
#include <locale>
#include <string.h>

#define MAX 30
typedef struct{
	int age, registration, aux;
	char name[250];
	float grade1, grade2, grade3, averageGrade;
}Aluno;
Aluno student[MAX];
int counter=0;

void switchCase(int option);
void studentRegistration();
void studentSearch();
void studentList();
int main(){
	setlocale(LC_CTYPE, "");
	int option;
	for(int i=0; i<MAX; i++){
		student[i].aux=1;
	}
	while(option !=4){
		std::cout << "Escolha uma das opções abaixo:\n\n1-Cadastrar Aluno\n2-Buscar Aluno pelo nome\n3-Listar Alunos\n4-Sair\n";
		std::cin >> option;
		switchCase(option);
	}
}
void switchCase(int option){
	switch(option){
			case 1:
				studentRegistration();
				break;
			case 2:
				studentSearch();
				break;
			case 3:
				studentList();
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
void studentRegistration(){
	system("cls");
	std::cout << "Você escolheu cadastrar um aluno.\n\n";
				if(counter!=MAX){
					fflush(stdin);
					std::cout << "\nDigite o nome do Aluno:\n";
					gets(student[counter].name);
					strlwr(student[counter].name);
					std::cout << "\nDigite a idade de " << student[counter].name << ": \n";
					std::cin >> student[counter].age;
					std::cout << "\nDigite a matricula de " << student[counter].name << ": \n";
					std::cin >> student[counter].registration;
					std::cout << "\nDigite a nota 1 de " << student[counter].name << ": \n";
					std::cin >> student[counter].grade1;
					std::cout << "\nDigite a nota 2: ";
					std::cin >> student[counter].grade2;
					std::cout << "\nDigite a nota 3: ";
					std::cin >> student[counter].grade3;
					student[counter].averageGrade=(student[counter].grade1+student[counter].grade2+student[counter].grade3)/3;
					std::cout << "\nA media das notas de" << student[counter].name << " é: \n";
					student[counter].aux=0;
					counter++;
				}
				else{
					std::cout << "\nNumero maximo de Alunos alcançado.\n";
					system("pause");
				}
				system("cls");
}
void studentSearch(){
	int aux=-1;
	char name[250];
	system("cls");
	std::cout << "Você escolheu procurar por um aluno em específico.\n\n";
				std::cout << "\nDigite o nome do Aluno: ";
				std::cin >> name;
				for(int i=0; i<MAX; i++){
					if(strcmp(name, student[i].name)==0){
					std::cout << "\nAluno "<< student[i].name <<" encontrado.\n";
					std::cout << "Idade: " << student[i].age << "\n";
					std::cout<< "Matricula: " << student[i].registration << "\n";
					std::cout<< "Nota final: " << student[i].averageGrade << "\n";
					aux=1;
					system("pause");
					}
				}
				if(aux==-1){
					std::cout << "\nAluno " << name << " não encontrado, tente novamente.\n\n";
					system("pause");
				}
				system("cls");
}
void studentList(){
	system("cls");
	std::cout << "Você escolheu listar todos os alunos cadastrados.\n\n";
				for(int i=0; i<MAX; i++){
					if(student[i].aux==0){
						std::cout << "\nAluno: " << student[i].name << "\n\n";
						std::cout << "Idade: " << student[i].age << "\n";
						std::cout<< "Matricula: " << student[i].registration << "\n";
						std::cout<< "Nota final: " << student[i].averageGrade << "\n\n";
					}
				}				
				if(student[0].aux==1 && student[2].aux==1){
					std::cout << "\nNão foram cadastrados alunos ainda.\n\n";
				}
				system("pause");
				system("cls");
}