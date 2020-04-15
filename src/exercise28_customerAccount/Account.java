package exercise28_customerAccount;

public class Account {
	private int ID;
	private Customer customer;
	private double balance;
	
	public Account(int ID, Customer customer, double balance) {
		this.ID = ID;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int ID, Customer customer) {
		this.ID = ID;
		this.customer = customer;
		this.balance = 0.0;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return customer.toString() + "\nBalance: $" + balance;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public double deposit(double amount) {
		System.out.println("Deposit: $" + amount);
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) {
		if(amount <= balance) {
			System.out.println("Withdraw: $" + amount);
			balance -= amount;
		}
		else
			System.out.println("Amount withdrawn exceeds the current balance!");
		return balance;
	}
}
