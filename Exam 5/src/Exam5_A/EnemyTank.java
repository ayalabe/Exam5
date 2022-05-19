package Exam5_A;

/**
 * RoundPegs are compatible with RoundHoles.
 */
public class EnemyTank implements Enemy{

	@Override
	public void turnRight() {
		System.out.println("I am turn Right");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("I am turn Left");
		
	}

	@Override
	public void driveForward() {
		System.out.println("I am drive Forward");
		
	}

	@Override
	public void driveBackward() {
		System.out.println("I am drive Backward");
		
	}

	@Override
	public void weapon() {
		System.out.println("piyoo piyoo");
		
	}
    
}