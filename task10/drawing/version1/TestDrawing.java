package drawing.version1;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class TestDrawing {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		Object obj = c;
		c.area();
		obj.toString();
		obj = "Hello";
		if (obj instanceof Circle)
			((Circle)obj).area();
		
		Drawing drawing = new Drawing();
		
		drawing.addCircle(new Circle(5));
		drawing.addCircle(new Circle(10));
		drawing.addRectangle(new Rectangle(5,6));
		drawing.addSquare(new Square(5));
		

		System.out.println("Total area = " + drawing.calculateTotalArea());
	}

}
