package aulaEstruturasCondicionais;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		float n1;
		float n2;
		float m;
		System.out.print("Digite a primeira nota: ");
		n1=stdin.nextFloat();
		System.out.print("Digite a segunda nota: ");
		n2=stdin.nextFloat();
		m=(n1+n2)/2;
		System.out.println("Sua media é: "+m);
		if(m>8) System.out.println("Parabens voce está acima da media");
		
	}

}
