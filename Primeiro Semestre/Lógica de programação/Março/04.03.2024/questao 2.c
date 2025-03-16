#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	int number,counter;
		printf("Digite um numero para saber sua tabuada: ");
		scanf("%d",&number);
		for(counter=1;counter<=10;counter++){
			int equal;
			equal=number*counter;
			printf("\n%d * %d = %d\n",number,counter,equal);
		}
return 0;
}
