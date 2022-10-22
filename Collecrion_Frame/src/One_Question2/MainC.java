package One_Question2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		String name, email;
		int mob, reg;
		
		LinkedList<Customer> obj = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Customer Details");
		
		for(int i=0; i<2; i++) {
			System.out.println("Enter the Name");
			name = sc.next();
			System.out.println("Enter the E-mail");
			email = sc.next();
			System.out.println("Enter the Mobile Number");
			mob = sc.nextInt();
			System.out.println("Enter the Customer Reg no");
			reg = sc.nextInt();
			
			obj.add(new Registered_Customer(reg,name,email,mob));
		}
		
		System.out.println(obj);
		for(Customer i:obj) {
			System.out.println(i);
		}

	}

}
