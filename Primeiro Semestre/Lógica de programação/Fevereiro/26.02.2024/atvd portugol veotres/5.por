programa
{
	funcao cadeia parimpar(inteiro v){
		se (v%2==0){
		retorne "par"
		}
		senao
		retorne "impar"
	}
	funcao inicio()
	{
		inteiro n
		cadeia r
		escreva("Digite um numero: ")
		leia(n)
		r=parimpar(n)
		escreva("o numero ",n, " é um valor ",r)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 92; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 3, 33, 1}-{n, 12, 10, 1}-{r, 13, 9, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */