
package Data_Structures_And_Algorithms.Recursion;

import java.util.*;

public class Josephus_problem {
	static int jp(int n, int k) {
		if(n == 1) return 1;
		
		return ((jp(n-1, k) + k-1) % n) + 1;
	}
	
	
	/// using list with recursion will also take O(n) time
	
	static int jpWithList(ArrayList<Integer> list, int start, int k) {
		if(list.size() == 1)
			return list.get(0);
		
		start = (start + k) % list.size();
		list.remove(start);// so it will move to the next automatically
		
		return jpWithList(list, start, k);
			
	}
	public static void main(String[] args) {
		int n = 5;
		int k = 2;
		
//		int result = jp(n, k);
		int start = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<=n;i++) {
			list.add(i);
		}
		int result = jpWithList(list, start, k-1);
		System.out.println(result);
	}
}
