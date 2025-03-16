programa//questao 17
{
	funcao inicio()
	{
		caracter sair='n'
		inteiro filhos=0,cont=1,n_filhos=0
		real salario=0.0,media_salario=0.0,media_filhos=0.0,maior_salario=0.0,percentual_1000=0.0
		enquanto (sair=='n'){
		escreva("Ola bem vindo a plataforma de cadastro dos habitantes.")
		escreva("\nPara começar digite o numero de filhos do habitante n°",cont,"\n")
		leia(filhos)
		escreva("\nAgora digite o salario que o habitante n°",cont," recebe.\n")
		leia(salario)
		n_filhos = n_filhos + filhos
		media_filhos = filhos / cont
		media_salario = (media_salario + salario) / cont
		se(maior_salario < salario){
			maior_salario = salario
		}
		se(salario < 1001){
			percentual_1000++
		}
		escreva("Deseja sair? sim/nao\n")
		leia(sair)
		se(sair!='n'){
			cont--
		}
		cont++
		limpa()
	}
		percentual_1000=(percentual_1000 / cont)*100
		escreva("Foram cadastrados ", cont ," habitantes no total")
		escreva("\nA media do salario da populacao é de R$", media_salario ," por pessoa.\n")
		escreva("\nA media de filhos da populacao é de ", media_filhos ," por pessoa.\n")
		escreva("\nO maior salario da populacao é de R$", maior_salario ,".\n")
		escreva("\nO percentual de pessoas com salario até R$1000,00 é de ", percentual_1000 ,"%.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media_salario, 7, 19, 13}-{percentual_1000, 7, 72, 15};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */