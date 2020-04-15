package exercise11_circle;

public class Circle {
	private double radius;
	private String color;
	
	//default constructor
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	//second constructor
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	//third constructor
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
}
