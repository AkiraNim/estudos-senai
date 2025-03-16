programa
{
	
	funcao inicio()
	{
	inteiro a,b,c
		escreva("Olá, digite um numero: ")
		leia(a)
		escreva("\nDigite outro numero: ")
		leia(b)
		escreva("\nDigite outro numero: ")
		leia(c)
		
		limpa()
		
		se(a>b e a>c){
			se(b>c) escreva("\n",c,"\n",b,"\n",a)
			senao escreva("\n",b,"\n",c,"\n",a)
		}
		senao se (b>a e b>c){
			se(a>c) escreva("\n",c,"\n",a,"\n",b)
			senao escreva("\n",a,"\n",c,"\n",b)
		}
		senao se(c>b e c>a)
		se(a>b) escreva("\n",b,"\n",a,"\n",c)
		senao escreva("\n",a,"\n",b,"\n",c)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */