#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct FichaDeAluno{
		char nome[50];
		int idade, matricula;
		float nota;
	};
int main(){
	struct FichaDeAluno aluno[11];
	for(int i =1; i <11; i++){
		fflush(stdin);
		printf("\nInforme o nome do aluno %d: ",i);
		gets(aluno[i].nome);
		printf("\nAgora infome a idade: ");
		scanf("%d", &aluno[i].idade);
		printf("\nAgora digite a matricula: ");
		scanf("%d", &aluno[i].matricula);
		printf("\nAgora digite a nota: ");
		scanf("%f", &aluno[i].nota);
		system("Cls");
	}
	for(int i = 1; i<11; i++){
		printf("\nALUNO %d\nNome: %s\nIdade: %d\nMatricula: %d\nNota: %.2f\n",i, aluno[i].nome, aluno[i].idade, aluno[i].matricula, aluno[i].nota);
	}
		
}
