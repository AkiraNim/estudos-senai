programa //media alunos
{
	
	funcao inicio()
	{
	cadeia nome
	real serie, idade, nota_1, nota_2, nota_3, nota_4, total, media
	
		escreva("Olá, bem vindo a plataforma de consulta das médias de alunos. Para começar digite o nome do aluno: ")
		leia(nome)
		escreva("Certo, agora digite sua idade usando apenas numeros: ")
		leia(idade)
		escreva("Certo, agora digite sua serie usando apenas numeros: ")
		leia(serie)
		escreva("Certo, agora digite sua nota total da primeira unidade utilizando numeros e pontos: ")
		leia(nota_1)
		escreva("Certo, agora digite sua nota total da segunda unidade utilizando numeros e pontos: ")
		leia(nota_2)
		escreva("Certo, agora digite sua nota total da terceira unidade utilizando numeros e pontos: ")
		leia(nota_3)
		escreva("Certo, agora digite sua nota total da quarta unidade utilizando numeros e pontos: ")
		leia(nota_4)

		limpa()

		total=(nota_1+nota_2+nota_3+nota_4)/4
		media=total*6

		se (media>24) {
			escreva("Aluno: ",nome)
			escreva("\nIdade: ",idade)
			escreva("\nSerie: ", serie)
			escreva("\nNota 1° unidade: ", nota_1)
			escreva("\nNota 2° unidade: ", nota_2)
			escreva("\nNota 3° unidade: ", nota_3)
			escreva("\nNota 4° unidade: ", nota_4)
			escreva("\nMédia do colégio: 6*4=24")
			escreva("\nMédia ano: ", media)
			escreva ("\nAluno APROVADO!! :D")
		}
		
		se (media<24) {
			escreva("Aluno: ",nome)
			escreva("\nIdade: ",idade)
			escreva("\nSerie: ", serie)
			escreva("\nNota 1° unidade: ", nota_1)
			escreva("\nNota 2° unidade: ", nota_2)
			escreva("\nNota 3° unidade: ", nota_3)
			escreva("\nNota 4° unidade: ", nota_4)
			escreva("\nMédia do colégio: 6*4=24")
			escreva("\nMédia ano: ", media)
			escreva ("\nAluno REPROVADO! :(")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1720; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */