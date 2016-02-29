package com.gmail.ing;

public class Main {

	public static void main(String[] args) {
		Vector3D vectorA = new Vector3D(2.3, 1, 3.1);
		System.out.println("Vector A: " + vectorA);
		Vector3D vectorB = new Vector3D(1.2, 3.1, 0);
		System.out.println("Vector B: " + vectorB);
		Vector3D vectorC = vectorA.add(vectorB);
		System.out.println("Sum of A and B: " + vectorC);
		System.out.println("Scalar product of A and B: " + vectorA.mulScalar(vectorB));
		Vector3D vectorD = vectorA.mulVector(vectorB);
		System.out.println("Vector product of A and B: " + vectorD);
	}

}
