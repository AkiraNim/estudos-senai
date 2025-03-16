#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>

struct Pessoa{
	int age;
	char name[50], sex[20];
	float height;
};
int main(){
	setlocale(LC_ALL,"portuguese");
	struct Pessoa pessoas[5];
		for(int i=0; i<5; i++){
			fflush(stdin);
			printf("Digite o nome da pessoa: ");
			gets(pessoas[i].name);
			printf("\nDigite a idade de %s: ",pessoas[i].name);
			scanf("%d", &pessoas[i].age);
			fflush(stdin);
			printf("\nAgora digite o sexo de %s: ", pessoas[i].name);
			gets(pessoas[i].sex);
			printf("\nAgora digite a altura de %s: ", pessoas[i].name);
			scanf("%f", &pessoas[i].height);
			system("cls");
		}
		for(int i=0; i<5; i++){
			printf("%s\nIdade: %d\nSexo: %s\nAltura: %f\n\n", pessoas[i].name, pessoas[i].age, pessoas[i].sex, pessoas[i].height);
		}
}