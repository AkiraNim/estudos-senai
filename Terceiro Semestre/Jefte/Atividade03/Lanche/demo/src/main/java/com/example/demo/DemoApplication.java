package com.example.demo;

import com.example.demo.applications.LancheApplication;
import com.example.demo.entities.Lanche;
import com.example.demo.facade.LancheFacade;
import com.example.demo.repositories.LancheRepositoryImpl;
import com.example.demo.services.LancheService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	private static LancheRepositoryImpl lancheRepositoryImpl;
	private static LancheService lancheService;
	private static LancheApplication lancheApplication;
	private static LancheFacade lancheFacade;

	public static void main(String[] args) {
		injetarDependencias();

		String destino = "src\\main\\java\\com\\example\\demo\\Imagens";
		int codigo = 0;
		boolean sair = false;

		Scanner scanner = new Scanner(System.in);

		while (!sair) {
			System.out.println("Bem vindo ao sistema de lanches PICA - Polo Industrial Cães Asmáticos"
					+ "\n[1] - Cadastrar um lanche."
					+ "\n[2] - Atualizar um lanche."
					+ "\n[3] - Remover um lamche."
					+ "\n[4] - Listar lamches."
					+ "\n[5] - Vender um lanche."
					+ "\n[6] - Sair.");

			int escolha = obterEntradaInteira(scanner);

			switch(escolha){
				case 1:
					System.out.println("\nVocê escolheu cadastrar um lanche.");
					System.out.println("\nDigite o nome do lanche.");
					String nome = scanner.next();

					System.out.println("\nDigite o preço do lanche.");
					float preco = obterEntradaFloat(scanner);

					System.out.println("\nDigite o caminho da imagem do lanche.");
					String img_url = scanner.next();

					System.out.println("\nLanche " + nome + ", codigo "+ codigo +" cadastrado com sucesso.");
					lancheFacade.cadastrar(new Lanche(codigo++, nome, preco, img_url), destino);

					break;
				case 2:
					System.out.println("\nVocê escolheu atualizar um lanche.");
					System.out.println("\nDigite o codigo do lanche.");

					int codigo2 = obterEntradaInteira(scanner);
					if(lancheFacade.buscarPorCodigo(codigo2)!=null){
						Lanche lancheAtt = lancheFacade.buscarPorCodigo(codigo2);

						System.out.println("\nDigite o nome do lanche.");
						String nome2 = scanner.next();

						System.out.println("\nDigite o preço do lanche.");
						float preco2 = obterEntradaFloat(scanner);

						System.out.println("\nDigite o caminho da imagem do lanche.");
						String img_url2 = scanner.next();

						lancheAtt.setImagem(img_url2);
						lancheAtt.setNome(nome2);
						lancheAtt.setPreco(preco2);

						lancheFacade.atualizar(codigo2, lancheAtt, destino);
					}
					else{
						System.out.println("\nLanche não encontrado.");
					}
					break;

				case 3:
					System.out.println("\nVocê escolheu remover um lanche.");
					System.out.println("\nDigite o codigo do lanche.");
					int codigo3 = obterEntradaInteira(scanner);

					Lanche lanche = lancheFacade.buscarPorCodigo(codigo3);

					if(lanche!=null){
						lancheFacade.remover(codigo3, destino);
						System.out.println("\nLanche removido.");
					}
					else {
						System.out.println("\nLanche nao encontrado.");
					}

					break;

				case 4:
					System.out.println("--------------------------------------\n CÓDIGO\tNOME\t\tPRECO\n--------------------------------------");
					List<Lanche> lanches = lancheFacade.buscar();
					for (Lanche l : lanches) {
						System.out.println(l.getCodigo() + "\t\t" + l.getNome() + "\t\t" + l.getPreco() + "\n");
					}
					break;
				case 5:
					System.out.println("Digite o código do lanche:");
					int cod = obterEntradaInteira(scanner);
					System.out.println("Digite a quantidade:");
					int qtd = obterEntradaInteira(scanner);
					Lanche lanche2 = lancheFacade.buscarPorCodigo(cod);
					if(lanche2!=null){
						String total = String.format("%.2f", lancheFacade.calcularLanche(lanche2, qtd));
						System.out.println("Total: R$ " + total);
					}

					break;
				case 6:
					sair = true;
					break;
				default:
					System.out.println("\nOpcao invalida");
					break;
			}

		}
	}

	private static void injetarDependencias() {
		lancheRepositoryImpl = new LancheRepositoryImpl();
		lancheService = new LancheService();
		lancheApplication = new LancheApplication(lancheService, lancheRepositoryImpl);
		lancheFacade = new LancheFacade(lancheApplication);
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

}
