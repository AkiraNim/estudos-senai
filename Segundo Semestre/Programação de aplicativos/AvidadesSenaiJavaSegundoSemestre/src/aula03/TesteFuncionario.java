package aula03;
/*
 * Usando a classe funcionario na ultima atividade
 * 
 * Crie uma classe separada e dentro dela faça o metodo main...
 */

import java.util.Scanner;

public class TesteFuncionario {
	
	public static final int SIZE = 3;
	
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		Funcionario employee[] = new Funcionario[SIZE];
		
		int quit=1, employeesNumber=0, actualEmployee=0;
		boolean empty=true, logged=false, canLogIn=false;
		String password, name, actualEmployeeString;
		
		while(quit!=0) {
			System.out.println("\nSelecione uma opção.\n1-Cadastrar Funcionario.\n2-Selecione um funcionario cadastrado.\n0-Sair.");
			quit = new Scanner(System.in).nextInt();
			switch(quit) {
				case 1:
					
						boolean full = true;
						for(int size=0; size<employee.length;size++) {
							if(employee[size]==null) {
								System.out.println("Digite o nome do funcionario: ");
								name = new Scanner(System.in).next();
								
								System.out.println("Digite o salario do funcionario: ");
								double salary = new Scanner(System.in).nextDouble();	
								
								System.out.println("Digite uma senha para o funcionario");
								password = new Scanner(System.in).next();
								
								System.out.println("Codigo: "+employeesNumber);
								actualEmployeeString = String.valueOf(employeesNumber);
								
								employee[employeesNumber] = new Funcionario (name, salary, password, actualEmployeeString);
								employeesNumber++;
								empty=false;
								full=false;
								break;
							}
						}
						if(full) {
							System.out.println("Numero maximo de funcionarios alcançado.");
						}
					

					break;
				case 2:
					if(!empty) {
						
						System.out.println("Digite o nome do funcionario.");
						name = new Scanner(System.in).next();
						
						System.out.println("Agora digite o codigo do funcinario.");
						actualEmployee = new Scanner(System.in).nextInt();
						actualEmployeeString = String.valueOf(actualEmployee);
						
						for(int size=0;size<employee.length;size++) {
							if(employee[size]==null) {
								break;
							}else {
								if(employee[size].getName().equals(name) && employee[size].getCode().equals(actualEmployeeString)) {
									canLogIn=true;
								}
							}
						}
						if(!canLogIn) {
							System.out.println("Funcionario não encontrado.");
						}
						if(!logged && canLogIn) {
							quit=1;
							while(quit!=2) {
								System.out.println("Digite a senha do funcionario.");
								password = new Scanner(System.in).next();
								
								if(employee[actualEmployee].getPassword().equals(password)) {
									logged=true;
									break;
								}else {
									System.out.println("Senha incorreta.\nSelecione uma opção.\n1-Tentar novamente.\n2-Voltar ao menu.\n");
									quit = new Scanner(System.in).nextInt();
									if(quit==1) {
										continue;
									}else {
										quit=2;
										break;
									}
									
								}
							}
						}
						while(logged) {
							System.out.println("O funcionario selecionado é "+employee[actualEmployee].getName()+"\nSalario atual: R$"+employee[actualEmployee].getSalary()+"\n\nSelecione uma opção.\n1-Aumentar salário.\n2-Deslogar e voltar ao menu.\n3-Sair.\n");
							quit = new Scanner(System.in).nextInt();
							switch(quit) {
								case 1:
									System.out.println("Digite a porcentagem de aumento de salario do funcionario: ");
									double percentage = new Scanner(System.in).nextDouble();
									System.out.println("Salario aumentado para R$"+employee[actualEmployee].increaseSalary(percentage));
									break;
								case 2:
									logged=false;
									break;
								case 3:
									logged=false;
									quit=0;	
									break;
								default:
									System.out.println("Opção invalida.");
									break;
							}
						}
						break;
					} else {
						System.out.println("Não foram encontrados funcionarios cadastrados.");
						}
					break;
				case 0:
					quit=0;
					break;
				default:
					System.out.println("Opção invalida.");
					break;
			}
		}
	}
}
