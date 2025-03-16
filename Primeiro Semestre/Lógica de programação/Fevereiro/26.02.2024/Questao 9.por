programa//questao 9 
{
	
	funcao inicio()
	{
	inteiro numero,i,resultado=1
	
		escreva("Olá escreva o numero para a mostrar o fatorial: ")
		leia(numero)
		limpa()
		escreva("\nO resultado de ",numero,"! = ")
		para(i=numero;i>=2;i--){
		resultado*=i
		escreva(i," * ")
		se(i==2){
			escreva("1"," = ",resultado)
		}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */