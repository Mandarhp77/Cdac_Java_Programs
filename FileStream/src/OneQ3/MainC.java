package OneQ3;

import java.util.Scanner;

public class MainC {

	public static void main(String[] args) {
		String name;
		int rollno;
		int marks;
		
	    Scanner sc = new Scanner(System.in);
	    Student s[] = new Student[3];
	    System.out.println("Enter Roll no, name and String");
	  
	    for(int i=1; i<3; i++) {
	    	name = sc.next();
		    rollno = sc.nextInt();
		    marks = sc.nextInt();     
	    	s[i]=new Student(rollno, name, marks);
	    	System.out.println(s[i].calGrade());
	    }
	}
}
