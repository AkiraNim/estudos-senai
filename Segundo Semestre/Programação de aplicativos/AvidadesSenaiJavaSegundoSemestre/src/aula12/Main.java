package aula12;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> pessoas = new ArrayList<>();
		
		pessoas.add("Jorge");
		pessoas.add("Jilson");
		pessoas.add("Gilson");
		System.out.println(pessoas);
		
		pessoas.addFirst("Leandro");
		System.out.println(pessoas);
		
		pessoas.addLast("Vito");
		System.out.println(pessoas);
		
		List<String> pessoas2 = new ArrayList<>();
		
		pessoas2.add("Amelson");
		pessoas2.add("Marselo");
		
		pessoas.addAll(pessoas2);
		System.out.println(pessoas);
		
		System.out.println(pessoas.contains("Jilson"));
		System.out.println(pessoas.contains("Gilson"));
		System.out.println(pessoas.containsAll(pessoas2));
		
		System.out.println(pessoas.get(3));
		System.out.println(pessoas.getFirst());
		System.out.println(pessoas.getLast());
		
		System.out.println(pessoas.indexOf("Jorge"));
		System.out.println(pessoas.lastIndexOf("Amelson"));
		
		System.out.println(pessoas.isEmpty());
		
		pessoas.remove("Jilson");
		System.out.println(pessoas);
		
		pessoas.remove(2);
		System.out.println(pessoas);
		
		pessoas.removeFirst();
		System.out.println(pessoas);
		
		pessoas.removeLast();
		System.out.println(pessoas);
		
		pessoas.removeAll(pessoas2);
		System.out.println(pessoas);
		
		System.out.println(pessoas.reversed());
		
		pessoas.set(1, "Jorge");
		System.out.println(pessoas);
		
		pessoas.addAll(pessoas2);
		
		System.out.println(pessoas.subList(1, 3));
		
		Object[] toArray = pessoas.toArray();
		
		pessoas.clear();
		System.out.println(pessoas);

	}
}
