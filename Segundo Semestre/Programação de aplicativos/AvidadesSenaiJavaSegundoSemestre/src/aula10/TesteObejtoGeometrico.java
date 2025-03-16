package aula10;

import java.util.Scanner;

public class TesteObejtoGeometrico {
	public static void main(String[] args) {
		boolean sair = false;
		
		while(!sair) {
			System.out.println("\nEscolha uma opção:"
					+ "\n1- Criar Circulo."
					+ "\n2- Criar Retangulo."
					+ "\n3- Criar Triangulo"
					+ "\n4- Sair.");
			int option = new Scanner(System.in).nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Digite o tamanho do centro do triangulo.");
					double centro = new Scanner(System.in).nextDouble();
					
					Circulo circulo = new Circulo(centro);
					
					System.out.println("\nArea do Circulo: "+circulo.calcularArea()+"cm.");
					System.out.println("Perimetro do Circulo: "+circulo.calcularPerimetro()+"cm.");
					break;
				case 2:
					System.out.println("Digite a base do retangulo.");
					double base = new Scanner(System.in).nextDouble();
					
					System.out.println("Digite a altura do retangulo.");
					double altura = new Scanner(System.in).nextDouble();
					
					Retangulo retangulo = new Retangulo(base, altura);
					
					System.out.println("\nArea do Retangulo: "+retangulo.calcularArea()+"cm.");
					System.out.println("Perimetro do Retangulo: "+retangulo.calcularPerimetro()+"cm.");
					break;
				case 3:
					System.out.println("Digite o lado A do triangulo.");
					double ladoA = new Scanner(System.in).nextDouble();
					
					System.out.println("Digite o lado A do triangulo.");
					double ladoB = new Scanner(System.in).nextDouble();
					
					System.out.println("Digite o lado A do triangulo.");
					double ladoC = new Scanner(System.in).nextDouble();
					
					Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
					
					System.out.println("\nArea do Triangulo: "+triangulo.calcularArea()+"cm.");
					System.out.println("Perimetro do Triangulo: "+triangulo.calcularPerimetro()+"cm.");
					break;
				case 4:
					sair = true;
					break;
			}
		}
	}
}
