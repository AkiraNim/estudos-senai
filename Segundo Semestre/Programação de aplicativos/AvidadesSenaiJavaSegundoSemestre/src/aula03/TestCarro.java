package aula03;

import java.util.Scanner;

public class TestCarro {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		double fuel = 0;
		
		System.out.println("Bem vindo ao carro, quantos quilômetros ele faz por litro?\n");
		
		double consumption = new Scanner(System.in).nextDouble();
		
		Carro car = new Carro(consumption);
		
		int quit;
		double quantity=0;
		
		do {
			System.out.println("Carro.\nConsumo: "+car.getConsumption()+"km/L.\nCombustível: "+car.getFuel()+"L."+"\n\nSelecione uma opção.\n1-Andar.\n2-Abastecer.\n0-Sair.\n");
			quit = new Scanner(System.in).nextInt();
			
			switch(quit) {
				case 1:
					System.out.println("\nPor qual distância você irá percorrer em quilometros?");
					double distance = new Scanner(System.in).nextDouble();
					
					if(car.getFuel() - (consumption*distance)/100<0) {
						
						System.out.println("Combustivel insuficiente, deseja abastecer ?\n1-Sim.\n2-Não.");
						quit = new Scanner(System.in).nextInt();
						
						if(quit==1) {
							System.out.println("Quantos litros deseja pôr? ");
							quantity = new Scanner(System.in).nextDouble();
							car.refuel(quantity);
						}
						else {
							break;
						}
					} else{
							car.ride(distance);
						}
					break;
				case 2:
					System.out.println("Quantos litros deseja pôr? ");
					quantity = new Scanner(System.in).nextDouble();
					car.refuel(quantity);
					break;
				case 0: 
					break;
				default:
					System.out.println("Opção invalida.\n");
					
			}
		}while(quit!=0);
		
	}

}
