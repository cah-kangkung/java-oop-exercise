package exercise61_abstractShape;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle() {
		this.width = 0.0;
		this.length = 0.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public String toString() {
		return "A Rectangle with width = " + width + " and length = " + length + ", wich is a subclass of " + super.toString();
	}
	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2*(length + width);
	}

}
