package shapes2d;

public class Square {
	
	protected int side;

	public Square(int side) {
		this.side = side;
	}
	
	public int area() {
		return side * side;
	}
	
	public String toString() {
		return "side :" + side;
	}

}
