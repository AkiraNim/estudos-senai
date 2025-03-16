programa//questao 1
{
	
	funcao inicio()
	{
		inteiro maior=0,cont=0
		inteiro numero[8]
		para(inteiro a=0;a<8;a++){
			escreva("Digite um numero: ")
			leia(numero[a])
			se(maior<numero[a]){
				maior=numero[a]
			}
			para(inteiro b=0;b<8;b++){
				se(numero[b]<maior){
					cont=numero[b]
				}
		}		
			}
			escreva("MAIOR VALOR: ", maior) 
    			escreva("\nPOSIÇÃO DO MAIOR VALOR: ", cont) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 73; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 7, 10, 6}-{a, 8, 15, 1}-{b, 14, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */