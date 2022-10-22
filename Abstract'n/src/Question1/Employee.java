package Question1;


abstract class Employee {
	
	private int eid , sal;
	private String name ;
	
	public Employee(){
		
	}

	public Employee( String name, int eid) {
		this.eid = eid;
		this.name = name;
	}
	
	public abstract void calSal();
	
	public String toString () {
		return "Emp: Eid: " + eid + " Name: " + name ;
	}
}

