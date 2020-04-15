package exercise45_shape;

public class MainShape {

	public static void main(String[] args) {
		Shape s1 = new Shape("red", false);
		System.out.println(s1);
		Shape s2 = new Circle(2.0D);
		System.out.println(s2);
		Shape s3 = new Rectangle(4.0D, 6.0D);
		System.out.println(s3);
		Shape s4 = new Square(10D);
		System.out.println(s4);
	}

}
