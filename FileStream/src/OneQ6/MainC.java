package OneQ6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class MainC {

	public static void main(String[] args) throws IOException {
		String input;
		String details;
		int count = 0;
		
		int line=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file to read the data");
		input = sc.next();
		
		FileReader fin = new FileReader(input);
		BufferedReader buffer = new BufferedReader(fin);
		
		int ch;
		String str = "";
		while((ch=fin.read())!=-1){
			if(ch =='\n') {
				count++;
				System.out.println(count+". "+str);
				str = "";
			}else {
				str += Character.toString((char)ch);
			}
		}
		count++;
		System.out.println(count+". "+str);
	}
}
