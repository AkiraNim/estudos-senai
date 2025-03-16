programa//questao 13
{
	cadeia nome,nome_maior,nome_menor
	real altura=0.0, maior=0.0,menor=0.0
	inteiro cont=1
	funcao nome_altura(){
		escreva("\nDigite o nome do ",cont," ° membro do grupo.\n")
		leia(nome)
		escreva("\nDigite a altura do ",cont," ° membro do grupo.\n")
		leia(altura)
		limpa()
	}
	funcao inicio()
	{
			nome_altura()
		maior=altura
		menor=altura
		nome_maior=nome
		nome_menor=nome
		para(cont=2;cont<6;cont++){
			nome_altura()
			se(altura>maior){
				maior=altura
				nome_maior=nome
			}
			senao se(menor>altura){
				menor=altura
				nome_menor=nome
			}
			limpa()
		}
		escreva("A maior altura do grupo foi de ",nome_maior," com ",maior," m\n")
		escreva("A menor altura do grupo foi de ",nome_menor," com ",menor," m")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */