/*
    Faça um programa que leia um código de operação (+, -, * ou /), e também dois valores inteiros
    A e B. O programa deve calcular o resultado da operação escolhida aplicado a A e B. Por
    exemplo, se a operação escolhida foi * e A = 1 e B = 3, o programa deve fornecer como
    resultado o valor de 1*3, que é 3.
*/

package atividadesSenaiJavaAula07;


import java.util.Scanner;

public class AtividadesSenaiJava05 {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        Calculadora calcula = new Calculadora();
        int number1, number2;
        char operation, stay='s';
        
        while(stay=='s'){
            System.out.print("Digite um numero: ");
            number1=stdin.nextInt();
            System.out.print("Digite a operação: ");
            operation=stdin.next().charAt(0);
            System.out.print("Digite outro numero: ");
            number2=stdin.nextInt();
            
            calcula.setNumber1(number1);
            calcula.setNumber2(number2);

            switch(operation){
                case '+':
                    calcula.sum();
                    break;
                case '-':
                    calcula.subtraction();
                    break;
                case '*':
                    calcula.multiplication();
                    break;
                case'/':
                    calcula.division();
                    break;
            }
            System.out.println("Resultado: "+calcula.getResult());
            System.out.println("Deseja continuar? \nsim\nnão");
            stay=stdin.next().charAt(0);
        }
    }
}
