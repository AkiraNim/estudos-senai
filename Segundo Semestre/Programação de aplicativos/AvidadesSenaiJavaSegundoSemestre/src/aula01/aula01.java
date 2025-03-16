/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Digite o valor do lado do quadrado ");
        int tamanho = new Scanner(System.in).nextInt();
        Quadrado quadrado = new Quadrado(tamanho);
        System.out.println("A area do quadrado e " + quadrado.calcularArea());
    }
    
}
