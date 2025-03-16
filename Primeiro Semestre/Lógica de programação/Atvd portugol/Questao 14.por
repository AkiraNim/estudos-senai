programa//questao 14
{
	
	funcao inicio()
	{
		inteiro numero, soma=0,neg=0,posi=0
	real media=0

		
		limpa()
		
		faca{
			escreva("\nDigite um numero par que nao seja 0: ")
			leia(numero)
			se(numero!=0){
				media++
				soma=soma+numero
			}
			se(numero<0 e numero!=0){
				neg++
			}
			senao se(numero>0 e numero!=0){
				posi++
			}
				
		}enquanto(numero!=0)
			media=soma/media
			escreva("A média aritmetica desses numeros é: ",media)
			escreva("\nForam escritos ",neg," numeros negativos.\nForam escritos ",posi," numeros positivos")
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 329; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */