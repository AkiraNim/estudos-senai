#include <stdio.h>
#include<stdlib.h>


typedef struct{
	int generalWidth, generalHeight, area;
}Retangulo;

int main(){
	Retangulo rectangle;
	int isRectangle=0;
	while(isRectangle==0){
		printf("Digite a base do retangulo: ");
		scanf("%d", &rectangle.generalWidth);
		printf("\nDigite a altura do retangulo: ");
		scanf("%d", &rectangle.generalHeight);
		if(rectangle.generalWidth!=rectangle.generalHeight) isRectangle=1;
		else{
			printf("\nQuadrado detectado, digite os valores novamente.\n");
			system("pause");
			system("cls");
		} 
	}
	rectangle.area=rectangle.generalWidth*rectangle.generalHeight;
	printf("\nA area do retangulo é: %d", rectangle.area);
}