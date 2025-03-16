programa//questao 19
{
	
	funcao inicio()
	{
		caracter sexo,sair='f',cor_olho,cor_cabelo
		inteiro idade,cont=1,qt_especifica=0,mais_velho=0
		enquanto(sair=='f'){
			escreva("Olá bem vindo a pesquisa de cidadaos, voce esta cadastrando o cidadao ",cont)
			escreva("\nPara começar, digite o sexo do cidadao ",cont,"\n")
			leia(sexo)
			escreva("\nAgora diga a cor de seus olhos baseando-se nas opcoes abaixo: \nAzuis\nVerdes\nCastanhos\n")
			leia(cor_olho)
			escreva("\nAgora diga a cor de seus cabelos baseando-se nas opcoes abaixo: \nLouros\nCastanhos\nPretos\n")
			leia(cor_cabelo)
			escreva("\nPara finalizar a pesquisa do cidadao ",cont," digite a idade.\n")
			leia(idade)
			escreva("\nPronto cadastro finalizado! Para sair digite 's',para fazer a pesquisa de outro cidadao digite 'f'\n")
			leia(sair)
			cont++
			limpa()
			se(idade>mais_velho){
				mais_velho=idade
			}
			se(idade>=18 e idade<=35 e cor_olho=='v' ou cor_olho=='V' e cor_cabelo=='l' ou  cor_cabelo=='L' e sexo=='f' ou sexo=='F'){
			qt_especifica++	
			}			
		}
		escreva("A maior idade entre os habitantes é de ",mais_velho," anos.\n")
		escreva("A quantidade de mulheres com idade entre 18 e 35 com olhos verdes e cabelos louros é de ",qt_especifica," mulheres.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 21; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */