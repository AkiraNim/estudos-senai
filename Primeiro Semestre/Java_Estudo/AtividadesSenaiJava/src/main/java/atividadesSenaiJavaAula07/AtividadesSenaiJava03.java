/*
 * Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se
 * somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se
 * atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
*/

package atividadesSenaiJavaAula07;

import java.util.Scanner;

public class AtividadesSenaiJava03 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int aValue, bValue, cValue;
		
		System.out.print("Digite um numero: ");
		aValue=stdin.nextInt();
		System.out.print("Digite outro numero: ");
		bValue=stdin.nextInt();
		
		if(aValue==bValue) {
			cValue=aValue+bValue;
			System.out.println("A soma de "+aValue+" + "+bValue+" = "+cValue);
		}
		else {
			cValue=aValue*bValue;
			System.out.println("A multiplicacao de "+aValue+" * "+bValue+" = "+cValue);
		}
	}

}
