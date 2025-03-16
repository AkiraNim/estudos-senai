#include<stdio.h>
#include<stdlib.h>

void apresentar(int b){
	printf("Valor: %d", b);
}

int main(){
	int *a;
		
		a=(int*) malloc(sizeof(int));
		*a=3;
		apresentar(*a);
		
		return 0;
}
