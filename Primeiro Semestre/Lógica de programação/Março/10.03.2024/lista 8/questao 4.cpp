/*questao 4*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
int main(){
	float grade_1, grade_2, arithmetic_average;
	printf("Digite a primeira nota do aluno: ");
	scanf(" %f", &grade_1);
	printf("Agora digite a segunda nota do aluno: ");
	scanf(" f%", &grade_2);
	arithmetic_average = grade_1 + grade_2 / 2;
	if(arithmetic_average>=5){
		printf("\nAluno aprovado, parabens!!");
	}
	else{
		printf("\nAluno reprovado!!");
	}
}