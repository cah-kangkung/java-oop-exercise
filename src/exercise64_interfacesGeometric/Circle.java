package exercise64_interfacesGeometric;

public class Circle implements GeometricObject {
	protected double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "MyCircle[radius= " + radius + "]";
	}
}
