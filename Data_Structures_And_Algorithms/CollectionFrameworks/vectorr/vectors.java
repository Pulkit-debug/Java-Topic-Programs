package Data_Structures_And_Algorithms.CollectionFrameworks.vectorr;

import java.util.Vector;

public class vectors {
	
	// WARNING: POSSIBLE TYPOS AHEAD EVERYTHING IS WRITTEN AT 100 WPM.
	
	// ************************  VECTORS **********************
	
	/*
	
	The vector class is an implementation of list interface that allows us to create resizable arrays similar to ArrayList.
	
	JavaVector VS ArrayList
	::  In java both ArrayList and VectorList implements the list interface and provides the same functinalities. However there
	exists some differences between them. The vector class synchronises each indivisual operation. This means whenever we want to perferm 
	some operation on vectors the vector class automatically applies a lock to that operaion. However in ArrayLists methods are not 
	synchronised.
	
	
	NOTE: It is recommmended to use ArrayLists in place of Vector because vectors are thread safe and are less efficient.
	
		************ Detailed Explanation **********************
		
		In vectors there are threads (threads which carrayouts some process). 
		EXAMPLE: Suppose we want to add two numbers then we will use the .add function and let us assume there are two threads 
		processing at the same time doing the same operation with different value. then in that case there will be conflict between 
		the first and the second thread. So, this might result in wrong addition of elements or something
		
		So, to resolve that issue we have vectors what Vector does is that they apply a lock on a element and until the element is added
		the lock remains locked and after the addition the lock unlocks and only after unlocking the locked element the next element
		will be added. 
		
		Applying this lock is called synchronizing and we use the keyword "synchronize" for this .
		So Vectors are beneficial when we are working with multiple threads (usually we don't);
		
		Ohterwise always use ArrayList in place of Vectors ;)
		
	*/
	
	Vector<Integer> v = new Vector();
	
	// Each and every operaion of vector are same as ArrayList.
	
	
	// ArrayList increases the size by 1.5 times after reaching a certain threashhold.
	// Vector increases the size by 2 times after reaching a certain threashhold
	
	 // So ArrayList are more space efficient than vector and also quite fast than Vector because they don't use synchronization
	
	
	// Extra Information 
	// To throw an exception we have to add "throws Exceptinon" in the function and after applying the condition in place of print we can use
	// "throw new Exception("Exception here!!")"
	
	
	
}
