#include<stdlib.h>
#include <stdio.h> 
int main(){
    int number=1,arithmethic_average,positive_numbers=0,negative_numbers=0,counter;
            while(number!=0){
            printf("Digite um numero inteiro: ");
            scanf("%d",&number);
            if(number>0 ){
            positive_numbers++;
            counter++;
            }
            else if(number < 0){
            negative_numbers++;
            counter++;
            } 
        }
    arithmethic_average=(positive_numbers+negative_numbers)/counter;
    printf("%d",counter);
    printf("\nForam escritos %d numeros positivos",positive_numbers);
    printf("\nForam escritos %d numeros negativos",negative_numbers);
    printf("\nA media aritmetica de todos os numeros foi %d",arithmethic_average);
    system("pause");
    return 0;
}