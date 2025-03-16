programa//QUESTAO 13
{
	real altura[16]
	inteiro c=0
	
	funcao altura1(){
		escreva("Digite um valor para a altura do ",c,"° membro do grupo.\n")
		leia(altura[c])
		limpa()
	}
	funcao inicio()
	{
		real maior=0.0, menor=0.0
		para(c=1;c<=1;c++){
			altura1()
			maior=maior+altura[c]
		}
		para(c=2;c<=2;c++){
			altura1()
			se(altura[c]>maior){
				menor=maior
				maior=altura[c]
		}
		}
		para(c=3;c<=15;c++){
			altura1()
			se(altura[c]>maior){
				maior=altura[c]
			}
			se(menor>maior){
				menor=maior
			}
			se(altura[c]<menor){
				menor=altura[c]
			}
		}
		escreva("A menor altura do grupo foi: ",menor,"\nA maior altura do grupo foi: ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 574; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {altura, 3, 6, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */