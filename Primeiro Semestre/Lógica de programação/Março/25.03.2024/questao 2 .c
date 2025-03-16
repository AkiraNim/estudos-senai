#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
struct Funcionario{
	int age;
	char name[50], office[50];
	float wage;
};
int main(){
	setlocale(LC_ALL,"portuguese");
	float averageWage;
	struct Funcionario funcionarios[11];
		for(int i = 1; i <11; i++){
			printf("\nDigite o nome do funcionario %d: ", i);
			gets(funcionarios[i].name);
			printf("\nAgora digite o cargo do funcionario %d: ",i);
			gets(funcionarios[i].office);
			printf("\nAgora digite a idade do funcionario %d: ",i);
			scanf("%d", &funcionarios[i].age);
			printf("\nAgora digite o salário do funcionario %d: R$", i);
			scanf("%f", &funcionarios[i].wage);
			averageWage=averageWage+funcionarios[i].wage;
			fflush(stdin);
			system("cls");
		}
		fflush(stdin);
		averageWage=averageWage/10;
		for(int i = 1; i<11; i++){
		printf("\n\nFuncionario %d\nNome: %s\nCargo: %s\nIdade: %d\nSalario: R$%.2f\n\n",i, funcionarios[i].name, funcionarios[i].office, funcionarios[i].age, funcionarios[i].wage);
		}
		printf("\nA media salarial dos funcionarios é de: R$%.2f", averageWage);
}