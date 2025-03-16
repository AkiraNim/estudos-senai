package aula02;

public class Funcionario {
	
	private String name;
	private double salary;
	@SuppressWarnings("unused")
	private float percentage;
	
	public Funcionario(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public double aumentarSalario(double percentage) {
		this.salary = this.salary +(this.salary*(percentage/100));
		return salary;
	}
	

}
