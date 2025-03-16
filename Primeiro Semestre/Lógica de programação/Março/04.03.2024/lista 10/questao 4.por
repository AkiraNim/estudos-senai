programa//questao 5
{
	
	funcao inicio()
	{
		inteiro numero[5],a,b,aux
		para(a=0;a<5;a++){
			escreva("Digite um numero: ")
				leia(numero[a])
		}
		para(a=0;a<5;a++){
			para(b=0;b<5;b++){
				se(numero[a]<numero[b]){
					aux=numero[a]
					numero[a]=numero[b]
					numero[b]=aux
				}
			}
		}
		escreva("A ordem crescente é: ")
		para(a=0;a<5;a++){
			escreva(numero[a],", ")
		}
		para(a=0;a<5;a++){
			para(b=0;b<5;b++){
				se(numero[a]>numero[b]){
					aux=numero[a]
					numero[a]=numero[b]
					numero[b]=aux
				}
			}
		}
		escreva("\nO inverso da ordem é: ")
		para(a=0;a<5;a++){
			escreva(numero[a],", ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */