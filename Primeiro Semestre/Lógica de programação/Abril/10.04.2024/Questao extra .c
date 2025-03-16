#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define MAX_CHAR 50
#define MAX_REGISTER 10

typedef struct{
	int cpf, telephone, cellPhone, registration, day, month, year, aux;
	char name[MAX_CHAR], email[MAX_CHAR], state[MAX_CHAR], city[MAX_CHAR], district[MAX_CHAR], street[MAX_CHAR], course[MAX_CHAR];
}Student;

typedef struct{
	int cpf, telephone, cellPhone, registration, day, month, year, aux;
	char name[MAX_CHAR], email[MAX_CHAR], state[MAX_CHAR], city[MAX_CHAR], district[MAX_CHAR], street[MAX_CHAR], specialization[MAX_CHAR];
}Teacher;

Student students[MAX_REGISTER];
Teacher teachers[MAX_REGISTER];

int studentNumber=0, teacherNumber=0;

int registration(int option){
	printf("\nDigite a opção que mais lhe agrada.\n1- Cadastrar ALUNOS\n2-Cadastrar PROFESSORES\n3-Listar ALUNOS\n4-Listar PROFESSORES\n0-SAIR\n");
	scanf("%d", &option);
	switch(option){
		case 1:
			fflush(stdin);
			system("cls");
			printf("\nVocê escolheu cadastrar um ALUNO\n");
			system("pause");
			system("cls");
			printf("\nDigite o nome do aluno: ");
			gets(students[studentNumber].name);
			printf("\nDigite sua data de nascimento: ");
			scanf("%d %d %d", &students[studentNumber].day, &students[studentNumber].month, &students[studentNumber].year);
			printf("\nDigite seu CPF: ");
			scanf("%d", &students[studentNumber].cpf);
			printf("\nTelefone fixo: ");
			scanf("%d", &students[studentNumber].telephone);
			printf("\nCelular: ");
			scanf("%d", &students[studentNumber].cellPhone);
			printf("\nDigite sua matrícula: ");
			scanf("%d", &students[studentNumber].registration);
			fflush(stdin);
			printf("\nDigite seu curso: ");
			gets(students[studentNumber].course);
			printf("\nDigite o estado onde vive: ");
			gets(students[studentNumber].state);
			printf("\nDigite seu logradouro: ");
			gets(students[studentNumber].street);
			printf("\nDigite seu bairro: ");
			gets(students[studentNumber].district);
			printf("\nAluno cadastrado com sucesso.\n\n");
			students[studentNumber].aux=1;
			studentNumber++;
			system("pause");
			break;
		case 2:
			fflush(stdin);
			system("cls");
			printf("\nVocê escolheu cadastrar um PROFESSOR\n");
			system("pause");
			system("cls");
			printf("\nDigite o nome do professor: ");
			gets(teachers[teacherNumber].name);
			printf("\nDigite sua data de nascimento: ");
			scanf("%d %d %d", &teachers[teacherNumber].day, &teachers[teacherNumber].month, &teachers[teacherNumber].year);
			printf("\nDigite seu CPF: ");
			scanf("%d", &teachers[teacherNumber].cpf);
			printf("\nTelefone fixo: ");
			scanf("%d", &teachers[teacherNumber].telephone);
			printf("\nCelular: ");
			scanf("%d", &teachers[teacherNumber].cellPhone);
			printf("\nDigite seu registro: ");
			scanf("%d", &teachers[teacherNumber].registration);
			printf("\nDigite sua area de especializacao: ");
			gets(teachers[teacherNumber].specialization);
			printf("\nDigite o estado onde vive: ");
			gets(teachers[teacherNumber].state);
			printf("\nDigite seu logradouro: ");
			gets(teachers[teacherNumber].street);
			printf("\nDigite seu bairro: ");
			gets(teachers[teacherNumber].district);
			printf("\nAluno cadastrado com sucesso.\n\n");
			teachers[teacherNumber].aux=1;
			teacherNumber++;
			system("pause");
			break;
		case 3:
			printf("\nVocê escolheu listar os alunos cadastrados\n");
			system("pause");
			system("cls");
			for(int i=0; i<MAX_REGISTER; i++){
				if(students[i].aux==1) printf("\nAluno: %s\nData de nascimento: %d/%d/%d\nCpf: %d\nMatricula: %d\nCurso: %s", students[i].name, students[i].day, students[i].month, students[i].year, students[i].cpf, students[i].registration, students[i].course);
				else if(students[1].aux!=1 && students[2].aux!=1) {
					printf("\nNão foram cadastrados alunos ainda.\n");
					system("pause");
					break;
				}
				else break;
			}
			break;
		case 4:
			printf("\nVocê escolheu listar os alunos cadastrados\n");
			system("pause");
			system("cls");
			for(int i=0; i<MAX_REGISTER; i++){
				if(teachers[i].aux==1) printf("\nProfessor: %s\nData de nascimento: %d/%d/%d\nCpf: %d\nRegistro: %d\nEspecializacao: %s", teachers[i].name, teachers[i].day, teachers[i].month, teachers[i].year, teachers[i].cpf, teachers[i].registration, teachers[i].specialization);
				else if(teachers[1].aux!=1 && teachers[2].aux!=1) {
					printf("\nNão foram cadastrados professores ainda.\n");
					system("pause");
					break;
				}
				else break;
			}
			break;
		case 0:
			printf("\nVocê escolheu sair\n\n");
			system("pause");
			break;
		default:
			printf("\nCaracter invalido.\n");
			break;
	}
	return option;
}

int main(){
	setlocale(LC_ALL,"");
	int option;
		while(1){
			system("cls");
			option=registration(option);
			if(option==0) break;
		}
}