package Question_1;
class Details{
	private int custID;
	private static float irate;
	private float balance;
	private static int count=0;
	
	static{
		irate  = 7.7f;
	}
	
	public Details() {
		count++;
		balance = 100;
		custID = count;
	}
	
	static void updateIntRate(float x){
		irate = x;
	}
	
	public Details(float a) {
		count++;
		balance = a;
		custID = count;
	}
	
	public void Show() {
		balance = balance+balance*(irate/100);
		System.out.println("custID: "+count +"\t Interest Rate: "+irate+"\t Account Balance: "+balance);
	}
}
public class Bank {

	public static void main(String[] args) {
		Details d1 = new Details();
        d1.Show();
        
        Details d2 = new Details(100);
        d2.Show();
        
        Details d3 = new Details(200);
        d3.updateIntRate(8.8f);
        d3.Show();
        
        Details d4 = new Details(300);
        d4.Show();
        
        Details d5 = new Details(400);
        d5.Show();
	}

}
