programa
{
	
	funcao inicio()
	{
inteiro funcionario
real salario_cleiton,salario_maria,salario_joana,salario_jorge, salario_minimo,qtd_salarios

	
	
		escreva("\nOlá, seja bem vindo a plataforma de consulta de funcionarios! Para começar digite o número correspondente ao funcionario deseja consultar que está listado abaixo: ")
		escreva("\n1- Cleiton Silva")
		escreva("\n2- Maria Santos")
		escreva("\n3- Joana Bastos")
		escreva("\n4- Jorge Almeida\n")
			leia(funcionario)
		escreva("\nDigite a opção:  ")
	
	
	limpa()

	salario_cleiton=1700
	salario_maria=2100
	salario_joana=1500
	salario_jorge=1500
	salario_minimo=1412

	
	se(funcionario==1){
	qtd_salarios=salario_cleiton/salario_minimo
	escreva("\nNome: Cleiton Silva")
	escreva("\nCargo: Vendedor")
	escreva("\nSálario: ",salario_cleiton)
	escreva("\nO salário Mínimo é igual a: R$",salario_minimo)
	escreva("\nQuantidade de salarios mínimos: ",qtd_salarios)
	}
	se(funcionario==2){
	qtd_salarios=salario_maria/salario_minimo
	escreva("\nNome: Maria Santos")
	escreva("\nCargo: Acessora de Rh")
	escreva("\nSálario: ",salario_maria)
	escreva("\nO salário Mínimo é igual a: R$",salario_minimo)
	escreva("\nQuantidade de salarios mínimos: ",qtd_salarios)
	}
	se(funcionario==3){
	qtd_salarios=salario_joana/salario_minimo
	escreva("\nNome: Joana Bastos")
	escreva("\nCargo: Almoxarifado")
	escreva("\nSálario: ",salario_joana)
	escreva("\nO salário Mínimo é igual a: R$",salario_minimo)
	escreva("\nQuantidade de salarios mínimos: ",qtd_salarios)
	}
	se(funcionario==4){
	qtd_salarios=salario_maria/salario_minimo
	escreva("\nNome: Jorge Almeida")
	escreva("\nCargo: Almoxarifado")
	escreva("\nSálario: ",salario_jorge)
	escreva("\nO salário Mínimo é igual a: R$",salario_minimo)
	escreva("\nQuantidade de salarios mínimos: ",qtd_salarios)
	}
	escreva("\n")
	escreva("\nObrigado por utilizar nossa plataforma:)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1877; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */