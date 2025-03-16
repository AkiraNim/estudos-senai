package atividadesSenaiJavaAula04;

import java.util.Scanner;

public class AtividadesSenaiJava03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		
		String studentName;
		int age;
		float grade1, grade2, grade3, grade4, finalGrade;
		
		System.out.print("Digite o nome do aluno: ");
		studentName=stdin.nextLine();
		System.out.print("Digite a idade do aluno: ");
		age=stdin.nextInt();
		System.out.print("Digite a primeira nota: ");
		grade1=stdin.nextFloat();
		System.out.print("Digite a segunda nota: ");
		grade2=stdin.nextFloat();
		System.out.print("Digite a terceira nota: ");
		grade3=stdin.nextFloat();
		System.out.print("Digite a quarta nota: ");
		grade4=stdin.nextFloat();
		finalGrade=(grade1+grade2+grade3+grade4)/4;
		System.out.println("A nota final do aluno "+studentName+" é: "+finalGrade);
	}

}
