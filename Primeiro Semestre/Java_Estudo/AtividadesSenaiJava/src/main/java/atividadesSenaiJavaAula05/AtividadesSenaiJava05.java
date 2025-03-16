/*
 * A Loja Mamão com Açucar está vendendo seus produtos em 5 (cinco) prestações sem juros.
   Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações.
 */

package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava05 {
	public static void main(String[]args) {
		Scanner stdin = new Scanner(System.in);
		int portion;
		float installment;
		
		System.out.println("Digite o preço do produto: ");
		installment=stdin.nextFloat();
		System.out.println("Para quantas parcelas voce quer? ");
		portion=stdin.nextInt();
		
		installment=installment/portion;
		
		System.out.println("Voce ira pagar "+portion+" parcelas de R$"+installment);
	}

}
