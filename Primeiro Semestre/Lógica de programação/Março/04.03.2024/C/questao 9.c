//Note:The template file will be copied to a new file. When you change the code of the template file you can create new file with this base code. 
#include <stdio.h> 
#include<stdlib.h>
int main(){
    int number,factoration=1;
        printf("Digite um numero a ser fatorado: ");
        scanf("%d",&number);
        printf("\nA fatoracao de %d e: \n%d!=",number,number);
        for(int i=number;i<=number && i>1;i--){
           factoration=i*factoration;
             printf("%d * ",i);
        }
        printf("1 = %d",factoration);
 system("pause");
return 0;
}