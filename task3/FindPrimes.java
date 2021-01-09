
public class FindPrimes {

	public static void main(String[] args) {
	    int max= Integer.parseInt(args[0]);

        for (int number=2; number<max; number++){ 
            boolean isPrime=true;
            for (int divisor=2; divisor<number; divisor++){
                if (number%divisor==0){
                    isPrime=false;
                }
            }
            if (isPrime) {
                System.out.print(number+ " ");
            }
        }
		
	}
	
}
