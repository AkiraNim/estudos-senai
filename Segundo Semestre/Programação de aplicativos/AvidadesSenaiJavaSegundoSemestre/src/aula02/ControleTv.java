package aula02;

public class ControleTv {
	
	private int canal, volume;
	
	public ControleTv(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}
	
	public int getCanal() {
		return canal;
	}
	public int getVolume() {
		return volume;
	}
	
	private void setCanal(int canal) {
		this.canal = canal;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void aumentarCanal() {
		 this.canal++;
	}
	public void diminuirCanal() {
		if(this.canal>0) {
			this.canal--;
		}
	}
	
	public void aumentarVolume() {
		if(this.volume<100) {
			this.volume+=5;
		}
		 
	}
	public void diminuirVolume() {
		if(this.volume>0) {
			this.volume-=5;
		}
		 
	}

}
