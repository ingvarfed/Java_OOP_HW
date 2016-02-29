package com.gmail.ing;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();

		Point[] points = new Point[3];
		Random rnd = new Random();
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(rnd.nextDouble()*10, rnd.nextDouble()*10);
		}

		Triangle triangle = new Triangle(points);
		System.out.println(triangle);

		board.addShape(triangle, 0);
		board.addShape(triangle, 2);
		board.boardInfo();
		board.addShape(triangle, 2);
		board.delShape(0);
		board.boardInfo();
	}

}
