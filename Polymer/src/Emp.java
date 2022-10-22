
public class Emp extends Person {
	
	private int eid , sal;
	private String name ;
	
	public Emp(){
		
	}

	public Emp( String name, String area, String pin, String city , int eid) {
		super( area,  pin,  city);
		this.eid = eid;
		this.name = name;
	}
	public String toString () {
		
		return "Emp: Eid: " + eid + " Name: " + name ;
	}
}
