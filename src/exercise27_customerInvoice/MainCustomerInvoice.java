package exercise27_customerInvoice;

public class MainCustomerInvoice {

	public static void main(String[] args) {
		Customer c1 = new Customer(101, "Hafizhun", 10);
		System.out.println("Customer: " + c1);
		Invoice i1 = new Invoice(123, c1, 25000D);
		System.out.println(i1.toString());
	}

}
