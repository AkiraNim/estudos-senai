/*Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, a
multiplicação e a divisão dos números lidos.
*/
package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int number1, number2, sum, subtraction, multiplication, division;
		
		System.out.print("Digite um numero: ");
		number1=stdin.nextInt();
		System.out.print("Digite outro numero: ");
		number2=stdin.nextInt();
		
		sum=number1+number2;
		subtraction=number1-number2;
		multiplication=number1*number2;
		division=number1/number2;
		
		System.out.println("A soma é: "+sum);
		System.out.println("A subtração é: "+subtraction);
		System.out.println("A multiplicação é: "+multiplication);
		System.out.println("A divisão é: "+division);
	}

}
