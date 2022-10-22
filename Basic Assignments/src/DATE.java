class DATES{
	private int day, month, year;
	public void SetDate(int d, int m, int y) {
		day=d;
		month=m;
		year=y;
		
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
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
}


public class DATE {

	public static void main(String[] args) {
		DATES d1 = new DATES();
		d1.SetDate(4,10,22);
		d1.ShowDate();
	}
}
