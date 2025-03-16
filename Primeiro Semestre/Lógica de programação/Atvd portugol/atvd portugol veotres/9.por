programa
{
	cadeia nome[5]
	real n1[5],n2[5],media[5]
	real soma=0,turma
	inteiro c,total=0
	funcao inicio()
	{
		para(c=1;c<5;c++){
			escreva("\nAluno: ",c)
			escreva("\nNome: ")
			leia(nome[c])
			escreva("\nPrimeira nota: ")
			leia(n1[c])
			escreva("\nSegunda nota: ")
			leia(n2[c])
			media[c]=(n1[c]+n2[c]/2)
			soma=soma+media[c]
		}
		limpa()
		turma=soma/4
		escreva("\nListagem de alunos\n")
		para(c=1;c<5;c++){
			escreva("\nNome: ",nome[c], "\nMedia: ",media[c])
			se(media[c]>turma){
				total++
			}
		}
		escreva("\nAo todo temos ",total, " alunos acima da media da turma que foi ",turma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */