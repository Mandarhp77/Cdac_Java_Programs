
public class Manager extends Emp {

	private int target, incentive, net_sal, sal;
	
	public Manager () {
	}

	public Manager(int target, int incentive , String name, String area, String pin, String city,int eid) {
		super(area,  pin,  city ,name , eid );
		this.target = target;
		this.incentive = incentive;
		this.sal = sal;
	}
	public void calSal() {
		 
		net_sal = sal + target * incentive ;
	}
	public String toString() {
		
		return "Manager: Salary = " + net_sal ;
	}
	
}
