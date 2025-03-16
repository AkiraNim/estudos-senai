/*questao 3*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
int main(){
	setlocale(LC_ALL,"portuguese");
	int a_value, b_value, c_value;
	printf("Digite um valor para A: ");
	scanf("%d", &a_value);
	printf("\nAgora digite um valor para B: ");
	scanf("%d", &b_value);
	if(a_value == b_value){
		c_value = a_value + b_value;
		printf("O resultado de %d + %d é %d",a_value, b_value, c_value);
	}
	else{
		c_value = a_value * b_value;
		printf("O resultado de %d * %d é %d",a_value, b_value, c_value);
	}
}