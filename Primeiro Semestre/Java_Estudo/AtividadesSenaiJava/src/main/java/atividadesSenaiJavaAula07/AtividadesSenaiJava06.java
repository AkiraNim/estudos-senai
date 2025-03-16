/*
  Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200.
 */
package atividadesSenaiJavaAula07;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class AtividadesSenaiJava06 {
    public static void main(String[]args){
        Scanner stdin = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um numero: ");
        number=stdin.nextInt();
        
        if(number>=100 && number<=200) System.out.print("Seu numero está entre 100 e 200.");
        if(number==777) System.out.print("Raffa Moreira mano.");
        else System.out.print("Seu numero não está entre 100 e 200.");
        
    }
    
}
