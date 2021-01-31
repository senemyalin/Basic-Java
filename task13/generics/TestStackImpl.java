package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStackImpl {

	public static void main(String[] args) {
		
		List<Integer> lst = new LinkedList<>();
		lst.add(5);
		lst.add(6);
		
		List<String> lstStr = new LinkedList<>();
		lstStr.add("A");
		lstStr.add("B");
		
		List<Object> lstObj = new ArrayList<>();
		lstObj.add(lstStr);
		lstObj.add(lst);
		
		Stack<Object> stachObj = new StackImpl<Object>();
		
		Stack<String> stack = new StackImpl<String>();
		
		stachObj.addAll(stack);
		
		
		/*
		StackImpl stack = new StackImpl();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	
		*/
		
		Stack<String> stack1 = new StackImpl<>();
	
		stack1.push("A");
		stack1.push("B");
		stack1.push("C");
		stack1.push("D");
		
		Stack<String> stack2 = new StackImpl<>();
		
		stack1.push("X");
		stack1.push("Y");
		stack1.addAll(stack2);
		System.out.println(stack1.toList());
		
		while(!stack1.empty()) {
			String str = stack1.pop();
			System.out.println(str);
		}
		
		Stack<Integer> stackInt = new StackArrayImpl<>();
		stackInt.push(5);
		int a = stackInt.pop();
		System.out.println(a);
	}
}