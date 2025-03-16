package aula09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenteProdutos {
	
 List <IProdutosFabricado> produtosFabricados = new ArrayList<>();
	protected List <IProduto> produtosComprados = new ArrayList<>();
	
	public List<String> ingredientes(String nome) {
		List<String> ingredientes = new ArrayList<>();
		
		
		for (IProdutosFabricado iProduto : produtosFabricados) {
			if(iProduto.getNome().equals(nome)) {
				for(int i = 0; i < iProduto.getNumeroIngredientes(); i++) {
					ingredientes.add(iProduto.getIngrediente(i).getNome());
					
				}
			}
		}
		return ingredientes;
	}
	
	public double valorCompra(String nome) {
		double custo = 0;
		
		for (IProduto iProduto : produtosComprados) {
			if(iProduto.equals(nome)) {
				custo += iProduto.getCusto();
			}
		}
		return custo;
	}
}
