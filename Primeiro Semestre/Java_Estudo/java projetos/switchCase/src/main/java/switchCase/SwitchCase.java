package switchCase;

import java.util.Scanner;


public class SwitchCase {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		int pernas;
		String tipo;
		System.out.print("Digite quantas pernas tem: ");
		pernas = stdin.nextInt();
		switch(pernas) {
			case 1:
				tipo="mono";
				break;
			case 2:
				tipo="bipede";
				break;
			case 3:
				tipo="cavalo de tres pernas";
				break;
			case 4:
				tipo="quadrupede";
				break;
			case 5:
				tipo="hello world";
				break;
			case 6:
				tipo="sirigueijo";
				break;
			default:
				tipo="bro?";
				break;
		}
		System.out.println("Isto é um "+tipo);
	}
}
