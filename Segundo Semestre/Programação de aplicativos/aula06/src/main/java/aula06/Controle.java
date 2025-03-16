package aula06;

public class Controle {

	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		
		controle.ligar();
		controle.maisVolume();
		controle.play();
		controle.ligarMudo();
		controle.desligarMudo();
		controle.abrirMenu();
	}

}
