package aula13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet02 {
	private int idade;

	public ExemploSet02(int idade) {
		super();
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "ExemploSet02 [idade=" + idade + "]";
	}
	
	public static void main(String[] args) {
		Set<ExemploSet02> dogs = new HashSet<>();
		
		dogs.add(new ExemploSet02(2));
		dogs.add(new ExemploSet02(1));
		dogs.add(new ExemploSet02(3));
		dogs.add(new ExemploSet02(5));
		dogs.add(new ExemploSet02(4));
		
		for (ExemploSet02 dog : dogs) {
			System.out.println(dog);
		}
		
		Set<Integer> ints = new TreeSet<>();
		
		ints.add(2);
		ints.add(1);
		ints.add(3);
		ints.add(5);
		ints.add(4);
		
		for (Integer integer : ints) {
			System.out.println("Treeset: "+integer);
		}
		
		Set<ExemploSet02> dog = new LinkedHashSet<>();
		
		dog.add(new ExemploSet02(2));
		dog.add(new ExemploSet02(1));
		dog.add(new ExemploSet02(3));
		dog.add(new ExemploSet02(5));
		dog.add(new ExemploSet02(4));
		
		for (ExemploSet02 dog1 : dog) {
			System.out.println(dog1);
		}
	}
}
