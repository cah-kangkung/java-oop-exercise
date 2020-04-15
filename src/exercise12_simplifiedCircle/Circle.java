package exercise12_simplifiedCircle;

public class Circle {
	private double radius;

	//default constructor
	public Circle() {
		radius = 1.0;
	}
	//second constructor
	public Circle(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]";
	}
}
