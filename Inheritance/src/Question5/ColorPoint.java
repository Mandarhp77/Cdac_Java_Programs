package Question5;

public class ColorPoint extends Point {

	private String Color;
	public static String[] Colors;
	
	static {
		Colors = new String[3];
		Colors[0]="red";
		Colors[1]="blue";
		Colors[2]="green";
	}
	public ColorPoint() {
		
	}
	
	public ColorPoint(int x,int y,String Color) {
		super(x,y);
		for(int i=0;i<Colors.length;i++) {
			if(Color==Colors[i]) {
				this.Color=Color;
			}
			else {
				this.Color="white";
			}
		}
	}
	
	public String toString() {
		//System.out.println("Color is" + Color);
	    return super.toString()+" Color is " + Color;
	}
	
}
