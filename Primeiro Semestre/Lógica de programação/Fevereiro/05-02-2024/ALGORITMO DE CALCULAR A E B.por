programa //algoritimo de calcular
{
	
	funcao inicio()
	{
	real a, b, soma, subtracao, multiplicacao, divisao
	
		escreva("Olá, bem vindo ao algoritmo de ler dois numeros, para começar digite um numero: ")
		leia(a)
		escreva("\nagora digite outro numero: ")
		leia(b)

	soma=a+b
	subtracao=a-b
	multiplicacao=a*b
	divisao=a/b

		limpa()

		escreva("Pronto, seu resultado é: ")
		escreva("\nSoma: ", a,"+", b,"=", soma)
		escreva("\nSubtracao: ",a,"-", b,"=",subtracao)
		escreva("\nMultiplicacao: ", a,"*", b, "=", multiplicacao)
		escreva("\nDivisao: ", a, "/", b, "=", divisao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */