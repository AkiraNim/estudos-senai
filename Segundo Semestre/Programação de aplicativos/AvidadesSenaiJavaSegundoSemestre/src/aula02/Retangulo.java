package aula02;

public class Retangulo {
	
	private int base, altura;
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea() {
		return getBase()*getAltura();
	}
	public int calcularPerimetro() {
		return (getBase()+getAltura())*2;
	}
}
