package aula07parte2;


public class Gato extends Animal{
	protected String cor;

	public Gato(String nome, String raca, String cor) {
		super(nome, raca);
		this.cor = cor;
	}

	public String mia() {
		return "Miau Por Favor";
	}
	
	
}
