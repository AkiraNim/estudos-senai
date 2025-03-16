programa//questao 20
{
	
	funcao inicio()
	{
		caracter sexo,sair='n'
		real salario=0.0,media=0.0
		inteiro idade,maior_idade=0,menor_idade=0,cont=1,homens_1000=0
		enquanto(sair=='n'ou sair=='N'){
			escreva("Bem vindo a pesquisa nada suspeita governamental, voce está cadastrando o usuario ",cont,"\n")
			escreva("\nPara começar, digite o sexo: ")
			leia(sexo)
			escreva("\nAgora diga a idade: ")
			leia(idade)
			escreva("\nPor fim diga o seu salario: R$")
			leia(salario)
			escreva("\nPronto cadastro realizado. Deseja sair?")
			leia(sair)
			limpa()
			se(idade>maior_idade){
				maior_idade=idade
			}
			se(maior_idade>idade){
				menor_idade=maior_idade
			}
			se(menor_idade>idade){
				menor_idade=idade
			}
			se(sexo=='m' ou sexo=='M' e salario<1001){
				homens_1000++
			}
			media=media+salario/cont
		}
		escreva("A media salarial é de: R$",media)
		escreva("\nA maior idade do grupo é de: ",maior_idade,"\nA menor idade do grupo é de: ",menor_idade)
		escreva("\nA quantidade de homens com salario até R$1000.00 é de: ",homens_1000)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 674; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {idade, 8, 10, 5}-{maior_idade, 8, 16, 11}-{menor_idade, 8, 30, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */