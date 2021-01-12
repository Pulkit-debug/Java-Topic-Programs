package Data_Structures_And_Algorithms.CollectionFrameworks.stack;

import Data_Structures_And_Algorithms.CollectionFrameworks.LinkedList.MyLinkedList;

public class MyStack<E> {
	
	
	MyLinkedList<E> ll = new MyLinkedList<>();
	
	public void push(E e) {
		ll.add(e);
	}
	
	public E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Nothing to pop!!");
		}
		else {
			return ll.removeFromStack();
		}
	}
	
	public E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Nothing to Peek!!");
		}
		return ll.peekFromStack();
	}
	
}
