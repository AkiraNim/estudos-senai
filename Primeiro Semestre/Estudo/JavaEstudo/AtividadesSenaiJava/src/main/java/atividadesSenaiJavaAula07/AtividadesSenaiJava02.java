/*
 * Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
 * estado civil seja “CASADA”, solicitar o tempo de casada (anos).
*/
package atividadesSenaiJavaAula07;

import java.util.Scanner;

public class AtividadesSenaiJava02 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String name;
		char sex, maritalStatus;
		byte marriedTime;
		
		System.out.print("Digite seu nome: ");
		name=stdin.nextLine();
		System.out.print("Digite seu sexo: ");
		sex=stdin.next().charAt(0);
		System.out.print("Digite seu estado civil: ");
		maritalStatus=stdin.next().charAt(0);
		
		if(sex=='F' || sex=='f' && maritalStatus=='C' || maritalStatus=='c') {
			System.out.print("Digite quantos anos de casada voce tem: ");
			marriedTime=stdin.nextByte();
			System.out.println("Obrigado por ceder as informaçoes :)");
		}
		else System.out.println("Obrigado por ceder as informaçoes :)");
	}
}
