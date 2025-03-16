package aula09;

public class CaminhaoAlfa extends Caminhao{
	
	
	@Override
	public boolean inserePluviometro(Pluviometro p) {
		double total = 0;
		for (Pluviometro pluviometro2 : pluviometro) {
			total += pluviometro2.getPeso();
		}
		if (total+p.peso<5000){
			pluviometro.add(p);
			return true;
		}
		else {
			return false;
		}
	}
}
