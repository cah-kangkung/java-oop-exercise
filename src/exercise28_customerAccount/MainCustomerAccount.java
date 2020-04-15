package exercise28_customerAccount;

public class MainCustomerAccount {

	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Hotman Paris", 'm');
		Account a1 = new Account(1000, c1, 5000);
		System.out.println(a1.toString());
		System.out.println("Balance: $" + a1.deposit(250));		
		System.out.println("Balance: $" + a1.withdraw(100));
	}
}
