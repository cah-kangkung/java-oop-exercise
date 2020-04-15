package exercise72_polyLine;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] array = {x, y};
		return array;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	public double distance(Point another) {
		 int xDiff = this.x - another.x;
		 int yDiff = this.y - another.x;
		 return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
}	
