programa//questao 5
{
	
	funcao inicio()
	{
	real a,b,c
	caracter operacao
		escreva("Olá, escreva um numero: ")
		leia(a)
		escreva("\nAgora escreva outro numero: ")
		leia(b)	
		escreva("\nEscreva agora um digito para operacao dentre as seguintes opcoes: \n + (adicao), - (subtracao), * (multiplicacao), / (divisao),\n\n")
		leia(operacao)

		limpa()

		se(operacao=='+'){
			c=a+b
			escreva(c)
		}
		senao se(operacao=='-'){
			c=a-b
			escreva(c)
		}
		senao se(operacao=='*'){
			c=a*b
			escreva(c)
		}
		senao se(operacao=='/'){
			c=a/b
			escreva(c)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 20; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */