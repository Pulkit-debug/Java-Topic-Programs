package Data_Structures_And_Algorithms.CollectionFrameworks.ArrayDeque;

public class myDeque<E> {
	// Not working needs optimisation
	Node<E> head, tail;
	
	public void addToHead(E data) {
		Node<E> node = new Node<E>();
		if(isEmpty()) {
			head = tail = null;
			return;
		}
		else {
			head.setNext(node);
			node.setPrev(head);
			head = node;
			node.setNext(null);
		}
	}
	
	public void removeLast() throws Exception {
		if(isEmpty()) throw new Exception("Hold is right there sparky!! ArrayDeque is Empty ;) ");
		else {
			 Node<E> node = new Node<E>();
			 node = tail;
			 tail = tail.getNext();
			 tail.setPrev(null);
			 node = null;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public class Node<E> {
		E data;
		Node<E> next, prev;
		
		public E getData() {
			return data;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public Node<E> getPrev() {
			return prev;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
		public void setPrev(Node<E> prev) {
			this.prev = prev;
		}
		public void setData(E data) {
			this.data = data;
		}
	}
}
