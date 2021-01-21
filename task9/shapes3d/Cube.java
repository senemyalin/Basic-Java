package shapes3d;

import shapes2d.Square;

public class Cube extends Square {
	
	public Cube(int side) {
		super(side);
	}
	
	public int area() {
		return super.area() * 6;
	}
	
	public int volume() {
		return super.area() * side;
	}
	
}