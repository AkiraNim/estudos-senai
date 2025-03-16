/*Faça algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
* mês.
— Considere fixo o juro da poupança em 0,70% a. m.*/

package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava04 {
	public static void main(String[]args) {
		Scanner stdin = new Scanner(System.in);
		
		float value, income;
		
		System.out.println("Digite o valor a ser depositado: ");
		value=stdin.nextFloat();
		
		income = (float) (value * 0.07)+value;
		
		System.out.println("Voce investiu "+value+" e retirou "+income);
	}

}
