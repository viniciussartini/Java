package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputKeyboard = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rectangle.width = inputKeyboard.nextDouble();
		
		System.out.println("Enter rectangle height");
		rectangle.height = inputKeyboard.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		
		inputKeyboard.close();
	}

}
