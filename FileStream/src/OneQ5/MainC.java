package OneQ5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) throws IOException {
		String input, output;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file to read the data");
		input = sc.next();
		
		System.out.println("Enter the file to write the data");
		output = sc.next();
		
		FileInputStream fin = new FileInputStream(input);
		FileOutputStream fout = new FileOutputStream(output);
		
		int ch;
		while((ch=fin.read())!=-1){
			fout.write(ch);
		}
		
		fin.close();
		fout.close();
	}
}
