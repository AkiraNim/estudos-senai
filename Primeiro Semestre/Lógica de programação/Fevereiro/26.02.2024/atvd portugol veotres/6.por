programa
{
	funcao inteiro fator(inteiro v){
		inteiro cont=1, r=1
		para(cont=cont;cont<=v;cont++){
			r=r*cont
		}
		retorne r
	}
	funcao inicio()
	{
		inteiro n, f
		escreva("digite um numero: ")
		leia(n)
		f=fator(n)
		escreva("\n o valor de ",n,"! é igual a ",f)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 3, 31, 1}-{cont, 4, 10, 4}-{r, 4, 18, 1}-{n, 12, 10, 1}-{f, 12, 13, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */