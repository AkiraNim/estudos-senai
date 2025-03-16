package aulaEstruturasCondicionais;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int nascimento;
		int i;
		
		System.out.print("Digite sua data de nascimento: ");
		nascimento = stdin.nextInt();
		i=2024-nascimento;
		System.out.println("Sua idade é: "+i);
		if(i>18) System.out.println("Maior de idade");
		else System.out.println("Menor de idade");
	}

}
