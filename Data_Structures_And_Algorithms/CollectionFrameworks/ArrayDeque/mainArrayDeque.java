package Data_Structures_And_Algorithms.CollectionFrameworks.ArrayDeque;

import java.util.ArrayDeque;

public class mainArrayDeque {
	public static void main(String[] args) throws Exception {
		myDeque<Integer> md = new myDeque<Integer>();
		md.addToHead(34);
		md.addToHead(534);
		md.removeLast();
	}
}
