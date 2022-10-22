package Question3;

public class Employee extends Person {
	private int eid, salary;

	public Employee() {

	}

	public Employee(int eid, int salary) {
		this.eid = eid;
		this.salary = salary;
	}

	public String toString() {
		return(" E id is " + eid + " Salary is " + salary);
	}
}
