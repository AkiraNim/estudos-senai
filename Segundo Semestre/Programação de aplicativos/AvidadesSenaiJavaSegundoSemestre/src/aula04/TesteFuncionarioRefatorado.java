package aula04;

import java.util.Scanner;

public class TesteFuncionarioRefatorado {
	public static final int SIZE = 3;
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {

		boolean execute=true;
		int employeeNumber=0;
		boolean runLoop;
		
		Funcionario employee[] = new Funcionario[SIZE];
		
		while(execute) {
			boolean logged = false;
			boolean empty=true;

			for(int i=0;i<employee.length;i++) {
				if(employee[i]!=null) {
					empty=false;
				}
			}
			
			System.out.println("\nBem vindo ao Sistema de gerenciamento de funcionarios."
					+ "\nSelecione uma opção."
					+ "\n[1]-Cadastrar funcionario."
					+ "\n[2]-Login de funcionario."
					+ "\n[3]-Listar funcionarios."
					+"\n[4]-Remover o funcionario."
					+ "\n[5]-Sair");
		
			int option = new Scanner(System.in).nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Você escolheu criar um funcionario.\n");
					
					boolean full = true;
					
					for(int i=0;i<employee.length;i++) {
						if(employee[i]==null) {
							employeeNumber=i;
							full=false;
							break;
						}
					}
					
					if(!full) {
						System.out.println("Digite o nome do funcionario.");
						String name = new Scanner(System.in).next();
						
						System.out.println("Digite o salário do funcionario.");
						double salary = new Scanner(System.in).nextDouble();
						
						System.out.println("Agora digite a senha do funcionario.");
						String password = new Scanner(System.in).next();
						
						System.out.println("Código do funcionario: "+employeeNumber);
						String employeeCode = String.valueOf(employeeNumber);
						
						employee[employeeNumber] = new Funcionario(name, salary, password, employeeCode);
					}else {
						System.out.println("Número maximo de funcionarios cadastrados.");
					}
					break;
				case 2:
					System.out.println("Você escolheu logar um funcionario.\n");
					
					runLoop=true;
					
					if(!empty) {
						while(runLoop) {
							System.out.println("Digite o nome do funcionario a logar.");
							String name = new Scanner(System.in).next();
							
							System.out.println("Digite o código do funcionario a logar.");
							String employeeCode = new Scanner(System.in).next();
							
							boolean canLogin = false;
							
							for(int i=0;i<employee.length;i++) {
								if(employee[i]==null) {
									continue;
								}
								if(employee[i].getName().equals(name)
										&&employee[i].getCode().equals(employeeCode)
										&& employee[i]!=null) {
									employeeNumber=i;
									canLogin = true;
									break;
								}
							}
													
							if(canLogin && !logged) {
								while(canLogin && !logged) {
									System.out.println("Digite a senha.");
									String password = new Scanner(System.in).next();
									

									if(employee[employeeNumber].getPassword().equals(password)) {
										logged=true;
										runLoop=false;
										break;
									}
									if(!logged) {
										System.out.println("Senha incorreta."
												+ "\nSelecione uma opção."
												+ "\n[1]-Tentar novamente."
												+ "\n[2]-Voltar ao menu\n");
										
										option = new Scanner(System.in).nextInt();
										if(option==2) {
											canLogin=false;
											break;
										}
									}
								}
							}else {
								System.out.println("Usuário não encontrado."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								
								option = new Scanner(System.in).nextInt();
								if(option==2) {
									runLoop=false;
									break;
								}
							}
						}
						while(logged) {
							System.out.println("Codigo do funcionario: "+employee[employeeNumber].getCode()
									+"\nNome do funcionario: "+employee[employeeNumber].getName());
							System.out.printf("\nSalário do funcioanrio: R$%.2f\n", employee[employeeNumber].getSalary());
							System.out.println("Selecione uma opção."
									+ "\n[1]-Aumentar salário."
									+ "\n[2]-Deslogar e voltar ao menu."
									+ "\n[3]-Sair do sistema.");
							option = new Scanner(System.in).nextInt();
							
							switch(option) {
								case 1:
									System.out.println("Você escolheu aumentar o salário.\n");
									
									System.out.println("Digite de quantos %(porcento) vai ser o aumento.(Apenas numeros)");
									
									double salary = new Scanner(System.in).nextDouble();
									employee[employeeNumber].increaseSalary(salary);
									
									System.out.println("Você aumentou o salário em "+salary+"%.");
									break;
								case 2:
									System.out.println("\nVocê escolheu deslogar e voltar ao menu.");
									logged = false;
									break;
								case 3:
									System.out.println("\nVocê escolheu sair do sistema.");
									logged = false;
									execute = false;
									break;
								default:
									System.out.println("Opção inválida.\n");
									break;
							}
						}
					}else {
						System.out.println("Não há funcionarios cadastrados.");
					}
					break;
				case 3:
					System.out.println("Você escolheu listar os funcionarios.");
					
					if(!empty) {
						runLoop=true;
						while(runLoop) {
							for(int i=0;i<employee.length;i++) {
								if(employee[i]!=null) {
									System.out.println("\nFuncionario: "+employee[i].getName()
											+"\nCódigo: "+employee[i].getCode());
								}
							}
							System.out.println("\nSelecione uma opção."
									+ "\n[1]-Reimprimir."
									+ "\n[2]-Voltar ao menu.");
							option = new Scanner(System.in).nextInt();
							
							if(option==2) {
								System.out.println("\nVoltando ao menu.");
								runLoop=false;
								break;
							}
						}
					}else {
						System.out.println("Não há funcionarios cadastrados.");
					}
					break;
				case 4:
					System.out.println("Você escolheu remover um funcionario.\n");
					
					runLoop=true;
					
					if(!empty) {
						while(runLoop) {
							System.out.println("Digite o nome do funcionario a remover.");
							String name = new Scanner(System.in).next();
							
							System.out.println("Digite o código do funcionario a remover.");
							String employeeCode = new Scanner(System.in).next();
							
							boolean canLogin = false;
							
							for(int i=0;i<employee.length;i++) {
								if(employee[i]==null) {
									continue;
								}
								if(employee[i].getName().equals(name)
										&&employee[i].getCode().equals(employeeCode)
										&& employee[i]!=null) {
									employeeNumber=i;
									canLogin = true;
									break;
								}
							}

							if(canLogin && !logged) {
								while(canLogin && !logged) {
									System.out.println("Digite a senha.");
									String password = new Scanner(System.in).next();
									

									if(employee[employeeNumber].getPassword().equals(password)) {
										logged=true;
										runLoop=false;
										break;
									}
									if(!logged) {
										System.out.println("Senha incorreta."
												+ "\nSelecione uma opção."
												+ "\n[1]-Tentar novamente."
												+ "\n[2]-Voltar ao menu\n");
										
										option = new Scanner(System.in).nextInt();
										if(option==2) {
											canLogin=false;
											break;
										}
									}
								}
							}else {
								System.out.println("Usuário não encontrado."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								
								option = new Scanner(System.in).nextInt();
								if(option==2) {
									runLoop=false;
									break;
								}
							}
						}
						while(logged) {
							System.out.println("Você está prestes a remover o funcionario "+employee[employeeNumber].getName()
									+", você confirma?"
									+ "\n[1]-Sim."
									+ "\n[2]-Não.");
							option = new Scanner(System.in).nextInt();

							switch(option) {
								case 1:
									System.out.println("Funcionario "+employee[employeeNumber].getName()
											+" removido com sucesso, voltando ao menu.");
									employee[employeeNumber]=null;
									logged = false;
									break;
								case 2:
									System.out.println("Voltando ao menu.");
									logged = false;
									break;
								default:
									System.out.println("Opção invalida.");
									break;
							}
						}
					}else {
						System.out.println("Não há funcionarios cadastrados.");
					}
					break;
				case 5:
					System.out.println("Você escolheu sair.\n");
					execute=false;
					break;
			}
		}

	}
}