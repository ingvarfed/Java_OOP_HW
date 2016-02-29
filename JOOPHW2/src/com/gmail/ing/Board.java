package com.gmail.ing;

public class Board {
	private Shape[] board = new Shape[4];
	private double area = 0;

	public void addShape(Shape shape, int place) {
		if (board[place] == null) {
			board[place] = shape;
			this.area += board[place].area();
		} else {
			System.out.println("This place is already taken.");
		}
	}

	public void delShape(int place) {
		if (board[place] == null) {
			System.out.println("There is no shape here.");
		} else {
			this.area -= board[place].area();
			board[place] = null;
		}
	}

	public void boardInfo() {
		for (int i = 0; i < board.length; i++) {
			System.out.println(i + ") " + board[i]);
		}
		System.out.println("Total covered area is " + this.area);
	}
}
