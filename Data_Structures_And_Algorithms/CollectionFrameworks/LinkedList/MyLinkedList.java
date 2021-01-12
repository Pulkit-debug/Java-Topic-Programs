package Data_Structures_And_Algorithms.CollectionFrameworks.LinkedList;

public class MyLinkedList<E> {
		
	Node<E> head;
	Node<E> tail;
	int size;
	
	public Node<E> createLinkedList( E value) { 
		Node<E> node = new Node<E>();
		node.setData(value);
		node.setNext(null);
		head = node;
		tail = node;
		size = 0;
		return head;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void add(E e) {
		Node<E> node = new Node<E>();
		node.setData(e);
		if(isEmpty()) {
//			node.setNext(null);
			head = node;		
			size++;
			return;
		}
			Node<E> temp = new Node<E>();
			temp = head;
			int index;
			while(temp.getNext() != null) {
				temp = temp.getNext();
//				index++;
			}
			temp.setNext(node);
			size++;
	}
	public void set(E value, int location) {
		Node<E> node = new Node<E>();
		node.setData(value);
		if(isEmpty()) {
			return;
		}
		else if(location == 0) {
			node.setNext(head);
			head = node;
		}
		else if(location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}
		else {
			Node<E> temp = new Node<E>();
			temp = head;
			int index = 0;
			while(index < location - 1) {
				temp = temp.getNext();
				index++;
			}
			Node<E> nextNode = new Node<E>();
			nextNode = temp.getNext();
			temp.setNext(node);
			node.setNext(nextNode);
		}
		size++;
	}
	

	public void get(E value) {
		Node<E> temp = new Node<E>();
		boolean check = false;
		 Node<E> saman = new Node<E>();
		for(int i = 0;i<size;i++) {
			if(temp.getData() == value) {
				check = true;
				saman = (MyLinkedList<E>.Node<E>) temp.getData();
				break;
			}
			temp = temp.getNext();
		}
		if(check) System.out.println(saman);
		else System.out.println("Not Present!");
	}
	
	public void remove(int value) {
		Node<E> temp = new Node<E>();
		temp = head;
		int index = 0;
		while(index < value-1) {
			temp = temp.getNext();
			index++;
		}
		Node<E> nextNode = new Node<E>();
		nextNode = temp.getNext().getNext();
		temp.setNext(nextNode);
		size--;
	}
	
	public E removeFromStack() throws Exception{

		Node<E> temp = new Node<E>();
		temp = head;
		if(temp == null) {
			throw new Exception("Nothing to Remove!!");
		}
		
		if(temp.getNext() == null) {
			Node<E> toRemove = new Node<E>();
			toRemove = head;
			temp = null;
			return toRemove.getData();
		}
		while(temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		Node<E> toRemove = new Node<E>();
		toRemove = temp.getNext();
		temp.setNext(null);
		return toRemove.getData();
	}
	
	public E peekFromStack() throws Exception{
		Node<E> temp = new Node<E>();
		temp = head;
		if(temp == null) throw new Exception("Nothing to Peek!!");
		
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp.getData();
	}
	public void print() {
		if(isEmpty()) {
			System.out.println("Linked List does not exist!!");
		}
		else {
		Node<E> temp = new Node<E>();
		temp = head;
		for(int i = 0;i<size;i++) {
			System.out.print(temp.getData());
			if(i != size -1) System.out.print(" -> ");
			temp = temp.getNext();
		}
		System.out.println();
		}
		
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

