package com.gmail.ing;

public class Cat {
	private String gender;
	private String color;
	private String name;
	private double weight;
	private boolean hungry;

	public Cat(String gender, String color, String name, double weight) {
		super();
		this.gender = gender;
		this.color = color;
		this.name = name;
		this.weight = weight;
		this.hungry = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void feed(){
		this.hungry = false;
		this.weight += 1.0;
	}
	
	public void fight(Cat opponent){
		if(!this.gender.equals(opponent.gender)){
			System.out.println("True cat will never hurt a lady!");
			return;
		}
		if(this.weight >= opponent.weight){
			System.out.println(this.name + " won! " + opponent.name + " lost!");
		} else {
			System.out.println(opponent.name + " won! " + this.name + " lost!");
		}
	}
}
