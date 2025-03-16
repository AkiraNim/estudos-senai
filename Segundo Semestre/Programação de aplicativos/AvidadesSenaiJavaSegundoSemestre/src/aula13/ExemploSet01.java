package aula13;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ExemploSet01 {
	private String nome;

	public ExemploSet01(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExemploSet01 other = (ExemploSet01) obj;
		return Objects.equals(nome, other.nome);
	}

	public static void main(String[] args) {
		Set<ExemploSet01> conjPaises = new HashSet<>();
		
		conjPaises.add(new ExemploSet01("Brasil"));
		conjPaises.add(new ExemploSet01("Angola"));
		conjPaises.add(new ExemploSet01("Alemanha"));
		conjPaises.add(new ExemploSet01("Alemanha"));
		
		System.out.println(conjPaises.size());
	}
}
