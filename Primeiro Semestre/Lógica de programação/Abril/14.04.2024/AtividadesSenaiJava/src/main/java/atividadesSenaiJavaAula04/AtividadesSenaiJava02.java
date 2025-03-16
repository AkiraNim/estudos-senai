package atividadesSenaiJavaAula04;

import java.util.Scanner;

public class AtividadesSenaiJava02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		int base, height, area;
		
		System.out.print("Digite a base do triângulo: ");
		base=stdin.nextInt();
		System.out.print("Digite a altura do triângulo: ");
		height=stdin.nextInt();
		area=(base*height)/2;
		System.out.println("A area do triângulo é: "+ area);
	}

}
