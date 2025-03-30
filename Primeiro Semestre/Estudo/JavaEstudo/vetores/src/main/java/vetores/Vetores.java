package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		
		/*int n[] = new int [4];*/
		
		int n [] = {3,2,7,8,5,9,0};
		
		Arrays.sort(n);/*Colocar vetor em ordem*/
		int a = Arrays.binarySearch(n, 9);
		/*System.out.println("Total de casas de N: " + n.length);*/
		System.out.println("Encontrei o valor na posicao " + a);
		
		for(int i = 0; i<n.length; i++) {
			/*n[i]=i;*/
			
			System.out.println("Na posição "+i + " temos o numero "+n[i]);
		
		}
			
		
	}

}
