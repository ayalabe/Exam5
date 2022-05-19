package Exam5_B;

import java.util.List;

public class Home {
	private Address address;
	private List<Room> rooms;
	private boolean hasYard;
	private boolean hasBasement;
	private double area;
	
	
	public Home(Address address, List<Room> rooms, boolean hasYard, boolean hasBasement, double area) {
		super();
		this.address = address;
		this.rooms = rooms;
		this.hasYard = hasYard;
		this.hasBasement = hasBasement;
		this.area = area;
	}

	public Home() {}
	
	@Override
	public String toString() {
		return "Home [address=" + address + ", rooms=" + rooms + ", hasYard=" + hasYard + ", hasBasement=" + hasBasement
				+ ", area=" + area + "]";
	}
	
	

}
