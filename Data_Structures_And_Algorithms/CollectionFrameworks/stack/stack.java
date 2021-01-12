package Data_Structures_And_Algorithms.CollectionFrameworks.stack;

//import java.util.Stack;

public class stack {
	public static void main(String[] args) throws Exception {
		//			*************Information **************
		
		// Stack is made from vectors and vectors are thread safe so Stack is a bit slow instead we can use Arraydeque which are faster than stack 
		// We can use all the operations of stack in ArrayDeque (So Cheers to ArrayDeque) (ArrayDeque is not thread safe).
		
		
		
//		Stack<Integer> stack = new Stack();
//				stack.push(2);
//		stack.push(4);
//		stack.push(6);
//		
//		int var = stack.pop();
//		int pk = stack.peek();
//		System.out.println(var + pk);
		
		
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(4);
		stack.push(6);
//		
		int var = stack.pop();
		System.out.println("Popped element is " + var);
		int pk = stack.peek();
		System.out.println("Peeked element is " + pk);
		stack.pop();
		stack.pop();
		
	}

}
