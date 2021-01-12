package Data_Structures_And_Algorithms.CollectionFrameworks.LinkedList;
public class MainLinkedList {
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		
//		for(int i = 0;i<100000;i++) {
//			list.add(i);
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println(list.getClass().getName() + " --> " + (end - start));
//	}
	public static void main(String[] args) {
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		ll.add(3);
//		ll.add(4);
//		ll.add(343);
//		System.out.println(ll);
		
		// NOTE: All the functions of arrayList and LinkedList are same like add, get, set etc because they both implements the List interface.
		
		// *********** Measuring the time difference between ArrayList and LinkedList **************
//		
//		getTimeDiff(al);
//		getTimeDiff(ll);
		
		/// ********* Using our own linked list *****************
		MyLinkedList<String> myLL = new MyLinkedList<String>();
//		myLL.createLinkedList(8);
		myLL.add("done");
		
		myLL.add("don");
		myLL.add("do");
		myLL.add("d");
		myLL.add("e");
//		myLL.remove(2);
		myLL.print();
		
	}
	
}
