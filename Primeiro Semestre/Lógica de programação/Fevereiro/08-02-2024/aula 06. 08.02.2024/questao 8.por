programa//questao 8
{
	
	funcao inicio()
	{
	real peso, altura, imc
		escreva("Olá, escreva seu peso: ")
		leia(peso)
		escreva("\nAgora escreva sua altura: ")
		leia(altura)

		limpa()

		imc=peso/(altura*altura)

		se(imc<20){
			escreva("Abaixo do peso")
		}
		senao se(imc>=20 e imc<=25){
			escreva("Peso normal")
		}
		senao se(imc>26 e imc<=30){
			escreva("Sobre peso")
		}
		senao se(imc >30 e imc<=40){
			escreva("Obeso")
		}
		senao{
			escreva("Obeso mórbido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */