package aula03;

import java.util.Random;
import java.util.Scanner;

public class TestContaInvestimentos {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		
		int quit=5;
		double balance=0;
		String password = "";
		
		while(quit==5) {
			System.out.println("Qual o nome do proprietário da conta?");
			String cardholderName = new Scanner(System.in).next();
			
			int aNumber = new Random().nextInt(100000, 999999);
			String accountNumber = String.valueOf(aNumber);
			
			ContaInvestimentos investAccount = new ContaInvestimentos(accountNumber, cardholderName, password);
			
			while(quit!=0) {
				//System.out.println("\nNumero da conta: "+investAccount.getAccountNumber()+"\nNome do proprietario: "+investAccount.getCardHolderName()+"\nSaldo: R$"+investAccount.getBalance()+"\n\nSelecione uma opção.\n1-Depositar.\n2-Sacar.\n3-Adicionar juros.\n0-Sair.");
				System.out.printf("\nNumero da conta: %s\nNome do proprietário: %s\nSaldo: R$%.2f\n\nSelecione uma opção.\n1-Depositar.\n2-Sacar.\n3-Adicionar juros.\n0-Sair.\n\n", investAccount.getAccountNumber(), investAccount.getCardHolderName(), investAccount.getBalance());
				quit = new Scanner(System.in).nextInt();
				
				switch(quit) {
					case 1:
						System.out.println("\nQuanto voce deseja depositar?");
						balance= new Scanner(System.in).nextDouble();
						investAccount.deposit(balance);
						break;
					case 2:
						System.out.println("\nQuanto voce deseja sacar?");
						balance= new Scanner(System.in).nextDouble();
						investAccount.withdraw(balance);
						break;
					case 3:
						if(investAccount.addInterest()==true) {
							System.out.println("\nJuros cobrados");
						}	else {
							System.out.println("\nSem fundos para cobrar juros");
						}

						break;
					case 0:
						break;
					
				}
				
			}
			
		}
		
	}

}
