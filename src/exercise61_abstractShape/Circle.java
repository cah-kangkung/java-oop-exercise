package exercise61_abstractShape;

public class Circle extends Shape {
	protected double radius;
	
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
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "A Circle with radius of " + radius + ", wich is a subclass of " + super.toString();
	}
	
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;	
	}

}
