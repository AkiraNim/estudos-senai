#include<string.h>
#include<locale.h>
#include <conio.h>
#include<time.h>
#include <ctype.h>
#include<stdbool.h>
int anos(int years, int months, int days){
	int result;
		result = (years*365)+(months*12)+days;
			return result;
}
int main(){
	int years, months, days, result;
		printf("Digite quantos anos voce tem: ");
		scanf("%d", &years);
			printf("\nDigite quantos meses voce tem de vida: ");
			scanf("%d", &months);
				printf("\nDigite quantos dias voce tem de vida: ");
				scanf("%d", &days);
					result=anos(years, months, days);
						printf("\Voce tem aproximadamente %d dias de vida no total.", result);
}
