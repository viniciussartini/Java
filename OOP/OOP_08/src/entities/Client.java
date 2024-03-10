package entities;

public class Client {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Client() {
		
	}
	
	public Client(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public Client(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}
		
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
		
	public String toString() {
		return "Account: "
				+ getAccountNumber()
				+ ", Holder: "
				+ getAccountHolder()
				+ ", Balance: $"
				+ getBalance()
				+"\n";
	}
	
}
