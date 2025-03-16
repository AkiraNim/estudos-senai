package aula03;

import java.util.Random;
import java.util.Scanner;

public class TesteContaCorrente {

    public static final int SIZE = 3;

    @SuppressWarnings({"resource","unused"})
    public static void main(String[] args) {

        int quit = 5, loginNumber = 0, actualAccount = 0;
        double balance = 0;
        boolean empty = true;
        boolean execute=true;
        String accountNumber;
        
        ContaInvestimentos currentAccount[] = new ContaInvestimentos[SIZE];

        while (execute) {
        	displayMainMenu();
            quit = new Scanner(System.in).nextInt();
            boolean canLogIn=false;
            
            switch (quit) {
                case 1:
                    
                    	boolean full = true;
                    	for(int size=0;size<currentAccount.length;size++) {
                    		System.out.println("Qual o nome do proprietário da conta?");
                            String cardholderName = new Scanner(System.in).next();

                            System.out.println("Digite uma senha: ");
                            String password = new Scanner(System.in).next();
                            
                            int aNumber = new Random().nextInt(100000, 999999);
                            accountNumber = String.valueOf(aNumber);
                            
                            System.out.println("Cliente cadastrado com sucesso!\nCodigo: "+accountNumber+".\nNome: "+cardholderName+".\n");
                            
                            currentAccount[actualAccount] = new ContaInvestimentos(accountNumber, cardholderName, password);

                            empty = false;
                            actualAccount++;
                            full=false;
                    	}
                        
                     if(full) {
                        System.out.println("Numero maximo de clientes alcançado.");
                        break;
                    }

                    break;
                case 2:
                    quit = 1;
                    if (!empty) {
                    	
                    	System.out.println("Digite o nome do cliente que deseja acessar.");
                    	String clientName = new Scanner(System.in).next();
                    	System.out.println("Agora digite o codigo do cliente que deseja acessar.");
                    	accountNumber = new Scanner(System.in).next();
                    	
                        for (int size = 0; size < currentAccount.length; size++) {
                        	
                        	if(currentAccount[size]==null) {
                            	break;
                            }

                            if (currentAccount[size].getCardHolderName().equals(clientName) && currentAccount[size].getAccountNumber().equals(accountNumber)) {
                                System.out.println("\nCodigo: " + currentAccount[size].getAccountNumber() + "\nNome: " + currentAccount[size].getCardHolderName()+"\n");
                                loginNumber = size;
                                canLogIn = true;
                                break;
                            }
                            
                        }
                        if(!canLogIn) {
                        	System.out.println("Cliente não encontrado.");
                            break;
                        }
                        
                        boolean logged = false;
                        
                        while (quit != 2) {
                            

                            if (!logged&& canLogIn) {
                                System.out.println("Digite a senha para acessar a conta.");
                                String password = new Scanner(System.in).nextLine();
                                if (currentAccount[loginNumber].getPassword().equals(password) == true) {
                                    logged = true;
                                } else {
                                    System.out.println("Senha incorreta.\nSelecione uma opção.\n1-Tentar novamente.\n2-Voltar ao menu.");
                                    quit = new Scanner(System.in).nextInt();
                                    if (quit == 1) {
                                        continue;
                                    } else if (quit == 2) {

                                    } else {
                                        quit = 2;
                                    }

                                }
                            }else {
                            	break;
                            }
                        }
                            while (logged) {

                                System.out.printf("\nNumero da conta: %s\nNome do proprietário: %s\nSaldo: R$%.2f\n\nSelecione uma opção.\n1-Depositar.\n2-Sacar.\n3-Adicionar juros.\n4-Deslogar e voltar ao menu.\n\n", currentAccount[loginNumber].getAccountNumber(), currentAccount[loginNumber].getCardHolderName(), currentAccount[loginNumber].getBalance());
                                quit = new Scanner(System.in).nextInt();

                                switch (quit) {
                                    case 1:
                                        System.out.println("\nQuanto voce deseja depositar?");
                                        balance = new Scanner(System.in).nextDouble();
                                        currentAccount[loginNumber].deposit(balance);
                                        break;
                                    case 2:
                                        System.out.println("\nQuanto voce deseja sacar?");
                                        balance = new Scanner(System.in).nextDouble();
                                        currentAccount[loginNumber].withdraw(balance);
                                        break;
                                    case 3:
                                        if (currentAccount[loginNumber].addInterest() == true) {
                                            System.out.println("\nJuros cobrados");
                                        } else {
                                            System.out.println("\nSem fundos para cobrar juros");
                                        }

                                        break;
                                    case 4:
                                        quit = 2;
                                        logged = false;
                                        break;
                                }

                            }

                        }
                     
                case 0:
					execute=false;
					break;
                default:
					System.out.println("Opção invalida.");
					break;
            }

        }

    }
    
    private static void displayMainMenu() {
    	System.out.println("\nBem vindo ao banco BDSM - Boys do São Marinho"
    			+ "\nSelecione uma opção."
    			+ "\n1-Abrir nova conta."
    			+ "\n2-Acessar uma conta."
    			+ "\n0-Sair.");
    }

}