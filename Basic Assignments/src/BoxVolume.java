class BOX{
	private int length, width, depth;
	public void SetValue(int l, int w, int d) {
		length=l;
		width=w;
		depth=d;
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

public class BoxVolume {

	public static void main(String[] args) {
		BOX b1 = new BOX();
		b1.SetValue(5,5,5);
		b1.ShowVolume();
	}
}
