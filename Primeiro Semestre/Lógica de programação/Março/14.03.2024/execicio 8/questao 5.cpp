/*questao 5*/

void questao5(){
	setlocale(LC_ALL,"portuguese");
	int number_a, number_b, result=0;
	char arithmetic_operation;
	printf("Digite o primeiro valor: ");
	scanf("%d", &number_a);
	printf("\nAgora digite o segundo valor: ");
	scanf("%d", &number_b);
	printf("\nAgora digite a operação a ser realizada: \n+\n-\n*\n/\n");
	scanf(" %c", &arithmetic_operation);
	switch(arithmetic_operation){
		case '+':
			result = number_a + number_b;
				break;
	
		case '-':
			result = number_a-number_b;
				break;
	
		case '*':
			result = number_a * number_b;
				break;
			case '/':
			result = number_a / number_b;
				break;
	}
	printf("\nO resultado de %d %c %d é %d",number_a, arithmetic_operation, number_b, result);
}
