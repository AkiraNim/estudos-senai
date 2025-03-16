#include <stdio.h>
#include <stdlib.h>
void digita(char *data){
	printf("Digite: ");
	scanf("%s", data);	
}
int main(){
	char retorna_dado[255];
	
	digita(retorna_dado);
	
	printf("%s", retorna_dado);
}