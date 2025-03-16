#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#include<string.h>

main(){

setlocale(LC_ALL, "Portuguese");

char letra; // pega apenas uma letra
char nome[10];
char nome2[10];

printf("informe a letra desejada: \n");
scanf("%c",&letra);
fflush(stdin);
printf("informe o nome desejado: \n");
scanf("%s",&nome);
fflush(stdin);
printf("informe o nome desejado: \n");
gets(nome2);
fflush(stdin);

printf("LETRA -> %c \n",letra);
printf("NOME -> %s \n", nome);
printf("NOME COMPLETO -> %s \n", nome2);




}

