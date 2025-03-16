/*questao 8*/

void questao8(){
	setlocale(LC_ALL,"portuguese");
	float weight, height,imc;
	printf("Digite seu peso: ");
	scanf(" %f", &weight);
	fflush(stdin);
	printf("\nAgora digite sua altura: ");
	scanf(" %f", &height);
	imc=weight/(height*2);
	if(imc<20){
		printf("\nSeu imc é de %.2f você está abaixo do peso, alimente-se.",imc);
	}
	else if(imc>=20 && imc<= 25){
		printf("\nSeu imc é de %.2f você está no peso normal, continue assim.",imc);	
	}
	else if(imc >25 && imc<= 30){
		printf("\nSeu imc é de %.2f você está com sobre-peso, exercicios sao necessarios.",imc);
	}
	else if(imc >30 && imc <=40){
		printf("\nSeu imc é de %.2f você está com obesidade, exercicios e uma dieta fornecida por um medico sao necessarios.",imc);
	}
	else{
		printf("\nSeu imc é de %.2f você está com obesidade mórbida, cuidados medicos urgentes são necessários.",imc);
	}
}
