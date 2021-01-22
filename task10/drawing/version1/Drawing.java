package drawing.version1;

import java.util.ArrayList; 

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class Drawing {
	
	private ArrayList<Circle> circles = new ArrayList<Circle>();
	private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	private ArrayList<Square> squares = new ArrayList<Square>();
	
	public double calculateTotalArea(){
		double totalArea = 0;

		for (Circle circle : circles){
			totalArea += circle.area();    
		}
		
		for (Rectangle rect : rectangles){            
			totalArea += rect.area();     
		}
		for (Square sq : squares){            
			totalArea += sq.area();     
		}		
		
		return totalArea;
	}
	
	public void addCircle(Circle c) {
		circles.add(c);
	}
	
	public void addRectangle(Rectangle r) {
		rectangles.add(r);
	}
	public void addSquare(Square s) {
		squares.add(s);
	}
}
