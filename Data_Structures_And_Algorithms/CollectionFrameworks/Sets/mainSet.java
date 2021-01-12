package Data_Structures_And_Algorithms.CollectionFrameworks.Sets;
import java.util.*;
public class mainSet {
	public static void main(String[] args) {
//		Set<String> s = new TreeSet<>();
		
		// internal working
			// 1. we provide the input
		// 2. the input goes to a hash function
		// 3. the hash function provides the hash output(basically used for memory location to store the input)
		
//		
//		s.add("orange");
//		s.add("Apple");
//		s.add("babbuTosha");
		
		// NOTE: To get the output in the same order as input we can use LinkedHashSet
		// NOTE: To get the output in the sorted form we can use TreeSet
		
//		System.out.println(s);
		
		
Set<Integer> x = new HashSet<>();
		
		
		x.add(34);
		x.add(6);
		x.add(56);
		
Set<Integer> y = new HashSet<>();
		
		
//		y.add(12);
//		y.add(7);
		y.add(56);
		y.add(60);
		
		
		System.out.println(x.containsAll(y));
		
		
		
		
	}
}
