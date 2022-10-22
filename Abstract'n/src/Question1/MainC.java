package Question1;


public class MainC {

	public static void main(String[] args) {
		Employee p1[]=new Employee[4];
		
		p1[0]=new admin("Mandar",404,20000, 30000);
		p1[1]=new Programmer(3,500,"Mandar",404);
		p1[2]=new Manager(4,1000,"Mandar", 404);
		
		for (int i=0; i<p1.length;i++) {
			p1[i].calSal();
			System.out.println(p1[i].toString());
		}
	}
}
