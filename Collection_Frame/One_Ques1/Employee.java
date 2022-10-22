package One_Ques1;

class Employee implements Comparable<Employee> {
	private int eid;
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name + ", salary=" + salary;
	}

	public int getId() {
		return eid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {

		return this.eid - o.eid;
	}
}
