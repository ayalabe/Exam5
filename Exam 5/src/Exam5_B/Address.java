package Exam5_B;

public class Address {
	
	private String street;
    private int number;
	private String state;
	private String city;
	
	
	public Address(String street, int number, String state, String city) {
		super();
		this.street = street;
		this.number = number;
		this.state = state;
		this.city = city;
	}
	
	public Address() {}


	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", state=" + state + ", city=" + city + "]";
	}
	
	

}
