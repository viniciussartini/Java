package application;

import java.util.Scanner;

import utilities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner inputKeyboard = new Scanner(System.in);
		
		System.out.println("How much is the dollar price today? ");
		double dolar = inputKeyboard.nextDouble();
		
		System.out.println("How many dollars will you buy? ");
		double quantity = inputKeyboard.nextDouble();
		
		System.out.printf("You will pay in reais: %.2f\n", CurrencyConverter.converter(dolar, quantity));
		
		inputKeyboard.close();
	}

}
