#include <stdio.h>  
#include<stdlib.h>
int main(){  
int sum,number; 
printf("Os numeros de 1 ate 500 multiplos de 3 são: ");
for(number=1;number>=1 && number<=500;number++){
        if(number%2!=0 && number%3==0){
            sum=sum+number;
            printf("%d,",number);
        }
}
printf("\nA soma dos numeros inteiros multiplos de 3 de 1 até 500 é: %d",sum);
    system("pause");
    return 0;    
}