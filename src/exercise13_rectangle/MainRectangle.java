package exercise13_rectangle;

public class MainRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		System.out.println("Area= " + r1.getArea());
		System.out.println("Circumference= " + r1.getCircumference());
		System.out.println();
		
		Rectangle r2 = new Rectangle(2.0f, 4.0f);
		System.out.println(r2.toString());
		System.out.println("Area= " + r2.getArea());
		System.out.println("Circumference= " + r2.getCircumference());
		System.out.println();
		
		r2.setLength(3.0f);
		r2.setWidth(8.0f);
		System.out.println(r2.toString());
		System.out.println("Area= " + r2.getArea());
		System.out.println("Circumference= " + r2.getCircumference());
		System.out.println();
	}

}
