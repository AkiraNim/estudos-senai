package classesJava02;

public class Caneta02 {
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	private String tampa;
	
	
	public Caneta02(String m, String c, float p) { //metodo construtor
		this.tampar();
		this.modelo=m;
		this.cor=c;
		this.ponta=p;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m){
		this.modelo=m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta=p;
	}
	
	
	public void tampar() {
		this.tampada=true;
		this.tampa="Tampada";
	}
	
	public void destampar() {
		this.tampada=false;
		this.tampa="Destampada";
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		System.out.println("Cor: "+this.cor);
		System.out.println("Status: "+this.tampa);
	}
	
}
