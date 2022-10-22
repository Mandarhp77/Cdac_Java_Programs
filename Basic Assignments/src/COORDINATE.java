class CO{
	private int X, Y;
	public void SetValue(int x, int y) {
		X=x;
		Y=y;
	}
	
	public void SetX(int x){
		X=x;
	}
	
	public void SetY(int y){
	    Y = y;
	}
	
	public void ShowOrdinates() {
		System.out.println("CO-rdinates: ["+X+","+Y+"]");
	}
}
public class COORDINATE {

	public static void main(String[] args) {
		CO b1 = new CO();
		b1.SetValue(5,4);
		b1.SetY(8);
		b1.ShowOrdinates();
	}

}
