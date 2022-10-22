class volume{
	private int length, width, depth;
	public volume() {
		length = width = depth = 5;
	}
	
	public volume(int x) {
		length = width = depth = x;
	}
	
	public volume(int a, int b, int c) {
		length = a;
		width = b;
		depth = c;
	}
	
	public void show() {
		System.out.println("The Volume is: "+(length*width*depth));
	}
}
public class BoxVolume {

	public static void main(String[] args) {
		volume v1 = new volume(2,2,3);
		v1.show();
		
		volume v2 = new volume(2);
		v2.show();
	}
}
