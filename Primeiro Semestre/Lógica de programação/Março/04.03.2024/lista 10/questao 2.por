programa//questao 2
{
	
	funcao inicio()
	{
		inteiro numero[10],soma=0,cont
		para(cont=0;cont<10;cont++){
			se(cont==0){
			escreva("Digite um numero: ")
			leia(numero[cont])
			soma=soma+numero[cont]
			limpa()
			}
			senao{
			escreva("Digite outro numero: ")
			leia(numero[cont])
			soma=soma+numero[cont]
			limpa()
			}
			
		}
		escreva("A soma dos numeros é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {soma, 6, 21, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */