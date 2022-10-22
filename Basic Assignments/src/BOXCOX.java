class Boxcon{
	private int length, width, depth;
	public void Boxcon(int l, int w, int d) {
		length=l;
		width=w;
		depth=d;
	}
	
	public Boxcon() {
		length=5;
		width=3;
		depth=6;
	}
	
	public void SetLength(int l){
		length=l;
	}
	
	public void SetWidth(int w){
	    width = w;
	}
	
	public void SetDepth(int d){
		depth = d;
	}
	
	public void ShowVolume() {
		System.out.println("Volume: "+(length*width*depth));
	}
}

public class BOXCOX {
	public static void main(String[] args) {
		Boxcon b1 = new Boxcon();
		b1.Boxcon(5, 2, 5);
		b1.ShowVolume();
	}
}
