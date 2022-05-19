package Exam5_A;

public class Runner {
	 public static void main(String[] args) {
		 
		 //I will use the pattern Adapter
		 EnemyTank enemyTank = new EnemyTank();
		 System.out.println("This is EnemyTank");
		 enemyTank.driveBackward();
		 enemyTank.driveForward();
		 enemyTank.turnLeft();
		 enemyTank.turnRight();
		 enemyTank.weapon();
		 System.out.println("----------");
		 
		 System.out.println("This is BadHelicopter adapter");
		 BadHelicopter badHelicopter = new BadHelicopter();
		 BadHelicopterToEnemyAdapter adapter = new BadHelicopterToEnemyAdapter(badHelicopter);
		 adapter.driveBackward();
		 adapter.driveForward();
		 adapter.turnLeft();
		 adapter.turnRight();
		 adapter.weapon();
	 }
}
