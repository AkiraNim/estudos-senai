
package ana.primeiroprojeto;

import java.util.Scanner;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        String teste = null;
        byte idade;
        short sal = 25000;
        int money = 1500800;
        long billionare = 1251962158;
        
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        idade = teclado.nextByte();
        
        
        
        String valor = Byte.toString(idade);
        int tester = Integer.parseInt(teste);
        
        System.out.printf("Seu nome é :%s \n", nome);
        System.out.printf("Sua idade é :%d \n", idade);
        
        System.out.printf("Sua idade é :%s \n", valor);
        
        System.out.println("Seu salario é: " + sal);
        System.out.println("Seu saldo é: " + money);
        System.out.println("Bilionario mais pobre: " + billionare);
    }
}
