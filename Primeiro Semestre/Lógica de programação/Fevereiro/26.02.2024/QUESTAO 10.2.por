programa//questao 10
{
	inclua biblioteca Texto-->t
	funcao inteiro operacoes(inteiro x, inteiro y, caracter operacao){
		inteiro resultado=0
		escolha(operacao){
			caso '+':
			resultado=x+y
			pare
			caso '-':
			resultado=x-y
			pare
			caso '*':
			resultado=x*y
			pare
			caso '/':
			resultado=x/y
			pare
			caso '=':
			resultado=x+x
			pare
			caso contrario:
			escreva("Caracter incorreto, escreva novamente!")
			pare
		}
		retorne resultado
	}
	funcao inicio()
	{
		caracter op,sair='n'
		inteiro n1,n2,result,sair1=0
		escreva("### OLA BEM VINDO A CALCULADORA QUE CALCULA E ACUMULA RESULTADOS ###")
		escreva("\nPara começar digite o primeiro valor: ")
		leia(n1)
		escreva("\nO que voce deseja fazer com os valores? \nSomar = +\nSubtrair = -\nMultiplicar = *\nDividir = /\n")
		leia(op)
		escreva("\nAgora digite o segundo valor: ")
		leia(n2)
		result=operacoes(n1,n2,op)
		escreva("\nO resultado de ",n1," ",op," ",n2," = ",result)
		escreva("\nDeseja sair? Sim/Nao\n")
		leia(sair)
		enquanto(sair=='n' ou sair=='N'){
			escreva("\nDigite o proximo valor: ")
			leia(n1)
			escreva("\nAgora escreva a operacao: \n+\n-\n*\n/\n")
			leia(op)
			n2=result
			result=operacoes(result,n1,op)
			escreva("\nO resultado de ",n2,"  ",op,"  ",n1," = ",result)
			sair1++
			se(sair1==5){
				escreva("Desja sair? Sim/Nao\n")
				leia(sair1)
				sair1=sair1-sair1
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */