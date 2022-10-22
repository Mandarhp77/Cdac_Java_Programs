
public class PRIME {

	public static void main(String[] args) {
		int num = 87, flag=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("THe number is not prime");
		}else {
			System.out.println("THe number is prime");
		}
		
	}

}
