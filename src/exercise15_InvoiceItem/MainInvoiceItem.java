package exercise15_InvoiceItem;

public class MainInvoiceItem {

	public static void main(String[] args) {
		//initialize an object with (Str id, Str description, int quantity, double Price/unit)
		InvoiceItem i1 = new InvoiceItem("Tango", "New Item", 10, 5000D);
		System.out.println("ID: " + i1.getID());
		System.out.println("Desciption: " + i1.getDesc());
		System.out.println("Quantity: " + i1.getQty());
		System.out.println("Price/pcs: " + i1.getUnitPrice());
		System.out.println(i1.toString());
		System.out.println();
		
		i1.setQty(15);
		i1.setUnitPrice(7000D);
		System.out.println("ID: " + i1.getID());
		System.out.println("Desciption: " + i1.getDesc());
		System.out.println("Quantity: " + i1.getQty());
		System.out.println("Price/pcs: " + i1.getUnitPrice());
		System.out.println("Total Price: " + i1.getTotal());
		System.out.println(i1.toString());
		System.out.println();
		
	}

}
