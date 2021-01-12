package tests.bigBoysWork;

public class LinkedList<E> {

	Node<E> head ;
	Node<E> tail ;
	int size = 0;
	
	public Node<E> createLinkedList(E data) {
		Node<E> node = new Node<E>();
		node.setData(data);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
	
	public void add(E value) {
		Node<E> node = new Node<E>();
		node.setData(value);
		if(isEmpty()) {
			node.setNext(null);
			head = node;
			tail = node;
			size += 1;
			return;
		}
		else {
			Node<E> temp = new Node<E>();
			temp = head;
//			int index = 0;
			while(temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
			node.setNext(null);
			tail = node;
			size++;
		}
	}
	
	// to add an element to some position
	
	public void set(E value, int location) {
		Node<E> node = new Node<E>();
		node.setData(value);
		if(location == 0) {
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
			while(index < (location-1)) {
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
	
	public void traverse() {
		if(isEmpty()) System.out.println("Linked List does not exist!!");
		else {
		Node<E> node = new Node<E>();
		node = head;
//		int index = 0;
		for(int i = 0;i<size;i++) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
		}
	}
	public void size() {
		System.out.println("Current size of Linked list is : " + size);
	}
	
}
