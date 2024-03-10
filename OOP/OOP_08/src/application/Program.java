package application;

import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Scanner inputKeyboard = new Scanner(System.in);
		Client client;
		
		System.out.print("Enter the account number: ");
		int accountNumber = inputKeyboard.nextInt();
		inputKeyboard.nextLine();
		
		System.out.print("Enter the account holder: ");
		String accountHolder = inputKeyboard.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char choiceDeposit = inputKeyboard.nextLine().charAt(0);
		
		if (choiceDeposit == 'y') {
			System.out.print("Enter the value of inital deposit: ");
			double initialDeposit = inputKeyboard.nextDouble();
			client = new Client(accountNumber, accountHolder, initialDeposit);
			
		} else {			
			client = new Client(accountNumber, accountHolder);

		}
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.print("Enter a deposit value: ");
		client.deposit(inputKeyboard.nextDouble());
		
		System.out.print("Updated account data: ");
		System.out.println(client);
		
		System.out.print("Enter a withdraw value: ");
		client.withdraw(inputKeyboard.nextDouble());
		
		System.out.print("Updated account data: ");
		System.out.println(client);
		
		inputKeyboard.close();
	}

}
