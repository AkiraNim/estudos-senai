package aula09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {

		GerenteProdutos gerenteProdutos = new GerenteProdutos();
		
		boolean sair = false;
		
		while(!sair) {
			System.out.println("1-Cadastrar produto comprado"
					+"\n2-Cadastrar produto fabricado"
					+"\n3-Menu produto comprado"
					+"\n4-Menu produto fabricado"
					+"\n5- Sair");
			int option = new Scanner(System.in).nextInt();
			
			switch(option) {
				
				case 1:
					System.out.println("Digite o nome do produto comprado:");
					String nome = new Scanner(System.in).next();
					
					System.out.println("Digite o valor do produto comprado: ");
					double custo = new Scanner(System.in).nextDouble();
					
					ProdutoComprado produtosComprado = new ProdutoComprado(nome, custo);
					gerenteProdutos.produtosComprados.add(produtosComprado);
					
					break;
				case 2:
					System.out.println("Digite o nome do produto fabricado:");
					nome = new Scanner(System.in).next();
					
					System.out.println("Digite o nome do ingrediente que vai nele: ");
					String nomeFabricado = new Scanner(System.in).next();
					
					boolean acabou = false;
					boolean achou = false;
					List<IProduto> listaIngredientes = new ArrayList<>();
					
					while(!acabou) {
						for (IProduto produtosComprado2 : gerenteProdutos.produtosComprados) {
							if(produtosComprado2.getNome().equals(nomeFabricado)) {
								listaIngredientes.add(produtosComprado2);
								achou = true;
							}
						}
						if(!achou) {
							System.out.println("Produto não encontrado.");
						}
						System.out.println("Deseja adicionar mais um ingrediente?\n1-Sim"
								+ "\n2-Nao");
						option = new Scanner(System.in).nextInt();
						
						if(option == 1) {
							System.out.println("Digite o nome do ingrediente que vai nele: ");
							nomeFabricado = new Scanner(System.in).next();
						}else {
							acabou = true;
						}
						ProdutoFabricado produtoFabricado = new ProdutoFabricado(nome, listaIngredientes);
						gerenteProdutos.produtosFabricados.add(produtoFabricado);
					}
					break;
				case 3:
					if(!gerenteProdutos.produtosComprados.isEmpty()) {
						achou = false;
						
						System.out.println("\nMenu produtos comprados"
								+"\n1-Listar um produto"
								+"\n2-Listar todos os produtos");
						option = new Scanner(System.in).nextInt();
						switch(option) {
							case 1:
								System.out.println("Digite o nome do produto");
								nome = new Scanner(System.in).next();
								
								for (IProduto produtosComprado2 : gerenteProdutos.produtosComprados) {
									if(produtosComprado2.getNome().equals(nome)) {
										System.out.println("\nNome: "+produtosComprado2.getNome()
										+"\nCusto: R$\n\n"+produtosComprado2.getCusto());
										achou = true;
									}
								}
								if(!achou) {
									System.out.println("Produto não encontrado.");
								}
								break;
							case 2:
								for (IProduto produtosComprado2 : gerenteProdutos.produtosComprados) {
									System.out.println("\nNome: "+produtosComprado2.getNome()
									+"\nCusto: R$\n\n"+produtosComprado2.getCusto());
								}
						}
					
					}
					else {
						System.out.println("Nao foram cadastrados produtos comprados.");
						break;
					}
				case 4:
					if(!gerenteProdutos.produtosFabricados.isEmpty()) {
						achou = false;
						
						System.out.println("\nMenu produtos fabricados"
								+"\n1-Listar um produto"
								+"\n2-Listar todos os produtos");
						option = new Scanner(System.in).nextInt();
						
						switch(option) {
							case 1:
								System.out.println("Digite o nome do produto");
								nome = new Scanner(System.in).next();
								
								for (IProdutosFabricado produtosFabricados2 : gerenteProdutos.produtosFabricados) {
									if(produtosFabricados2.getNome().equals(nome)) {
										System.out.println("\nNome: "+produtosFabricados2.getNome()
										+"\nCusto: R$"+produtosFabricados2.getCusto()
										+"\nIngredientes: ");
										System.out.println(gerenteProdutos.ingredientes(nome)
										+"\nTeste");
										achou = true;
									}
								}
								if(!achou) {
									System.out.println("Produto não encontrado.");
								}
								break;
							case 2:
								nome = new Scanner(System.in).next();
								
								for (IProdutosFabricado produtosFabricados2 : gerenteProdutos.produtosFabricados) {
									System.out.println("\nNome: "+produtosFabricados2.getNome()
									+"\nCusto: R$"+produtosFabricados2.getCusto()
									+"\nIngredientes: "+gerenteProdutos.ingredientes(nome)
									+"\n\n");
									
								}
						}
					}
					else {
						System.out.println("Nao foram cadastrados produtos fabricados.");
						break;
					}
				case 5:
					sair = true;
			}
		}
		
	}
}
