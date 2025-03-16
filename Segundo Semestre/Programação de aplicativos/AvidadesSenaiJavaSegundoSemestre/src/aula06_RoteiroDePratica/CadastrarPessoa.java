
package aula06_RoteiroDePratica;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarPessoa {
    public void cadastrarPessoa(ArrayList<Pessoa> person) {
                    
        System.out.println("Digite o nome da pessoa.");
        String name = new Scanner(System.in).next();

        System.out.println("Digite o numero do cpf da pessoa.");
        String cpf = new Scanner(System.in).next();

        System.out.println("Digite o ano de nascimento da pessoa.");
        int birthYear = new Scanner(System.in).nextInt();

        Pessoa persons = new Pessoa(name, cpf, birthYear);
        person.add(persons);
    }
     
}
