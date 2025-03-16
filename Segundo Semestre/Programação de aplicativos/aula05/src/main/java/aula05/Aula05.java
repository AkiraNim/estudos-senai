package aula05;
public class Aula05 {

	public static void main(String[] args) {
		ContaBanco pessoa1 = new ContaBanco();
		
		pessoa1.setNumeroConta(5555);
		pessoa1.setDono("Jorge");
		pessoa1.abrirConta("CC");
		pessoa1.depositar(100);
		pessoa1.estadoAtual();
		
		
		System.out.printf("\n\n");
		
		ContaBanco pessoa2 = new ContaBanco();
		
		pessoa2.setNumeroConta(23555);
		pessoa2.setDono("Joana");
		pessoa2.abrirConta("CP");
		pessoa2.depositar(500);
		pessoa2.sacar(1000);
		pessoa2.estadoAtual();
		
	}

}
