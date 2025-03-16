programa//questao 3
{
	inclua biblioteca Util-->u
	funcao inicio()
	{
	inteiro a=0,num,neg=0
		para(a=0;a<5;a++){
			escreva(" DIGITE UM NUMERO: \n")
			leia(num)
			se(num<0){
				neg++
			}
		}
		limpa()
		escreva("Voce digitou ",neg," numeros negativos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */