package exercise23_myPoint;

public class MainMyPoint {

	public static void main(String[] args) {
		/*MyPoint p1 = new MyPoint();  // Test constructor
		System.out.println(p1);      // Test toString()
		p1.setX(8);   // Test setters
		p1.setY(6);
		System.out.println("x is: " + p1.getX());  // Test getters
		System.out.println("y is: " + p1.getY());
		p1.setXY(3, 0);   // Test setXY()
		System.out.println(p1);

		MyPoint p2 = new MyPoint(5, 1);  // Test another constructor
		// Testing the overloaded methods distance()
		System.out.println(p2.distance(5, 4));
		*/
		MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
		int x = 1;
		int y = 1;
		for (int i = 0; i < points.length; i++) {
		   points[i] = new MyPoint(x, y);    // Allocate each of MyPoint instances
		   x++;
		   y++;
		}
		
		for(int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
		
	}

}
