package Data_Structures_And_Algorithms.CollectionFrameworks.HashMap;

import java.security.Key;

public class hashMapInfo {

	
//	************************** Map Interface ***********************
	
//	In java, elements of the map are stored in key/value pair. Keys are unique values associated with indivisual values. A map cannot
//	contain duplicate keys just like sets and each key is associated with single values.
//	
//	we can access and modify values using keys associated with them. In the below diagram we have values: United States, Brazil, and Spain
//	And we have corresponding keys: us, br, sp, Now we can access those values using their keys.
	
//				keys					values
//				us------------------->	United States
//				br------------------->	Brazil
//				sp------------------->	Spain
	
	
	
	// ************************** Methods of Map *****************************
//	
//1. put(K, V) - Inserts the association of a Key K and value V into the map. If the key is already present then the new values replaces the old value
//
//2. putAll() - Inserts all entries from a specified map onto this map.
//
//3. putIfAbsent(K, V) - Inserts the associateion if Key K is not already present with value V
//
//4. get(K) - Returns the value associated with a specified key K. if the key is not found it returns null.
//
//5. getOrDefault(K, DefaultValue) - Returns the value associated with specified key K. If the key is not found it returns default value.
//
//6. containsKey(K) - check if the specified key K is present in the map or not.
//
//7. containsValue(V) - check if the specified value V is present int the map or not.
//
//8. replace(K, V) - Replace the value of key K with new specified value V.
//
//9. replace(K, oldValue, newValue) - Replaces the value of the key K with the new value V only if the key K is associated with the old Value V.
//
//10. remove(K) - Removes the entry from the map represented by the key K.
//
//11. remove(K, V) - removes the entry from the map that has key K associated with the value V.
//
//12. keySet() - returns the set of all keys present in the map.
//
//13. values() - returns the set of all values present in the map.
//
//14. entrySet() - returns the set of all key/value mapping present in the map.
	
//15. setValue() - can set the values of the set while iteration over entries.
	
	
	
//	******************** Internal Working of HashMap ***************************
	
	
//HashMap uses an array table to store it's key value pair. Each element of the array holds the head of a linked list to avoid collision.
//The hash of every key is calculated and every elements are placed in the array using the hash function.
	
	// the default capacity is kept at 16 and the load factor at 0.75
	
	
	// structure is something like this:- 
	
		// ArrayBlock ----> key | value | next ----> key | value | next
		// 0 index contains only null (    ArrayBlock ----> null | null | null    
	
}
