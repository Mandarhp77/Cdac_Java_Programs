package Two_Question4;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainC {

	public static void main(String[] args) {
		Queue<Employee> obj = new PriorityQueue<>();
		obj.add(new Employee("Kaustubh",5));
		obj.add(new Employee("Mandar",4));
		obj.add(new Employee("Aalesh",1));
		obj.add(new Employee("Vinay",3));
		obj.add(new Employee("Prince",2));
		
		for (Employee i : obj) {
			System.out.println(i);
		}
		
		obj.remove();
		System.out.println(" -----------------------");
	
		for (Employee i : obj) {
			System.out.println(i);
		}
		
		obj.remove();
		System.out.println(" -----------------------");
	
		for (Employee j : obj) {
			System.out.println(j);
		}
		
		obj.remove();
		System.out.println(" -----------------------");
	
		for (Employee j : obj) {
			System.out.println(j);
		}
		
		obj.remove();
		System.out.println(" -----------------------");
	
		for (Employee j : obj) {
			System.out.println(j);
		}
		
		obj.remove();
		System.out.println(" -----------------------");
	
		for (Employee j : obj) {
			System.out.println(j);
		}
		
		obj.remove();
		System.out.println(" -----------------------");
	
		for (Employee j : obj) {
			System.out.println(j);
		}
	}
}
