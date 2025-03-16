programa//questao 4
{
	
	funcao inicio()
	{
		inteiro numero[10],divisiveis[10],numero_pedido,b=0,cont
		para(cont=0;cont<10;cont++){
			escreva("Digite um numero: ")
			leia(numero[cont])	
			}
			escreva("Agora digite um numero para ver se alguns dos citados anteriormente é divisivel por ele: ")
			leia(numero_pedido)
		para(cont=0;cont<10;cont++){
			se(numero[cont]%numero_pedido==0){
			divisiveis[b]=numero[cont]
			b++
		}	
		}
		escreva("Os numeros divisiveis por ",numero_pedido," são: \n")
		para(cont=0;cont<b;cont++){
			escreva(divisiveis[cont],"\n")
		}
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6}-{divisiveis, 6, 21, 10}-{b, 6, 50, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */