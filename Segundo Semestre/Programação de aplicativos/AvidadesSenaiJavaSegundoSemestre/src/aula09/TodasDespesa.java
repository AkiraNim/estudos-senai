package aula09;

import java.util.ArrayList;
import java.util.List;

public class TodasDespesa{
	
	private List<DespesaMes> despesas;
	private String cpf;
	
	
	
	public TodasDespesa(List<DespesaMes> despesas, String cpf) {
		super();
		this.despesas = despesas;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public DespesaMes totalizaMes(int mes) {
		double total = 0;
		
		for (DespesaMes despesa : despesas) {
			if(despesa.getMes()== mes) {
				total += despesa.getValor();
			}
		}
		
		DespesaMes despesa = new DespesaMes(mes, total);
		return despesa;
	}
}
