/*
Escreva um programa que leia do teclado as duas notas de um aluno, calcule e exiba a média
aritmética das notas. O programa deve, adicionalmente, exibir a mensagem de resultado se o
aluno está aprovado (média superior ou igual a 7,0), em recuperação (média superior ou
igual a 5,0 e inferior a 7,0) ou reprovado (média inferior a 5,0).
 * */

package atividadesSenaiJavaAula07;

import atividadesSenaiJavaAula04.Aluno;
import java.util.Scanner;

public class AtividadesSenaiJava04 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
                Aluno student[] = new Aluno[5];
		String studentName;
                float grade;
                byte students=0,aux;
                char stay='s';
                        
                do{
                    student[students] = new Aluno();
                    
                    
                    System.out.println("Dgitie o nome do aluno: ");
                    studentName=stdin.nextLine();
                    System.out.println("Agora digite a primeira nota do aluno: ");
                    grade=stdin.nextFloat();
                    student[students].setGrade1(grade);
                    System.out.println("Agora digite a segunda nota do aluno: ");
                    grade=stdin.nextFloat();
                    student[students].setGrade2(grade);
                    System.out.println("Deseja continuar? Sim/Nao");
                    stay = stdin.next().charAt(0);
                    
                    if(stay=='s' || stay=='S') students++;
                    student[students].notaAluno();
                    student[students].nomeAluno(studentName);
                    student[students].recuperacao();
                    
                }while(students <5 && stay=='s' || stay=='S');
                
                aux=students;
                for(students=0;students<=aux;students++){
                    System.out.println("Aluno: "+student[students].getStudentName());
                    //System.out.println("Idade: "+student[students].getAge());
                    System.out.println("Nota final: "+student[students].getFinalGrade());
                    System.out.println("Situacção: "+student[students].getStatus());
                }
                
                
	}

}
