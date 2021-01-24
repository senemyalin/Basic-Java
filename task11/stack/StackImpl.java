package stack;

public class StackImpl implements Stack {
	
	private StackItem top;

	@Override
	public void push(Object obj) {
		StackItem item = new StackItem(obj);
		item.setNext(top);   // yeni next yapıyor
		top = item;

	}

	@Override
	public Object pop() {     //top ile tersini yapıyoruz
		StackItem item = top;
		top = top.getNext();
		return item.getObj();
	}

	@Override
	public boolean empty() {
		
		return top==null;
	}

}
