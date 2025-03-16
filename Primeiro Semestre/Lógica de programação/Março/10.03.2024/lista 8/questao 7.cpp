/*questao 7*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"portuguese");
	int number;
	printf("Digite um numero: ");
	scanf("%d",&number);
	if(number>=100 && number<=200){
		printf("\nO numero %d está entre 100 e 200.",number);
	}
	else{
		printf("\nO numero %d não está entre 100 e 200.",number);
	}
}