/*
    Construa um algoritmo para determinar o IMC (Índice de Massa Corpórea) do indivíduo que é
    definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do
    indivíduo. O programa deve verificar e imprimir em tela a condição e situação do IMC
    encontrado, conforme tabela abaixo:
*/
package atividadesSenaiJavaAula07;

import java.util.Scanner;

public class AtividadesSenaiJava07 {
    public static final int TAM = 10;
    
    public static void main(String []args){
        Scanner stdin = new Scanner(System.in);
        IMC pessoa[] = new IMC[TAM];
        int i=0;
        float aux;
        String name;
        
            while(i<TAM){
                pessoa[i] = new IMC();

                System.out.print("\nDigite seu nome: ");
                name=stdin.nextLine();
                pessoa[i].setName(name);
                System.out.print("Agora digite sua altura: ");
                aux=stdin.nextFloat();
                pessoa[i].setHeight(aux);
                System.out.print("Agora digite seu peso: ");
                aux=stdin.nextFloat();
                stdin.nextLine();
                pessoa[i].setWeight(aux);
                pessoa[i].status();
                System.out.print("Situação: "+pessoa[i].getStatus()+"\n");
                
                i++;
            }
    }
}
