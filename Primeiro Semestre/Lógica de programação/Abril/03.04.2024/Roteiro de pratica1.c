#include <stdio.h>

#include <stdlib.h>

#include <locale.h>

#include <string.h>

#include <time.h>

#define MAX 30
typedef struct {
  int productStock, productId, productAux;
  char productName[250];
  float productPrice;
}
Stock;
Stock products[MAX];
int counter = 0;

void switchCase(int option);
void productsRegistration();
void productsSearch();
void productsList();
int main() {
  setlocale(LC_CTYPE, "");
  int option;
  for (int i = 0; i < MAX; i++) {
    products[i].productAux = 1;
  }
  while (option != 4) {
    printf("Escolha uma das opções abaixo:\n\n1-Cadastrar Produto\n2-Buscar Produto pelo nome\n3-Listar Produto\n4-Sair\n");
    scanf("%d", & option);
    switchCase(option);
  }
}
void switchCase(int option) {
  switch (option) {
  case 1:
    productsRegistration();
    break;
  case 2:
    productsSearch();
    break;
  case 3:
    productsList();
    break;
  case 4:
    printf("\nVocê escolheu sair\n\n");
    break;
  default: {
    printf("\nComando invalido.");
    break;
  }
  }
}
void productsRegistration() {
  int sortNumber;
  system("cls");
  printf("Você escolheu cadastrar um aluno.\n\n");
  if (counter != MAX) {
    fflush(stdin);
    printf("\nDigite o nome do Produto: ");
    gets(products[counter].productName);
    strlwr(products[counter].productName);
    printf("\nDigite quantos produtos tem no estoque: ");
    scanf("%d", & products[counter].productStock);
    srand(time(NULL));
    sortNumber = rand() % 1000000;
    products[counter].productId = sortNumber;
    printf("\nO codigo do produto é: %d\n", products[counter].productId);
    printf("\nDigite o preço do produto: ");
    scanf("%f", & products[counter].productPrice);
    products[counter].productAux = 0;
    counter++;
  } else {
    printf("\nNumero maximo de Products alcançado.\n");
    system("pause");
  }
  system("cls");
}
void productsSearch() {
  int productAux = -1, switchAux = 0, productCode;
  char productName[250];
  system("cls");
  printf("Você escolheu procurar por um aluno em específico.\n\nSelecione uma das opções:\n1-Buscar pelo nome\n2-Buscar pelo codigo\n");
  scanf("%d", & switchAux);
  if (switchAux == 1) {
    printf("\nDigite o nome do Produto: ");
    scanf("%d", & productName);
    for (int i = 0; i < MAX; i++) {
      if (strcmp(productName, products[i].productName) == 0) {
        printf("\nProduto %s encontrado.\n", products[i].productName);
        printf("\nEstoque: %d", products[i].productStock);
        printf("\nCodigo: %d", products[i].productId);
        printf("\nPreço: %f", products[i].productPrice);
        productAux = 1;
        system("pause");
      }
    }
  } else if (switchAux == 2) {
    printf("\nDigite o codigo do Produto: ");
    scanf("%d", & productCode);
    for (int i = 0; i < MAX; i++) {
      if (productCode == products[i].productId) {
        printf("\nProduto %d encontrado.\n", products[i].productId);
        printf("\nNome: %s", products[i].productName);
        printf("\nEstoque: %d", products[i].productStock);
        printf("\nPreço: %f", products[i].productPrice);
        productAux = 1;
        system("pause");
      }
    }
  }
  if (productAux == -1) {
    printf("\nProduto não encontrado, tente novamente.\n\n");
    system("pause");
  }
  system("cls");
}
void productsList() {
  system("cls");
  printf("Você escolheu listar todos os alunos cadastrados.\n\n");
  for (int i = 0; i < MAX; i++) {
    if (products[i].productAux == 0) {
      printf("\nProduto: %s \n", products[i].productName);
      printf("\nEstoque: %d \n", products[i].productStock);
      printf("\nCodigo: %d \n", products[i].productId);
    }
  }
  if (products[0].productAux == 1 && products[2].productAux == 1) {
    printf("\nNão foram cadastrados produtos ainda.\n\n");
  }
  system("pause");
  system("cls");
}