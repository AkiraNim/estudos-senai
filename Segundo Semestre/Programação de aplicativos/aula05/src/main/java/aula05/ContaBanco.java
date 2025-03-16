package aula05;

public class ContaBanco {
	public int numeroConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	private String aberto;
	
	public void estadoAtual() {
		if(this.getStatus()==true) {
			this.aberto="Ativo";
		}
		else this.aberto="Inativo";
		
		System.out.println("Conta: "+this.getNumeroConta());
		System.out.println("Tipo: "+this.getTipo());
		System.out.println("Dono: "+this.getDono());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Status: "+this.aberto);
	}
	
	public void setNumeroConta(int num) {
		this.numeroConta=num;
	}
	public int getNumeroConta(){
		return this.numeroConta;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	public void setDono(String dono) {
		this.dono=dono;
	}
	public String getDono() {
		return this.dono;
	}
	
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setStatus(boolean status) {
		this.status=status;
	}
	public boolean getStatus() {
		return this.status;
	}
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void abrirConta(String tipo){
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo=="CC") this.setSaldo(50);
		else if(tipo=="CP") this.setSaldo(150);
	}
	
	public void fecharConta() {
		if (this.getSaldo()>0) System.out.println("A conta tem dinheiro, não posso fechar ela");
		else if(this.getSaldo()<0) System.out.println("A conta esta em debito, nao posso fechar ela");
		else {
			this.setStatus(false); 
			System.out.println("A conta foi fechada com sucesso.");
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus()==true) {
			this.setSaldo(this.getSaldo()+valor);
			System.out.println("Valor depositado na conta de "+this.getDono());
		}
		else System.out.println("Impossivel depositar, conta fechada.");
	}
	
	public void sacar(float valor) {
		if(this.getStatus()==true) {
			if(this.getSaldo()>valor) {
				this.setSaldo(this.getSaldo()-valor);
				System.out.println("Valor sacado na conta de "+this.getDono());
			}
			else System.out.println("Saldo insuficiente.");
		}
		else System.out.println("Impossivel sacar.");
	}
	
	public void pagarMensal() {
		float valor=0;
		if (this.getTipo()=="CC") valor = 12;
		else if(this.getTipo()=="CP") valor = 20;
		if(this.getStatus()==true) {
			if(this.getSaldo()>valor) this.setSaldo(this.getSaldo()-valor);
			System.out.print("Pagamento realizado com sucesso");
		}
		else System.out.print("Impossivel pagar");
	}
}
