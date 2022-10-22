package Question_4;

class Array_1D{
	private int a[];
	private int min;
	private int max;
	private int avg;
	private int sum;
	
	public void avg(int a[]) {
		 int sum=0;
		 for(int i=0; i<a.length; i++) {
			 sum = sum + a[i];
		 }
		 avg = sum/(a.length);
		 System.out.println("Average is: "+avg);
	}
	
    public void min(int a[]) {
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Minimum number is: "+min);
    }
    
    public void max(int a[]) {
		int min=a[0];
		for(int i=0; i<a.length; i++) {
			if(min<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum number is: "+max);
    }
}
public class MinMax {
	public static void main(String[] args) {
		Array_1D a1 = new Array_1D();
		int arr[]= {1,2,3,4,5};
		a1.avg(arr);
		a1.min(arr);
		a1.max(arr);
	}
}
