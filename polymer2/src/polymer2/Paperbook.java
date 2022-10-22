package polymer2;
class Paperbook extends Book {
	private double cost;
	private double new_cost;
	
	public Paperbook(double cost) {
	    super(cost);
	    this.cost=cost;
	}
	
	public void calPrice() {
		double temp;
		if(cost<=500) {
			temp=(7/100)*cost;
			new_cost = cost+temp;
			
			
		}else if(500<cost && cost<=1000) {
			temp=(5/100)*cost;
			new_cost = cost+temp;
			
			
		}else if(cost>1000 && cost<=5000) {
			temp=(2/100)*cost;
			new_cost = cost+temp;
			
		}
	}
	
	public String toString() {
		return "Hardcover Cost: "+cost+" New cost: "+ new_cost;
	}
	
	
	
	

}
