programa//questao 8
{	
	
	funcao inicio()
	{
 
	inteiro numero, soma=0,sair
		escreva("Escreva um numero impar que esteja entre 100 e 500 e seja divisel por 3,\nqualquer outro será descartado na hora da soma!  ")
		faca{
			
			leia(numero)
			se(numero%3==0 e numero>=100 e numero<=500){
				soma=soma+numero
			}senao se(numero%2==0 ou numero%3!=0){
				escreva("Opção invalida!")
			}
			escreva("\nDeseja sair ou digitar outro numero? \n1/Digitar outro numero\n0/Sair\n")
			leia(sair)
			se(sair==1){
				limpa()
				escreva("Escreva outro numero impar para somar com o anterior,\nlembre-se que o numero precisa ser impar, estar entre 100 e 500 e ser divisivel por 3: ")
			}
		}enquanto(sair==1)
		escreva("A soma dos numeros é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 20; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 7, 9, 6}-{soma, 7, 17, 4}-{sair, 7, 24, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */