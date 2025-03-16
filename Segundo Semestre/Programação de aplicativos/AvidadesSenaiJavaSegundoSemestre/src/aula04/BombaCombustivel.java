package aula04;

public class BombaCombustivel {
	private int id;
	private String fuelType;
	private float valueLiter;
	private float quantityFuel;
	
	BombaCombustivel(int id, String fuelType, float valueLiter, float quantityFuel){
		this.id = id;
		this.fuelType = fuelType;
		this.valueLiter = valueLiter;
		this.quantityFuel = quantityFuel;
		
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getValueLiter() {
		return valueLiter;
	}

	public void setValueLiter(float valueLiter) {
		this.valueLiter = valueLiter;
	}

	public float getQuantityFuel() {
		return quantityFuel;
	}

	public void setQuantityFuel(float quantityFuel) {
		this.quantityFuel = quantityFuel;
	}

	public int getId() {
		return id;
	}
	
	public boolean fillByValue(float value){
		if(quantityFuel>0) {
			value/=getValueLiter();
			quantityFuel-=value;
			return true;
		}
		return false;
	}
	
	public boolean fillByLiter(float liter) {
		if(quantityFuel>0) {
			liter*=getValueLiter();
			quantityFuel-=liter;
			return true;
		}
		return false;
	}
}
