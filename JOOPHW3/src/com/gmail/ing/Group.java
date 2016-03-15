package com.gmail.ing;

import java.util.Arrays;

public class Group {
	private Student[] groupList = new Student[10];
	private String name;

	public Group(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getGroupList() {
		return groupList;
	}

	@Override
	public String toString() {
		return "Group " + name + "\n" + Arrays.toString(groupList);
	}

	public void addStudent(Student student) throws GroupFullException {
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] == null) {
				groupList[i] = student;
				return;
			}
		}
		throw new GroupFullException();
	}

	public void surnameFinder(String surname) {
		boolean found = false;
		System.out.println("\nSearching for " + surname + " in group " + this.name + "...");
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i].surname.equals(surname)) {
				groupList[i].printInfo();
				found = true;
			}
		}
		if (!found) {
			System.out.println("No students with this surname!");
		}
	}

	public void printInfo() {
		System.out.println("Group " + this.name);
		for (int i = 0; i < groupList.length; i++) {
			System.out.println((i+1) + ") " + groupList[i]);
		}
	}
}
