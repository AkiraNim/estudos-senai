package aula08;

public class Animal2 {
	protected String raca;
	protected String cor;
	protected double tamanho;

	public Animal2(String raca, String cor, double tamanho) {
		super();
		this.raca = raca;
		this.cor = cor;
		this.tamanho = tamanho;
	}
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
