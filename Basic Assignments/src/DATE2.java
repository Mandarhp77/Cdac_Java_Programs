class Seperator{
	private int day, month, year;
	private char sep;
	public void SetDate(int d, int m, int y, char a) {
		day=d;
		month=m;
		year=y;
		sep = a;
		
	}
	
	public void SetDay(int d){
		day=d;
	}
	
	public void SetMonth(int m){
		month=m;
	}
	
	public void SetYear(int y){
		year=y;
	}
	
	public void ShowDate() {
		System.out.println("Date: "+day+sep+month+sep+year);
	}
}


public class DATE2 {

	public static void main(String[] args) {
		Seperator d1 = new Seperator();
		d1.SetDate(4,10,22,'/');
		d1.ShowDate();
	}
}


