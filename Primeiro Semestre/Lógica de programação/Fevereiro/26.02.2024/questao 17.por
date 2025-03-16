programa
{
	real salario[12]
	inteiro filhos[12]
	inteiro c=1
	funcao salario_filho(){
		escreva("Cidadao ",c)
		escreva("\nDigite o numero de filhos que voce tem: ")
		leia(filhos[c])
		escreva("Agora digite seu salario: ")
		leia(salario[c])
		limpa()
	}
	funcao inicio()
	{	
		inteiro media_filho,pessoas_1000=0,soma_filhos=0
		real maior_salario,media_salario,percentual=0,soma_salario=0

		escreva("Cidadao ",c)
		escreva("\nDigite o numero de filhos que voce tem: ")
		leia(filhos[c])
		escreva("Agora digite seu salario: ")
		leia(salario[c])
		maior_salario=salario[c]
		se(salario[c]<=1001.00){
				pessoas_1000++
			}
			soma_filhos=soma_filhos+filhos[c]
			soma_salario=soma_salario+salario[c]
		
		para(c=2;c<=10;c++){
			salario_filho()
			se(maior_salario<salario[c]){
				maior_salario=salario[c]
			}
			se(salario[c]<=1001.00){
				pessoas_1000++
			}
			soma_filhos=soma_filhos+filhos[c]
			soma_salario=soma_salario+salario[c]
		}
		percentual=pessoas_1000*10
		media_filho=soma_filhos/10
		media_salario=soma_salario/10
		escreva("A media de filhos da populacao é de ",media_filho," filhos por pessoa.")
		escreva("\nA media salario da populacao é de R$",media_salario," por pessoa")
		escreva("\nO maior salario entre a populacao é de R$",maior_salario)
		escreva("\nO Percentual de pessoas com salario até R$1000.00 é ",percentual,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1044; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {filhos, 4, 9, 6}-{c, 5, 9, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */