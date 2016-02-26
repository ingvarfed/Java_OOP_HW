package com.gmail.ing;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("male", "brown", "Kali", 2.4);
		Cat catTwo = new Cat("female", "grey", "Mola", 2.1);
		Cat catThree = new Cat("male", "black", "Lucy", 3.0);
		
		System.out.println(catOne);
		System.out.println(catTwo);
		System.out.println(catThree);
		
		catOne.fight(catTwo);
		catOne.fight(catThree);
		catOne.feed();
		catOne.fight(catThree);
		
		System.out.println(catOne);
		System.out.println(catTwo);
		System.out.println(catThree);
	}

}
