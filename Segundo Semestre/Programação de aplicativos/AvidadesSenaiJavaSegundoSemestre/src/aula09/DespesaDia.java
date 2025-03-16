package aula09;

public class DespesaDia extends DespesaMes{
	private int dia;
	
	public DespesaDia(int dia, int mes, double valor) {
		super(mes, valor);
		this.dia = dia;
	}
	public int getDia() {
		return dia;
	}
	
}
