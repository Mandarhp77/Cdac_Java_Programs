package Two_Question3;

import java.util.Comparator;

class Csal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.salary-o2.salary;
	}

}
