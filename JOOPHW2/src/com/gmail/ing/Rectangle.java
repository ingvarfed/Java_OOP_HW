package com.gmail.ing;

import java.util.Arrays;

public class Rectangle extends Shape {
	private Point[] points = new Point[4];
	private double[] sides = new double[4];

	public Rectangle(Point[] points) {
		super();
		this.points = points;
	}

	@Override
	public double perimeter() {
		this.sides[0] = Math.sqrt(Math.pow((points[1].getX() - points[0].getX()), 2)
				+ Math.pow((points[1].getY() - points[0].getY()), 2));
		this.sides[2] = this.sides[0];
		this.sides[1] = Math.sqrt(Math.pow((points[2].getX() - points[1].getX()), 2)
				+ Math.pow((points[2].getY() - points[1].getY()), 2));
		this.sides[3] = this.sides[1];
		return this.sides[0] * 2 + this.sides[1] * 2;
	}

	@Override
	public double area() {
		return this.sides[0] * this.sides[1];
	}

	@Override
	public String toString() {
		return "Rectangle [points=" + Arrays.toString(points) + "]";
	}

}
