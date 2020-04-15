package exercise71_discountSystem;

public class Discount {
	private double serviceDiscountPremium = 0.2;
    private double serviceDiscountGold    = 0.15;
    private double serviceDiscountSilver  = 0.1;

    private double productDiscountPremium = 0.1;
    private double productDiscountGold    = 0.1;
    private double productDiscountSilver  = 0.1;

    public double getServiceDiscountRate(String type) {
        switch(type.toUpperCase()) {
            case "PREMIUM": return serviceDiscountPremium;
            case "GOLD":    return serviceDiscountGold;
            case "SILVER":  return serviceDiscountSilver;
        }
        return 0.0;
    }
    
    public double getProductDiscountRate(String type) {
        switch(type.toUpperCase()) {
            case "PREMIUM": return productDiscountPremium;
            case "GOLD":    return productDiscountGold;
            case "SILVER":  return productDiscountSilver;
        }
        return 0.0;
    }
}
