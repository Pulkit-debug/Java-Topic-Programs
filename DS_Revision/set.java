package DS_Revision;
import java.util.*;
public class set {
	public static void main(String[] args) {
		// Given a array, find if there exists a subarray with sum equal to zero
		//n<10^5
		
//		int a[] = {3, 2, 4, -1, 6, 6};
//		int sum = 0;
//		
//		Set<Integer> s = new HashSet<Integer>();
//		// This will be done in time complexity of O(n)	but it will take some extra space for set.
//		boolean flag = false;
//		for(int i = 0;i<a.length;i++) {
//			s.add(sum);
//			sum += a[i];
//			if(s.contains(sum)) {
//				flag = true;
//				break;
//			}
//		}
//		if(flag) System.out.println("Present");
//		else System.out.println("not present");
		
		
		// Given a array, find if there exists a subarray with sum equal to k
		
		int a[] = {3, 2, 4, -1, 6, 5};
		int k = 10;
		
		Set<Integer> s = new HashSet<Integer>();
		int sum = 0;
		boolean flag = false;
		for(int x : a) {
			s.add(sum);
			sum += x;
			if(s.contains(sum-k)) {
				flag = true;
				break;
			}
		}
		if(flag) System.out.println("present");
		else System.out.println("not present");
	}
}
