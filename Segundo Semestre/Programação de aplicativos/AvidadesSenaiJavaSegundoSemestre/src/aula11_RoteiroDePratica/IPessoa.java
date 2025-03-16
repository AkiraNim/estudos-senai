package aula11_RoteiroDePratica;

import java.util.List;

public interface IPessoa {
	public void editar(List<Pessoa> pessoas, String nome, int id, int idade, String cpf_cnpj);
	public String buscar(List<Pessoa> pessoas, String nome, int id, int idade, String cpf_cnpj);
}
