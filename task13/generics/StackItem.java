package generics;

public class StackItem <T> {
	
	T obj;
	
	StackItem <T> next;
	
	public StackItem(T obj) {
		this.obj = obj;
	}

	public StackItem <T> getNext() {
		return next;
	}

	public void setNext(StackItem <T> next) {
		this.next = next;
	}

	public T getObj() {
		return obj;
	}

}
