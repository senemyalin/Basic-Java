package shapes;

public class Square extends Shape {

	double side;

	
	public Square(double side) {
		super();
		this.side = side;
	}

	public double area(){
		return side * side;

	}	

}