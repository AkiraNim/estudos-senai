/*questao 10*/

void questao10(){
	setlocale(LC_ALL,"portuguese");
	float wage, financing;
	printf("Digite seu salario: ");
	scanf(" %f", &wage);
	printf("\nAgora digite o valor do financiamento requerido: ");
	scanf(" %f", &financing);
	if(financing<=wage*5){
		printf("\nFinanciamento concedido.");
	}
	else{
		printf("\nFinanciamento negado.");
	}
}
