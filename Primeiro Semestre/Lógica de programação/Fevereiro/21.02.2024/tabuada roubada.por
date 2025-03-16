programa//tabuada roubada
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
	inteiro i=0,n
		escreva("Digite um numero: \n")
		leia(n)
		limpa()
		enquanto(i<=10){
			i++
			u.aguarde(500)escreva(n," * ",i," = ",i*n,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */