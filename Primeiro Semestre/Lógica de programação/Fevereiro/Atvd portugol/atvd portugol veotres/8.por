programa
{
	inteiro val[7]	
	inteiro i,tot_par=0
	funcao inicio()
	{
		para(i=1;i<7;i++){
			escreva("Digite o ",i,"° valor: ")
			leia(val[i])
			se(val[i]%2==0)
			tot_par=tot_par+1
		}
		escreva("O total de pares foi: ",tot_par,"\n")
		para(i=1;i<7;i++){
			se(val[i]%2==0)
			escreva("\nValor par na posicao ",i,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */