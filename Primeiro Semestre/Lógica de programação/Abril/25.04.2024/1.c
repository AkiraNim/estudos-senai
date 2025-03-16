#include <stdio.h>
#include <stdlib.h>
#define TAM 10

typedef struct{
	int item[TAM];
	int top;
} Pile;

void start(Pile *pile){
	pile->top=-1;
}

int isEmpty(Pile *pile){
	if(pile->top==-1) return 1;
	return 0;
}

int isFull(Pile *pile){
	if(pile->top == TAM-1) return 1;
	return 0;
}

void push(Pile *pile, int number){
	if(isFull(pile)) printf("\nA pilha está cheia!");
	else{
		pile->top++;
		pile->item[pile->top] = number;
		printf("%d foi inserido na pilha.\n", number);
	}
}

void pop(Pile *pile){
	if(isEmpty(pile)) printf("A pilha está vazia");
	else {
		int aux = pile->item[pile->top];
		pile->top--;
		printf("%d removido com sucesso!", aux);
	}
}
void choice(Pile *pile){
	int number, option;
		scanf("%d", &option);
			switch(option){
				case 1:
					printf("\nDigite um numero para adicionar à pilha: ");
					scanf("%d", &number);
					push(pile, number);
					printf("\n");
					system("pause");
					system("cls");
					break;
				case 2:
					pop(pile);
					break;
				case 3:
					if(isEmpty(pile)) printf("A pilha está vazia!.\n");
					else printf("A pilha não está vazia!.\n");
					system("pause");
					system("cls");
					break;
				case 4:
					if(isFull(pile)) printf("A pilha está cheia!.\n");
					else printf("A pilha nao está cheia!.\n");
					system("pause");
					system("cls");
					break;
				case 5:
					printf("Tamanho da pilha: %d\n", pile->top+1);
					system("pause");
					system("cls");
					break;
			}
}
int main(){
	int number, i;
	while(i<TAM){
		Pile *pile = (Pile *) malloc(sizeof(Pile));
		start(pile);
		printf("\nDigite a opçao que lhe agrada.\n1 - Adicionar um numero à pilha.\n2- Tirar um numero da pilha\n3- Verificar se a pilha está vazia.\n4- Verificar se a pilha está cheia.\n5-Tamanho da pilha\n6-Topo da pilha.\n7- Sair.");
		choice(pile);
	}
	
}
