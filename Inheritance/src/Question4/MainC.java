package Question4;

public class MainC {

	public static void main(String[] args) {
		Customer E1 = new Customer();
		System.out.println(E1);
		
		Reg_Customer E2 = new Reg_Customer(50000);
		System.out.println(E2);
		
		Reg_Customer E[] = new Reg_Customer[5];
		E[0]=new Reg_Customer(500000);
		E[1]=new Reg_Customer(600000);
		E[2]=new Reg_Customer(700000);
		E[3]=new Reg_Customer(800000);
		E[4]=new Reg_Customer(900000);
		
		for(int i=0;i<E.length;i++) {
			System.out.println(E[i]);
		}
		
		
	}
}
