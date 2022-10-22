package Question4;


public class Customer {
	private String name;
	private String email;

	public Customer() {

	}

	public Customer(String name, String email) {
		this.name=name;
		this.email =email;
	}
	
	public String toString() {
		return("name: "+ name +"email"+ email);
	}
	
}
