programa
{
	
	funcao inicio()
	{
	inteiro numero
		escreva("Olá, escreva o numero que voce quer mostrar a tabuada: ")
		leia(numero)

		limpa()
		escreva("Tabuada de ",numero,"\n")
		para(inteiro i=1;i<=10;i++){
			escreva(numero," * ",i," = ",numero*i,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */