package exercise32_myPolynomial;

public class MyPolynomial {
	private double[] coeffs;
	
	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	
	public int getDegree() {
		return coeffs.length-1;
	}
	
	public String toString() {
		String result = "";
		for(int i = coeffs.length-1; i >= 0; i--) {
			if(i == 0)
				result += coeffs[i] + "*X^" + i;
			else
				result += coeffs[i] + "*X^" + i + " + ";
		}
		return result;
	}
	
	public double evaluate(double x) {
		double sum = 0.0;
		double coX = 1.0;
		for(int i = 0; i < coeffs.length; i++) {
			if(i == 0)
				coX *= 1.0;
			else
				coX *= x;
			sum += coX * coeffs[i];
		}
		return sum;
	}
	
	public MyPolynomial add(MyPolynomial right) {
		for(int i = 0; i < coeffs.length; i++) {
			this.coeffs[i] += right.coeffs[i];
		}
		return this;
	}
	
	public MyPolynomial multiply(MyPolynomial right) {
		for(int i = 0; i < coeffs.length; i++) {
			this.coeffs[i] *= right.coeffs[i];
		}
		return this;
	}
}
