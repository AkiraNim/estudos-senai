#include<string.h>
#include<locale.h>
#include <conio.h>
#include<time.h>
#include <ctype.h>
float notas (float grade1, float grade2, float grade3, char option){
	float result;
	switch(option){
		case 'A':
			result = (grade1 + grade2 + grade3)/3;
				break;
				
		case 'P':
			 result=((grade1*5)+(grade2*3)+(grade3*2))/10;
	}
	return result;
}
int main(){
	float grade1, grade2, grade3,result;
	char option;
		printf("\nDigite a nota 1\n");
		scanf(" %f", &grade1);
		printf("\nDigite a nota 2\n");
		scanf(" %f", &grade2);
		printf("\nDigite a nota 3\n");
		scanf(" %f", &grade3);
		printf("\nDigite como quer a media\nA=aritmetica\nP=ponderada\n");
		scanf(" %c", &option);
		result = notas(grade1, grade2, grade3, option);
		printf("\nA media é: %f", result);
}


