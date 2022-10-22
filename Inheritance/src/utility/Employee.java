package utility;

public class Employee extends Person {
	private int eid, salary;

	public Employee() {

	}

	public Employee(String name,String city,String pin,int eid, int salary) {
		super(name,city,pin);
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {
		return super.toString()+"E id is" + eid + "Salary is " + salary;
	}
}


