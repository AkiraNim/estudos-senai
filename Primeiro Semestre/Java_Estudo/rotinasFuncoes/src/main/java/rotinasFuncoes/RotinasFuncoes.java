package rotinasFuncoes;

import java.util.Scanner;

public class RotinasFuncoes {
	
	static int soma(int a, int b) {
		int s = a+b;
		/*System.out.println("A soma é "+ s+".");*/
		return s;
	}
	
	public static void main(String[] args) {
		int sum;
		System.out.printf("Começou o programa.\n\n");
		/*soma(5,2);*/
		sum=soma(5,2);
		System.out.println("A soma é "+ sum+".");
	}

}
