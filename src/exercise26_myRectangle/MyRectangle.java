package exercise26_myRectangle;
import exercise23_myPoint.*;

public class MyRectangle {
	private MyPoint v1, v3;
	
	public MyRectangle(int x1, int y1, int x3, int y3) {
		v1 = new MyPoint(x1, y1);
		v3 = new MyPoint(x3, y3);
	}
	
	public MyRectangle(MyPoint v1, MyPoint v3) {
		this.v1 = v1;
		this.v3 = v3;
	}
	
	public String toString() {
		return "MyRectangle[v1= " + v1 + ", v2= (" + v3.getX() + ", " + v1.getY()
				+ "), v3= " + v3 + ", v4= (" + v1.getX() + ", " + v3.getY() + ")]";
	}
	
	public double getPerimeter() {
		double s1 = v1.distance(v3.getX(), v1.getY());
		double s2 = v3.distance(v3.getX(), v1.getY());
		double s3 = v3.distance(v1.getX(), v3.getY());
		double s4 = v1.distance(v1.getX(), v3.getY());
		return s1+s2+s3+s4;
	}
	
	public double getArea() {
		double s1 = v1.distance(v3.getX(), v1.getY());
		double s2 = v3.distance(v3.getX(), v1.getY());
		return s1*s2;
	}
	
	
}
