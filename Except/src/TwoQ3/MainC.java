package TwoQ3;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args)throws Exception  {
		try {
			String colour;
			//Scanner sc = new Scanner(System.in);
			//colour = sc.next();
			ColourPoint c = new ColourPoint("Orange");
		}
		catch(ColoursNotMatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
