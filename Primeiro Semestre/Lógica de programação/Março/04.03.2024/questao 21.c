#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	int number=1,even_number,odd_number,average_even_numbers,average_numbers,counter_even_number,counter;
		while(number!=0){
			printf("\nDigite um numero: ");
				scanf("%d",&number);
					if(number%2==0&&number!=0){
						even_number=even_number+number;
						counter_even_number++;
					}
						else{
							odd_number++;
						}
							average_numbers=average_numbers+number;
								counter++;
		}
	system("cls");
		average_even_numbers=even_number/counter_even_number;
			average_numbers=average_numbers/counter;
				printf("A quantidade de numeros pares: %d\nA quantidade de numeros impares: %d\nA media dos numeros pares: %d\nA media geral dos numeros foi: %d\n",counter_even_number,odd_number,average_even_numbers,average_numbers);
return 0;
}
