package estruturasDeRepeticao;

import java.util.Scanner;

public class Numeros {
	
	public static void main(String[] args) {
		
		int n = 0, s = 0;
		String resposta;
		Scanner teclado = new Scanner(System.in);
		
		
		do {
			System.out.println("Digite um numero: ");
			n = teclado.nextInt();
			s+=n;
			System.out.println("Quer continuar? ");
			resposta = teclado.next();
		}while(resposta.equals("s"));
		System.out.println("A soma de todos os valores é: "+s);
	}

}
