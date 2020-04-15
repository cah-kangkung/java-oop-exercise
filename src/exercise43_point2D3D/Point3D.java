package exercise43_point2D3D;

public class Point3D extends Point2D {
	private float z;
	
	public Point3D() {
		this.z = 0.0f;
	}
	
	public Point3D(float z) {
		super();
		this.z = z;
	}
	
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}
	
	public float getZ() {
		return this.z;
	}
	
	public void setZ(float z) {
		this.z = z;
	}
	
	public float[] getXYZ() {
		float[] array = {getX(), getY(), z};
		return array;
	}
	
	public void setXYZ(float x, float y, float z) {
		setXY(x, y);
		this.z = z;
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + z + ")";
	}
}
