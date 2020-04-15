package exercise27_customerInvoice;

public class Invoice {
	private int ID;
	private Customer customer;
	private double amount;
	
	public Invoice(int ID, Customer customer, double amount) {
		this.ID = ID;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getID() {
		return this.ID;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public double getAmountAfterDiscount() {
		double dcr = (customer.getDiscount()*amount)/100;
		//System.out.println("Discount: " + dcr);
		return amount - dcr;
	}
	
	public String toString() {
		return "Invoice ID: " + ID + "\nPersonal Discount: " 
				+ customer.getDiscount() + "%" + "\nTotal: " + amount 
				+ "\nTotal after discount: " + getAmountAfterDiscount();
	}
}
