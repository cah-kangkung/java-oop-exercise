package exercise72_polyLine;

import java.util.*;

public class TestPolyLine {

	public static void main(String[] args) {
		// Test default constructor and toString()
		PolyLine l1 = new PolyLine();
		System.out.println(l1);  // {}

		// Test appendPoint()
		l1.appendPoint(new Point(1, 1));
		l1.appendPoint(3, 1);
		l1.appendPoint(4, 1);
		System.out.println(l1); 
		System.out.println(l1.getLength());

		// Test constructor 2
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(11, 11));
		points.add(new Point(13, 1));
		points.add(new Point(15, 1));
		PolyLine l2 = new PolyLine(points);
		System.out.println(l2);  
	}

}
