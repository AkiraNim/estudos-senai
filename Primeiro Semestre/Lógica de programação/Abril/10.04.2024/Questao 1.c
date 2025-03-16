#include <stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
#include <ctype.h> 
#include <conio.h>

#define MAX_CHAR 150
#define MAX_USER 10

typedef struct{
	int age, aux;
	char name[MAX_CHAR], email[MAX_CHAR], user[MAX_CHAR], password[MAX_CHAR], telephone[15];
}Register;

Register users[MAX_USER];

int main(){
	setlocale(LC_ALL,"");
	int quit=0, i=0, aux=0, counter=0;
		for(aux=0; aux<MAX_USER;aux++){
			users[aux].aux=0;
			users[i].password[aux-0]='\0';
			users[i].user[aux-0]='\0';
		}
		while(quit==0 && i<MAX_USER){
			system("cls");
			printf("\nOlá bem vindo ao cadastro de usuarios.\n\nDigite a idade do usuario: ");
			scanf("%d", &users[i].age);
			fflush(stdin);
			if(users[i].age>=18){
				printf("\nDigite o nome do usuario: ");
				gets(users[i].name);
				printf("\nDigite seu e-mail: ");
				scanf("%s", users[i].email);
				printf("\nDigite seu nome de usuário: ");
				while(1){
					scanf("%s", users[i].user);
					if(strlen(users[i].user)<8){
						printf("\nUsuario com poucos digitos. Digite novamente.\n");
					}
					else break;
				}
				printf("\nDigite seu numero de telefone: ");
				scanf("%s", users[i].telephone);
				fflush(stdin);
				printf("\nDigite uma senha forte: ");
				while(1){
					gets(users[i].password);
					if(strlen(users[i].password)<8){
						printf("\nSenha com poucos digitos. Digite novamente.\n");
					}
					else{
						fflush(stdin);
						printf("\nUsuario cadastrado com sucesso!\nDeseja sair?\n1-Sim\n0-Não\n");
						users[i].aux=1;
						scanf("%d", &quit);
						i++;
						break;
					}
				}	
			}
			else{
				printf("\nNão aceitamos o cadastro de menores de idade.\nDeseja sair?\n1-Sim\n0-Não\n");
				scanf("%d", &quit);
			}
		}
		system("cls");
		for(i=0; i<MAX_USER; i++) {
			if(users[i].aux!=1) break;
			printf("\nNome: %s\nIdade: %d\nE-Mail: %s\nTelefone: %s\nNome de usuario: %s\nSenha: %s\n\n", users[i].name, users[i].age, users[i].email, users[i].telephone, users[i].user, users[i].password);
		}
}