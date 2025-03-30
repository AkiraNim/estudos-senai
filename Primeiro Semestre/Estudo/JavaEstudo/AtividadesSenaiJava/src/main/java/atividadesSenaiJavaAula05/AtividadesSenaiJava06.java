/*
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se
 * que o preço de custo recebera um acréscimo de acordo com um percentual informado pelo usuário.
 */
package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava06 {
	public static void main(String[]args) {
		Scanner stdin = new Scanner(System.in);
		float costPrice, salePrice, taxe;
		
		System.out.print("Digite o valor do preço de custo do produto: ");
		costPrice=stdin.nextFloat();
		System.out.print("Digite qual a porcentagem a ser aplicada no produto para a venda: ");
		taxe=stdin.nextFloat();
		
		taxe=(taxe*costPrice)/100;
		salePrice=costPrice+taxe;
		
		System.out.println("O preço de venda será RS"+salePrice);
		
	}

}
