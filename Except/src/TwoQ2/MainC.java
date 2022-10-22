package TwoQ2;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		
		try {
			String name;
			String country;
			System.out.println("Enter Name and Country Name");
			Scanner sc = new Scanner(System.in);
			name = sc.next();
			country = sc.next();
			UserRegistration u = new UserRegistration();
			u.RegisterUser(name, country);
		}
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
			
		}
	}
}
