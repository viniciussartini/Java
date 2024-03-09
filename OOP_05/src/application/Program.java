package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner inputKeyboard = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the student name: ");
		student.name = inputKeyboard.nextLine();
		System.out.println("Enter the first grade: ");
		student.grade1 = inputKeyboard.nextDouble();
		System.out.println("Enter the second grade: ");
		student.grade2 = inputKeyboard.nextDouble();
		System.out.println("Enter the third grade: ");
		student.grade3 = inputKeyboard.nextDouble();
		
		if (student.finalGrade() > 60) {
			System.out.println("Final Grade: " + student.finalGrade() + " PASS");
		} else {
			System.out.println("Final Grade: " + student.finalGrade() + " FAILED");
			System.out.println("Missing " + student.missingPoints() + "points");
		}
		
		inputKeyboard.close();
	}

}
