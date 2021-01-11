
public class GCDLoop {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);

		int divisor=gcd(number1 > number2 ? number1 : number2, 
						number1 > number2 ? number2 : number1);
		System.out.println("GCD is " + divisor);

	}

	private static int gcd(int number1, int number2) {
		int result=0;
		int remainder;
		
		do {
			System.out.println("Number 1 : "+ number1 + "Number 2 : " + number2);
			remainder = number1 % number2;
			number1 = number2;
			number2 = remainder;
			result = number1;
		
		}while(remainder != 0 );
	
	
		return result;
		
		
	}

}
