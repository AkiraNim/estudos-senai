#include<string.h>
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
void somatorio(int number, int period){
	setlocale(LC_ALL,"portuguese");
	int result, resultPeriod=0;
		printf("\nO somatorio de %d no periodo %d é:", number, period);
		for(int i=1;i <= period;i++){
			result=(number*i);
			resultPeriod=(number*i)+resultPeriod;
			printf("\n%d * %d = %d ", number, i,result);
		}
		printf("\nO somatorio eé: %d", resultPeriod);
}
int main(){
	setlocale(LC_ALL,"portuguese");
	int number, period;
		printf("Digite o numero que quer saber o somatorio: ");
		scanf("%d", &number);
		printf("\nAgora digite o periodo: ");
		scanf("%d", &period);
		somatorio(number, period);
}
