programa //Salario comissao
{
	
	funcao inicio()
	{
			cadeia nome, cargo
			real salario_fixo, taxa_comissao, comissao, vendas, total

		escreva("Olá, bem vindo a plataforma de consulta para funcionarios, para começar digite seu nome: ")
		leia(nome)
		escreva("\nCerto, agora digite seu cargo: ")
		leia(cargo)
		escreva("\nAgora digite seu salário (apenas número): ")
		leia(salario_fixo)
		escreva("\nCerto, agora informe o valor total de suas vendas(apenas números): ")
		leia(vendas)
		escreva("\nÓtimo, agora informe sua comissão de acordo com a porcentagem que seu gerente informou: \n")
		leia(taxa_comissao)

			limpa()

			comissao = (vendas*taxa_comissao)/100
			total=comissao+salario_fixo

		escreva("Tudo pronto!!")
		escreva("\nNome: ", nome)
		escreva("\nCargo: ", cargo)
		escreva("\nSalário fixo: R$", salario_fixo)
		escreva("\nTotal de Vendas: R$", vendas)
		escreva("\nSua comissão: ", taxa_comissao,"%")
		escreva("\nTotal de Salário: $",salario_fixo," + R$", comissao, " = R$", total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 28; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */