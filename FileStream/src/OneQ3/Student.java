package OneQ3;

class Student {
	private int rollno;
	private String name;
	private int marks;
	
	public Student() {
		
	}

	public Student(int rollno, String name, int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public char calGrade() {
		if(marks>80 && marks<100) {
			return 'a';
		}
		else if(marks>60 && marks<79){
			return 'b';
		}
		else if(marks>35 && marks<59) {
			return 'c';
		}else {
			return 'd';
		}
	}
}
