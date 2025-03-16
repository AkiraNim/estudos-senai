#include<stdio.h>
#include<stdlib.h>

int main(){
	int *a;
		
		a=(int*) malloc(sizeof(int));
		*a=3;
		printf("%d", *a);
		
		return 0;
}
