package aula04;

public class Carro {
	
	private double fuel = 0, consumption;
	

	public Carro(double consumption) {
		this.fuel = 0;
		this.consumption = consumption;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}
	
	public double ride(double distance) {
		distance/=100;
		fuel = fuel - (distance*consumption);
		return fuel;
	}
	
	public double refuel(double quantity) {
		fuel+=quantity;
		return fuel;
	}
}
