package Question_9;
class Pts{
	private int Start_pt;
	private int End_pt;
	
	public Pts() {
		Start_pt = 5;
		End_pt = 9;
	}
	
	public Pts(int a, int b) {
		Start_pt = a;
		End_pt = b;
	}
	
	public void Display() {
		System.out.println("Start point: "+Start_pt+ " Start point: "+End_pt);
	}
}

public class Point{
	public static void main(String args[]) {
		Pts pt = new Pts();
		pt.Display();
				
		Pts pt1 = new Pts(10,20);
		pt1.Display();
	}
}



