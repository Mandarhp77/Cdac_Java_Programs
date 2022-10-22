package Question1;

class Rectangle implements Drawable {
	private double length, breadth;

	public Rectangle() {
	}

	public Rectangle(double a, double b) {
		length = a;
		breadth = b;
	}
	
	public void drawShape() {	
		System.out.println("Draw a Rectangle");
	}
	
	public double calculateArea() {
		return(length*breadth);
	}
	
}
