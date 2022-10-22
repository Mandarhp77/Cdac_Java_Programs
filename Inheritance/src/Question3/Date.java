package Question3;

class Date{
	private int dd, mm, yy;
	
	public Date() {
		dd=25;
		mm=10;
		yy=2022;
	}
	public Date(int a, int b, int c) {
		dd=a;
		mm=b;
		yy=c;
	}
	public String toString() {
		return(" Date is " +dd+"-"+mm+"-"+yy);
	}
}


