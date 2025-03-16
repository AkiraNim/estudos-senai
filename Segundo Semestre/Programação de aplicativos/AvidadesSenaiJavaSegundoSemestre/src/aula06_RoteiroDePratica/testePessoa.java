
package aula06_RoteiroDePratica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testePessoa {
    public static void main(String[] args) {
        int option;
        boolean execute = true;
        
        List <Pessoa> person = new ArrayList<>();
        
        while(execute){
            System.out.println("Bem vindo ao sistema de cadastro de pessoas CHUPA - Cadastro Humano Universal Paulo Afonso"
                    + "\n\nSelecione uma opcao."
                    + "\n[1]-Cadastrar pessoa."
                    + "\n[2]-Buscar pessoa."
                    + "\n[3]-Sair do sistema.");
            
            option = new Scanner(System.in).nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Voce escolheu cadastrar uma pessoa.");
                    
                    CadastrarPessoa cadastrarPessoa = new CadastrarPessoa();
                    cadastrarPessoa.cadastrarPessoa((ArrayList<Pessoa>) person);
                    break;
                case 2:
                    System.out.println("Voce escolheu buscar uma pessoa.");
                    
                    BuscarPessoa buscarPessoa = new BuscarPessoa();
                    buscarPessoa.buscarPessoa((ArrayList<Pessoa>) person);
                    break;
                case 3:
                    System.out.println("Voce escolheu sair.");
                    execute = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
        }
    }
    
}
