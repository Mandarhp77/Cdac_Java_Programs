
 public class Programmer extends Emp {
 
	private int hours, charges , net_sal, sal;
	
	public Programmer() {
		
	}

	public Programmer(int hours, int charges , String name, String area, String pin, String city , int eid) {
		super( name,  area,  pin,  city ,  eid);
		this.hours = hours;
		this.charges = charges;
		this.net_sal = net_sal;
	}
	public void calSal() {
		net_sal = sal+(hours * charges);
	}
	
	public String toString() {
		return "Programmer Salary is: "+net_sal;
	}
	
}