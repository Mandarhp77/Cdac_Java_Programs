class Details{
	private int custID;
	private int account;
	private int balance;
	private static int count=0;
	
	public Details() {
		count++;
		account = 1234;
		balance = 100;
		custID = count;
	}
	
	public Details(int a) {
		count++;
		account = a;
		custID = count;
		
	}
	
	public Details(int a, int b) {
		count++;
		account = a;
		balance = b;
		custID = count;
	}
	
	public void Show() {
		System.out.println("custID: "+count +"\n Account number: "+account+"\n Account Balance: "+balance);
	}
}
public class BANK {

	public static void main(String[] args) {
		Details d1 = new Details();
        d1.Show();
        
        Details d2 = new Details(121);
        d2.Show();
        
        Details d3 = new Details(122,1000);
        d3.Show();
        
        Details d4 = new Details();
        d4.Show();
        
        Details d5 = new Details(125,10000);
        d5.Show();
	}

}
