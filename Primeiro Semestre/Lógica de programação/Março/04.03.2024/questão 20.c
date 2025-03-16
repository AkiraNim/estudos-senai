#include <stdio.h>
#include<conio.h>
int main(){
       int age,older,younger,man_wage_1000,counter,aux;
       float wage,average_wage,sum_wage;
       char sex[1],quit='n';
       printf("###BEM VINDO A PESQUISA###\n");
       while(quit=='n'){
           counter++;
 
           printf("Para começar, digite sua idade: ");
               scanf("%d",&age);
           printf("Agora, digite seu sexo: ");
               scanf("%s",&sex[1]);
           printf("Agora digite seu salario: R$");
               scanf("%f",&wage);
           printf("Pesquisa finalizada, deseja sair?\nsim\nnao\n");
               scanf("%s", &quit);
           if(age>older){
               older=age;
           }
           if(younger>age){
               younger=age;
           }
           if(counter==1&&younger==0){
               younger=age;
           }
           if(wage<=100 && sex[1]=='m'){
               man_wage_1000++;
           }
           sum_wage=sum_wage+wage;
           clrscr();
       }
       average_wage=sum_wage/counter;
       printf("A pessoa mais nova da cidade tem %d anos\nA pessoa mais velha da cidade tem %d anos\nA media salarial da populacao é de: R$%.2f por pessoa.\nO numero de homens que recebem ate R$1000.00 é de: %d",younger,older,average_wage,man_wage_1000);
    return 0;
}