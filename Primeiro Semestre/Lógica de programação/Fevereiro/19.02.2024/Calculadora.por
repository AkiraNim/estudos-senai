programa//calculadora 
{
	inteiro a,b,c
	caracter op
	funcao inicio()
	{
		escreva("Olá, digite um numero: ")
		leia(a)
		escreva("Agora digite outro numero: ")
		leia(b)
		escreva("Agora, este numero irá:\n + (somar)\n - (subtrair)\n * (multiplicar)\n / (dividir)\n ? Use somente os sinais!")
		leia(op)
		
		limpa()
		
		escolha(op){
			caso '+':
				c=a+b
				escreva(a," + ",b," = ",c)
			pare
			
			caso '-':
				c=a-b
				escreva(a," - ",b," = ",c)
			pare
			
			caso '*':
				c=a*b
				escreva(a," * ",b," = ",c)
			pare
			
			caso '/':
				c=a/b
				escreva(a," / ",b," = ",c)
			pare
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */