package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TesteFuncionarioArrayList {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		List<Funcionario> employee = new ArrayList<>();
		
		int option;
		int code = 0;
		boolean runLoop;
		boolean execute = true;
		
		while(execute) {

			System.out.println("Bem vindo gerenciamento de funcionarios."
					+ "\nSelecione uma opção."
					+ "\n[1]-Cadastrar funcionario."
					+ "\n[2]-Logar funcionario."
					+ "\n[3]-Listar funcionarios."
					+ "\n[4]-Remover funcionario."
					+ "\n[5]-Sair.");
			
			option = new Scanner(System.in).nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Voce escolheu Cadastrar funcionario.");
					
					System.out.println("Digite o nome do funcionario a ser cadastrado.");
					String name = new Scanner(System.in).next();
					
					System.out.println("Digite o salario do funcionario a ser cadastrado.");
					double salary = new Scanner(System.in).nextFloat();
					
					System.out.println("Digite uma senha para o funcionario.");
					String password = new Scanner(System.in).next();
					
					String employeeCode = String.valueOf(code);
					System.out.println("Código: "+employeeCode);
					
					Funcionario employees = new Funcionario (name, salary, password, employeeCode);
					employee.add(employees);
					
					
					System.out.println("Funcionario cadastrado com sucesso!\n");
                    
                    code++;
					
					break;
				case 2:
					System.out.println("Voce escolheu Logar funcionario.");
					if(!employee.isEmpty()) {
						boolean canLogin = false;
						runLoop=true;
						int index =0;
						boolean logged = false;		
						
						while(runLoop) {
							System.out.println("Digite o nome do funcionario a ser logado.");
							name = new Scanner(System.in).next();
							
							System.out.println("Digite o codigo do funcionario a ser logado.");
							employeeCode = new Scanner(System.in).next();
							
							for (Funcionario employeeFor : employee) {
								if(employeeFor.getName().equals(name) && employeeFor.getCode().equals(employeeCode)){
									canLogin = true;
									index = employee.indexOf(employeeFor);
									break;
								}
							}
							if(!canLogin) {
								System.out.println("Funcionario não encontrado."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								option = new Scanner(System.in).nextInt();
								
								if(option==2) {
									runLoop = false;
									break;
								}
							}
										
							while(canLogin && !logged) {
								System.out.println("Digite a senha do funcionario.");
								password = new Scanner(System.in).next();
																
								if(employee.get(index).getPassword().equals(password)) {
									logged = true;
									runLoop=false;
									break;
								}
								
							
								if(!logged) {
									System.out.println("Senha invalida."
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
						}
						while(logged) {
							
							System.out.println("\nFuncionário: "+employee.get(index).getName()
									+"\nCódigo: "+employee.get(index).getCode());
							
							System.out.printf("Salário: %.2f\n", employee.get(index).getSalary());
							System.out.println("\nSelecione uma opção."
									+ "\n[1]-Aumentar salário."
									+ "\n[2]-Deslogar e voltar ao menu."
									+ "\n[3]-Sair do sistema.");
							option = new Scanner(System.in).nextInt();
							
							switch(option) {
								case 1:
									System.out.println("Voce selecionou aumentar o salário.");
									
									System.out.println("Digite a porcentagem de aumento (Apenas numeros.).");
									float percentage = new Scanner(System.in).nextFloat();
									
									employee.get(index).increaseSalary(percentage);
									System.out.println("Salario aumentado em "+percentage+"%.");
									break;
								case 2:
									System.out.println("Voce selecionou deslogar e voltar ao menu.\n");
									logged=false;
									break;
								case 3:
									System.out.println("Voce selecionou sair do sistema.");
									logged = false;
									execute = false;
									break;
							}
						}
					}else {
						System.out.println("\nNão há funcionarios cadastrados\n");
						break;
					}
					break;
				case 3:
					System.out.println("Voce escolheu Listar funcionarios.");
					if(!employee.isEmpty()) {
						for (Funcionario employeeFor : employee) {
							System.out.println("Funcionario: " + employeeFor.getName()
									+"\nCódigo: "+employeeFor.getCode()+"\n");
						}
					}else {
						System.out.println("\nNão há funcionarios cadastrados\n");
						break;
					}
					break;
				case 4:
					System.out.println("Voce escolheu Remover funcionario.");
					if(!employee.isEmpty()) {
						boolean canLogin = false;
						runLoop=true;
						int index =0;
						boolean logged = false;		
						
						
						while(runLoop) {
							System.out.println("Digite o nome do funcionario a ser removido.");
							name = new Scanner(System.in).next();
							
							System.out.println("Digite o codigo do funcionario a ser removido.");
							employeeCode = new Scanner(System.in).next();
							
							for (Funcionario employeeFor : employee) {
								if(employeeFor.getName().equals(name) && employeeFor.getCode().equals(employeeCode)){
									canLogin = true;
									index = employee.indexOf(employeeFor);
									break;
								}
							}
							if(!canLogin) {
								System.out.println("Funcionario não encontrado."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								option = new Scanner(System.in).nextInt();
								
								if(option==2) {
									runLoop = false;
									break;
								}
							}
										
							while(canLogin && !logged) {
								System.out.println("Digite a senha do funcionario.");
								password = new Scanner(System.in).next();
																
								if(employee.get(index).getPassword().equals(password)) {
									logged = true;
									runLoop=false;
									break;
								}
								
							
								if(!logged) {
									System.out.println("Senha invalida."
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
								System.out.println("Voce está prestes a remover o funcionario "+employee.get(index).getName()
										+".\nVocê confirma?"
										+ "\n[1]-Sim."
										+ "\n[2]-Não.");
								
								option = new Scanner(System.in).nextInt();
								
								switch(option) {
									case 1:
										System.out.println("Funcionario "+employee.get(index).getName()+" removido com sucesso.\n");
										employee.remove(index);
										logged=false;
										break;
									case 2:
										System.out.println("Voltando ao menu.\n");
										logged = false;
										break;
									default:
										System.out.println("Opção invalida");
										break;
								}
							}
						}
					}else {
						System.out.println("\nNão há funcionarios cadastrados\n");
						break;
					}
					break;
				case 5:
					System.out.println("Voce escolheu Sair.");
					execute = false;
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}
			
		}

	}

}
