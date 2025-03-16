#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#include<locale.h>
void forca(int errors){
	if(errors==0){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	}
	if(errors==1){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|               O");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	}
	if(errors==2){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|               O");
	printf("\n|               |");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	}
	if(errors==3){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|               O");
	printf("\n|              /|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	}
	if(errors==4){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|               O");
	printf("\n|              /|\\");
	printf("\n|");
	printf("\n|");
	printf("\n|");
	printf("\n|VOCE SO TEM MAIS 2 CHANCES!!");
	}
	if(errors==5){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|               O");
	printf("\n|              /|\\");
	printf("\n|              /");
	printf("\n|");
	printf("\n|");
	printf("\n|VOCE SO TEM MAIS 1 CHANCE!");
	}
	if(errors==6){
	printf("\n|________________");
	printf("\n|               |");
	printf("\n|               O");
	printf("\n|              /|\\");
	printf("\n|              / \\");
	printf("\n|");
	printf("\n|");
	printf("\n|VOCE PEREDEU!!");
	}
	
}
int main(){
	setlocale(LC_ALL,"portuguese");
	int counter=1,madeMistake,errors=0,i;
	char secretWord[30],screenWord[30],tipWord[20],guessWord,continue1='s';
	while(continue1=='s'){
	fflush(stdin);
	system("cls");
	errors=0;
	printf("###JOGO DA FORCA###\nBem vindo jogador %d\nPara começar digite qual vai ser a palavra secreta: ",counter);
	fgets(secretWord,30,stdin);
	printf("\nAgora digite a dica para esta palavra: ");
	fgets(tipWord,20,stdin);
	printf("\nPronto, a palavra secreta é: %s\nA dica é: %s\n\nCodificando a palavra secreta:\n",secretWord,tipWord);
	secretWord[strlen(secretWord)-1]='\0';
	strcpy(screenWord,secretWord);
	for(i=0;i<strlen(screenWord);i++){
		screenWord[i]='_';
		printf(" %s\n",screenWord);
	}
	printf("Tudo pronto pro Desafiado %d começar a jogar\n",counter);
	system("pause");
	system("cls");
		while(1){
		madeMistake=1;
		printf("\n\n###JOGO DA FORCA###\n\nBem vindo desafiado %d\nA dica para a palavra é: %s\nNúmero de letras da palavra: %lu\n",counter,tipWord,strlen(secretWord));
		forca(errors);
		printf("\nPalavra: %s\nDigite uma letra: ",screenWord);
		scanf(" %c",&guessWord);
		for(i=0;i<strlen(screenWord);i++){
			if(guessWord==secretWord[i]){
			screenWord[i]=guessWord;
			madeMistake=0;
		}
			}
		if(madeMistake==1){
			errors++;
		}
		if(strcmp(secretWord,screenWord)==0){
			system("cls");
			forca(errors);
			printf("\nVoce acertou a palavra: %s\n\nVOCE VENCEU PARABENS!!!!\n\nDeseja continuar a jogar?\nsim\nnao\n",secretWord);
			fflush(stdin);
			scanf("%c",&continue1);
			counter++;
			break;
		}
		else if(strcmp(secretWord,screenWord)!=0&&errors==6){
			printf("\n\nVOCE PERDEU!!\n\nDeseja continuar a jogar?\nsim\nnao\n");
			fflush(stdin);
			scanf("%c",&continue1);
			break;
		}
		system("cls");
		}
	}
	printf("OBRIGADO POR JOGAR!");
}