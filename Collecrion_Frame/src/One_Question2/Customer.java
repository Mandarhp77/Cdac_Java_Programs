package One_Question2;

class Customer {
	private String name, email;
	private int mob;
	
	public Customer() {
		super();
	}


	public Customer(String name, String email, int mob) {
		super();
		this.name = name;
		this.email = email;
		this.mob = mob;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", email=" + email + ", mob=" + mob;
	}
	
}
