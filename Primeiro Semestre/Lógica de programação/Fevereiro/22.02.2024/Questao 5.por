programa//questao 5
{
	
	funcao inicio()
	{
		inteiro numero=0, media, memoria=0,soma=0
		faca{
			escreva(" Escreva um numero par: \n")
			leia(numero)
			
			se(numero%2==0 e numero!=0){
				soma++	
				
			}
			memoria=memoria+numero
			media=memoria/soma
		}enquanto(numero!=0)
			
			
			escreva(" a media aritmetica é: ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */