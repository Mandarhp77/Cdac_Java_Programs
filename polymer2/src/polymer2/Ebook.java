package polymer2;

class Ebook extends Book{
	private double cost;
	private double new_cost;
	
	public Ebook(double cost) {
	    super(cost);
	    this.cost=cost;
	}
	
	public void calPrice() {
		double temp=0;
		if(cost<=500) {
			temp=(0.02*cost);
			new_cost = cost-temp;	
			
		}else if(500<cost && cost<=1000) {
			temp=(0.05)*cost;
			new_cost = cost-temp;
			
		}else if(cost>1000 && cost<=5000) {
			temp=(0.07*cost);
			new_cost = cost-temp;
		}
	}
	
	public String toString() {
		return "Ebook cost: "+cost+" new_cost: "+ new_cost;
	}

}
