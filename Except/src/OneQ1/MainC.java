package OneQ1;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		int a, b;

		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);

			System.out.println("Division of the number is= " + (a / b));
		} catch (ArithmeticException e) {
			System.out.println(" zero se divide nhi hota be bail");

		} catch (NumberFormatException e) {
			System.out.println(" Abe sirf Integer dal");
		}
	}

}
