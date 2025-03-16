package aula10;

public class Circulo implements ObjetoGeometrico{
	private double centro;
	private double raio;
	private double diametro;
	
	public Circulo(double centro) {
		super();
		this.centro = centro;
		diametro = centro*2;
	}
	
	@Override
	public double calcularArea() {
		raio = diametro/2;
		return Math.PI*raio*raio;
	}

	@Override
	public double calcularPerimetro() {
		raio = diametro/2;
		return Math.PI*2*raio;
	}
	
}

