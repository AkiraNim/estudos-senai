programa //triangulos
{
	
	funcao inicio()
	{
	real base, altura, area
	
		escreva("Olá, bem vindo ao calculador de area de um triangulo. Para começar digite a base do triangulo (usando apenas numeros e pontos): ")
		leia(base)					
		escreva("\nAgora digite a altura (usando novamente apenas numeros e pontos): ")
		leia(altura)

		limpa()

		area=(base*altura)/2

		escreva("Base: ", base)
		escreva("\nAltura: ", altura)
		escreva("\nÁrea: ", base, " * ", altura, "/2 = ",area)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 22; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */