package Question1;


class admin extends Employee {
	private int net_sal, sal, bonus;
	

	public admin() {
	}

	public admin(String name,  int eid, int bonus, int sal) {
		//super(name, eid);
		this.net_sal = net_sal;
		this.bonus = bonus;
		this.sal=sal;
	}

	public void calSal() {
		net_sal = bonus+ sal;
	}

	public String toString() {
		return "Admin: Salary = " + net_sal;
	}

}
