package exercise16_account;

public class Account {
	private String id, name;
	private int balance;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount <= balance)
			balance -= amount;
		else
			System.out.println("Ammount exceeded balance");
		return balance;
	}
	
	public int transferTo(Account another, int amount) {
		if(amount <= balance) {
			balance = debit(amount);
			another.credit(amount);
		}
		else
			System.out.println("Ammount exceeded balance");
		return balance;
	}
	
	public String toString() {
		return "Account[id= " + id + ", name= " + name + ", balance= " + balance +"]";
	}
}
