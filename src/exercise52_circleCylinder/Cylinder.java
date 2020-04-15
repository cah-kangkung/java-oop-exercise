package exercise52_circleCylinder;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder() {
		base = new Circle();
		height = 1.0;
	}
	
	public Cylinder(double height) {
		base = new Circle();
		this.height = height;
	}
	
	public Cylinder(double height, double radius) {
		base = new Circle(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return 2*Math.PI*base.getRadius()*height + 2*base.getArea();
	}
	
	public double getVolume() {
		return base.getArea()*height; 
	}
	
	public String toString() {
		return "Cylinder: subclass of " + base.toString()  // use Circle's toString()
        		+ " height=" + height;
	}
}
