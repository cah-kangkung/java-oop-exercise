package exercise24_myCircle;

public class MyCircle {
	private int radius;
	private MyPoint center;
	
	public MyCircle() {
		this.radius = 1;
		center = new MyPoint();
	}
	
	public MyCircle(int x, int y, int radius) {
		center.setX(x);
		center.setY(y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public int[] getCenterXY() {
		return center.getXY();
	}
	
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	
	public String toString() {
		return "MyCircle[radius= " + radius + ", center= " + center.toString() + "]";
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	
	public double distance(MyCircle another) {
		return center.distance() - another.center.distance();
	}
}	

