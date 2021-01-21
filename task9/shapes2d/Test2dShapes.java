package shapes2d;

public class Test2dShapes {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Square square = new Square(5);
		String str = square.toString();
		
		System.out.println(circle.area());
		System.out.println(square.area());
		System.out.println(str);
		System.out.println(circle);
		
	}
}
