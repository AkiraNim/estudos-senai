//Faça um algoritmo que receba dois números e exiba o resultado da uma soma.

package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava00 {
	public static void main (String[] args) {
		Scanner stdin = new Scanner(System.in);
		int number1, number2, sum;
		
		System.out.print("Digite um numero: ");
		number1=stdin.nextInt();
		System.out.print("Digite outro numero: ");
		number2=stdin.nextInt();
		
		sum=number1+number2;
		
		System.out.println("A soma é: "+sum);
	}

}
