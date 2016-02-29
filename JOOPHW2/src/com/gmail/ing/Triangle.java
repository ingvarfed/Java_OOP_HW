package com.gmail.ing;

import java.util.Arrays;

public class Triangle extends Shape {
	private Point[] points = new Point[3];
	private double[] sides = new double[3];

	public Triangle(Point[] points) {
		super();
		this.points = points;
	}

	@Override
	public double perimeter() {
		this.sides[0] = Math.sqrt(Math.pow((points[1].getX() - points[0].getX()), 2)
				+ Math.pow((points[1].getY() - points[0].getY()), 2));
		this.sides[1] = Math.sqrt(Math.pow((points[2].getX() - points[1].getX()), 2)
				+ Math.pow((points[2].getY() - points[1].getY()), 2));
		this.sides[2] = Math.sqrt(Math.pow((points[0].getX() - points[2].getX()), 2)
				+ Math.pow((points[0].getY() - points[2].getY()), 2));
		return sides[0] + sides[1] + sides[2];
	}

	@Override
	public double area() {
		double p = this.perimeter() / 2;
		return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
	}

	@Override
	public String toString() {
		return "Triangle [points=" + Arrays.toString(points) + "]";
	}

}
