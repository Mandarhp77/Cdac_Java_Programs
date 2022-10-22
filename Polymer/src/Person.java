
public class Person {

	private String area ;
	private String pin ;
	private String city ;
	
	
	public Person() {	
           
	}
	public void calSal() {
		
	}
	
	public Person(String area, String pin, String city) {
		this.area = area;
		this.pin = pin;
		this.city = city;
	}
	public String toString() {
		return "person: City is " + city + ", area is " + area + " Pin is " + pin ;
	}
 
}
