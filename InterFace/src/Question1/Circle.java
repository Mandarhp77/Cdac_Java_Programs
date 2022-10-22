package Question1;

class Circle implements Drawable {
	private double radius;

	public Circle() {

	}

	public Circle(double a) {
        radius = a;
	}
	
	public void drawShape() {	
		System.out.println("Draw a Circle");
	}
	
	public double calculateArea() {
		return(3.14*radius*radius);
	}
	
	
	
}
