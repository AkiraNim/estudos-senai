package aula04;

import java.util.Scanner;

public class TesteBombaCombustivel {
	public static final int SIZE = 3;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		boolean execute = true;
		int option;
		boolean empty = true;
		boolean runLoop;
		int id = 0;
		
		BombaCombustivel fuelPump[] = new BombaCombustivel[SIZE];
		
		while(execute) {
			empty = true;
			
			for(int i=0;i<fuelPump.length;i++) {
				if(fuelPump[i]!=null) {
					empty=false;
					break;
				}
			}
			
			System.out.println("\nBem vindo ao sistema de posto de gasolina."
					+ "\n[1]-Cadastrar bomba."
					+ "\n[2]-Usar bomba"
					+ "\n[3]-Editar bomba existente."
					+ "\n[4]-Remover bomba existente."
					+ "\n[5]-Sair.");
			
			option = new Scanner(System.in).nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Você escolheu cadastrar uma bomba.\n");
					
					boolean full=true;
					
					for(int i=0;i<fuelPump.length;i++) {
						if(fuelPump[i]==null) {
							full=false;
							id=i;
							break;
						}
					}
					
					if(!full) {
						runLoop = true;
						String fuelType = "0";
						
						while(runLoop) {
							System.out.println("Selecione o tipo de combustivel da bomba.");
							
							System.out.println("[1]-Gasolina comum."
									+ "\n[2]-Gasolina aditivada."
									+ "\n[3]-Etanol comum."
									+ "\n[4]-Etanol aditivado."
									+ "\n[5]-Diesel comum."
									+ "\n[6]-Diesel aditivado.");
							
							option = new Scanner(System.in).nextInt();
							switch(option) {
								case 1:
									System.out.println("\nVocê escolheu gasolina comum.");
									fuelType = "Gasolina comum.";
									runLoop=false;
									break;
								case 2:
									System.out.println("\nVocê escolheu gasolina aditivada.");
									fuelType = "Gasolina aditivada.";
									runLoop=false;
									break;
								case 3:
									System.out.println("\nVocê escolheu etanol comum.");
									fuelType = "Etanol comum.";
									runLoop=false;
									break;
								case 4:
									System.out.println("\nVocê escolheu etanol aditivado.");
									fuelType = "Etanol aditivado.";
									runLoop=false;
									break;
								case 5:
									System.out.println("\nVocê escolheu diesel comum.");
									fuelType = "Diesel comum.";
									runLoop=false;
									break;
								case 6:
									System.out.println("\nVocê escolheu diesel aditivado.");
									fuelType = "Diesel aditivado.";
									runLoop=false;
									break;
								default:
									System.out.println("\nOpção invalida.\n");
									break;
							}
						}
						
						System.out.println("Digite o valor do litro do combustivel.(Apenas numeros e virgulas.)");
						float valueLiter = new Scanner(System.in).nextFloat();
						
						System.out.println("Digite a quantidade de combustivel na bomba.");
						float quantityFuel = new Scanner(System.in).nextFloat();
						
						System.out.println("Numero da bomba "+id);
						
						fuelPump[id] = new BombaCombustivel(id, fuelType, valueLiter, quantityFuel);
					}else {
						System.out.println("Numero maximo de bombas cadastradas.");
					}
					break;
				case 2:
					System.out.println("Você escolheu usar uma bomba.\n");
					
					runLoop=true;
					
					if(!empty) {
						System.out.println("Digite o numero da bomba.");
						id = new Scanner(System.in).nextInt();
						
						while(runLoop) {
							if(fuelPump[id]!=null) {
								System.out.println("Bomba numero:"+fuelPump[id].getId()
										+"\nTipo de combustivel: "+fuelPump[id].getFuelType()
										+"\nValor do litro: R$"+fuelPump[id].getValueLiter()
										+"\nQuantidade de litros disponiveis: "+fuelPump[id].getQuantityFuel()
										+"\n\nSelecione uma opção."
										+ "\n[1]-Abastecer."
										+ "\n[2]-Voltar ao menu.");
								option = new Scanner(System.in).nextInt();
								
								switch(option) {
									case 1:
										System.out.println("Selecione uma opção."
												+ "\n[1]-Abastecer por litro."
												+ "\n[2]-Abastecer por preço.");
										option = new Scanner(System.in).nextInt();
										
										switch(option) {
											case 1:
												System.out.println("Quantos litros você vai pôr?");
												float quantityFuel = new Scanner(System.in).nextFloat();
												
												System.out.println(quantityFuel+" litros são R$"+fuelPump[id].getValueLiter()*quantityFuel
														+"\nVocê confirma?"
														+ "\n[1]-Sim."
														+ "\n[2]-Não");
												
												option = new Scanner(System.in).nextInt();
												
												if(option==1) {
													if(fuelPump[id].fillByLiter(quantityFuel)) {
														System.out.println("\nVoce abasteceu "+quantityFuel+" litros.");
													}
													else {
														System.out.println("Não há combustivel suficiente na bomba.");
													}
												}
												break;
											case 2:
												break;
											default:
												System.out.println("Opção invalida.");
												break;
										}
										break;
									case 2:
										System.out.println("Voltando ao menu.");
										runLoop=false;
										break;
									default:
										break;
								}
							}else {
								System.out.println("Bomba invalida."
										+ "\nSelecione uma opção."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								option = new Scanner(System.in).nextInt();
								
								if(option==2) {
									runLoop=false;
									break;
								}
							}
						}
					}else {
						System.out.println("Nenhuma bomba foi encontrada.");
					}
					break;
				case 3:
					System.out.println("Você escolheu editar uma bomba.\n");
					break;
				case 4:
					System.out.println("Você escolheu remover uma bomba.\n");
					
					if(!empty) {
						
					}else {
						System.out.println("Nenhuma bomba foi encontrada.");
					}
					break;
				case 5:
					System.out.println("Você escolheu sair.\n");
					execute=false;
					break;
				default:
					System.out.println("Opção invalida.\n");
					break;
			}
		}

	}
}
