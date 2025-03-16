package comparacaoString;

public class ComparacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1 = "Gustavo";
		String n2 = "Gustavo";
		String n3 = new String("Gustavo");
		String res;
		res=(n1.equals(n3))?"igual":"diferente";	
		System.out.println(res);

	}

}
