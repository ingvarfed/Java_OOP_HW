package com.gmail.ing;

public class GroupFullException extends Exception {

	@Override
	public String getMessage() {
		return "The group is full!";
	}

}
