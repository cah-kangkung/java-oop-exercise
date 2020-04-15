package exercise51_pointLine;

public class MainPoint {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);   // Construct a Point
		System.out.println(p1);
		// Try setting p1 to (100, 10)
		Point p2 = new Point(100, 10);   // Construct a Point
		System.out.println(p2);
		
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);
	   
		Point p3 = new Point(1, 4);
		Point p4 = new Point(5, 4);
		
		Line l2 = new Line(p3, p4);
		System.out.println(l2);
		System.out.println(l2.getLength());
		System.out.println(l2.getGradient());
		System.out.println();
		
		LineSub l3 = new LineSub(p3, p4);
		System.out.println(l3);
		System.out.println(l3.getLength());
	}

}
