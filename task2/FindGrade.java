
public class FindGrade {

	public static void main(String[] args){
		int score = Integer.parseInt(args[0]);
        if (100>=score && score>=90) {
        System.out.println("Your grade is A");
        }
        else if (90>score && score>=80) {
        System.out.println("Your grade is B");
        }
        else if (80>score && score>=70) {
        System.out.println("Your grade is C");
        }
        else if (70>score && score>=60) {
        System.out.println("Your grade is D");
        }
        else if (60>score && score>=0) {
        System.out.println("Your grade is F");
        }
        else {
        System.out.println("It is not a valid score!");
        }
	}
}
