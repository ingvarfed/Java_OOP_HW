package com.gmail.ing;

public class Student extends Human {
	private int idNumber;
	private double averageMark;
	
	public Student(int age, String name, String surname, int idNumber, double averageMark) {
		super(age, name, surname);
		this.idNumber = idNumber;
		this.averageMark = averageMark;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	@Override
	public String toString() {
		return name + " " + surname + " is " + age + " years old student. His ID: " + idNumber + ". His average mark: " + averageMark + ".";
	}

	@Override
	public void printInfo() {
		System.out.println(this);
	}
}
