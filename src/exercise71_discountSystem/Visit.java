package exercise71_discountSystem;

public class Visit {
	private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, boolean member, String memberType, Date date) {
        this.customer = new Customer(name, member, memberType);
        this.date = date;
    }
    
    public String getName() {
        return customer.getName();
    }
    
    public String getMemberType() {
        return customer.getMemberType();
    }
    
    public double getServiceExpense() {
        return serviceExpense;
    }
    
    public void setServiceExpense(double ex) {
        serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }
    
    public void setProductExpense(double ex) {
        productExpense = ex;
    }

    public double getTotalExpense(double discServ, double discProd) {
    	double diff1 = discServ*serviceExpense;
    	double diff2 = discProd*productExpense;
        return (serviceExpense-diff1) + (productExpense-diff2);
    }
    
    public String toString() {
        return String.format("Visit of customer %1$s at date %2$s", customer.toString(), date.toString());
    }
}
