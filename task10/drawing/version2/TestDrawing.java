package drawing.version2;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class TestDrawing {

	public static void main(String[] args) {
		
		Drawing drawing = new Drawing();
		
		drawing.addShape(new Circle(5));
		drawing.addShape(new Rectangle(5,6));
		drawing.addShape(new Square(5));
		

		System.out.println("Total area = " + drawing.calculateTotalArea());
	}

}