package exercise37_ballPlayer;

public class Player {
	private int number;
	private float x, y, z;
	
	public Player(int number, float x, float y) {
		this.number = number;
		this.x = x;
		this.y = y;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void move(float xDisp, float yDisp) {
		this.x = xDisp;
		this.y = yDisp;
	}
	
	public void jump(float zDisp) {
		this.z = zDisp;
	}
	
	public boolean near(Ball ball) {
		float xDiff = this.x - ball.getX();
		float yDiff = this.y - ball.getY();
		float zDiff = this.z - ball.getZ();
		double dist = Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
		
		if(dist < 8) 
			return true;
		else
			return false;
	}
	
	public double distance(Ball ball) {
		float xDiff = this.x - ball.getX();
		float yDiff = this.y - ball.getY();
		float zDiff = this.z - ball.getZ();
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
	}
	// i have to make an asumption here where the direction of the ball kicked always positive
	// or towards the goalkepeer (wich is "x" direction)
	// And also the ball will never go up, so it's always z = 0
	// x, y, z is always at octan 1
	public void kick(Ball ball) {
		ball.setXYZ((ball.getX()+10), ball.getY(), ball.getZ());		
	}
	
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
}
