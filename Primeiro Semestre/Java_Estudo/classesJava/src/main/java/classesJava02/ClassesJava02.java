package classesJava02;

public class ClassesJava02 {
	public static void main(String[]args) {
		Caneta02 c1 = new Caneta02("Bic", "Azul", 0.5f);
		
		c1.setModelo("Bic");
		c1.setPonta(0.5f);
		c1.status();
		
		Caneta02 c2 = new Caneta02("NEC", "VERMELHA", 0.9f);
		c2.status();
	}

}
