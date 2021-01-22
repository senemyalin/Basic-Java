package shapes;

public class Circle extends Shape {
	private double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double area(){
		return Math.PI * Math.pow(radius, 2);
	}
	
	
}