package exercise16_account;

public class MainAccount {

	public static void main(String[] args) {
		Account a1 = new Account("001", "Hafizhun Alim", 1000000);
		System.out.println("ID: " + a1.getID());
		System.out.println("Name: " + a1.getName());
		System.out.println("Balance: " + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println();
		
		Account a2 = new Account("002", "Hotman Paris", 1000000000);
		System.out.println("ID: " + a2.getID());
		System.out.println("Name: " + a2.getName());
		System.out.println("Balance: " + a2.getBalance());
		System.out.println(a2.toString());
		
		a2.transferTo(a1, 15000000);
		System.out.println("\nTranser from Hotman Paris to Hafizhun Alim: ");
		System.out.println("15000000");
		System.out.println(a1.toString());
	}

}
