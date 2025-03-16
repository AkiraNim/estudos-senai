#include <stdio.h> 
#include<stdlib.h>
int operations(int number1, int number2, char operation){
    int result;
    switch(operation){
        case '+':
            result=number1+number2;
        break;
        case '-':
            result=number1-number2;
        break;
        case '*':
            result=number1*number2;
        break;
        case '/':
            result=number1/number2;
        break;
        case '=':
            result=number1+number1;
        break;
        default:
        printf("\nVoce digitou algo errado\n");
        break;
    }
    return result;
}
int main(){
    int number1,number2,result,quit_count=0;
    char operation[1],quit[1];
        printf("Bem vindo a calculadora, para comecar digite o primeiro numero: ");
        scanf("%d",&number1);
        printf("\nO que deseja fazer com esse numero? Digite o que corresponde a seu desejo.\n+ = somar.\n- = subtrair.\n* = multiplicar.\n/ = dividir.\n");
        scanf("%s",  &operation[1]);
        if(operation[1]!='='){
            printf("\nAgora digite outro numero: ");
        scanf("%d",&number2);
        result=operations(number1,number2,operation[1]);
        }
        else{
        result=operations(number1,number1,operation[1]);
        }
        printf("O resultado e  = %d\n",result);
        printf("Deseja sair?\nsim/nao\n");
        scanf("%s",&quit[1]);
        while(quit[1]=='n'){
            printf("\nDigite outro numero para operar com o resultado: ");
            scanf("%d",&number1);
            printf("\nAgora digite a operacao: ");
            scanf("%s", &operation[1]);
            result=operations(result,number1,operation[1]);
            printf("\nO resultado e = %d",result);
            quit_count++;
            if(quit_count==4){
            printf("\nDeseja sair?\nsim/nao\n");
            scanf("%s",&quit[1]);
            quit_count=0;
            }
        }
        printf("Obrigado por usar a calculadora que calcula :)");
    system("pause");
    return 0;
}