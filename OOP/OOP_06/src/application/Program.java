package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputKeyboard = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = inputKeyboard.nextDouble();
		
		System.out.printf("Cicumference: %.2f\n", Calculator.circumference(radius));
		System.out.printf("Volume: %.2f\n", Calculator.volume(radius));
		System.out.printf("PI Value: %.2f\n", Calculator.PI);
		
		inputKeyboard.close();
	}

}