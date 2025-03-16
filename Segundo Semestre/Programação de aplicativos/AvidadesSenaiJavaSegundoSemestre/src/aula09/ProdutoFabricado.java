package aula09;

import java.util.ArrayList;
import java.util.List;

public class ProdutoFabricado implements IProdutosFabricado{
	
	protected  String nome;
	protected List<IProduto> listaIngredientes = new ArrayList<>();
	
	
	public ProdutoFabricado(String nome, List<IProduto> listaIngredientes) {
		super();
		this.nome = nome;
		this.listaIngredientes = listaIngredientes;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public double getCusto() {
		double custo = 0;
		
		for (IProduto iProduto : listaIngredientes) {
			custo+=iProduto.getCusto();
		}
		
		return custo;
	}
	@Override
	public int getNumeroIngredientes() {
		return listaIngredientes.size();
	}

	@Override
	public IProduto getIngrediente(int numero) {
		return listaIngredientes.get(numero);
	}

}
