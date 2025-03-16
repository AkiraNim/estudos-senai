programa
{
	
	funcao inicio()
	{
	inteiro vet[4]
	inteiro i,j,aux
		para(i=0;i<=3;i++){
			escreva("Digite um valor: ")
			leia(vet[i])
		}
		para(i=0;i<=3;i++){
			para(j=0;j<=3;j++){
				se(vet[i]<vet[j]){
				aux=vet[i]
				vet[i]=vet[j]
				vet[j]=aux	
				}
			}
		}
		para(i=0;i<=3;i++){
			escreva("(",vet[i],")")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */