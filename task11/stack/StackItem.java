package stack;

public class StackItem {
	Object obj;
	StackItem next;
	
	public StackItem(Object obj) {
		this.obj=obj;
	}

	public StackItem getNext() {
		return next;
	}

	public void setNext(StackItem next) {
		this.next = next;
	}

	public Object getObj() {
		return obj;
	}
}
