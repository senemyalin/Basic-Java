package shapes2d;

public class Circle {
	
	protected int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}	
	public double area() {
		return Math.PI * radius * radius;
	}

	public String toString() {
		return "radius :" + radius;
	}
}
