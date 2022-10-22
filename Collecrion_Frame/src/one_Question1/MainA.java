package one_Question1;

import java.util.*;

public class MainA {

	public static void main(String[] args) {
		int choice;
		String name;
		int eid;
		int salary;
		int id;

		List<Employee> emps = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Accept");
			System.out.println("2. display");
			System.out.println("3. search");
			System.out.println("4. delete");
			System.out.println("5. modify");
			System.out.println("6. size");
			System.out.println("7. sort");
			System.out.println("8. Reverse");
			System.out.println("9. isPresent");
			System.out.println("0. exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter ID, name, Salary");

				int eids = sc.nextInt();
				String name1 = sc.next();
				int sal = sc.nextInt();

				emps.add((new Employee(eids, name1, sal)));
				break;

			case 2:
				for(Employee i: emps) {
					System.out.println(emps);
				}
				//System.out.println(emps);

				break;
			case 3:
				System.out.println("Enter ID for Search");
				id = sc.nextInt();
				for(int i=0; i<emps.size(); i++) {
					if (id ==emps.get(i).getId()){
					    System.out.println(emps.get(i));
					}
				}
				break;
				

			case 4:
				System.out.println("Enter ID to delete");
				id = sc.nextInt();
				for(int i=0;i<emps.size(); i++) {
					if(id==emps.get(i).getId()) {
						System.out.println(emps.remove(i));
					}
					
				}
				break;
				

			case 5:
				System.out.println("Enter ID to modify");
				id = sc.nextInt();
				for(int i=0;i<emps.size(); i++) {
					if(id==emps.get(i).getId()) {
						System.out.println("Enter Name to modify");
						name = sc.next();
						emps.get(i).setName(name);
					}
					
					if(id==emps.get(i).getId()) {
						System.out.println("Enter Salary to modify");
						salary = sc.nextInt();
						emps.get(i).setSalary(salary);
					}
					
				}
				break;

			case 6:
				System.out.println("The size of This Array is"+emps.size());
				break;
				
			case 7:
				Collections.sort(emps);
				break;
			
			case 8:
				for(int i=emps.size()-1; i>=0; i--) {
					System.out.println(emps.get(i)); 
				}
				break;
				
			case 9:
				System.out.println("Enter the String");
				String str = sc.next();
				for(int i=0; i<emps.size(); i++) {
					if(str==emps.get(i).getName()) {
						System.out.println("Present at index "+ i);
						
					}else {
						System.out.println("String is missing");
					}
				}
				break;
			}
		} while (choice != 0);
	}
}
