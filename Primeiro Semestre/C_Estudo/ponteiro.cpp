#include<stdio.h>
#include<stdlib.h>
void display(int var, int *ptr);
void update(int *p);
int main(){
	int var=15;
	int *ptr;
	ptr = &var;
	display(var, ptr);
	
	
	update(ptr);
	display(var,ptr);
	
	return 0;
}
void display(int var, int *ptr){
	
	printf("\n\n");
	printf("Conteudo de var = %d\n", var);
	printf("Endereco de var = %p\n", &var);
	printf("Conteudo apontado por ptr = %d\n", *ptr);
	printf("Endereco apontado por ptr = %p\n", ptr);
	printf("\nEndereco de ptr = %p\n", &ptr);
}
void update(int *p){
	*p+=1;
}
/*Ponteiros: 
//*ptr: o apontado por, conteudo do enderco da variavel que ptr aponta.
//ptr: o endereco da variavel.
//&ptr: o endereco de ptr.*/