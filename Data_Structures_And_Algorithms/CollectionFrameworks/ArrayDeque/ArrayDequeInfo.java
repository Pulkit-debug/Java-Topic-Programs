package Data_Structures_And_Algorithms.CollectionFrameworks.ArrayDeque;

public class ArrayDequeInfo {

	// ***********ArrayDeque***********
	
	/*
	 * 
	 * An ArrayDeque( also known as "Array Double Ended Queue", pronounced as ArrayDeck) is a special kind of growable Array that allows us to add and remove
	 * array from both sides unline normal queue data structure in which we can only use FIFO operation 
	 * 
	 *  
	 *  An ArrayDeque implementation can be used as a stack (LIFO) or a Queue (FIFO) 
	 *  
	 *  
	 *  						extends            extends
	 *  			collection <---------- Queue <--------- Deque 
	 *  					   				|					|
	 *  									|					|
	 *  									---------------------
	 *  											 |
	 *  										ArrayDeque
	 *  
	 *  
	 *  
	 *  					***********  Deque  *****************
	 *  In a regular queue elements are added from the rear and removed from the front. However in a deque we can insert and remove elements from both
	 *  the directions rear and front.
	 *  
	 *  
	 *  
	 *  
	 * Operation 						Method(null/false)				Method throwing Exception
	 * Insert from Head						offerFirst(e)					addFirst(e)
	 * Removal from Head					pollFirst(e)					removeFirst(e)
	 * Retrieval from Head					peekFirst(e)					getFirst(e)
	 * 
	 * Insertino from Tail					offerLast(e)					addLast(e)
	 * Removal from Tail					pollLast(e)						removeLast(e)
	 * Retrieval from Tail					peekLast(e)						getLast(e)
	 *  										
	 *  
	 *  
	 */


}
