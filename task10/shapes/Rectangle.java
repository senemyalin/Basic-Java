package shapes;

public class Rectangle extends Shape {
	

	double width;
	double height;

	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double area(){
		return height * width;

	}	
	
	
}
