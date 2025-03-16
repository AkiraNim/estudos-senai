package aula13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteHashMap {
	public static void main(String[] args) {
		Map<String, String> pessoas = new TreeMap<>();
		
		pessoas.put("12345678910", "Jorge");
		pessoas.put("123456789", "Jilson");
		pessoas.put("12345678", "Amelson");
		
		System.out.println(pessoas.keySet());
		System.out.println(pessoas.values());
	}
}
