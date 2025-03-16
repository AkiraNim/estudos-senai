programa//questao 1
{
	
	funcao inicio()
	{
		cadeia nome[11]
		inteiro cont
		para(cont=1;cont<11;cont++){
			escreva("Digite o nome ",cont," ")
			leia(nome[cont])
		}
		limpa()
		para(cont=1;cont<11;cont++){
			escreva("nome ",cont,": ",nome[cont],"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 184; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */