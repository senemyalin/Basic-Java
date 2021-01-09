

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {	
		Scanner reader = new Scanner(System.in); //Creates an object to read user input
		Random rand = new Random(); //Creates an object from Random class
		int number =rand.nextInt(100); //generates a number between 0 and 99
		
		
		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");
		int count=1;
		int guess = reader.nextInt(); //Read the user input
        while ( number!=guess && guess!=-1){
            count++;		
            if (number==guess) {
                System.out.println("Congratulations! You won after "+count+" attempts!");
            }
            else {  
                 if (guess!=-1){
                    System.out.println("Sorry");
                    if (guess>number) {
                        System.out.println("Your number is higher than my number.");
                    }
                    else if (guess< number){
                        System.out.println("Your number is lower than my number.");               
                    }
                    System.out.print("Type -1 to quit or guess another:");
                    guess = reader.nextInt();
                    if (number==guess){
                    System.out.println("Congratulations! You won after "+count+" attempts!");
                    }
                 }
                 else {
                        System.out.println("Sorry, the number was "+number);
                 }
            }
        }
        
		
		
		reader.close(); //Close the resource before exiting
	}
	
	
}
