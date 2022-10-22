package Question_6;

class Volume{
	private int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	public void Calculate() {
		int result=1;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				result = result * a[i][j];
			}
		System.out.println("Volume for box "+(i+1)+ " is "+ result);
		result=1;
		}
	}
}
public class Box {
	public static void main(String[] args) {
		Volume v1 = new Volume();
		v1.Calculate();
	}
}
