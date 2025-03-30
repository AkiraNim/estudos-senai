/*Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve
no semestre. No final informar o nome do aluno e a sua média (aritmética).*/

package atividadesSenaiJavaAula05;

import java.util.Scanner;

public class AtividadesSenaiJava03 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Aluno student1 = new Aluno();
                String name;
                float grade1, grade2, grade3;

		System.out.print("Digite o nome do aluno: ");
                name=stdin.nextLine();
                student1.nomeAluno(name);
		System.out.print("Digite a nota da primeira prova: ");
                grade1=stdin.nextFloat();
		System.out.print("Digite a nota da segunda prova: ");
		grade2=stdin.nextFloat();
		System.out.print("Digite a nota da terceira prova: ");
		grade3=stdin.nextFloat();
                
                student1.notaAluno(grade1, grade2, grade3);
                
                System.out.printf("\nAluno %s\n\nNota final: %.2f", student1.getStudentName(),student1.getArithmeticOdd());
	}

}
