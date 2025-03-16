/*
 * Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a
distância Total percorrida pelo automóvel e o total de combustível gasto.
*/
package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		float liters, quilometers, total;
		
		System.out.print("Digite quanto combustivel seu automóvel gastou: ");
		liters=stdin.nextFloat();
		System.out.print("Agora digite quantos quilometros ele fez com essa quantidade: ");
		quilometers=stdin.nextFloat();
		
		total=quilometers/liters;
		
		System.out.print("Seu carro faz "+total+"km por litro.");
	}

}
