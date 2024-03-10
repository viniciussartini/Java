package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner inputKeyboard = new Scanner(System.in);
		
		System.out.println("Enter the account number: ");
		int accountNumber = inputKeyboard.nextInt();
		
		System.out.println("Enter the account holder ");
		String accountHolder = inputKeyboard.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		char choiceDeposit = inputKeyboard.next().charAt(0);
		
		if (choiceDeposit == 'y') {
			System.out.println("Enter the value of inital deposit: ");
			double initialDeposit = inputKeyboard.nextDouble();
			Client client = new Client(accountNumber, accountHolder, initialDeposit);
		} else {
			Client client = new Client(accountNumber, accountHolder);
		}
		
		System.out.println("Account data:");
		System.out.println(client);
		
		
		inputKeyboard.close();
	}

}
