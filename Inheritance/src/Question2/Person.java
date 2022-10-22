package Question2;


public class Person {
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
	
	public void Display() {
		System.out.println("name: "+ name +" city "+ city+" Pin Code is "+pin);
	}
	
}

