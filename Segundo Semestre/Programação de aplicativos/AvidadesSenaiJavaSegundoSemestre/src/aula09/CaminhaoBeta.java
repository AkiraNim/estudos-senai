package aula09;

public class CaminhaoBeta extends Caminhao{
	
	@Override
	public boolean inserePluviometro(Pluviometro p){
		boolean existe = false;
		for (Pluviometro pluviometro2 : pluviometro) {
			 if (pluviometro2.getTipo().equals(p.getTipo())) {
				 existe = true;
			 }
		}
		if(!existe) {
			pluviometro.add(p);
			return true;
		}
		return false;
	}
}
