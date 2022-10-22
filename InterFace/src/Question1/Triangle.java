package Question1;

class Triangle implements Drawable {
	private double base, height;

	public Triangle() {
	}

	public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
	}
	
	public void drawShape() {	
		System.out.println("Draw a Triangle");
	}
	
	public double calculateArea() {
		return(0.5*base*height);
	}
	
}

