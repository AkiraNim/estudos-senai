programa
{
		inteiro i=0
		cadeia n, pesado="0"
		real p, mai=0
	funcao topo(){
		limpa()
		escreva("-------------------\n")
		escreva("D E T E C T O R  DE  P E S A D O\n")
		escreva("O mais pesado ate agora foi ",pesado," com ",mai,"kg")
		escreva("\n-------------------\n")
	}
	funcao inicio()
	{
		

		topo()
		para(i=i;i<5;i++){
		escreva("Digite o nome: \n")
		leia(n)
		escreva("Digite o peso: \n")
		leia(p)
		se(p>mai){
			mai=p
			pesado=n
		}
			topo()
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */