package exercise37_ballPlayer;

public class TestPlayer {

	public static void main(String[] args) {
		
		Ball ball = new Ball(2, 5, 0);
		Player player = new Player(10, 1, 5);
		System.out.println("Ball Position:    " + ball);
		System.out.println("Player Position:  " + player);
		System.out.println("Player Number " + player.getNumber() + " distance with the ball is: " 
							+ player.distance(ball));
		if (player.near(ball)) {
			System.out.println("Player Number " + player.getNumber() 
								+ " kick the ball (x + 10)...");
			player.kick(ball);
			System.out.println("Ball Posisiton after being kicked: ");
			System.out.println(ball);
		}
		else
			System.out.println("Player Number " + player.getNumber() 
								+ " is far form the ball");
		
		
		
		Ball ball2 = new Ball(2, 5, 0);
		Player player2 = new Player(13, 10, 5);
		System.out.println("\nBall Position:    " + ball2);
		System.out.println("Player Position:  " + player2);
		System.out.println("Player Number " + player2.getNumber() + " distance with the ball is: " 
				+ player2.distance(ball2));

		if (player2.near(ball2)) {
			System.out.println("Player Number " + player2.getNumber() 
								+ " kick the ball (x + 10)...");
			player2.kick(ball2);
			System.out.println("Ball Posisiton after being kicked: ");
			System.out.println(ball2);
		}
		else
			System.out.println("Player Number " + player2.getNumber() 
								+ " is far form the ball");

		
		
	}

}
