#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<locale.h>
struct Livros{
	int yearOfPublication;
	char bookTitle[50], author[50];
	float price;
};
int main(){
	setlocale(LC_ALL,"portuguese");
	struct Livros biblioteca[10];
	printf("\nBem vindo ao cadastro da biblioteca virtual\n");
	for(int i=0; i<10;i++){
		fflush(stdin);
		printf("\nDigite o nome do livro que deseja cadastrar: ");
		gets(biblioteca[i].bookTitle);
		printf("\nAgora digite o nome do autor do livro: ");
		gets(biblioteca[i].author);
		printf("\nAgora digite o ano da publicação do livro: ");
		scanf("%d", &biblioteca[i].yearOfPublication);
		printf("\nAgora digite o preço do livro: ");
		scanf("%f", &biblioteca[i].price);
		system("cls");
	}
	for(int i =0; i<10; i++){
		printf("Livro %s\nAutor: %s\nAno de publicação: %d\nPreço do livro: %.2f\n\n", biblioteca[i].bookTitle, biblioteca[i].author, biblioteca[i].yearOfPublication, biblioteca[i].price);
	}
}