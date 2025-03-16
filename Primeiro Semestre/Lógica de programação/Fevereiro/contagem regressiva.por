programa//contagem regressiva
{
	inclua biblioteca Util
	inteiro contador
	funcao inicio()
	{
		escreva("-Quanto tempo de vida eu tenho Dr?\n")
		Util.aguarde(1000)escreva("-10\n")
		Util.aguarde(1000)escreva("-10 o que Dr? 10 anos? Que Maravilha\n")
		Util.aguarde(1000)escreva("(Dr olha pro relógio lentamente e diz)\n")	
		
		contador=9
			
		faca{ escreva(contador,". ")			
			Util.aguarde(1500)contador=contador-1
		}enquanto(contador>=0)
		Util.aguarde(1500)escreva("\nEra zoeira Carlos, você tem mais 50 anos de vida :)\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 536; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {contador, 4, 10, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */