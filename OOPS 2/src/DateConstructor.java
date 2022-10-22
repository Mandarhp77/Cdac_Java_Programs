class Dateconstruct{
	private int day, month, year;
	private char sep;
	
	public Dateconstruct() {
		day=1;
		month=1;
		year=2020;
		sep = '-';
	}
	
	public Dateconstruct(int d, int m, int y, char a) {
		day=d;
		month=m;
		year=y;
		sep = a;
	}
	
	public Dateconstruct(int d, int m) {
		day=d;
		month=m;
	}
	
	public void ShowDate() {
		System.out.println("Date: "+day+sep+month+sep+year);
	}
}

public class DateConstructor {

	public static void main(String[] args) {
		Dateconstruct d1 = new Dateconstruct();
		d1.ShowDate();
		
		Dateconstruct d2 = new Dateconstruct(4,7,22,'&');
		d2.ShowDate();
		
		Dateconstruct d3 = new Dateconstruct(4,11);
		d3.ShowDate();
		
		Dateconstruct d4 = d2;
		d4.ShowDate();
	}
}
