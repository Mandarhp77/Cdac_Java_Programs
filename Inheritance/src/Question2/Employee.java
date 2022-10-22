package Question2;


public class Employee extends Person {
	private int eid, salary;

	public Employee() {

	}

	public Employee(int eid, int salary, String name, String city, String pin) {
		super(name, city, pin);
		this.eid = eid;
		this.salary = salary;
	}

	public void Display() {
		System.out.println("E id is " + eid + " Salary is " + salary);
	}
}
