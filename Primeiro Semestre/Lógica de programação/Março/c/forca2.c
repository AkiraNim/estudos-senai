#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
void forca(int estado){
			if(estado==0){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
			else if(estado==1){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|             O");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
			else if(estado==2){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|             O");
		printf("\n|             |");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
			else if(estado==3){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|             O");
		printf("\n|            /|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n|");
	}
				else if(estado==4){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|             O");
		printf("\n|            /|\\");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n| VOCE TEM 2 CHANCES\n");
	}
					else if(estado==5){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|             O");
		printf("\n|            /|\\");
		printf("\n|            /");
		printf("\n|");
		printf("\n|");
		printf("\n| VOCE TEM 1 CHANCE\n");
	}
					else if(estado==6){
		printf("\n|______________");
		printf("\n|             |");
		printf("\n|             O");
		printf("\n|            /|\\");
		printf("\n|            / \\");
		printf("\n|");
		printf("\n|");
		printf("\n|");
		printf("\n### VOCE PERDEU!! ###\n");
	}
}
void forcas(int counter, char tip[50]){
	printf("###JOGO DA FORCA###\nDesafiado %d\n",counter);
	printf("DICA: %s\n",tip);
}
int main(){
	int errors=0,counter=1,madeMistake;
	char secretWord[100],screenWord[100],tip[50],word,continues='s';
	printf("###JOGO DA FORCA###\n");
	while(continues=='s'){
		system("cls");
		fflush(stdin);
		if(counter>1){
		}
		printf("\nJogador %d\nPara comecar digite a palavra secreta: ",counter);
		fgets(secretWord,100,stdin);
		printf("A palavra secreta tem: %lu letras\n",strlen(secretWord)-1);
		printf("Digite a dica da palavra: ");
		fgets(tip, 50, stdin);
		printf("\n");
		system("pause");
		system("cls");
		forcas(counter,tip);
		secretWord[strlen(secretWord)-1]='\0';
		strcpy(screenWord,secretWord);
		for(int i=0;i<strlen(screenWord);i++){
			screenWord[i]='_';
		}
		while(1){
			forca(errors);
			printf("Advinhe a palavra: ");
			for(int i=0;i<strlen(screenWord);i++){
				printf("%c",screenWord[i]);
			}
			madeMistake=1;
			printf("\nLetra: ");
			scanf(" %c",&word);
			for(int i=0;i<strlen(screenWord);i++){
				if(word==secretWord[i]){
					screenWord[i]=word;
					madeMistake=0;
					system("cls");
					forcas(counter,tip);
				}
		}
			if(madeMistake==1){
				errors++;
				system("cls");
				forcas(counter,tip);
			}
			if(strcmp(screenWord,secretWord)==0){
				forca(errors);
				printf("Acertou: ");
				for(int i=0;i<strlen(screenWord);i++){
					printf(" %c",screenWord[i]);
				}
				printf("\nVOCE GANHOU!!\n");
				counter++;
				break;
			}
			else if(errors==6){
				forca(errors);
				printf("\nVOCE PERDEU!!");
				counter++;
				break;
			}
		}
		fflush(stdin);
		printf("\nDeseja jogar denovo? s/n\n");
		scanf("%c",&continues);
	}
	printf("\nOBRIGADO POR JOGAR!");
}