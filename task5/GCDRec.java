
public class GCDRec {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		int divisor=gcd(number1 > number2 ? number1 : number2, 
						number1 > number2 ? number2 : number1);
		System.out.println("GCD is " + divisor);

	}

	private static int gcd(int number1, int number2) {
		if ( number2 == 0)
			return number1;
		
		return gcd(number2, number1 % number2);
		
		
	}

}
