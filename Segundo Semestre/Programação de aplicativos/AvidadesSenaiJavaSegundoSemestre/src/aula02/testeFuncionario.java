package aula02;

import java.util.Scanner;

public class testeFuncionario {
	
	public static void main(String[] args) {
		
		System.out.println("Digite o nome do funcionario: ");
		String name = new Scanner(System.in).next();
		System.out.println("Digite o salario do funcionario: ");
		double salary = new Scanner(System.in).nextDouble();
		
		Funcionario funcionario1 = new Funcionario(name, salary);
		
		System.out.println("Salario atual: R$"+funcionario1.getSalary());
		System.out.println("Digite a porcentagem de aumento de salario do funcionario: ");
		double percentage = new Scanner(System.in).nextDouble();
		System.out.println("Salario aumentado para R$"+funcionario1.aumentarSalario(percentage));
	}

}
