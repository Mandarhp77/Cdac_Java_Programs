package two_question2;

import java.util.Scanner;
import java.util.TreeSet;

public class MainA {

	public static void main(String[] args) {

		int eid, salary;
		String name;
		TreeSet<Employee> obj = new TreeSet<>();
		Scanner sc = new Scanner(System.in);

		obj.add(new Employee(01, "mandar", 870));
		obj.add(new Employee(02, "vinay", 910));
		obj.add(new Employee(03, "prince", 650));
		obj.add(new Employee(04, "vinay", 780));
		obj.add(new Employee(05, "mandar", 790));

		for (Employee i : obj) {
			System.out.println(i);
		}
	}

}
