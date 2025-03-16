package aula04;

import java.util.Random;
import java.util.Scanner;

public class TesteContaCorrenteRefatorado {
	
	public static final int SIZE = 3;
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		boolean execute = true;
		int account=0;
		boolean empty = true;
		boolean logged = false;
		boolean runLoop;
		boolean canLogin;
		
		ContaInvestimentos currentAccount[] = new ContaInvestimentos[SIZE];
		
		while(execute) {
			empty=true;
			
			for(int i=0;i<currentAccount.length;i++) {
				if(currentAccount[i]!=null) {
					empty=false;
				}
			}
			
			System.out.println("\nBem vindo ao Banco BDSM - Boys do São Marinho"
					+ "\nSelecione uma opção."
					+ "\n[1]-Abrir uma conta."
					+ "\n[2]-Logar na conta."
					+ "\n[3]-Listar contas."
					+ "\n[4]-Remover conta."
					+ "\n[5]-Sair.");
			int option = new Scanner(System.in).nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Você escolheu criar uma conta.\n");
					
					boolean full=true;
					
					
					for(int i=0;i<currentAccount.length;i++) {
						if(currentAccount[i]==null) {
							account=i;
							full=false;
							break;
						}
					}
					if(!full) {
						System.out.println("Digite o nome do proprietário da conta.");
						String cardholderName = new Scanner(System.in).next();
						
						System.out.println("Digite a senha do proprietário da conta.");
						String password = new Scanner(System.in).next();
						
						int randomNumber = new Random().nextInt(100000, 999999);
						String accountNumber = String.valueOf(randomNumber);
						System.out.println("Cliente cadastrado com sucesso, numero da conta: "+accountNumber);
						
						currentAccount[account] = new ContaInvestimentos(cardholderName, password, accountNumber);
					}else {
						System.out.println("Numero máximo de contas cadastradas.\n");
					}
					break;
				case 2:
					System.out.println("Você escolheu logar numa conta.\n");
					
					canLogin=false;
					runLoop=true;
					
					while(runLoop) {
						
						if(!empty) {
							System.out.println("Digite o nome do proprietário da conta.");
							String cardholderName = new Scanner(System.in).next();
							
							System.out.println("Digite o numero da conta.");
							String accountNumber = new Scanner(System.in).next();
							
							for(int i=0;i<currentAccount.length;i++) {
								if(currentAccount[i].getCardHolderName().equals(cardholderName)
										&& currentAccount[i].getAccountNumber().equals(accountNumber)
										&& currentAccount[i]!=null) {
									account=i;
									canLogin = true;
									break;
								}else {
									break;
								}
							}
							
							if(canLogin && !logged) {
								while(runLoop) {
									System.out.println("Digite a senha do proprietário da conta.");
									String password = new Scanner(System.in).next();
									
									if(currentAccount[account].getPassword().equals(password)) {
										logged = true;
										runLoop=false;
									}else {
										System.out.println("Senha incorreta.\n"
												+ "\nSelecione uma opção."
												+ "\n[1]-Tentar novamente."
												+ "\n[2]-Voltar ao menu.");
										option = new Scanner(System.in).nextInt();
										if(option==2) {
											System.out.println("Voltando ao menu.");
											runLoop=false;
										}
									}
								}
							}else {
								System.out.println("Usuário não encontrado.\n"
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								option = new Scanner(System.in).nextInt();
								if(option==2) {
									System.out.println("Voltando ao menu.");
									runLoop=false;
								}
							}
							
						}else {
							System.out.println("Não foram cadastradas contas.");
							break;
						}
					}
					while(logged) {
						System.out.println("Número da conta: "+currentAccount[account].getAccountNumber()
								+"\nProprietário: "+currentAccount[account].getCardHolderName());
						System.out.printf("Saldo: R$%.2f\n", currentAccount[account].getBalance());
						System.out.println("\nSelecione uma opção."
								+ "\n[1]-Depositar."
								+ "\n[2]-Sacar."
								+ "\n[3]-Adicionar juros de 10%."
								+ "\n[4]-Deslogar e voltar ao menu."
								+ "\n[5]-Finalizar aplicação.");
						option = new Scanner(System.in).nextInt();
						
						double balance;
						
						switch(option) {
							case 1:
								System.out.println("Você escolheu depositar.\n");
								
								System.out.println("Quanto voce deseja depositar?");
								balance = new Scanner(System.in).nextDouble();
								
								currentAccount[account].deposit(balance);
								System.out.printf("Foram depositados R$%.2f.\n", balance);
								break;
							case 2:
								System.out.println("Você escolheu sacar.\n");
								
								System.out.println("Quanto voce deseja sacar?");
								balance = new Scanner(System.in).nextDouble();
								
								if(currentAccount[account].withdraw(balance)) {
									System.out.printf("Foram sacados R$%.2f.\n", balance);
								}else {
									System.out.println("Saldo insuficente para sacar.\n");
								}
								break;
							case 3:
								System.out.println("Você escolheu adicionar juros de 10%.\n");
								
								if(currentAccount[account].addInterest()) {
									System.out.println("Foram adicionados 10% de juros.\n");
								}else {
									System.out.println("Saldo insuficente para adicionar juros.\n");
								}
								break;
							case 4:
								System.out.println("Você escolheu deslogar e sair pro menu.");
								logged=false;
								runLoop=false;
								break;
							case 5:
								System.out.println("Obrigado por usar a plataforma do BDSM.");
								logged=false;
								runLoop=false;
								execute=false;
								break;
						}
					}
					break;
				case 3:
					System.out.println("Você escolheu listar as contas.\n");
					
					if(!empty) {
						while(option!=2) {
							for(int i=0; i<currentAccount.length;i++) {
								if(currentAccount[i]!=null) {
									System.out.println("Usuário: "+currentAccount[i].getCardHolderName()
											+"\nNumero da conta: "+currentAccount[i].getAccountNumber()
											+"\n");
								}
							}
							System.out.println("Selecione uma opção."
									+ "\n[1]-Reimprimir Lista."
									+ "\n[2]-Voltar ao menu.");
							option = new Scanner(System.in).nextInt();
						}
					}else {
						System.out.println("Não foram cadastradas contas.");
						break;
					}
						
					break;
				case 4:
					System.out.println("Você escolheu remover uma conta.\n");

					canLogin=false;
					runLoop=true;
					
					while(runLoop) {
						
						if(!empty) {
							System.out.println("Digite o nome do proprietário da conta a ser removida.");
							String cardholderName = new Scanner(System.in).next();
							
							System.out.println("Digite o numero da conta ser removida.");
							String accountNumber = new Scanner(System.in).next();
							
							for(int i=0;i<currentAccount.length;i++) {
								if(currentAccount[i].getCardHolderName().equals(cardholderName)
										&& currentAccount[i].getAccountNumber().equals(accountNumber)
										&& currentAccount[i]!=null) {
									account=i;
									canLogin = true;
									break;
								}else {
									break;
								}
							}
							
							if(canLogin && !logged) {
								while(runLoop) {
									System.out.println("Digite a senha do proprietário da conta a ser removida.");
									String password = new Scanner(System.in).next();
									
									if(currentAccount[account].getPassword().equals(password)) {
										logged = true;
										runLoop=false;
									}else {
										System.out.println("Senha incorreta.\n"
												+ "\nSelecione uma opção."
												+ "\n[1]-Tentar novamente."
												+ "\n[2]-Voltar ao menu.");
										option = new Scanner(System.in).nextInt();
										if(option==2) {
											System.out.println("Voltando ao menu.");
											runLoop=false;
										}
									}
								}
							}else {
								System.out.println("Usuário não encontrado.\n"
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								option = new Scanner(System.in).nextInt();
								if(option==2) {
									System.out.println("Voltando ao menu.");
									runLoop=false;
								}
							}
							
						}else {
							System.out.println("Não foram cadastradas contas.");
							break;
						}
					}
					while(logged) {
						System.out.println("Número da conta: "+currentAccount[account].getAccountNumber()
								+"\nProprietário: "+currentAccount[account].getCardHolderName());
						System.out.printf("Saldo: R$%.2f\n", currentAccount[account].getBalance());
						
						if(currentAccount[account].getBalance()!=0) {
							System.out.printf("\nVoce ainda tem um saldo de R$%.2f na conta, deseja sacar?", currentAccount[account].getBalance());
							System.out.println("\n[1]-Sim."
									+ "\n[2]-Nao."
									+ "\n[3]-Voltar ao menu.\n");
							option = new Scanner(System.in).nextInt();
							
							switch(option) {
								case 1:
									System.out.printf("\nForam sacados R$%.2f da conta.\n", currentAccount[account].getBalance());
									currentAccount[account].withdraw(currentAccount[account].getBalance());
									break;
								case 2:
									System.out.println("\nNão será possível remover a conta com este saldo.\n");
									break;
								case 3:
									logged=false;
									break;
								default:
									System.out.println("\nOpção invalida.\n");
							}
						}else {
							currentAccount[account]=null;
							System.out.println("\nConta removida com sucesso, voltando ao menu.");
							logged=false;
							break;
						}
					}
					break;
				case 5:
					System.out.println("Você escolheu sair.\n");
					execute=false;
					break;
				default:
					System.out.println("Opção invalida.\n");
			}
		}

	}

}
