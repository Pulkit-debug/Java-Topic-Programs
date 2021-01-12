package DS_Revision;

public class node<E> {
	E data;
	node<E> next;
	
	 E getData() {
		return data;
	}
	
	 node<E> getNext() {
		 return next;
	 }
	 
	 void setData(E data) {
		 this.data = data;
	 }
	
	 void setNext(node<E> next) {
		 this.next = next;
	 }
}
