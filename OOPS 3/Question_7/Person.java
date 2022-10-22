package Question_7;

class Details{
	private String name;
	private String city;
	private Date dob;
	
	public Details() {
		name = null;
		city = null;
		dob = new Date();
	}
	
	public Details(String name, String city, int d, int m, int y) {
		this.name = name;
		this.city = city;
		dob = new Date(d,m,y);
	}
	
	public Details(String name, String city, Date d1) {
		this.name = name;
		this.city = city;
		dob = d1;
	}
	
	public void Show() {
		System.out.println("Personal Details: "+ name+" " + city +" "+dob.Display());
	}
}
public class Person {
        
	public static void main(String[] args) {
		Details d2 = new Details();
		d2.Show();
		
		Details d3 = new Details("Mandar", "Jalgaon", 25, 10, 2022);
		d3.Show();
		
		Date d1 = new Date(20,9,1998);
		
		Details d4 = new Details("Mandar", "Jalgaon", d1);
		d4.Show();
			
	}
}
