package Two_Question4;

public class Employee implements Comparable<Employee>{
	private String name;
	private int pri;
		
	public Employee() {
	}

	public Employee(String name, int pri) {
	    this.name = name;
	    this.pri = pri;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}
	
	public String getName() {
		return name;
	}

	public int compareTo(Employee o) {
			
		return this.pri - o.pri;
	}

}
