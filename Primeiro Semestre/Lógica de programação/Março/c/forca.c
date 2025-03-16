#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
void forca(int estado){
	if(estado==0){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
	else if(estado==1){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|          0");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
	else if(estado==2){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|          0");
		printf("\n|          |");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
	else if(estado==3){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|          0");
		printf("\n|         /|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
	else if(estado==4){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|          0");
		printf("\n|         /|\\");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
	else if(estado==5){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|          0");
		printf("\n|         /|\\");
		printf("\n|         /");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
	else if(estado==6){
		printf("\n------------");
		printf("\n|          |");
		printf("\n|          0");
		printf("\n|         /|\\");
		printf("\n|         / \\");
		printf("\n|");
		printf("\n|PERDEU O JOGO!");
		printf("\n|");
	}
}
int main(){
	int errors=0;
	char secretWord[100];
	printf("Jogador 1:\n");
	printf("DIGITE A PALAVRA SECRETA:\n");
	fgets(secretWord, 100, stdin);
	printf("A PALAVRA SECRETA E: %s\n",secretWord);
	printf("A PALAVRA TEM %lu CARACTERES\n",strlen(secretWord)-1);
	system("cls");
	printf("### BEM VINDO A FORCA ###\n");
	printf("Digite uma letra:\n");
	char forScreen[100];
	secretWord[strlen(secretWord)-1]='\0';
	strcpy(forScreen, secretWord);
	int i;
	for(i=0;i<strlen(forScreen);i++){
		forScreen[i]='_';
	}
	
	while(1){
		forca(errors);
		printf("Advinhe a palavra: ");
		for(i=0;i<strlen(forScreen);i++){
			printf("%c ",forScreen[i]);
		}
		printf("\nLetra: ");
		char letra;
		scanf(" %c",&letra);
		int madeMistake=1;
		for(i=0;i<strlen(forScreen);i++){
		 if(letra==secretWord[i]){
		 	forScreen[i]=letra;
		 	madeMistake=0;
		 }
		}
		if(madeMistake==1){
			errors++;
		}
		if(strcmp(forScreen,secretWord)==0){
			printf("\n\nACERTOU: ");
			for(i=0;i<strlen(forScreen);i++){
				printf("%c ",forScreen[i]);
		}
			printf("\nVOCE GANHOU!\n");
			system("pause");
			break;
		}
		else if(errors==6){
			forca(errors);
			break;
		}
	}
	system("pause");
}
