#include <stdio.h>
#include<stdlib.h>

typedef struct{
	int day, month, year, aux;
}Data;

int dateVerify(Data date1, Data date2){
	if(date1.year>date2.year) return -1;
	else if(date1.year<date2.year) return 1;
	else if(date1.month>date2.month) return -1;
	else if(date1.month<date2.month) return 1;
	else if(date1.day>date2.day) return -1;
	else if(date1.day<date2.day) return 1;
	else return 0;
}

int main(){
	Data date1, date2;
	int i=0, older, result;
	while (1){
		printf("\nDigite uma data\n\nDigite o dia, mes e ano:\n");
		scanf("%d/%d/%d", &date1.day, &date1.month, &date1.year);
		printf("\nDigite a outra data\n\nDigite o dia, mes e ano:\n");
		scanf("%d/%d/%d", &date2.day, &date2.month, &date2.year);
		result = dateVerify(date1, date2);
		system("cls");
		break;
	}
		if(result==0) printf("\nAs datas são iguais");
		else if(result==1) printf("\nA primeira data veio primeiro");
		else printf("\nA segunda data veio primeiro");
}