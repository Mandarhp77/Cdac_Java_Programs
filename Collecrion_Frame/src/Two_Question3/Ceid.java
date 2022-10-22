package Two_Question3;

import java.util.Comparator;

class Ceid implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		
		return o1.eid-o2.eid;
	}
}
