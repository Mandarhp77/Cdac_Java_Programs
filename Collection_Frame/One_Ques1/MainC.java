package One_Ques1;

import java.util.*;

public class MainC {

	public static void main(String[] args) {
		int choice;
		String name;
		int eid;
		int salary;
		
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
			System.out.println("0. exit");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter id, name, Salary");
				eid=sc.nextInt();
				name=sc.next();
				salary=sc.nextInt();
				emps.add(new Employee(eid,name,salary));
				break;
				
			case 2:
				for(Employee i: emps)
				System.out.println(i);
				break;
				
			case 3:
				int id;
				System.out.println("Enter id");
				id=sc.nextInt();
				for(int i = 0; i<emps.size();i++) {
					if(id==emps.get(i).getId()) {
						System.out.println(emps.get(i));
					}
				}
				break;
				
			case 4:
				int id1;
				System.out.println("Enter id");
				id1=sc.nextInt();
				for(int i = 0; i<emps.size();i++) {
					if(id1==emps.get(i).getId()) {
						emps.remove(i);
					}
				}
				break;
				
			case 5:
				int id2;
				System.out.println("Enter id for modification");
				id2=sc.nextInt();
				for(int i = 0; i<emps.size();i++) {
					if(id2==emps.get(i).getId()) {
                      System.out.println("Enter new name");
                      String new_name=sc.next();          
                      emps.get(i).setName(new_name);                     
					}
					
					if(id2==emps.get(i).getId()) {
	                      System.out.println("Enter new Salary");                      
	                      int new_sal = sc.nextInt();	                      
	                      emps.get(i).setSalary(new_sal);
					}
				}
				break;
				
			case 6:
				System.out.print("Size of array is: ");
				System.out.println(emps.size());
				break;
				
			case 7:
				Collections.sort(emps);
                System.out.println(emps);
			case 8:
				
				id1 = 0;
				id2 = 0;
				Collections.swap(emps, id1, id2);
				System.out.println(emps);
				
			}
		}
		while(choice !=0);

	}

}
