package TwoQ1;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		
		System.out.println("Enter the password");
		
		try {
			Scanner sc = new Scanner (System.in);
			String pass =  sc.next();
			int length = pass.length();
			System.out.println(length);
			if(length >= 12) {
				
				throw new PasswordTooLongException();
				
			}else if(length<=8) {
				
				throw new PasswordTooShortException();
			}
		}
		catch(PasswordTooLongException e) {
			System.out.println(e.getMessage());
		}
		catch(PasswordTooShortException e) {
			System.out.println(e.getMessage());
		}
	}
}
