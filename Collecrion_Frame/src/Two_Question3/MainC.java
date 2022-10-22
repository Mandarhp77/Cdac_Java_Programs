package Two_Question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class MainC {

	public static void main(String[] args) {

		int eid, salary;
		String name;
		ArrayList<Employee> obj = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		obj.add(new Employee(050, "mandar", 870));
		obj.add(new Employee(02, "vinay", 910));
		obj.add(new Employee(11, "prince", 650));
		obj.add(new Employee(04, "vinay", 780));
		obj.add(new Employee(05, "mandar", 790));

		
		System.out.println("Sorting by id");
		Collections.sort(obj , new Ceid());
		for (Employee i : obj) {
			System.out.println(i);
		}
		    
		System.out.println("Sorting by salary");
	    Collections.sort(obj , new Csal());
		for (Employee i : obj) {
		    System.out.println(i);
		}
	}
}
