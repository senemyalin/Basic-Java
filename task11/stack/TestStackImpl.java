package stack;

import java.util.ArrayList;
import java.util.List;

public class TestStackImpl {
	public static void main(String[] args) {
		
		List lst = new ArrayList();
		
		
		StackArrayImpl stack = new StackArrayImpl();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("");
		
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
	}

}