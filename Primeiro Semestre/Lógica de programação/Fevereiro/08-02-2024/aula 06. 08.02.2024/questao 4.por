programa//QUESTAO 4 
{
	
	funcao inicio()
	{
	real nota1,nota2
	
		escreva("Olá digite a primeira nota do aluno: ")
		leia(nota1)
		escreva("\nAgora digite a segunda nota do aluno: ")
		leia(nota2)
		
		limpa()
		
		se((nota1+nota2)/2>=5){
			escreva("Parabens ALUNO APROVADO!!")
		}
		senao{
			escreva("Te vejo ano passado :D")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */