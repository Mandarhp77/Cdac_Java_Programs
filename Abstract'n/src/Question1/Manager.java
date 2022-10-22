package Question1;


public class Manager extends Employee {

	private int target, incentive, net_sal, sal;
	
	public Manager () {
	}

	public Manager(int target, int incentive , String name, int eid) {
		//super(name , eid );
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
