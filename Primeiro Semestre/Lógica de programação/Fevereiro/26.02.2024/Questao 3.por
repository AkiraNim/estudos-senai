programa//questao 3
{
	
	funcao inicio()
	{
		inteiro a,neg=0,rep=0
		escreva("Digite um numero negativo ou positivo: \n")
		para(rep=rep;rep<5;rep++){
			leia(a)
			se(a<0){
				neg++
			}
		}
		escreva("Foram gerados ",neg," valores negativos")
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