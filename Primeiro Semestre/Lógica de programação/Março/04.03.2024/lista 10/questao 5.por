programa//questao 6
{
	
	funcao inicio()
	{
	inteiro numero[10],cont,multi=1,soma=0
		para(cont=0;cont<10;cont++){
			escreva("Digite um numero: ")
			leia(numero[cont])
			se(numero[cont]%2==0){
				multi=multi*numero[cont]
			}
			senao{
				soma=soma+numero[cont]
			}
		}
		escreva("A multiplicacao dos numeros pares é ",multi)
		escreva("\nA soma dos numeros impares é ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 9, 6}-{multi, 6, 25, 5}-{soma, 6, 33, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */