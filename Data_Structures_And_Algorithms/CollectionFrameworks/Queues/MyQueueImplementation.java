package Data_Structures_And_Algorithms.CollectionFrameworks.Queues;

public class MyQueueImplementation<E> {	
	
	
	Node<E> head;
	Node<E> tail;
	int size;
	
	public void enqueue(int value) {
		
		Node<E> node = new Node<E>();
		if(head == null) {	// If the queue is empty
			head = tail = node;
			size++;
			return;
		}
		Node<E> temp = new Node<>();
		temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
		tail.setNext(node);
		tail = tail.getNext();
		
	}
	public class Node<E> {
		E data;
		Node<E> next;
		
		public E getData() {
			return data;
		}
		
		public void setData(E data) {
			this.data = data;
		}
		
		public Node<E> getNext() {
			return next;
		}
		
		public void setNext(Node<E> next) {
			this.next = next;
		}
	}

}
