package drawing.version2;

import java.util.ArrayList; 

import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;

public class Drawing {
	

	private ArrayList<Object> shapes = new ArrayList<Object>();
	
	public double calculateTotalArea(){
		double totalArea = 0;

		for (Object obj : shapes){
			if (obj instanceof Circle)
				totalArea += ((Circle)obj).area();    
			else if (obj instanceof Rectangle)
				totalArea += ((Rectangle)obj).area();   
			else if (obj instanceof Square)
				totalArea += ((Square)obj).area();   
		}
			
		return totalArea;
	}
	
	public void addShape(Object o) {
		shapes.add(o);
	}
}
