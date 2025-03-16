#include<stdlib.h>
#include <stdio.h> 
int main(){
    float height,bigger_height,smaller_height=0;
    printf("Digite a altura: ");
    scanf("%f",&height);
    bigger_height=height;
    smaller_height=height;
    for(int count=0;count<14;count++){
        printf("Agora digite outra altura: ");
        scanf("%f",&height);
        if(height>bigger_height){
            bigger_height=height;
        }
        if(smaller_height>height){
            smaller_height=height;
        }
    }
    printf("A maior altura foi: %.2f\n",bigger_height);
    printf("A menor altura foi: %.2f\n",smaller_height);
    system("pause");
    return 0;
}