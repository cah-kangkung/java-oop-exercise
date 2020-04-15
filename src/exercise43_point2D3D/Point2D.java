package exercise43_point2D3D;

public class Point2D {
	private float x;
	private float y;
	
	public Point2D() {
		this.x = 0.0f;
		this.y = 0.0f;
	}
	
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void sety(float y) {
		this.y = y;
	}
	
	public float[] getXY() {
		float[] array = {x, y};
		return array;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
