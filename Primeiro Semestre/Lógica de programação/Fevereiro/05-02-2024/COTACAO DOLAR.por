programa //cotação do dolar
{
	
	funcao inicio()
	{
	real dolar, real_br, cotacao_dolar
		escreva("Olá, bem vindo à plataforma de conversão de dolár para real. Para começar digite quantos dolares voce quer converter: ")
		leia(dolar)
		escreva("Certo, agora diga qual a cotação atual do dólar(utilize '. ponto' invés de virgulas): ")
		leia(cotacao_dolar)


		limpa()

		real_br=dolar*cotacao_dolar

		escreva("Seu valor em dólares: $", dolar)
		escreva("\nSeu valor em reais: R$", real_br)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */