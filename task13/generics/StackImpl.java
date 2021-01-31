package generics;
import java.util.ArrayList;
import java.util.List;

public class StackImpl <T> implements Stack <T> {

	private StackItem <T> top;
	
	@Override
	public void push(T obj) {
		StackItem <T> item = new StackItem<T>(obj);
		item.setNext(top);
		top = item;
	}

	@Override
	public T pop() {
		StackItem<T> item = top;
		top = top.getNext();
		return item.getObj();
	}

	@Override
	public boolean empty() {
		return top == null;
	}

	@Override
	public List<T> toList(){
		List<T> list = new ArrayList<>();
		StackItem<T> current = top;
		while (current != null) {
			list.add(0, current.getObj());
			current = current.getNext();
		}
		return list;
	}

	@Override
	public void addAll(Stack<? extends T> aStack) {
		List<? extends T> list = aStack.toList();
		for(T t : list) {
			push(t);
		}
	}
}