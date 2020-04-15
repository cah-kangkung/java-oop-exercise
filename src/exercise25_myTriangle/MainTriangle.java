package exercise25_myTriangle;
import exercise23_myPoint.*;

public class MainTriangle {

	public static void main(String[] args) {
		MyTriangle t1 = new MyTriangle(2, 4, 5, 1, 1, 1);
		System.out.println(t1.toString());
		System.out.println(t1.getPerimeter());
		
		MyPoint v1 = new MyPoint(2, 4);
		MyPoint v2 = new MyPoint(5, 1);
		MyPoint v3 = new MyPoint(1, 1);
		MyTriangle t2 = new MyTriangle(v1, v2, v3);
		
		System.out.println(t2.toString());
		System.out.println(t2.getPerimeter());
	}

}
