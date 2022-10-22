package OneQ2;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter " + i + " Elements");
			a[i] = sc.nextInt();
		}

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("There are only 5 Elements in Array");
		}
	}
}
