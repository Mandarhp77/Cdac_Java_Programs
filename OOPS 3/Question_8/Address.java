package Question_8;

public class Address {
	private String area;
	private String city;
	private String pin;
	
	public Address() {
		area = "Sivaji_Nagar";
		city = "Pune";
		pin = "425001";	
	}
	
	public Address(String a, String b, String c) {
		area = a;
		city = b;
		pin = c;	
	}
	
	public String Show() {
		return "Area: "+area+", city "+city+", pin "+pin;
	}
}
