package com.gmail.ing;

public class Main {

	public static void main(String[] args) {
		Group group = new Group("A");
		Student stdOne = new Student(19, "Jack", "Skinner", 345712, 4.5);
		Student stdTwo = new Student(21, "Janis", "Joplin", 456424, 4.6);
		try {
			for (int i = 0; i < group.getGroupList().length + 1; i++) {
				group.addStudent(stdOne);
				group.addStudent(stdTwo);
			}
		} catch (GroupFullException e) {
			System.out.println(e.getMessage());
		}
		group.printInfo();
		group.surnameFinder("Joplin");
		group.surnameFinder("Peterson");
	}

}
