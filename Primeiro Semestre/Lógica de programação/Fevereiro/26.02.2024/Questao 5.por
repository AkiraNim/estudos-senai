programa//questao 5
{
	
	funcao inicio()
	{
	inteiro numero, soma=0
	real media=0

		
		limpa()
		
		faca{
			escreva("\nDigite um numero par que nao seja 0: ")
			leia(numero)
			se(numero%2==0 e numero!=0){
				media++
				soma=soma+numero
			}
				
		}enquanto(numero!=0)
			media=soma/media
			escreva("A média aritmetica desses numeros é: ",media)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 9, 6}-{soma, 6, 17, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */