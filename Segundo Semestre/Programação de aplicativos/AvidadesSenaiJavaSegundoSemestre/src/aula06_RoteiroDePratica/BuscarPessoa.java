
package aula06_RoteiroDePratica;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarPessoa {
    public void buscarPessoa(ArrayList<Pessoa> person){
        if(!person.isEmpty()){
            System.out.println("Digite o CPF da pessoa que esta buscando");
           String cpf = new Scanner(System.in).nextLine();
           boolean found = false;

           for(Pessoa personFor : person){
               if(personFor.getcpf().equals(cpf)){
                   found = true;
                   System.out.println("\nNome: " + personFor.getname()
                   + "\nCPF: " + personFor.getcpf()
                   + "\nAno de nascimento: " + personFor.getyear());
                   System.out.print("Pressione Enter para continuar");
                   String exit = new Scanner(System.in).nextLine();
               }
           }
           if(!found){
               System.out.println("Pessoa nao encontrada.");
           }
       }else{
           System.out.println("Nao foram encontradas pessoas cadastradas.");
       }
    }
}
