
public class FindMin {

	public static void main(String[] args){
		int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int value3 = Integer.parseInt(args[2]);
        int result;
         
        boolean someCondition= value1 < value2;

        result = someCondition ? value1 : value2;

        result = result < value3 ? result : value3;

        System.out.println(result);

	}
}
