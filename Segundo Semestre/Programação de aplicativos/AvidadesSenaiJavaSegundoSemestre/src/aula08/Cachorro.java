package aula08;

public class Cachorro extends Animal2 implements Animal{

	
	public Cachorro(String raca, String cor, double tamanho) {
		super("Chiuaua", "Preto", 1.90);
	}

	@Override
	public String caminha() {
		return "caminhou 5 quilometros based";
	}
	
	public String late() {
		return "AuAu (BASED)";
	}

}
