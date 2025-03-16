package aula05;

public class Funcionario {
	
	private String name;
	private double salary;
	@SuppressWarnings("unused")
	private float percentage;
	private String password;
	private String code;
	


	public Funcionario(String name, double salary, String password, String code) {
		this.name = name;
		this.salary = salary;
		this.password = password;
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	
	
	public double increaseSalary(double percentage) {
		this.salary = this.salary +(this.salary*(percentage/100));
		return salary;
	}
	
}
