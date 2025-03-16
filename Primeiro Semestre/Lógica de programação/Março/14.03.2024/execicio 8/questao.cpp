#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
#include <conio.h>
#include<time.h>
#include <ctype.h>

#include "questao 1.c"
#include "questao 2.cpp"
#include "questao 3.cpp"
#include "questao 4.cpp"
#include "questao 5.cpp"
#include "questao 6.cpp"
#include "questao 7.cpp"
#include "questao 8.cpp"
#include "questao 9.cpp"
#include "questao 10.cpp"
#include "questao 11.cpp"

int main (){
	setlocale(LC_ALL,"portuguese");
	int option;
	do{
		printf("#########################\n\n");
		printf("##EXERCÍCIOS - ANEXO 8 ##\n\n");
		printf("#########################\n\n");
		printf("1- Q1\n");
		printf("2- Q2\n");
		printf("3- Q3\n");
		printf("4- Q4\n");
		printf("5- Q4\n");
		printf("6- Q6\n");
		printf("7- Q7\n");
		printf("8- Q8\n");
		printf("9- Q9\n");
		printf("10- Q10\n");
		printf("11- Q11\n");
		printf("0- Sair\n");
		printf("Escolha uma opção: ");
		scanf("%d", &option);
		
		switch(option){
			case 1:
				questao1();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 2:
				questao2();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 3:
				questao3();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 4:
				questao4();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 5:
				questao5();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 6:
				questao6();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 7:
				questao7();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 8:
				questao8();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 9:
				questao9();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 10:
				questao10();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
			case 11:
				questao11();
					fflush(stdin);
						printf("\n");
							system("pause");
								system("cls");
									break;
									
			case 0:
				printf("\nObrigado por usar a plataforma.");
				break;
		
		}
	}while(option!=0);
	
	return 0;
}
