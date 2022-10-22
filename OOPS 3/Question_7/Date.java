package Question_7;

public class Date {
	private int dd, mm, yy;
	
	public Date() {
		dd=mm=1;
		yy=2020;
	}
	
	public Date(int d, int m, int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	
	public String Display() {
		return dd+"-"+mm+"-"+yy;
	}
}
