package vetores;

public class VetorCalendario {

	public static void main(String[] args) {
	
		String meses [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 0; i<meses.length;i++) {
			System.out.println("O mes de "+meses[i]+" tem "+dias[i]+" dias.");
		}
		
		for(int i: dias) {
			System.out.println(i + " ");
		}
	}

}
