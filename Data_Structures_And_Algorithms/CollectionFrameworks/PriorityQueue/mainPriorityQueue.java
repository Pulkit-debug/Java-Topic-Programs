package Data_Structures_And_Algorithms.CollectionFrameworks.PriorityQueue;

import java.util.PriorityQueue;

public class mainPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(343);
		pq.add(3413);
		pq.add(564);
		pq.add(65);
		
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		//NOTE: 	In strings elements are removed in dictionary order(lexographical order)
		// Whatever letter comes first will be removed first.   
	}
}
