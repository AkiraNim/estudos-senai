programa//questao 10
{
	funcao real ope(real n1, real n2, caracter op){
			real resultado=0
			escolha(op){
				caso '+':
				resultado=n1+n2
				pare
				caso '-':
				resultado=n1-n2
				pare
				caso '*':
				resultado=n1*n2
				pare
				caso'/':
				resultado=n1/n2
				pare
			}
			retorne resultado
	}
	funcao inicio(){	
	caracter operacoes='.',sair='n'
	real n1=0,n2=0,n3=0,resultado=0
	inteiro sair1=0
		escreva("Digite o primeiro numero: ")
		leia(n1)
		escreva("Agora digite a operacao: \n+, - , * , / , \n")
		leia(operacoes)
		escreva("Agora digite o segundo numero: ")
		leia(n2)
		resultado=ope(n1,n2,operacoes)
		escreva("O resultado é: ",resultado)
		escreva("\nDeseja sair? \nS|N\n")
		leia(sair)
			enquanto(sair=='n'){
				se(sair1==5){
				escreva("\nDeseja sair? \nS|N\n")
				leia(sair)
				sair1=sair1-sair1
				}
				se(sair=='n'){
				escreva("\nDigite a operacao: ")
				leia(operacoes)
				escreva("\nAgora digite o numero: ")
				leia(n2)
				resultado=ope(resultado,n2,operacoes)
				escreva("\nO resultado é: ",resultado)
				sair1++
				}
			}
				escreva("Obrigado por utilizar a calculator!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */