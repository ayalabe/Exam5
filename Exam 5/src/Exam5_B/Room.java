package Exam5_B;

public class Room {
	 private double width;
	 private double length;
     private boolean hasAC;
     
     
	public Room(double width, double length, boolean hasAC) {
		super();
		this.width = width;
		this.length = length;
		this.hasAC = hasAC;
	}

	public Room() {}
	
	@Override
	public String toString() {
		return "Room [width=" + width + ", length=" + length + ", hasAC=" + hasAC + "]";
	}
     
     

}
