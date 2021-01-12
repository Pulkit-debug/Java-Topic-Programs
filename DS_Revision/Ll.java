package DS_Revision;

public class Ll<E> {
	node<E> head;
	node<E> tail;
	int size;
	
	public node<E> createlinkedlist(E data) {
		node<E> nod = new node<E>();
		nod.setData(data);
		nod.setNext(null);
		head = nod;
		tail = nod;
		size++;
		return nod;
		
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	public void addll(E data) {
		node<E> nod = new node<E>();
		nod.setData(data);
		if(isEmpty()) {
			nod.setNext(null);
			head = nod;
			tail = nod;
			size++;
			return;
		}
		else {
			node<E> temp = new node<E>();
			temp = head;
			
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nod);
			nod.setNext(null);
			tail = nod;
			size++;
		}
	}
	
	public void setll(E data, int location) {
		node<E> nod = new node<E>();
		nod.setData(data);
		if(isEmpty()) {
			return;
		}
		else if(location == 0) {
			nod.setNext(head);
			head = nod;
			tail = nod;
			size++;
			return;
		}
		else if(location >= size) {
			addll(data);
		}
		else {
			node<E> temp = new node<E>();
			temp = head;
			int index = 0;
			while(index < location -1) {
				temp = temp.getNext();
				index++;
			}
			node<E> newnode = new node<E>();
			newnode = temp.getNext();
			temp.setNext(nod);
			nod.setNext(newnode);
			size++;
		}
		
	}
	
	public void removell(int location) {
		int index = 0;
		node<E> temp = new node<E>();
		temp = head;
		while(index < location - 1) {
			temp = temp.getNext();
			index++;
		}
		node<E> newnode = new node<E>();
		newnode = temp.getNext().getNext();
		temp.setNext(newnode);
//		newnode.setNext(null);
		size--;
	}
	
	public void print() {
	if(isEmpty()) System.out.println("LinkedList Does not exist!!!");
	else {
//		int index = 0;
		node<E> temp = new node<E>();
		temp = head;
		for(int i = 0;i<size;i++) {
			System.out.print(temp.getData());
			if(i != size -1) System.out.print("->");
			temp = temp.getNext();
		}
	}
	}
	
	
//	*************************	APPLYING STACK USING LINKED LIST	********************
	
	
	public void pushOnStack(E data) {
		node<E> nod = new node<E>();
		nod.setData(data);
		if(isEmpty()) {
			head = nod;
			tail = nod;
			nod.setNext(null);
			
		}
		else {
			node<E> temp = new node<E>();
			temp = head;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nod);
			nod.setNext(null);
			tail = nod;
			
		}
		size++;
	}
	
	public void removeFromStack() {
		if(head == null) {
			System.out.println("LinkedList for Stack does not exist!!");
		}
		else {
		node<E> temp = new node<E>();
		temp = head;
		int index = 0;
		while (index < size -1) {
			temp = temp.getNext();
			index++;
		}
		temp.setNext(null);
		size--;
		}
	}
	
	public void peekFromStack() {
		if(head == null) {
			System.out.println("LinkedList for Stack does not exist!!");
		}
		else {
		node<E> temp = new node<E>();
		temp = head;
		int index = 0;
		while(index < size-1 ) {
			temp = temp.getNext();
			index++;
		}
		System.out.println(temp.getData());
		}
	}
	
	// ***************************** QUEUE ****************************
	
	public void pushen(E data) {
		node<E> nod = new node<E>();
		nod.setData(data);
		if(isEmpty()) {
			nod.setNext(null);
			head = nod;
			tail = nod;
			
		}
		else {
			node<E> temp = new node<E>();
			temp = head;
			int index = 0;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nod);
			nod.setNext(null);
			tail = nod;
		}
		size++;
	}
	
	public void popd() {
		if(head == null) {
			System.out.println("LinkedList for Queue does not exist!!");
			// NOTE: This statement is based on the methods used to throw exception like add remove element
		}
		else {
		node<E> temp = new node<E>();
		temp = head;
		head = head.getNext();
		temp.setNext(null);
		size--;
		}
	}
	
	public void peekq() {
		if(head == null) {
			System.out.println("LinkedList for Queue does not exist!!");
			// NOTE: This statement is based on the methods used to throw exception like add remove element
		}
		else {
		node<E> temp = new node<E>();
		temp = head;
		System.out.println(temp.getData());
		}
	}
	
	// ****************** ARRAY DEQUE ****************************
	
	public void offerFirst(E data) {
		node<E> nod = new node<E>();
		nod.setData(data);
		if(isEmpty()) {
			nod.setNext(null);
			head = nod;
			tail = nod;	
		}
		else {
//			node<E> temp = new node<E>();
//			temp = head;
			nod.setNext(head);
			head = nod;
		}
		size++;
	}
	
	public void pollFirst() {
		node<E> temp = new node<E>();
		temp = head;
		head = head.getNext();
		temp.setNext(null);
		size--;
	}
	
	public void peekFirst() {
		node<E> temp = new node<E>();
		temp = head;
		System.out.println(temp.getData());
	}
	
	
	//NOTE: Writing same code over and over again so that if someone looks at this code in the future he/she does not have to roll back all way
	//upto every function.
	
	public void offerLast(E data) {
		node<E> nod = new node<E>();
		nod.setData(data);
		if(isEmpty()) {
			nod.setNext(null);
			head = nod;
			tail = nod;
			
		}
		else {
			node<E> temp = new node<E>();
			temp = head;
			int index = 0;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(nod);
			nod.setNext(null);
			tail = nod;
		}
		size++;
	}
	
	public void pollLast() {
		node<E> temp = new node<E>();
		temp = head;
		int index = 0;
		while(index < size - 1) {
			temp = temp.getNext();
			index++;
		}
		temp.setNext(null);
		tail = temp;
		size--;
	}
	
	public void peekLast() {
		node<E> temp = new node<E>();
		temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
	
	
	
}
