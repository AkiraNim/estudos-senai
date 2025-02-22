package com.example.demo;

import com.example.demo.applications.LancheApplication;
import com.example.demo.entities.Lanche;
import com.example.demo.facade.LancheFacade;
import com.example.demo.respositories.LancheRepository;
import com.example.demo.services.LancheService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

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
					+ "\n[3] - Listar lamches."
					+ "\n[4] - Sair.");

			escolha = obterEntradaInteira(scanner);


		}
	}

	private void injetarDependencias(){
		LancheRepository lancheRepository = new LancheRepository();
		LancheService lancheService = new LancheService();
		LancheApplication lancheApplication = new LancheApplication(lancheService, lancheRepository);
		LancheFacade lancheFacade = new LancheFacade(lancheApplication);
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
