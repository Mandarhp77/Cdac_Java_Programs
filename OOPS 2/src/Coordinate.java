class Coxy{
	private int X,Y;
	public Coxy(){
	    X=5;
	    Y=6;
    }
	public Coxy(int x,int y){
	    X=x;
	    Y=y;
    }
	public void Show(){
	   System.out.println("The Coordinates Are:["+X+","+Y+"]");
    }
}
public class Coordinate {
	public static void main(String[] args) {
		Coxy c1 = new Coxy();
		c1.Show();
		Coxy c2 = new Coxy(7,9);
		c2.Show();
		

	}

}
