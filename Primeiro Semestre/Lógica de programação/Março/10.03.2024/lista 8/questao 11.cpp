/*questao 11*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
int main(){
	int value_1,value_2,value_3;
	printf("Digite um numero: ");
	scanf("%d", &value_1);
	printf("\nAgora digite outro numero: ");
	scanf("%d", &value_2);
	printf("\nAgora digite outro numero: ");
	scanf("%d", &value_3);
	if(value_1>value_2 && value_1>value_3){
		if(value_2>value_3){
			printf("\nA ordem crescente é: \n%d\n%d\n%d.",value_3, value_2, value_1);
		}
	}
	 if(value_2>value_1 && value_2>value_3){
		if(value_3>value_1){
			printf("\nA ordem crescente é: \n%d\n%d\n%d.",value_1,value_3,value_2);
		}
	}
	else if(value_3>value_1 && value_3>value_2){
		if(value_1>value_2){
				printf("\nA ordem crescente é: \n%d\n%d\n%d.",value_2,value_1,value_3);
		}
		}
	else if(value_1>value_2 && value_1>value_3){
		if(value_3>value_2){
			printf("\nA ordem crescente é: \n%d\n%d\n%d.",value_2,value_3,value_1);
		}
	}
	 if(value_2>value_1 && value_2>value_3){
		if(value_1>value_3){
			printf("\nA ordem crescente é: \n%d\n%d\n%d.",value_3,value_1,value_2);
		}
	}

	if(value_3>value_1 && value_3>value_2 && value_2>value_1){
		if(value_2>value_1){
			printf("\nA ordem crescente é: \n%d\n%d\n%d.",value_1,value_2,value_3);
		}
	}
	}