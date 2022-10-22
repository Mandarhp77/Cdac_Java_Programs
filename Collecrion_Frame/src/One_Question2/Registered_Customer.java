package One_Question2;

class Registered_Customer extends Customer{
    private int regno;

	public Registered_Customer() {
		
	}

	public Registered_Customer(int regno, String name, String email, int mob) {
		super(name, email, mob);
		this.regno = regno;
	}
	
	@Override
	public String toString() {
		return "regno=" + regno;
	}
}
