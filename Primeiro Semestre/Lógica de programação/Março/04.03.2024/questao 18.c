#include<stdlib.h>
#include <stdio.h> 
int main(){
    int vote,candidate1,candidate2,candidate3,candidate4,null_vote,blank_vote,quit;
    printf("BEM VINDO A URNA ELETRONICA");
    while(quit==0){
    printf("Para começar digite para qual candidato quer votar:\nCandidato1 - 1\nCandidato2 - 2\nCandidato3 - 3\nCandidato4 - 4\nVoto nulo - 5\nVoto em branco - 6\n");
        scanf("%d",&vote);
        switch(vote){
            case 1:
                candidate1++;
            break;
            case 2:
                candidate2++;
            break;
            case 3:
                candidate3++;
            break;
            case 4:
                candidate4++;
            break;
            case 5:
                null_vote++;
            break;
            case 6:
                blank_vote++;
            break;
            default :
                printf("\nOpcao invalida, tente novamente.\n");
        }
        printf("Deseja sair?\n1 - Sim\n0- Nao\n");
        scanf("%d",&quit);
    }
    printf("TOTAL DE VOTOS\nCandidato 1: %d votos\nCandidato 2: %d votos \nCandidato 3: %d votos \nCandidato 4: %d votos \nVotos nulos: %d votos \nVotos em branco: %d votos\n",candidate1,candidate2,candidate3,candidate4,null_vote,blank_vote);
    return 0;
}