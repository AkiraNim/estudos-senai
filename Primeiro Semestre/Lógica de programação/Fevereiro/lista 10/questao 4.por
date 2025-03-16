programa//questao 5
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
		para(a=0;a<5;a++){
			escreva(numero[a],"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6}-{a, 6, 20, 1}-{b, 6, 22, 1}-{aux, 6, 24, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */