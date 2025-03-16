programa//questao 2
{
	funcao inicio()
	{
		real media[5]
		real nota,acumulo=0
		inteiro cont,cont2
		para(cont=0;cont<5;cont++){
			cont2=1
			limpa()
			escreva("Digite a nota do aluno ",cont+1)
			enquanto(cont2!=0){
				escreva("\nDigite a nota ",cont+1," ")
				leia(nota)
				acumulo=nota+acumulo
				media[cont]=acumulo/4
				cont2++				
				se(cont2==5){
					cont2=0
					acumulo=0
				}
			}
		}
		para(cont=0;cont<5;cont++){
				
				se(media[cont]<5){
					escreva("A media do aluno n° ",cont+1," foi: ",media[cont],"\nALUNO REPROVADO (BURRO!)\n")
				}
				senao{
					escreva("A media do aluno n° ",cont+1," foi: ",media[cont],"\nALUNO APROVADO (NAO FEZ MAIS QUE A OBRIGACAO)\n")
				}
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 61; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media, 5, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */