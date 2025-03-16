package aula02;

import java.util.Random;
import java.util.Scanner;

public class TestCurrentAccount {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		
		int quit=5;
		double balance=0;
		
		while(quit==5) {
			System.out.println("Qual o nome do proprietário da conta?");
			String cardholderName = new Scanner(System.in).next();
			
			int aNumber = new Random().nextInt(100000, 999999);
			String accountNumber = String.valueOf(aNumber);
			
			CurrentAccount currentAccount = new CurrentAccount(accountNumber, cardholderName);
			
			while(quit!=0) {
				System.out.println("\nNumero da conta: "+currentAccount.getAccountNumber()+"\nNome do proprietario: "+currentAccount.getCardHolderName()+"\nSaldo: R$"+currentAccount.getBalance()+"\n\nSelecione uma opção.\n1-Depositar.\n2-Sacar.\n3-Adicionar juros.\n0-Sair.");
				quit = new Scanner(System.in).nextInt();
				
				switch(quit) {
					case 1:
						System.out.println("Quanto voce deseja depositar?");
						balance= new Scanner(System.in).nextDouble();
						currentAccount.deposit(balance);
						break;
					case 2:
						System.out.println("Quanto voce deseja sacar?");
						balance= new Scanner(System.in).nextDouble();
						currentAccount.withdraw(balance);
						break;
					case 0:
						break;
				}
			}
			
		}
		
	}

}
