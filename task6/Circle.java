package lab;

public class Circle {
	int radius;
	
	Point center;
	
	public Circle(int r,Point c) {
		radius = r;
		center = c;
	}
	public double area() {
		return Math.PI* radius * radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
    public boolean overLap(Circle c) {
    	double distance =Math.sqrt(Math.pow(center.xCoord - c.center.xCoord, 2) +
    			Math.pow(center.yCoord - c.center.yCoord, 2));
        return distance < c.radius +radius;   
    }
}
