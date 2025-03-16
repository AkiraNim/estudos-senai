package aula07;

import java.util.ArrayList;
import java.util.List;

public class Pinscher extends Cachorro{
	private int tamanho;

	public Pinscher(String nome, int idade, String cor, int tamanho) {
		super(nome, idade, cor);
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>();
		Cachorro c = new Cachorro ("Cachorro", 3, "Caramelo");
		Pinscher p = new Pinscher("Jilson", 3, "Preto", 2);
		animais.add(c);
		animais.add(p);
		
	}
}
