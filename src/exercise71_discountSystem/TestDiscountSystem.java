package exercise71_discountSystem;

public class TestDiscountSystem {

	public static void main(String[] args) {
		Date d1 = new Date(10, 01, 2015);
		Visit v1 = new Visit("Hafizhun Alim", true, "GOLD", d1);
		System.out.println(v1);
		v1.setProductExpense(500.000D);
		v1.setServiceExpense(150.000D);
		System.out.println("Product expense: " + v1.getProductExpense());
		System.out.println("Service expense: " + v1.getServiceExpense());
		
		Discount dsc1 = new Discount();
		double DiscountProduct = dsc1.getProductDiscountRate(v1.getMemberType());
		double DiscountService = dsc1.getServiceDiscountRate(v1.getMemberType());
		System.out.println("Product Discount: " + DiscountProduct);
		System.out.println("Service Discount: " + DiscountService);
		System.out.println("Total: " + v1.getTotalExpense(DiscountService, DiscountProduct));
	}

}
