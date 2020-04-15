package exercise63_interfaceMovable;

public class MovablePoint implements Movable {
	// instance variables
	int x, y, xSpeed, ySpeed;     // package access
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

    public String toString() {
        return String.format("MovablePoint (%1$d, %2$d) with xSpeed = %3$d and ySpeed = %4$d"
                            , x, y, xSpeed, ySpeed);
    }
	
	@Override
	public void moveUp() {
		y -= ySpeed;
	}
	
	@Override
	public void moveDown() {
		y += ySpeed;   
	}
	
	@Override
	public void moveLeft() {
		y -= ySpeed;   
	}
	
	@Override
	public void moveRight() {
		y += ySpeed;   
	}
}
