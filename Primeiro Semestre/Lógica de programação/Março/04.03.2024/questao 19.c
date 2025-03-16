#include <stdio.h> 
int main(){
    int age,most_older,women,men,eye_color_blue,eye_color_green,eye_color_brown,hair_color_blonde,hair_color_brown,hair_color_black,women_18;
    char sex[1],eye_color[1],hair_color[1],quit='n';
    printf("###BEM VINDO A PESQUISA###\n\n");
    while(quit=='n'){
        printf("Digite sua idade: ");
        scanf("%d",&age);
        printf("\nDigite seu sexo: ");
        scanf("%s",&sex[1]);
        printf("\nQual dessas cores correspondem ao seu cabelo?\nLouro\nCastanho\nPreto\n");
        scanf("%s",&hair_color[1]);
        printf("\nQual dessas cores correspondem a seus olhos?\nAzul\nVerde\nCastanho\n");
        scanf("%s",&eye_color[1]);
        switch(hair_color[1]){
            case 'l' :
                hair_color_blonde++;
                    break;
            case 'c' :
                hair_color_brown++;
                    break;
            case 'p' :
                hair_color_black++;
                    break;
        }
        switch(eye_color[1]){
            case 'a' :
                eye_color_blue++;
                    break;
            case 'v' :
                eye_color_green++;
                    break;
            case 'c' :
                eye_color_brown++;
                    break;
        }
        switch(sex[1]){
            case 'f' :
                women++;
                    break;
            case 'm' :
                men++;
                    break;
        }
        if(sex[1]=='f' && age>=18 && age<=35 && eye_color[1]=='v' && hair_color[1]=='l'){
            women_18++;
        }
        if(age>most_older){
            most_older=age;
        }
        printf("Deseja sair?\nsim\nnao\n");
        scanf("%s",&quit[1]);
    }
    printf("A pessoa mais velha entre os habitantes tem: %d anos.\nO numero de mulheres entre 18 e 35 anos que tem olhos verdes e cabelos louros é de: %d mulheres.\nO numero de mulheres é de: %d mulheres.\nO numero de homens é de: %d homens.\nO numero de pessoas louras é de: %d pessoas\nO numero de pessoas com cabelo castanho é de: %d\nO numero de pessoas com cabelo preto é de: %d pessoas.",most_older,women_18,women,men,hair_color_blonde, hair_color_brown,hair_color_black);
    return 0;
}