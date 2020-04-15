package exercise11_circle;

public class MainCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The circle has radius of " 
							+ c1.getRadius() + " and area of " + c1.getArea());
		Circle c2 = new Circle(2.0);
		System.out.println(c2.toString());
		Circle c4 = new Circle(); 
		c4.setRadius(5.0);          // change radius
		System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
		c4.setColor("blue");        // Change color
		System.out.println("color is: " + c4.getColor());   // Print color via getter
		//you cant print color via seter because setter return void
	}
}
