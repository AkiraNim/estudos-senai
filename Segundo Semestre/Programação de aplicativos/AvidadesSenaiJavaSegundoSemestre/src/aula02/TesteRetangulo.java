package aula02;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		
		System.out.println("Digite a base do retangulo: ");
		int base = new Scanner(System.in).nextInt();
		System.out.println("Digite a altura do retangulo: ");
		int altura = new Scanner(System.in).nextInt();
		
		Retangulo retangulo1 = new Retangulo(base, altura);
		
		System.out.println("A base é: "+retangulo1.getBase());
		System.out.println("A altura é: "+retangulo1.getAltura());
		System.out.println("A area é: "+retangulo1.calcularArea());
		System.out.println("O perimetro é: "+retangulo1.calcularPerimetro());
		
		System.out.println("");
		System.out.println("Digite a nova base do retangulo: ");
		base = new Scanner(System.in).nextInt();
		System.out.println("Digite a nova altura do retangulo: ");
		altura = new Scanner(System.in).nextInt();
		
		retangulo1.setBase(base);
		retangulo1.setAltura(altura);
		
		System.out.println("A base é: "+retangulo1.getBase());
		System.out.println("A altura é: "+retangulo1.getAltura());
		System.out.println("A area é: "+retangulo1.calcularArea());
		System.out.println("O perimetro é: "+retangulo1.calcularPerimetro());
	}

}
