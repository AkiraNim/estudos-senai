package classesJava01;

public class Caneta {
	public String modelo;
	public String cor;
	protected String tampa;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		if(this.tampada==true) this.tampa="Sim";
		else this.tampa="Não";
		
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Carga: "+ this.carga);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Uma caneta "+ this.cor);
		System.out.println("Está tampada? " + this.tampa);
	}
	private void rabiscar() {
		if(this.tampada==true) {
			System.out.println("Erro, caneta tampada!!");
			
		}
		else System.out.println("Estou rabiscando");
	}
	protected void tampar() {
		this.tampada=true;
		this.tampa="Sim";
	}
	protected void destampar() {
		this.tampada=false;
		this.tampa="Nao";
	}

}
