package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner inputKeyboard = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.name = inputKeyboard.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = inputKeyboard.nextDouble();
		System.out.println("Tax: ");
		employee.tax = inputKeyboard.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary: ");
		employee.increaseSalary(inputKeyboard.nextDouble());
		
		System.out.println("Update: " + employee);
		
		inputKeyboard.close();
		
	}

}
