/*
 *Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
  que C.
 */

package atividadesSenaiJavaAula07;

import java.util.Scanner;

public class AtividadesSenaiJava01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int aValue, bValue, cValue;
		
		System.out.print("Digite um primeiro valor A: ");
		aValue=stdin.nextInt();
		System.out.print("Digite um segundo valor B: ");
		bValue=stdin.nextInt();
		System.out.print("Digite um terceiro valor C: ");
		cValue=stdin.nextInt();
		
		if(aValue+bValue>cValue)System.out.println("O valor A = "+aValue+" + o valor B = "+bValue+" é maior que o valor C = "+cValue);
		else System.out.println("O valor A = "+aValue+" + o valor B = "+bValue+" é menor que o valor C = "+cValue);
	}

}
