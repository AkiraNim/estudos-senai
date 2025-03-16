#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	int number,sum,counter;
		for(counter=0;counter<10;counter++){
			printf("Digite um numero: ");
				scanf("%d",&number);
					sum=sum+number;
		}
	system("cls");
		printf("A soma dos numeros e %d",sum);
return 0;
}
