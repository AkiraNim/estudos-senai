package aula07;

public class Cachorro extends Animal{
	
	protected String cor;

	public Cachorro(String nome, int idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String late() {
		return "AuAu";
	}
	
}
