class OVERLOADING{
	private int X, Y, Z;
	public void SetValue(int x, int y) {
		X=x;
		Y=y;
	}
	
	public void SetValue(int x, int y, int z) {
		X=x;
		Y=y;
		Z=z;	
	}
	
	public void SetValue(float x, float y) {
		 X=(int) x;
		 Y=(int) y;
	}
	
	public void SetX(int x){
		X=x;
	}
	
	public void SetY(int y){
	    Y = y;
	}
	
	public void Addition() {
		System.out.println("Addition is:"+ (X+Y+Z));
	}
}

public class OVERLOAD {

	public static void main(String[] args) {
		OVERLOADING o1 = new OVERLOADING();
		o1.SetValue(2.2f, 2.3f);
		o1.Addition();
		
	}
}
