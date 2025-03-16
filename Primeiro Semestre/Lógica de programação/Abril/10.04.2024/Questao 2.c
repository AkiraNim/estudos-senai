#include <stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
#include <ctype.h> 
#include <conio.h>

#define MAX_CHAR 150
#define MAX_USER 2

typedef struct{
	int height, age;
	char name[MAX_CHAR];
}Pessoa;

Pessoa pessoas[MAX_USER];

int main(){
	int i=0;
	while(i<MAX_USER){
		system("cls");
		fflush(stdin);
		printf("\nDigite o nome do usuario: ");
		gets(pessoas[i].name);
		printf("\nDigite a altura do usuario: ");
		scanf("%d", &pessoas[i].height);
		printf("\nDigite a idade do usuario: ");
		scanf("%d", &pessoas[i].age);
		i++;
	}
	for(i=0;i<MAX_USER;i++) {
		printf("\nUsuario %d\nNome: %s\nAltura: %d\nIdade: %d\n", i,pessoas[i].name, pessoas[i].height, pessoas[i].age);	
	}
}