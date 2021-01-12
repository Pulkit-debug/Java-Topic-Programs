package Data_Structures_And_Algorithms.CollectionFrameworks.Queues;

import java.util.*;

public class MainQueue {
	public static <E> void main(String[] args) {
		
//		Queue<Integer> queue = new LinkedList<>();
		
//		queue.add(34);
//		queue.add(365);
//		queue.add(87);
//		
//		System.out.println(queue);
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		
//		System.out.println(queue.element());
		
//		System.out.println(queue.peek());
		
		
		MyQueueImplementation<E> queue = new MyQueueImplementation<E>();
		
		queue.enqueue(34);
		queue.enqueue(4);
		queue.enqueue(3);
		System.out.println(queue);
		
		
		
	}

}
