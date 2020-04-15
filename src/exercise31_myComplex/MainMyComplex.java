package exercise31_myComplex;

public class MainMyComplex {

	public static void main(String[] args) {
		MyComplex n1 = new MyComplex(1.1, 2.2);
		MyComplex n2 = new MyComplex(3.3, 4.4);
		
		System.out.println("Complex Number 1 is: " + n1);
		if(n1.isReal())
			System.out.println("is a pure real number");
		else
			System.out.println("is NOT a pure real number");
		if(n1.isImag())
			System.out.println("is a pure imag number");
		else
			System.out.println("is NOT a pure imag number\n");

		
		System.out.println("Complex Number 2 is: " + n2);
		if(n2.isImag())
			System.out.println("is a pure imag number");
		else
			System.out.println("is NOT a pure imag number");
		if(n2.isReal())
			System.out.println("is a pure real number");
		else
			System.out.println("is NOT a pure real number\n");

		
		if(n1.equals(n2)) 
			System.out.println(n1 + " is equals to " + n2);
		else 
			System.out.println(n1 + " is NOT equals to " + n2);
		
		System.out.println(n1 + " + " + n2 + " = " + n1.addNew(n2));
		System.out.println(n1 + " - " + n2 + " = " + n1.subtractNew(n2));
		System.out.println(n1 + " * " + n2 + " = " + n1.multiply(n2));
	}
}
