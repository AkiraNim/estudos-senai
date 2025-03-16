package aula09;

public class ProdutoComprado implements IProduto{
	
	private String nome;
	private double valorDeCompra;
	
	public ProdutoComprado(String nome, double valorDeCompra) {
		this.nome = nome;
		this.valorDeCompra = valorDeCompra;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getCusto() {
		return this.valorDeCompra;
	}

}
