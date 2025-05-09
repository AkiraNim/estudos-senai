package aula11_RoteiroDePratica;

import java.util.List;

public class PessoaJuridica extends Pessoa
	implements IPessoa{
	protected String cnpj;
	
	public PessoaJuridica(int id, int idade, String nome, String cnpj) {
	    super(id, idade, nome);
	    this.cnpj = cnpj;
	}
	
	public String getCnpj() {
	    return cnpj;
	}
	
	public void setCnpj(String cnpj) {
	    this.cnpj = cnpj;
	}
	
	@Override
	public List<Pessoa> cadastrarPessoa(int id, String nome, int idade, String cpf_cnpj, List<Pessoa> pessoas) {
	    pessoas.add(new PessoaJuridica(id, idade, nome, cnpj));
	    return pessoas;
	}
	
	@Override
	public void editar(List<Pessoa> pessoas, String nome, int id, int idade, String cnpj) {
		for (Pessoa pessoa : pessoas) {
			
			if(pessoa instanceof PessoaJuridica && pessoa.getId()==id) {
				int index = pessoas.indexOf(pessoa);
				
				PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoas.get(index);
				
				pessoaJuridica.setNome(nome);
				pessoaJuridica.setCnpj(cnpj);
				pessoaJuridica.setIdade(idade);
				
			}
		}
		
	}
	
	@Override
	public String buscar(List<Pessoa> pessoas, String nome, int id, int idade, String cnpj) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa instanceof PessoaJuridica && pessoa.getId()==id) {
				int index = pessoas.indexOf(pessoa);
				
				PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoas.get(index);
		
				return "\nId: "+ pessoaJuridica.getId()
				+"\nNome: "+ pessoaJuridica.getNome()
				+ "\nIdade: "+pessoaJuridica.getIdade()
				+"Cnpj: "+pessoaJuridica.getCnpj();
			}
		}
		return "\nNão encontrado";
	}
}