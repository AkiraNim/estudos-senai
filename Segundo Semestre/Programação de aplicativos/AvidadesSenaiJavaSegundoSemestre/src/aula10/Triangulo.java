package aula10;

public class Triangulo implements ObjetoGeometrico{
	private double lado1;
	private double lado2;
	private double lado3;
	private double s;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		
	}

	@Override
	public double calcularArea() {
		s=(lado1+lado2+lado3)/2;
		return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
	}

	@Override
	public double calcularPerimetro() {
		return lado1+lado2+lado3;
	}

}
