#include <stdio.h> 
int main(){
    int number;
    printf("Bem vindo a super tabuada que calcula ate o multiplo 10, para comecar digite um numero de 1 ate 10: ");
    scanf("%d",&number);
    for(int counter=0;counter<=10;counter++){
        printf("%d * %d\n",number,counter);
    }
    return 0;
}