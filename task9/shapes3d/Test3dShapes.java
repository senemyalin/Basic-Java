package shapes3d;

public class Test3dShapes {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(5,10);
		Cube cube = new Cube(5);
	
		
		System.out.println(cylinder.area());
		System.out.println(cylinder);
		System.out.println(cube.area());
		System.out.println(cube);
		System.out.println("Volume of Cube : " + cube.volume());
		System.out.println("Volume of Cylinder :" + cylinder.volume());
	}

}