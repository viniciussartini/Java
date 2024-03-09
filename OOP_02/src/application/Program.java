package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner inputKeyboard = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = inputKeyboard.nextLine();
		System.out.print("Price: ");
		product.price = inputKeyboard.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = inputKeyboard.nextInt();
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		product.addProduct(inputKeyboard.nextInt());
		System.out.println("Updated data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProduct(inputKeyboard.nextInt());
		System.out.println("Updated data: " + product);
		
		
		inputKeyboard.close();
	}

}
