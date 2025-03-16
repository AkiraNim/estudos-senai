#include <stdio.h> 
#include<stdlib.h>
int main(){
    int  number_of_children,average_number_of_children,percentage_wage_1000,counter,quiting=1;
    float wage,average_wage,bigger_wage;
    char quit[1];
    quit[1]='n';
    while(quit[1]=='n'){
        counter++;
        printf("Bem vindo ao cadastro de cidadãos, cidadão n°%d.\n Para começar digite quantos filhos voce tem: ",counter);
        scanf("%d",&number_of_children);
        printf("\nAgora digite o seu salario: R$");
        scanf("%f",&wage);
        if(bigger_wage<wage){
            bigger_wage=wage;
        }
        if(wage<=1000.00){
            percentage_wage_1000++;
        }
average_number_of_children=average_number_of_children+number_of_children/counter;
average_wage=average_wage+wage/counter;
    printf("\nDeseja sair?\nsim/nao\n");
    scanf("%s",&quit[1]);
    }
    printf("\nA media salarial da populacao e de: R$%.2f",average_wage);
    printf("\nA media de filhos de cada cidadao é de %d filhos por pessoa",average_number_of_children);
    printf("\nO maior salario da populacao é: R$%.2f",average_wage);
    printf("\nO numero de pessoas que recebem até R$1000,00 é de: %d pessoas",percentage_wage_1000);

    return 0;
}