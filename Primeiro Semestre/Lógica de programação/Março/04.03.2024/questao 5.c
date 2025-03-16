#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	int number=1,average,counter;
		while(number!=0){
			printf("\nDigite um numero: ");
				scanf("%d",&number);
					if(number%2==0&&number!=0){
						average=average+number;
							counter++;
					}
		}
		system("cls");
			average=average/counter;
				printf("%d\n",counter);
					printf("A media dos numeros pares foi: %d",average);
return 0;
}
