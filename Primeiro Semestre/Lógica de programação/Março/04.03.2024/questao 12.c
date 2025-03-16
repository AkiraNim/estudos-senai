#include<stdlib.h>
#include <stdio.h> 
int main(){
    int number=1, sum=0;
    while(number!=0){
        printf("Digite um numero: ");
        scanf("%d",&number);
        sum=sum+number;
    }
    printf("A soma dos numero é: %d",sum);
    system("pause");
    return 0;
}