
public class FindMaximum {

	public static void main(String[] args){
		int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int result;

        boolean someCondition = value1 > value2;

        result = someCondition ? value1 : value2;

        System.out.println(result);

	}
}
