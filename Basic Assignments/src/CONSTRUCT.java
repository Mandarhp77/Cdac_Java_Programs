class Constructor{
	private int day, month, year;
	private char sep;
	public Constructor() {
		day = 5;
		month = 11;
		year = 2022;
		sep = '/';
	}
	
	public void Constructor(int a, int b, int c, char sep){
		day = a;
		month = b;
		year = c;
		this.sep = sep;
	}
	
	public void ShowDate() {
		System.out.println("Date: "+day+sep+month+sep+year);
	}
}

public class CONSTRUCT {

	public static void main(String[] args) {
		Constructor d1 = new Constructor();
		d1.ShowDate();
		d1.Constructor(1, 1, 23, '-');
		d1.ShowDate();
	}
}
