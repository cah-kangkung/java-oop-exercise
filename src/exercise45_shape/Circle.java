package exercise45_shape;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this.radius = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
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
		return "A Circle with radius of " + radius + ", wich is a subclass of " + super.toString();
	}
}
