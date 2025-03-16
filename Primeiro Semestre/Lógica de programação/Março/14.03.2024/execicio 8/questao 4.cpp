/*questao 4*/

void questao4(){
	float grade_1, grade_2, arithmetic_average;
	printf("Digite a primeira nota do aluno: ");
	scanf(" %f", &grade_1);
	printf("Agora digite a segunda nota do aluno: ");
	scanf(" f%", &grade_2);
	arithmetic_average = grade_1 + grade_2 / 2;
	if(arithmetic_average>=5){
		printf("\nAluno aprovado, parabens!!");
	}
	else{
		printf("\nAluno reprovado!!");
	}
}
