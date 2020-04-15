package exercise12_simplifiedCircle;

public class MainCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " 
							+ c1.getRadius() + " and area of " + c1.getArea());
		Circle c2 = new Circle(4.0);
		System.out.println(c2.toString());
	}

}
