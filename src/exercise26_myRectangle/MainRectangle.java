package exercise26_myRectangle;

public class MainRectangle {

	public static void main(String[] args) {
		MyRectangle r1 = new MyRectangle(5, 3, 8, 1);
		System.out.println(r1.toString());
		System.out.println("Perimeter = " + r1.getPerimeter());
		System.out.println("Area = " + r1.getArea());
	}

}
