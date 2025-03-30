package atividadesSenaiJavaAula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadesSenaiJava03 {

	private static Scanner stdin;

	public static void main(String[] args) {
		
		stdin = new Scanner(System.in);
		//List<Aluno> student = new ArrayList<Aluno>();
		Aluno []student = new Aluno[5];
		byte i=1, a;
		char stay;
		String studentName;
                float grade, finalGrade;
                int age;
			
                    do{
                        student[i] = new Aluno();
                        
			System.out.print("Digite o nome do aluno: ");
                        studentName=stdin.nextLine();
                        student[i].nomeAluno(studentName);
			System.out.print("Digite a idade do aluno: ");
                        age=stdin.nextInt();
                        student[i].setAge(age);
			System.out.print("Digite a primeira nota: ");
                        grade=stdin.nextFloat();
                        student[i].setGrade1(grade);
                        System.out.print("Digite a segunda nota: ");
                        grade=stdin.nextFloat();
                        student[i].setGrade2(grade);
                        System.out.print("Digite a terceira nota: ");
                        grade=stdin.nextFloat();
                        student[i].setGrade3(grade);
                        System.out.print("Digite a quarta nota: ");
                        grade=stdin.nextFloat();
                        student[i].setGrade4(grade);
                        student[i].notaAluno();
                        student[i].recuperacao();
                        System.out.println("Deseja continuar? Sim/Não");
                        stay = stdin.next().charAt(0);
                        
                        stdin.nextLine();
                        if(stay=='s' || stay=='S')i++;
                        
                    }while(i<5 && stay=='s' || stay=='S');
                    a=i;
                    for(i=1; i<=a;i++){
                        System.out.printf("\nAluno: %s\nIdade: %d\nNota final: %.2f\n%s\n", student[i].getStudentName(),student[i].getAge(),student[i].getFinalGrade(), student[i].getStatus());
                    }
	}
}
