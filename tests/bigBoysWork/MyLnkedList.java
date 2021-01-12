package tests.bigBoysWork;

public class MyLnkedList {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.createLinkedList(5);
		ll.add(23);
		ll.traverse();
		ll.add(88);
		ll.traverse();
		ll.set(12, 2);
		ll.size();
		ll.traverse();
	}
}
