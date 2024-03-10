package application;

import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Scanner inputKeyboard = new Scanner(System.in);
		
		System.out.println("Enter the account number: ");
		int accountNumber = inputKeyboard.nextInt();
		inputKeyboard.nextLine();
		
		System.out.println("Enter the account holder ");
		String accountHolder = inputKeyboard.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char choiceDeposit = inputKeyboard.nextLine().charAt(0);
		
		if (choiceDeposit == 'y') {
			System.out.println("Enter the value of inital deposit: ");
			double initialDeposit = inputKeyboard.nextDouble();
			
			Client client = new Client(accountNumber, accountHolder, initialDeposit);
			System.out.println(client);
			
			System.out.println("Enter a deposit value: ");
			client.deposit(inputKeyboard.nextDouble());
			
			System.out.println("Updated account data: ");
			System.out.println(client);
			
			System.out.println("Enter a withdraw value: ");
			client.withdraw(inputKeyboard.nextDouble());
			
			System.out.println("Updated account data: ");
			System.out.println(client);
			
		} else {			
			Client client = new Client(accountNumber, accountHolder);
			System.out.println(client);
			
			System.out.println("Enter a deposit value: ");
			client.deposit(inputKeyboard.nextDouble());
			
			System.out.println("Updated account data: ");
			System.out.println(client);
			
			System.out.println("Enter a withdraw value: ");
			client.withdraw(inputKeyboard.nextDouble());
			
			System.out.println("Updated account data: ");
			System.out.println(client);
		}
		
		inputKeyboard.close();
	}

}
