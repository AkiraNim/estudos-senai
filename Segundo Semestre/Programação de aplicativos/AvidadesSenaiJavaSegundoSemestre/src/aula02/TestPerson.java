package aula02;

import java.util.Scanner;

public class TestPerson {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		int quit=5;
		
		while(quit==5 || quit==0) {
			System.out.println("Criando uma pessoa nova.\nDigite o nome da pessoa:");
			String name = new Scanner(System.in).next();
			System.out.println("Digite a idade de "+name);
			int age = new Scanner(System.in).nextInt();
			System.out.println("Digite o peso de "+name);
			double weight = new Scanner(System.in).nextDouble();
			System.out.println("Agora digite a altura de "+name);
			double height = new Scanner(System.in).nextDouble();
			
			Person person = new Person (name, age, height, weight);
			
			quit=5;
			
			while(quit!=0) {
				System.out.println("");
				System.out.println("Nome: "+person.getName()+"\nIdade: "+person.getAge()+"\nAltura: "+person.getHeight()+"\nPeso: "+person.getWeight());
				System.out.println("\nO que deseja fazer?\n1-Envelhecer.\n2-Engordar.\n3-Perder peso.\n4-Crescer.\n0-Criar outra pessoa\n6-Sair");
				quit = new Scanner(System.in).nextInt();
				
				switch(quit) {
					case 1:
						person.growOld();
						System.out.println("Envelheceu em 1 ano\n");
						break;
					case 2:
						System.out.println("Quantos quilos você vai engordar?");
						weight = new Scanner(System.in).nextDouble();
						person.gainWeight(weight);
						System.out.println("Engordou em "+weight+"kg.\n");
						break;
					case 3:
						System.out.println("Quantos quilos você vai perder?");
						weight = new Scanner(System.in).nextDouble();
						person.loseWeight(weight);
						System.out.println("Perdeu "+weight+"kg.\n");
						break;
					case 4:
						System.out.println("Quantos cm voce vai crescer");
						height = new Scanner(System.in).nextDouble();
						person.growUp(height);
						System.out.println("Cresceu em  "+height+"cm.\n");
						break;
					case 0:
						break;
				}
				
			}
		}
		
		
	}

}
