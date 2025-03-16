/*questao 1*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"portuguese");
	int a_value, b_value ,c_value;
	printf("Digite um valor para A: ");
	scanf("%d", &a_value);
	printf("\nAgora digite um valor para B: ");
	scanf("%d", &b_value);
	printf("\nPor fim digite um valor para C: ");
	scanf("%d", &c_value);
	if(a_value + b_value > c_value){
		printf("Os valores %d + %d são maiores que o valor %d",a_value, b_value, c_value);
	}
	else{
		printf("Os valores %d + %d são menores que o valor %d",a_value, b_value, c_value);
	}
}