#include <stdio.h> 
int main(){
    int number;
    printf("Contador de numeros impares entre 100 e 200: ");
    for(int counter=100;counter >=100 && counter <=200;counter++){
        if(counter%2!=0){
            printf("%d, ",counter);
        }
    }
    return 0;
}