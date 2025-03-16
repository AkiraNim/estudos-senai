package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteBombaCombustivelArrayList {

	public static void main(String[] args) {
		List<BombaCombustivel> fuelPump = new ArrayList<>();
		
		int option;
		int id = 0;
		boolean execute = true;
		boolean runLoop;
		
		
		while(execute) {
			System.out.println("Bem vindo ao posto de gasolina."
					+ "\n\nSelecione uma opção"
					+ "\n[1]-Cadastrar uma bomba."
					+"\n[2]-Usar bomba."
					+ "\n[3]-Editar bomba."
					+"\n[4]-Listar as bombas."
					+ "\n[5]-Remover uma bomba."
					+ "\n[6]-Sair.");
			
			option = new Scanner(System.in).nextInt();
			switch(option) {
				case 1:
					System.out.println("\nVoce escolheu Cadastrar uma bomba.\n");
					
					runLoop = true;
					String fuelType = "";
					
					while(runLoop) {
						System.out.println("Qual o tipo de combustivel?"
								+ "\n\nSelecione uma opção."
								+ "\n[1]-Gasolina comum."
								+ "\n[2]-Gasolina aditivada."
								+ "\n[3]-Etanol."
								+ "\n[4]-Diesel."
								+ "\n[5]-Gás GNV.");
						
						option = new Scanner(System.in).nextInt();
						switch(option) {
							case 1: 
								System.out.println("\nVoce escolheu Gasolina comum.");
								fuelType = "Gasolina comum";
								runLoop = false;
								break;
							
							case 2: 
								System.out.println("\nVoce escolheu Gasolina aditivada.");
								fuelType = "Gasolina aditivada";
								runLoop = false;
								break;
								
							case 3: 
								System.out.println("\nVoce escolheu Etanol.");
								fuelType = "Gasolina Etanol";
								runLoop = false;
								break;
							
							case 4: 
								System.out.println("\nVoce escolheu Diesel.");
								fuelType = "Gasolina Diesel";
								runLoop = false;
								break;
							
							case 5: 
								System.out.println("\nVoce escolheu Gás GNV.");
								fuelType = "Gasolina Gás GNV";
								runLoop = false;
								break;
							
							default:
								System.out.println("\nOpção inválida.");
								break;
						}
						System.out.println("Digite o valor do litro do combustivel (Números e vírgulas somente).");
						float valueLiter = new Scanner(System.in).nextFloat();
						
						System.out.println("Digite a quantidade de combustivel na bomba.");
						float quantityFuel = new Scanner(System.in).nextFloat();
						
						BombaCombustivel fuelPumps = new BombaCombustivel(id, fuelType, valueLiter, quantityFuel);
						fuelPump.add(fuelPumps);
						
						id++;
					}
					
					break;
					
				case 2:
					System.out.println("\nVoce escolheu Usar uma bomba.\n");

					if(!fuelPump.isEmpty()) {
						runLoop = true;
						boolean canEditPump = false;
						int index = 0;
						
						while(runLoop) {
							System.out.println("\nDigite o id da bomba.");
							index = new Scanner(System.in).nextInt();
							
							boolean foundPump = false;
							
							
							for (BombaCombustivel fuelPumpFor : fuelPump) {
								if(fuelPumpFor.getId() == fuelPump.get(index).getId()) {
									foundPump = true;
									canEditPump = true;
									runLoop = false;
									break;
								}
							}
							if(!foundPump) {
								System.out.println("\nBomba não encontrada."
										+ "\n[1]-Tentar novamente."
										+ "\n[2]-Voltar ao menu.");
								
								option = new Scanner(System.in).nextInt();
								if(option == 2) {
									runLoop = false;
								}
							}
						}
						
						while(canEditPump) {
							System.out.println("\nBomba id: "+ fuelPump.get(index).getId()
							+"\nTipo de combustível: "+fuelPump.get(index).getFuelType()
							+"\nQuantidade de combustível na bomba: "+fuelPump.get(index).getQuantityFuel());
							System.out.printf("\nValor do litro do combustível: R$%.2f\n",fuelPump.get(index).getValueLiter());
							
							System.out.println("Selecione uma opção."
									+ "\n[1]-Abastecer por litro."
									+ "\n[2]-Abastecer pelo valor."
									+ "\n[3]-Voltar ao menu."
									+ "\n[4]-Sair.");
							
							option = new Scanner(System.in).nextInt();
							switch(option) {
								case 1:
									System.out.println("\nVoce escolheu Abastecer por litro.\n");
									
									System.out.println("Digite quanto quer abastecer (Apenas numeros e vírgulas.).");
									float fillByLiter = new Scanner(System.in).nextFloat();
									fuelPump.get(index).fillByLiter(fillByLiter);
									
									System.out.println("\nForam abastecidos "+fillByLiter
											+" com sucesso.\n");
									break;
								case 2:
									System.out.println("\nVoce escolheu Abastecer pelo valor.\n");
									
									System.out.println("Digite quanto quer abastecer (Apenas numeros e vírgulas.).");
									float fillByValue = new Scanner(System.in).nextFloat();
									fuelPump.get(index).fillByValue(fillByValue);
									
									System.out.printf("\n\nForam abastecidos R$%.2f com sucesso.\n", fillByValue);
									break;
								case 3:
									System.out.println("\nVoce escolheu Voltar ao menu.\n");
									canEditPump = false;
				
									break;
								case 4:
									System.out.println("\nVoce escolheu Sair.\n");
									canEditPump = false;
									execute = false;
									
									break;
								default:
									System.out.println("\nOpção inválida.\n");
									break;
							}
							
						}
						
					}else {
						System.out.println("Não há bombas cadastradas.");
					}
					
					break;
					
				case 3:
					System.out.println("\nVoce escolheu Editar bomba.\n");
					if(!fuelPump.isEmpty()) {
						
					}else {
						System.out.println("Não há bombas cadastradas.");
					}
					
					break;
				case 4:
					System.out.println("\nVoce escolheu Listar as bombas\n");

					if(!fuelPump.isEmpty()) {
						System.out.println("--------------------------------------");
						
						for (BombaCombustivel fuelPumpFor : fuelPump) {
							System.out.println("\nBomba id: "+ fuelPumpFor.getId()
							+"\nTipo de combustível: "+fuelPumpFor.getFuelType()
							+"\nQuantidade de combustível na bomba: "+fuelPumpFor.getQuantityFuel());
							System.out.printf("\nValor do litro do combustível: R$%.2f\n",fuelPumpFor.getValueLiter());
						}
						
						System.out.println("--------------------------------------");
						
					}else {
						System.out.println("Não há bombas cadastradas.");
					}
					
					break;
				case 5:
					System.out.println("\nVoce escolheu Remover uma bomba.\n");

					if(!fuelPump.isEmpty()) {
						
					}else {
						System.out.println("Não há bombas cadastradas.");
					}
					
					break;
				case 6:
					System.out.println("\nVoce escolheu Sair.\n");
					execute = false;
					
					break;
				default:
					System.out.println("\nOpção inválida. \n");
					
					break;
			}
		}
	}
}
