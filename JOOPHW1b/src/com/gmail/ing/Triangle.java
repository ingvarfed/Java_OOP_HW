package com.gmail.ing;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return "Triangle with sides: " + sideA + ", " + sideB + " and " + sideC + ".";
	}

	public double getArea() {
		double p = (this.sideA + this.sideB + this.sideC) / 2;
		return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
	}

}
