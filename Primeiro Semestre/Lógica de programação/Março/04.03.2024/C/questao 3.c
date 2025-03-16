#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	int number,negative_number,counter;
		for(counter=0;counter<5;counter++){
			printf("Digite um numero: ");
				scanf("%d",&number);
					if(number<0){
						negative_number++;
					}
		}
		printf("Foram digitados %d numeros negativos.",negative_number);
return 0;
}
