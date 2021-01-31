package generics;

import java.util.ArrayList;
import java.util.List;

public class StackArrayImpl <T> implements Stack <T>{
	
	ArrayList<T> items = new ArrayList<T>();

	@Override
	public void push(T obj) {
		items.add(obj);
	
	}

	@Override
	public T pop() {
		return items.remove(items.size() - 1);
	}

	@Override
	public boolean empty() {
		return items.size() == 0;
	}

	public List<T> toList() {
		return items;
	}

	@Override
	public void addAll(Stack<? extends T> aStack) {
		List<? extends T> list = aStack.toList();
		for(T t : list) {
			push(t);
		}
	}
}
