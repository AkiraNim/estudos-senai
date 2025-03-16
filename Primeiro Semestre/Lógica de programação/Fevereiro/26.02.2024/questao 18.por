programa
{
	
	funcao inicio()
	{
	inteiro cand1=0,cand2=0,cand3=0,cand4=0,voto=0,nulo=0,branco=0
		faca{
			escreva("### ELEICOES 2024 ###\n\n")
			escreva("1-Candidato 1\n")
			escreva("2-Candidato 2\n")
			escreva("3-Candidato 3\n")
			escreva("4-Candidato 4\n")
			escreva("5-NULO\n")
			escreva("6-BRANCO 1\n")
			escreva("7-ENCERRAR 1\n")
			
			escreva("Escolha uma opcão: \n")
			leia(voto)

			escolha(voto){
				caso 1:
				cand1++
				voto++
				pare
				caso 2:
				cand2++
				voto++
				pare
				caso 3:
				cand3++
				voto++
				pare
				caso 4:
				cand4++
				voto++
				pare
				caso 5:
				nulo++
				voto++
				pare
				caso 6:
				branco++
				voto++
				pare
				caso 7:
				escreva("Votacao encerrada!")
				limpa()
				pare
				caso contrario:
				escreva("Opcao invalida tente novamente\n")
				leia(voto)
				pare
			}
		}enquanto (voto!=7)
		escreva("Resultado final\n\n")
		escreva("Candidato 1: ",cand1," votos\n")
		escreva("Candidato 2: ",cand2," votos\n")
		escreva("Candidato 3: ",cand3," votos\n")
		escreva("Candidato 4: ",cand4," votos\n")
		escreva("Nulo: ",nulo," votos\n")
		escreva("Branco: ",branco," votos\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */