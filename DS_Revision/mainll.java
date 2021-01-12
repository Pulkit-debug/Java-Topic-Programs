package DS_Revision;
import java.util.*;

public class mainll {
	
	public static void getDiff(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		for(int i =0;i<100000;i++) {
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " -> " + (end - start));
	}
	public static void main(String[] args) {
//		Ll<Integer> ll = new Ll<Integer>();
//		ll.createlinkedlist(34);
//		ll.addll(56);
//		ll.addll(64);
//		ll.setll(88, 2);
//		ll.removell(2);
//		ll.print();
//		List<Integer> l = new LinkedList<Integer>();
//		l.add(2343)
//		l.add(0, 343);
		List<Integer> ll = new LinkedList<Integer>();
		List<Integer> al = new ArrayList<Integer>();
		
		getDiff(al);
		getDiff(ll);
		
	}
}
