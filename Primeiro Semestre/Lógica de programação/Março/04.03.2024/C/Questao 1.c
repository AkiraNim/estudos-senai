#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	float chico=1.50,juca=1.10;
	int counter;
	while(chico>juca){
		printf("\nAltura de Chico %f mts\n",chico);
		printf("\nAltura de Juca %f mts\n",juca);
		chico=chico+0.02;
		juca=juca+0.03;
		counter++;
	}
	printf("Levaram %d anos para Juca ficar maior que Chico.",counter);
return 0;
}

