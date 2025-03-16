programa
{
	
	funcao inicio()
	{
	inteiro numero=1,par=0,impar=0,media_par=0,media_geral=0,cont=0,cont_par=0
		enquanto(numero!=0){
			escreva("Digite um numero: ")
			leia(numero)
			se(numero%2==0 e numero!=0){
				par++
				cont_par++
			}
			senao{
				impar++
			}
			cont++
		}
		media_geral=par+impar/cont
		media_par=par/cont_par
		escreva("\nO total de numeros pares foi: ",par)
		escreva("\nO total de numeros impares foi: ",impar)
		escreva("\nA media geral dos numeros foi: ", media_geral)
		escreva("\nA media dos numeros pares foi: ", media_par)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */