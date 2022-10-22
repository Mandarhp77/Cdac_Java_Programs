class CompNO{
	private int X,Y;
	public CompNO(){
	    X=5;
	    Y=6;
    }
	public CompNO(int x,int y){
	    X=x;
	    Y=y;
    }
	public void Show(){
		if (Y<0) {
			System.out.println("The Complex number is: "+X+"x"+Y+"i");
		}else {
	   System.out.println("The Complex number is: "+X+"x"+"+"+Y+"i");
    }
	}
}


public class Complex {

	public static void main(String[] args) {
		CompNO c1 = new CompNO(7,9);
		c1.Show();
		CompNO c2 = new CompNO(7,-9);
		c2.Show();
	}
}
