
public class MainC {

	public static void main(String[] args) {
		Person p1[]=new Person[5];
		
		p1[0]=new Person("Shivaji Nagar","425001", "pune");
		p1[1]=new Emp("Mandar", "Shivaji Nagar","425001", "pune",404);
		p1[2]=new admin("Mandar", "Shivaji Nagar","425001", "pune",404,20000, 30000);
		p1[3]=new Programmer(3,500,"Mandar", "Shivaji Nagar","425001", "pune",404);
		p1[4]=new Manager(4,1000,"Mandar", "Shivaji Nagar","425001", "pune",404);
		
		for (int i=0; i<p1.length;i++) {
			p1[i].calSal();
			System.out.println(p1[i].toString());
		}
	}
}
