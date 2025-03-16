package aula02;

public class Person {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private double weight, height;
	
	public Person(String name, int age, double height, double weight) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public void growOld() {
		this.age+=1;
		if(this.age<21) {
			growUp(5);
		}
	}
	
	public void gainWeight(double weight) {
		this.weight = this.weight + weight;
	}
	
	public void loseWeight(double weight) {
		this.weight = this.weight - weight;
	}
	
	public void growUp(double height) {
		this.height= this.height+(height/100);
		
	}
	
}
