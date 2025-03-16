programa//banco imobiliario
{
	inclua biblioteca Util --> u
	
	inteiro op, saque, saldo, deposito
	funcao inicio()
	{
		escreva("### MENU ###\n\n")
		escreva("Escolha uma das opçoes abaixo: \n")
		escreva("1- Sacar \n")
		escreva("2- Saldo \n")
		escreva("3- Depositar \n")
		escreva("4- Sair \n\n")
		leia(op)
		

		limpa()
		
		saldo=u.sorteia(1, 10000)
	
		escolha(op) {
			caso 1:
				escreva("Quanto deseja sacar? R$")
				leia(saque)
				se(saque>saldo){
					escreva("Saldo insuficiente. Seu saldo é de R$",saldo," (pobre miseravel)")
				}senao{
					escreva("Saque de R$",saque," realizado com sucesso!")
				}
				pare
			caso 2:
				escreva("Seu Saldo é: R$",saldo)
				pare
			caso 3:
				escreva("Quanto deseja depositar? R$")
				leia(deposito)
				escreva("Seu deposito de R$",deposito," foi feito.")
				pare
			caso 4:
				escreva("Adeus :3")
				pare
			caso contrario:
				escreva("Opcao invalida.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 872; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {saldo, 5, 21, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */