package com.gmail.ing;

public class Main {

	public static void main(String[] args) {
		Triangle triOne = new Triangle(3, 1.2, 4.1);
		System.out.println(triOne + " It's area is " + triOne.getArea());
		Triangle triTwo = new Triangle(3, 1.2, 4.1);
		System.out.println(triTwo + " It's area is " + triTwo.getArea());
	}

}
