package OneQ4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainC {
    public static void main(String[] args) throws IOException {
		String fname;
		String Details;
		String rname;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name");
		fname = sc.next();
		FileOutputStream fout = new FileOutputStream(fname);
				
  	    System.out.println("Enter the details into file");
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bufferi = new BufferedReader(ir);
		
		FileWriter file = new FileWriter(fname);
		BufferedWriter buffero = new BufferedWriter(file);
				
		int i;
		while((i=bufferi.read()) != 'q') {
			buffero.write(i);
		}
		buffero.close();
		file.close();
					
		
		System.out.println("Enter the filename to read the data");
		rname = sc.next();		
		FileInputStream fin = new FileInputStream(rname);
		
		int ch;
		while ((ch = fin.read()) != -1) {
			System.out.println((char)ch);
		}
		fin.close();
	}
}

