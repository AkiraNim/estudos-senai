programa//questao 10
{
	
	funcao inicio()
	{
	caracter operacoes,sair='n'
	real numero1,numero2, acumulo1=0,acumulo2=0
		escreva("Olá bem vindo a calculadora, para começar digite um numero: ")
		leia(numero1)
		escreva("Agora escolha um destes sinais para continuar: \n+ Soma\n- Subtracao\n* Multiplicacao\n/ Divisao\n")
		faca{
			leia(operacoes)
			se(operacoes=='+'){
				escreva("Agora escreva um numero para somar com este: ")
				leia(numero2)
				acumulo1=acumulo1+numero1+numero2
				escreva("A soma destes numeros é: ",acumulo1,"\nDigite + para somar mais\nDigite s para sair. ")
				leia(operacoes)
				limpa()
				escreva("Escreva outro numero para somar com os anteriores: ")
				enquanto(operacoes=='+'){
					leia(numero1)
					acumulo2=numero1+acumulo1
					escreva("A soma destes numero é: ",acumulo2,"\nDigite + para somar mais\nDigite s para sair. ")
					leia(operacoes)
					limpa()
					escreva("Escreva outro numero para somar com os anteriores: ")
					se(operacoes=='+' ou operacoes=='s'){
						acumulo1=acumulo2
					}
				}
			}
			senao se(operacoes=='-' ou operacoes=='s'){
				escreva("Agora escreva um numero para subtrair com este: ")
				leia(numero2)
				acumulo1=acumulo1+numero1-numero2
				escreva("A subtracao destes numeros é: ",acumulo1,"\nDigite - para subtrair mais\nDigite s para sair. ")
				leia(operacoes)
				limpa()
				escreva("Escreva outro numero para subtrair com os anteriores: ")
				enquanto(operacoes=='-'){
					leia(numero1)
					acumulo2=acumulo1-numero1
					escreva("A subtracao destes numero é: ",acumulo2,"\nDigite - para subtrair mais\nDigite s para sair. ")
					leia(operacoes)
					limpa()
					escreva("Escreva outro numero para subtrair com os anteriores: ")
					se(operacoes=='-'){
						acumulo1=acumulo2
					}
				}
			}
			senao se(operacoes=='*' ou operacoes=='s'){
				escreva("Agora escreva um numero para multiplicar com este: ")
				leia(numero2)
				acumulo1=acumulo1+numero1*numero2
				escreva("A multiplicacao destes numeros é: ",acumulo1,"\nDigite * para multiplicar mais\nDigite s para sair. ")
				leia(operacoes)
				limpa()
				escreva("Escreva outro numero para multiplicar com os anteriores: ")
				enquanto(operacoes=='*'){
					leia(numero1)
					acumulo2=acumulo1*numero1
					escreva("A multiplicacao destes numero é: ",acumulo2,"\nDigite * para multiplicar mais\nDigite s para sair. ")
					leia(operacoes)
					limpa()
					escreva("Escreva outro numero para subtrair com os anteriores: ")
					se(operacoes=='*'){
						acumulo1=acumulo2
					}
				}
			}
				senao{
				escreva("Agora escreva um numero para multiplicar com este: ")
				leia(numero2)
				acumulo1=acumulo1+numero1/numero2
				escreva("A multiplicacao destes numeros é: ",acumulo1,"\nDigite / para dividir mais\nDigite s para sair. ")
				leia(operacoes)
				limpa()
				escreva("Escreva outro numero para dividir com os anteriores: ")
				enquanto(operacoes=='/'){
					leia(numero1)
					acumulo2=acumulo1/numero1
					escreva("A divisao destes numero é: ",acumulo2,"\nDigite / para dividir mais\nDigite s para sair. ")
					leia(operacoes)
					limpa()
					escreva("Escreva outro numero para dividir com os anteriores: ")
					se(operacoes=='/'){
						acumulo1=acumulo2
					}
				}
			}		
			limpa()
			escreva("Deseja sair? S/N: ")
				leia(sair)
		}enquanto(sair=='n')
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero1, 7, 6, 7}-{acumulo1, 7, 23, 8}-{acumulo2, 7, 34, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */