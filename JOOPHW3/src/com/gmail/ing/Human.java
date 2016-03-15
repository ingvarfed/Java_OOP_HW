package com.gmail.ing;

public class Human {
	protected int age;
	protected String name;
	protected String surname;

	public Human(int age, String name, String surname) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " " + surname + ", " + age + " years old.";
	}

	public void printInfo() {
		System.out.println(this);
	}
}
