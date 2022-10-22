package Question1;

public class MainC {

	public static void main(String[] args) {
		Circle d1 = new Circle(3.0);
		d1.drawShape();
		System.out.println(d1.calculateArea());
		
		Rectangle d2 = new Rectangle(6,8);
		d2.drawShape();
		System.out.println(d2.calculateArea());
		
		Triangle d3 = new Triangle(4,2);
		d3.drawShape();
		System.out.println(d3.calculateArea());
		
		
		

	}
}
