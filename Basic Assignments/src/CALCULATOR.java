class CALCULATE{
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
	
	public void Addition() {
		System.out.println("Addition is:"+ (X+Y));
	}
	
	public void Subtraction() {
		System.out.println("Subtraction is:"+ (X-Y));
	}
	
	
	public void Multiplication() {
		System.out.println("Multiplication is:"+ (X*Y));
	}
	
	public void Division() {
		System.out.println("Division is:" +(X/Y));
	}
}

public class CALCULATOR {

	public static void main(String[] args) {
		CALCULATE c1 = new CALCULATE();
		c1.SetValue(10,10);
		c1.Multiplication();
	}
}
