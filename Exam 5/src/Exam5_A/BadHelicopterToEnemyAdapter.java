package Exam5_A;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class BadHelicopterToEnemyAdapter implements Enemy {
    private BadHelicopter helicopter;

    public BadHelicopterToEnemyAdapter(BadHelicopter helicopter) {
        this.helicopter = helicopter;
    }


	@Override
	public void turnRight() {
		System.out.println("This may function like a BadHelicopter but its a Enemy: ");
		helicopter.yawsRight();
		
	}

	@Override
	public void turnLeft() {
		System.out.println("This may function like a BadHelicopter but its a Enemy: ");
		helicopter.yawsRight();
		
	}

	@Override
	public void driveForward() {
		System.out.println("This may function like a BadHelicopter but its a Enemy: ");
		helicopter.fliesUp();
		
	}

	@Override
	public void driveBackward() {
		System.out.println("This may function like a BadHelicopter but its a Enemy: ");
		helicopter.fliesDown();
		
	}

	@Override
	public void weapon() {
		System.out.println("This may function like a BadHelicopter but its a Enemy: ");
		helicopter.launchesMissile();
		
	}
}