package aula09;

public interface IProdutosFabricado extends IProduto{
	public int getNumeroIngredientes();
	public IProduto getIngrediente(int numero);
}
