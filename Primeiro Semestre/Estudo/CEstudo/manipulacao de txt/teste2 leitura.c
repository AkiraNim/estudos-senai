#include<stdio.h>

int main(){
	FILE *file;
	int x, y, z;
	char name[50];
	file = fopen("teste.txt", "r");
	if(file==NULL){
		printf("Arquivo nao pode ser aberto");
		return 0;
	}
	
	fscanf(file,"%i %i %i", &x, &y, &z);
	fscanf(file,"%s", name);
	printf("%i %i %i \n%s", x, y, z, name);
	fclose(file);
	
	return 0;
}