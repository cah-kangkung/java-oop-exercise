package exercise32_myPolynomial;

public class MainMyPolynomial {

	public static void main(String[] args) {
		MyPolynomial p1 = new MyPolynomial(1.0, 2.0, 3.0, 4.0, 5.0);
		MyPolynomial p2 = new MyPolynomial(1.0, 2.0, 3.0, 4.0, 5.0);
		System.out.println("degree: " + p1.getDegree());
		System.out.println(p1);
		System.out.println(p2);
		//System.out.println(p1.add(p2));
		System.out.println(p1.multiply(p2));
		System.out.println(p1.evaluate(2D));
	}

}
