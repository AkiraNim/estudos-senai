package aula07;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica(String nome, int idade, String cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String[] args) {
		PessoaFisica p = new PessoaFisica("jorge", 18,"12");
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		System.out.println(p.nome);
	}

}
