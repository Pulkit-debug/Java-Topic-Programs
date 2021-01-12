package DS_Revision;

import java.util.*;
public class priorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(45);
		pq.add(86);
		pq.add(34);
		System.out.println(pq);
		List<Integer> al = new ArrayList<Integer>(); 
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}
}
