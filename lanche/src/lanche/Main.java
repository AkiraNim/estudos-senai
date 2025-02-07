package lanche;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int codigo = 0;
        int escolha = 0;
        boolean sair = false;
        List<Lanche> lanche = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (!sair) {
            System.out.println("Bem vindo ao sistema de lanches PICA - Polo Industrial Cães Asmáticos"
                    + "\n[1]- Cadastrar um lanche."
                    + "\n[2] - Vender um lanche."
                    + "\n[3] - Sair.");
            
            escolha = obterEntradaInteira(scanner);
            
            switch (escolha) {
                case 1:
                    System.out.println("\nVocê escolheu cadastrar um lanche.");
                    System.out.println("\nDigite o nome do lanche.");
                    String nome = scanner.next();
                    
                    System.out.println("\nDigite o preço do lanche.");
                    float preco = obterEntradaFloat(scanner);
                    
                    System.out.println("\nDigite o caminho da imagem do lanche.");
                    String imagem = scanner.next();
                    imagem = imagem.replace("/", "\\");
                   
                    Path caminhoImagem = copiarArquivos(Paths.get(imagem), Paths.get("Imagens"));
                    
                    if(caminhoImagem == null) {
                    	System.out.println("Erro ao copiar a imagem. Cadastro cancelado.");
                        break;
                    }
                    
                    Lanche lanche2 = new Lanche(codigo, nome, preco, caminhoImagem.toString());
                    lanche.add(lanche2);
                    
                    System.out.println("\nLanche " + nome + ", codigo "+ codigo +" cadastrado com sucesso.");
                    codigo++;
                    break;
                
                case 2:
                    System.out.println("\nVocê escolheu vender um lanche.");
                    if (!lanche.isEmpty()) {
                        System.out.println("\nDigite o código do lanche.");
                        int codigo2 = obterEntradaInteira(scanner);
                        
                        for (Lanche lanche3 : lanche) {
                            if (lanche3.getCodigo() == codigo2) {
                                System.out.println("\nO lanche " + lanche3.getEspecificacao() + " custa R$"
                                        + lanche3.getPreco() + ".\nQuantos gostaria de comprar?");
                                int quantidade = obterEntradaInteira(scanner);
                                
                                int opcao = 0;
                                while (opcao != 1 && opcao != 2) {
                                    System.out.println("O total de " + quantidade + " " + lanche3.getEspecificacao() + " é " + (quantidade * lanche3.getPreco())
                                            + "\nEscolha uma opção:"
                                            + "\n[1] - Comprar."
                                            + "\n[2] - Sair.");
                                    
                                    opcao = obterEntradaInteira(scanner);
                                    if (opcao == 1) {
                                        System.out.println("Lanche comprado.");
                                        break;
                                    } else if (opcao == 2) {
                                        System.out.println("Saindo.");
                                        break;
                                    } else {
                                        System.out.println("Opção inválida.");
                                    }
                                }
                            }
                        }
                    } else {
                        System.out.println("\nNenhum lanche foi cadastrado.");
                    }
                    break;
                
                case 3:
                    System.out.println("\nVocê escolheu sair.");
                    sair = true;
                    break;
                
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
    
    public static int obterEntradaInteira(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nVocê precisa digitar um número inteiro.");
                scanner.next();
            }
        }
    }
    
    public static float obterEntradaFloat(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("\nVocê precisa digitar um número válido.");
                scanner.next();
            }
        }
    }
    
    public static Path copiarArquivos(Path origem, Path pastaDestino) {
    	try {
    		if(!Files.exists(pastaDestino)) {
    			Files.createDirectories(pastaDestino);
    		}
    		Path destino = pastaDestino.resolve(origem.getFileName());
    		Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
    		return destino;
    		
    	}catch(IOException e){
    		System.out.println("\nErro ao copiar a imagem: " + e.getMessage());
            return null;
    	}
    }
}