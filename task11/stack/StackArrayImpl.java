package stack;

import java.util.ArrayList;

public class StackArrayImpl implements Stack {
	
	ArrayList items = new ArrayList();

	@Override
	public void push(Object obj) {
		items.add(obj);
		
	}

	@Override
	public Object pop() {
		return items.remove(items.size()-1);
		
	}

	@Override
	public boolean empty() {
		return items.size() == 0;
		
	}

}
