package Question3;


public class Person extends Date{
	private String name;
	private String city;
	private String pin;

	public Person() {

	}

	public Person(String name, String city, String pin) {
		this.name=name;
		this.city =city;
		this.pin=pin;
	}
	
	public String toString() {
		return("name: "+ name +" city "+ city+" Pin Code is "+pin);
	}
	
}

