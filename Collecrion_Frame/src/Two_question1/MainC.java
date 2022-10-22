package Two_question1;

import java.util.HashSet;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		int id, perc;
		String name, city;
		HashSet<Student> obj = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		
		obj.add(new Student(01, "mandar", "Jalgaon", 87));
		obj.add(new Student(02, "vinay", "Pune", 91));
		obj.add(new Student(03, "prince", "Akola", 65));
		obj.add(new Student(04, "vinay", "Pune", 78));
		obj.add(new Student(05, "mandar", "Jalgaon", 79));
		
		for (Student i : obj) {
			System.out.println(i);
		}
	}
}
