programa
{
	funcao inteiro proximo_fibonacci(inteiro &a,inteiro &b){
		inteiro c
		c=a+b
		a=b
		b=c
		retorne c
	}
	funcao inicio()
	{
		inteiro c=0,t1,t2,t3
		t1=0
		escreva(t1,"\n")
		t2=1
		escreva(t2,"\n")
		
		para(c=2;c<=10;c++){
		t3=proximo_fibonacci(t1, t2)
		escreva(t3,"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {a, 3, 44, 1}-{b, 3, 55, 1}-{c, 4, 10, 1}-{c, 12, 10, 1}-{t1, 12, 14, 2}-{t2, 12, 17, 2}-{t3, 12, 20, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */