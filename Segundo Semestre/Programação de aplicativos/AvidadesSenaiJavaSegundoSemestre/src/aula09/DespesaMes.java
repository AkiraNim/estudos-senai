package aula09;

public class DespesaMes {
	protected int mes;
	protected double valor;
	
	public DespesaMes(int mes, double valor) {
		this.mes = mes;
		this.valor = valor;
	}
	
	public int getMes() {
		return mes;
	}
	
	public double getValor() {
		return valor;
	}
}
