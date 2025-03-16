programa//questao 1
{	
	inclua biblioteca Matematica-->m
	inclua biblioteca Util --> u
	funcao inicio()
	{
	real chico=1.50, juca=1.10
	inteiro anos=0
		escreva("Olá seu anão, vamos ver em quanto tempo voce alcanca o Chico >:) \n")

		enquanto (juca<chico) {
			u.aguarde(1)escreva("\n Chico: \n",chico,"  "," Juca: ", juca)
			chico+=0.02
			juca+=0.03
			
			anos++ 
		}	
			limpa()
		escreva("Juca: ",m.arredondar(juca, 2))
		escreva("\nChico: ",m.arredondar(chico, 2))
		escreva("\n Levou ",anos," anos pra voce alcancar ele")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */