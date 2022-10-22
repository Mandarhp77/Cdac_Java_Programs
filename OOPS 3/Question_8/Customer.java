package Question_8;
import Question_7.Date;
class Details{
	private String E_mail;
	private String Add;
	private Address obj;
	
	public Details() {
		E_mail = "abcd123@gmail.com";
		Add = "Gokhale Nagar";
		obj = new Address();
	}
	public Details(String a, String b) {
		E_mail = a;
		Add = b;
		obj = new Address();
	}
	
	public void Display() {
		System.out.println("The Details of Person is: \n E_mail: "+E_mail+" \n Address: "+Add+"\n"+ obj.Show());
	}
}
public class Customer {

	public static void main(String[] args) {
		Details d1 = new Details();
		d1.Display();
	}
}
