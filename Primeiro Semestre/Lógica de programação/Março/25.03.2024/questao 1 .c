#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
struct Aluno{
		char name[50];
		int idade, matricula;
		float nota;
	};
int main(){
	setlocale(LC_ALL,"");
	struct Aluno aluno[11];
	for(int i =1; i <11; i++){
		fflush(stdin);
		printf("\nInforme o nome do aluno %d: ",i);
		gets(aluno[i].name);
		printf("\nAgora infome a idade: ");
		scanf("%d", &aluno[i].idade);
		printf("\nAgora digite a matricula: ");
		scanf("%d", &aluno[i].matricula);
		printf("\nAgora digite a nota: ");
		scanf("%f", &aluno[i].nota);
		system("Cls");
	}
	for(int i = 1; i<11; i++){
		printf("\nALUNO %d\nNome: %s\nIdade: %d\nMatricula: %d\nNota: %.2f\n",i, aluno[i].name, aluno[i].idade, aluno[i].matricula, aluno[i].nota);
	}
		
}
