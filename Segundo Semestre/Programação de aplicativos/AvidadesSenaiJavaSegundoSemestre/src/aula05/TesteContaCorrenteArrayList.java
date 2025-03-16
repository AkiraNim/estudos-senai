package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TesteContaCorrenteArrayList {

	public static void main(String[] args) {
		
		List<ContaInvestimentos> currentAccount = new ArrayList<>();
		
		int index = 0;
		boolean execute = true;
		boolean runLoop;
		boolean canLogin = false;
		boolean logged = false;
		
		while(execute) {
			System.out.println("Bem vindo ao banco BDSM - Boys Do Sao Marinho.\n"
					+ "\nSelecione uma opção."
					+ "\n[1]-Abrir uma conta."
					+ "\n[2]-Logar numa conta."
					+ "\n[3]-Listar contas."
					+ "\n[4]-Remover uma conta."
					+ "\n[5]-Sair.");
			
			int option = new Scanner(System.in).nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Você escolheu Abrir uma conta.");
					
					System.out.println("\nDigite o nome do proprietário da conta.");
					String name = new Scanner(System.in).next();
					
					System.out.println("\nDigite uma senha para a conta.");
					String password = new Scanner(System.in).next();
					
					int codeInt = new Random().nextInt(100000, 999999);
					String code = String.valueOf(codeInt);
					System.out.println("Código: "+code);
					
					ContaInvestimentos currentAccounts = new ContaInvestimentos(name, password, code);
					currentAccount.add(currentAccounts);
					
					break;
				case 2:
					System.out.println("Você escolheu Logar numa conta.");
					
					runLoop = true;
					if(!currentAccount.isEmpty()) {
						while(runLoop) {
							System.out.println("Digite o nome do proprietário da conta.");
							name = new Scanner(System.in).next();
							
							System.out.println("Digite o código da conta.");
							code = new Scanner(System.in).next();
							
							for (ContaInvestimentos currentAccountFor : currentAccount) {
								if(currentAccountFor.getCardHolderName().equals(name) && currentAccountFor.getAccountNumber().equals(code)) {
									canLogin = true;
									runLoop = false;
									index = currentAccount.indexOf(currentAccountFor);
									break;
								}
							}
							if(!canLogin) {
								System.out.println("Conta não encontrada."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								
								option = new Scanner(System.in).nextInt();
								if(option == 2) {
									System.out.println("\nVoltando ao menu.\n");
									runLoop = false;
									break;
								}
							}
							
						}
						
						runLoop = true;
						
						if(canLogin && !logged) {
							while(runLoop) {
								System.out.println("Digite a senha de acesso.");
								password = new Scanner(System.in).next();
								
								if(currentAccount.get(index).getPassword().equals(password)) {
									logged = true;
									runLoop = false;
									break;
								}else {
									System.out.println("Senha incorreta."
											+ "\nSelecione uma opção."
											+ "\n[1]-Tentar novamente."
											+ "\n[2]-Voltar ao menu.");
									
									option = new Scanner(System.in).nextInt();
									if(option == 2) {
										System.out.println("\nVoltando ao menu.\n");
										runLoop = false;
										break;
									}
								}
							}
						}
							while(logged) {
								System.out.println("Cliente: "+currentAccount.get(index).getCardHolderName()
										+"\nCodigo da conta: "+currentAccount.get(index).getAccountNumber());
								System.out.printf("Saldo: %.2f\n", currentAccount.get(index).getBalance());
								System.out.println("\nSelecione uma opção."
										+ "\n[1]-Depositar valor."
										+ "\n[2]-Sacar valor."
										+ "\n[3]-Adicionar juros de 10%"
										+ "\n[4]-Deslogar e voltar ao menu."
										+ "\n[5]-Sair da aplicação.");
								
								option = new Scanner(System.in).nextInt();
								
								switch(option) {
									case 1:
										System.out.println("\nVocê escolheu Depositar valor");
										
										System.out.println("\nDigite o valor a depositar (Apenas numeros).");
										double deposit = new Scanner(System.in).nextDouble();
										
										currentAccount.get(index).deposit(deposit);
										System.out.printf("\nR$%.2f depositados com sucesso.\n", deposit);
										break;
									case 2:
										System.out.println("\nVocê escolheu Sacar valor");
										
										System.out.println("\nDigite o valor a sacar (Apenas numeros).");
										double withdraw = new Scanner(System.in).nextDouble();
										
										if(currentAccount.get(index).withdraw(withdraw)) {
											System.out.printf("\nVocê sacou R$%.2f\n", withdraw);
										}else {
											System.out.println("Saldo insuficiente na conta.\n");
										}
										break;
									case 3:
										System.out.println("\nVocê escolheu Adicionar juros de 10%.");
										if(currentAccount.get(index).addInterest()) {
											System.out.println("Juros adicionados.\n");
										}else {
											System.out.println("Saldo insufciente na conta.\n");
										}
										break;
									case 4:
										System.out.println("\nVocê escolheu Deslogar e voltar ao menu.");
										logged = false;
										break;
									case 5:
										System.out.println("\nVocê escolheu Sair");
										logged = false;
										execute = false;
										break;
								}
							}
						
					}else {
						System.out.println("Não há contas cadastradas.\n");
					}
					
					
					break;
				case 3:
					System.out.println("Você escolheu Listar contas.\n");
					System.out.println("-----------------------------------------------------------\n");
					if(!currentAccount.isEmpty()) {
						for (ContaInvestimentos currentAccountFor : currentAccount) {
							System.out.println("Conta: "+currentAccountFor.getAccountNumber()
							+"\nProprietário: "+currentAccountFor.getCardHolderName()
							+"\n\n");
						}
						System.out.println("-----------------------------------------------------------\n");
					}else {
						System.out.println("Não há contas cadastradas.\n");
					}
					
					break;
				case 4:
					System.out.println("Você escolheu Remover uma conta.");
					
					runLoop = true;
					
					if(!currentAccount.isEmpty()) {
						while(runLoop) {
							System.out.println("Digite o nome do proprietário da conta.");
							name = new Scanner(System.in).next();
							
							System.out.println("Digite o código da conta.");
							code = new Scanner(System.in).next();
							
							for (ContaInvestimentos currentAccountFor : currentAccount) {
								if(currentAccountFor.getCardHolderName().equals(name) && currentAccountFor.getAccountNumber().equals(code)) {
									canLogin = true;
									runLoop = false;
									index = currentAccount.indexOf(currentAccountFor);
									break;
								}
							}
							if(!canLogin) {
								System.out.println("Conta não encontrada."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								
								option = new Scanner(System.in).nextInt();
								if(option == 2) {
									System.out.println("\nVoltando ao menu.\n");
									runLoop = false;
									break;
								}
							}
							
						}
						
						runLoop = true;
						
						if(canLogin && !logged) {
							while(runLoop) {
								System.out.println("Digite a senha de acesso.");
								password = new Scanner(System.in).next();
								
								if(currentAccount.get(index).getPassword().equals(password)) {
									logged = true;
									runLoop = false;
									break;
								}else {
									System.out.println("Senha incorreta."
											+ "\nSelecione uma opção."
											+ "\n[1]-Tentar novamente."
											+ "\n[2]-Voltar ao menu.");
									
									option = new Scanner(System.in).nextInt();
									if(option == 2) {
										System.out.println("\nVoltando ao menu.\n");
										runLoop = false;
										break;
									}
								}
							}
						}
						while(logged) {
							if(currentAccount.get(index).getBalance()>0) {
								
								System.out.println("\nA conta ainda tem saldo, impossivel remover."
										+ "\nSelecione uma opção."
										+ "\n[1]-Sacar tudo."
										+ "\n[2]-Voltar ao menu.");
								
								option = new Scanner(System.in).nextInt();
								
								switch(option) {
									case 1:
										System.out.printf("\nVocê sacou %.2f\n", currentAccount.get(index).getBalance());
										currentAccount.get(index).withdraw(currentAccount.get(index).getBalance());
										break;
									case 2:
										System.out.println("Voltando ao menu.\n");
										logged = false;
										break;
								}
								
							}else {
								System.out.println("Você está prestes a remover a conta "+currentAccount.get(index).getAccountNumber()
										+" você confirma?"
										+ "\n[1]-Sim."
										+ "\n[2]-Não.");
								
								option = new Scanner(System.in).nextInt();
								
								if(option == 1) {
									System.out.println("Conta removida com sucesso, voltando ao menu.\n");
									currentAccount.remove(index);
									logged=false;
									break;
								}else {
									logged=false;
									break;
								}
							}
							
							
						}
					
					}else {
						System.out.println("Não há contas cadastradas.\n");
					}
					
					break;
				case 5:
					System.out.println("Você escolheu Sair");
					execute = false;
					break;
			}
		}
	}
}
