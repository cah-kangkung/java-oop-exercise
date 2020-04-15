package exercise24_myCircle;

public class MainMyCircle {

	public static void main(String[] args) {
		MyCircle p1 = new MyCircle();  // Test constructor
		p1.setCenterXY(8, 5);   // Test setters
		System.out.println(p1);      // Test toString()
		System.out.println(p1.getArea());
		System.out.println(p1.getCircumference());
		
	}

}
