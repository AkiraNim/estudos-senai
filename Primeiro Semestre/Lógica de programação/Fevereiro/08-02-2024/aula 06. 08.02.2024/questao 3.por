programa//multiplicacao ou soma QUESTAO 3 
{
	
	funcao inicio()
	{
	inteiro a,b,c
	
		escreva("Olá escreva um numero: ")
		leia(a)
		escreva("\nEscreva outro numero: ")
		leia(b)

		limpa()

		se(a==b){
			c=a+b
			escreva("Seu resultado é: ",a," + ",b," = ",c)
		}
		senao{
			c=a*b
			escreva("Seu resultado é: ",a," * ",b," = ",c)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 43; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */