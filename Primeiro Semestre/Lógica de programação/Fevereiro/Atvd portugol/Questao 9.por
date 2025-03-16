programa//questao 9 
{
	
	funcao inicio()
	{
	inteiro numero, fatorial=1,memoria=0
		escreva("Olá escreva o numero para a mostrar o fatorial: ")
		leia(numero)
		
		enquanto(numero>0){
			 fatorial=fatorial*numero
			 numero--
			 memoria++
		}
			escreva("O fatorial de ",memoria," é: ",fatorial)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 9, 6}-{fatorial, 6, 17, 8}-{memoria, 6, 28, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */