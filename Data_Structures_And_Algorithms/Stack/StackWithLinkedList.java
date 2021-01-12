package Data_Structures_And_Algorithms.Stack;

import Data_Structures_And_Algorithms.LinkedList.Node.SingleNode;
import Data_Structures_And_Algorithms.LinkedList.Single_Linked_List.SingleLinkedList;

public class StackWithLinkedList {

	SingleLinkedList list;

	
	//constructor
	public  StackWithLinkedList() {
		list = new SingleLinkedList();
	}//end of method

	
	public void push(int value) {
		if(list.getHead()== null) {
			list.createSingleLinkedList(value);
		}else {
			list.insertInLinkedList(value, 0);	
		}
		System.out.println("Inserted " + value + " in Stack !");
	}//end of method

	
	public int pop() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("Stack underflow error!!");
		} else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}// end of method

	
	public boolean isEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}// end of method

	
	public int peek() {
		if (!isEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The stack is empty!!");
			return -1;
		}
	}// end of method
	

	public void deleteStack() {
		list.setHead(null);
	}//end of method
	
}
