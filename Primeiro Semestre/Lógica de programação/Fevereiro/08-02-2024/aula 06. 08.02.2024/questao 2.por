programa//detector de casada QUESTAO 2 
{
	
	funcao inicio()
	{
	cadeia nome, tempo_de_casada
	inteiro sexo, estado_civil
	
	
		escreva("Olá, informe seu nome: \n ")
		leia(nome)
		escreva("\n Qual seu gênero?\n 1- Feminino\n 2- Masculino \n\n ")
		leia(sexo)
		escreva("\n Qual é seu estado civil?\n 1- Casado(a)\n 2- Solteiro(a) \n\n ")
		leia(estado_civil)

		limpa()

		se(sexo+estado_civil==2){
			escreva("Quanto tempo de casada? \n ")
			leia(tempo_de_casada)
			escreva("Nome: ",nome,"\nSexo: ",sexo,"\nEstado civil: ",estado_civil,"\nTempo de casada: ",tempo_de_casada)
		}
		senao{
			escreva("obrigado por informar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */