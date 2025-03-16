#include<stdlib.h>
#include <stdio.h> 
int main(){
    int number,sum=0,count;
    for(count=0;count<20;count++){
        printf("Digite um numero: ");
        scanf("%d",&number);
        if(number>0){
            sum=sum+number;
        }
    }
    printf("A soma dos valores positivos é: %d",sum);
    system("pause");
    return 0;
}