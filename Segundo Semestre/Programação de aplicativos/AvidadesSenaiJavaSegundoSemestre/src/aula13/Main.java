package aula13;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Jorge");
		fila.add("Jilson");
		fila.add("Amelson");
		
		fila.poll();
		
		System.out.println(fila.peek());
	}
}
