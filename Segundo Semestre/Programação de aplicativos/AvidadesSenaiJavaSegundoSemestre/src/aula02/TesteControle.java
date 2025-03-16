package aula02;

import java.util.Scanner;

public class TesteControle {

	public static void main(String[] args) {
		
		
		int canal=0, volume=50, opcao=1; 
		
		ControleTv controle = new ControleTv(canal, volume);
		
		while(opcao!=0) {
			
			System.out.println("");
			System.out.println("Volume atual: "+controle.getVolume());
			System.out.println("Canal atual: "+controle.getCanal());
			System.out.println("");
			System.out.println("Aumentar o canal = 1");
			System.out.println("Abaixar o canal = 2");
			System.out.println("Aumentar o volume = 3");
			System.out.println("Abaixar o volume = 4");
			System.out.println("Sair = 0");
			System.out.println("");
			
			opcao = new Scanner(System.in).nextInt();
			if(opcao==1) {
				controle.aumentarCanal();
			}
			else if(opcao==2) {
				controle.diminuirCanal();
			}
			else if(opcao==3) {
				controle.aumentarVolume();
			}
			else if(opcao==4) {
				controle.diminuirVolume();
			}
		}
		
	}

}
