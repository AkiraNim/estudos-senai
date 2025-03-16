/*questao 9*/

void questao9(){
	setlocale(LC_ALL,"portuguese");
	int age;
	printf("Digite sua idade: ");
	scanf("%d", &age);
	if(age>=5 && age<=7){
		printf("\nVocê está no INFANTIL A.");
	}
	else if(age>=8 && age<=10){
		printf("\nVocê está no INFANTIL B.");
	}
	else if(age>=11 && age<=13){
		printf("\nVocê está no JUVENIL A.");
	}
	else if(age>=14 && age<=17){
		printf("\nVocê está no JUVENIL B.");
	}
	else if(age>=18 && age<=17){
		printf("\nVocê está no SÊNIOR.");
	}
	else{
		printf("\nIdade fora da faixa etária.");
	}
}
