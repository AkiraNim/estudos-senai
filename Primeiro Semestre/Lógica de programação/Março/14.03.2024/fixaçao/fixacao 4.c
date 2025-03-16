#include<string.h>
#include<locale.h>
#include <conio.h>
#include<time.h>
#include <ctype.h>
#include<stdbool.h>
bool parImpar(int number){
	bool i = true;
		if(number<0){
			i= false;
		}
	return i;
}
int main(){
	int number;
	bool i;
		printf("Digite um numero: ");
		scanf("%d", &number);
	i = parImpar(number);
	if(i==true){
		printf("\nO numero e positivo.");
	}
	else{
		printf("\nO numero e negativo.");
	}
}
