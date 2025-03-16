/*questao 2*/

void questao2(){
	setlocale(LC_ALL,"");
	int relationship_time;
	char name[40], sex, marital_status[10];
	printf("Digite seu nome: ");
	scanf(" %s", name);
	printf("\nAgora digite seu sexo: ");
	scanf(" %c",&sex);
	fflush(stdin);
	printf("\nPor fim digite seu estado civil: ");
	scanf(" %s", marital_status);
	if(sex='f'&&strcmp(marital_status,"casada")==0){
		printf("\nVoce tem quanto tempo de casada? ");
		scanf(" %s", marital_status);
	}
	printf("\nObrigado por fornecer os dados para a pesquisa :)");
}
